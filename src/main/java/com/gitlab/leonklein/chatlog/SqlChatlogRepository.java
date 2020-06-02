package com.gitlab.leonklein.chatlog;

import com.google.protobuf.ProtocolStringList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.ReadOnlySetProperty;

public class SqlChatlogRepository implements ChatlogRepository {
  private final Connection CONNECTION;
  List<String> messages;

  private SqlChatlogRepository(Connection connection) {
    this.CONNECTION = connection;
    messages = new ArrayList<>();
  }

  @Override
  public void create(Chatlog chatlog) {
    try {
      PreparedStatement preparedStatement =
          CONNECTION.prepareStatement("INSERT INTO chatlog (creator,reported,game_server,messages) VALUES (?,?,?,?)");
      insertStatement(preparedStatement, chatlog);
    } catch (SQLException statementCreateFail) {
      System.err.println("Can´t ceraet Chatlog: " + statementCreateFail.getMessage());
    }
  }

  private void insertStatement(
      PreparedStatement preparedStatement,
      Chatlog chatlog
  ) throws SQLException {
    preparedStatement.setString(1, chatlog.getCreator());
    preparedStatement.setString(2, chatlog.getReported());
    preparedStatement.setString(3, chatlog.getServer());
    preparedStatement.setString(4, getChatlogMessages(chatlog));
    updateAndCloseStatement(preparedStatement);
  }

  private String getChatlogMessages(Chatlog chatlog) {
    ProtocolStringList messagesList = chatlog.getMessagesList();
    StringBuilder stringMessageBuilder = new StringBuilder();
    for(String messages : messagesList) {
      stringMessageBuilder.append(messages);
      stringMessageBuilder.append(" ");
    }
    return stringMessageBuilder.toString();
  }

  @Override
  public void delete(String reported) {
    try {
      PreparedStatement preparedStatement =
          CONNECTION.prepareStatement("DELETE FROM chatlog WHERE reported = ?");
      deleteStatement(preparedStatement, reported);
    } catch (SQLException deleteStatementFail) {
      System.err.println("Can´t delete Chatlog: " + deleteStatementFail.getMessage());
    }
  }

  private void deleteStatement(
      PreparedStatement preparedStatement,
      String reported
  ) throws SQLException {
    preparedStatement.setString(1, reported);
    updateAndCloseStatement(preparedStatement);
  }

  @Override
  public List<String> list(String server) {
    try {
      PreparedStatement preparedStatement =
          CONNECTION.prepareStatement("SELECT * FROM chatlog WHERE game_server = ?");
      return getChatlogMessagesFromServer(preparedStatement, server);
    } catch (SQLException listChatlogFail) {
      System.err.println("Can´t get Chatlog: " + listChatlogFail.getMessage());
    }
    return null;
  }

  private List<String> getChatlogMessagesFromServer(
      PreparedStatement preparedStatement,
      String server
  ) throws SQLException {
    preparedStatement.setString(1, server);
    ResultSet resultSet = preparedStatement.executeQuery();
    while (resultSet.next()) {
      messages.add(resultSet.getString("messages"));
      return messages;
    }
    return null;
  }

  private void updateAndCloseStatement(PreparedStatement preparedStatement) throws SQLException {
    preparedStatement.executeUpdate();
    preparedStatement.close();
    System.out.println("Statement was updated and closed!");
  }

  public static SqlChatlogRepository create(Connection connection) {
    return new SqlChatlogRepository(connection);
  }
}
