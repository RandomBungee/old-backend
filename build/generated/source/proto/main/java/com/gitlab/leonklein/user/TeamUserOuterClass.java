// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/team_user.proto

package com.gitlab.leonklein.user;

public final class TeamUserOuterClass {
  private TeamUserOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_user_TeamUser_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_user_TeamUser_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024user/team_user.proto\022\004user\"\242\001\n\010TeamUse" +
      "r\022\022\n\ntotal_bans\030\001 \001(\003\022\023\n\013total_mutes\030\002 \001" +
      "(\003\022\025\n\rtotal_reports\030\003 \001(\003\022\026\n\016total_wrong" +
      "ban\030\004 \001(\003\022\030\n\020total_wrongmutes\030\006 \001(\003\022\021\n\ta" +
      "dmission\030\007 \001(\005\022\021\n\tunique_id\030\010 \001(\tB\035\n\031com" +
      ".gitlab.leonklein.userP\001b\006proto3"
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
    internal_static_user_TeamUser_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_user_TeamUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_user_TeamUser_descriptor,
        new java.lang.String[] { "TotalBans", "TotalMutes", "TotalReports", "TotalWrongban", "TotalWrongmutes", "Admission", "UniqueId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
