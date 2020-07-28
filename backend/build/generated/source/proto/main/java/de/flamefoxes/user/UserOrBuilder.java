// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/user.proto

package de.flamefoxes.user;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:user.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string unique_id = 1;</code>
   */
  java.lang.String getUniqueId();
  /**
   * <code>optional string unique_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getUniqueIdBytes();

  /**
   * <code>optional string rank = 2;</code>
   */
  java.lang.String getRank();
  /**
   * <code>optional string rank = 2;</code>
   */
  com.google.protobuf.ByteString
      getRankBytes();

  /**
   * <code>optional int64 coins = 3;</code>
   */
  long getCoins();

  /**
   * <code>optional int64 wins = 4;</code>
   */
  long getWins();

  /**
   * <code>optional int64 ban_points = 5;</code>
   */
  long getBanPoints();

  /**
   * <code>repeated string ban_history = 6;</code>
   */
  com.google.protobuf.ProtocolStringList
      getBanHistoryList();
  /**
   * <code>repeated string ban_history = 6;</code>
   */
  int getBanHistoryCount();
  /**
   * <code>repeated string ban_history = 6;</code>
   */
  java.lang.String getBanHistory(int index);
  /**
   * <code>repeated string ban_history = 6;</code>
   */
  com.google.protobuf.ByteString
      getBanHistoryBytes(int index);

  /**
   * <code>optional string teamspeak_unique = 7;</code>
   */
  java.lang.String getTeamspeakUnique();
  /**
   * <code>optional string teamspeak_unique = 7;</code>
   */
  com.google.protobuf.ByteString
      getTeamspeakUniqueBytes();

  /**
   * <code>optional string discord_tag = 8;</code>
   */
  java.lang.String getDiscordTag();
  /**
   * <code>optional string discord_tag = 8;</code>
   */
  com.google.protobuf.ByteString
      getDiscordTagBytes();

  /**
   * <code>optional bool isBanned = 9;</code>
   */
  boolean getIsBanned();
}