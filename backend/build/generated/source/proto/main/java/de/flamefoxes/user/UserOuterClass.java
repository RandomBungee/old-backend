// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/user.proto

package de.flamefoxes.user;

public final class UserOuterClass {
  private UserOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_user_User_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_user_User_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017user/user.proto\022\004user\"\256\001\n\004User\022\021\n\tuniq" +
      "ue_id\030\001 \001(\t\022\014\n\004rank\030\002 \001(\t\022\r\n\005coins\030\003 \001(\003" +
      "\022\014\n\004wins\030\004 \001(\003\022\022\n\nban_points\030\005 \001(\003\022\023\n\013ba" +
      "n_history\030\006 \003(\t\022\030\n\020teamspeak_unique\030\007 \001(" +
      "\t\022\023\n\013discord_tag\030\010 \001(\t\022\020\n\010isBanned\030\t \001(\010" +
      "B\026\n\022de.flamefoxes.userP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_user_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_user_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_user_User_descriptor,
        new java.lang.String[] { "UniqueId", "Rank", "Coins", "Wins", "BanPoints", "BanHistory", "TeamspeakUnique", "DiscordTag", "IsBanned", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}