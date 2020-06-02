package com.gitlab.leonklein.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysql {
  private final String host;
  private final String user;
  private final String password;
  private final String database;
  private final int port;
  public static Connection connection;

  public Mysql(
      String host,
      String user,
      String password,
      String database,
      int port
  ) {
    this.host = host;
    this.user = user;
    this.password = password;
    this.database = database;
    this.port = port;
    connect();
  }

  private void connect() {
    try {
      connection
          = DriverManager.getConnection("jdbc:mysql://" + this.host + ":" + this.port + "/" + this.database + "?autoReconnect=true",
          this.user, this.password);
      System.out.println("MySQL was successfully connected!");
    } catch (SQLException connectionSetUpFail) {
      System.err.println("Can´t create connection: " + connectionSetUpFail.getMessage());
    }
  }

  public void createTable() {
    if(connection == null) { return; }
    try {
      connection
          .prepareStatement("CREATE TABLE IF NOT EXISTS permission_group(name VARCHAR(100),"
              + " permissions TEXT)")
          .executeUpdate();
      connection
          .prepareStatement("CREATE TABLE IF NOT EXISTS dye_user(unique_id VARCHAR(100),"
              + " user_rank VARCHAR(100),"
              + " coins int,"
              + " global_wins int,"
              + " ban_points int)")
          .executeUpdate();
      connection
          .prepareStatement("CREATE TABLE IF NOT EXISTS reports(reported VARCHAR(100),"
              + " server VARCHAR(100),"
              + " reason VARCHAR(100),"
              + " reported_by VARCHAR(100))")
          .executeUpdate();
      connection
          .prepareStatement("CREATE TABLE IF NOT EXISTS bans(name VARCHAR(100),"
              + " unique_id VARCHAR(100),"
              + " reason VARCHAR(100),"
              + " banned_by VARCHAR(100),"
              + " end int)")
          .executeUpdate();
      connection
          .prepareStatement("CREATE TABLE IF NOT EXISTS chatlog(creator VARCHAR(100),"
              + " reported VARCHAR(100),"
              + " game_server VARCHAR(100),"
              + " messages TEXT)")
          .executeUpdate();
      System.out.println("Table was successfully created in Database!");
    } catch (SQLException createTableFail) {
      System.err.println("Can´t create table: " + createTableFail.getMessage());
    }
  }
}
