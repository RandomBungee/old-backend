// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chatlog/chatlog.proto

package de.flamefoxes.chatlog;

public final class ChatlogOuterClass {
  private ChatlogOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_group_Chatlog_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_group_Chatlog_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025chatlog/chatlog.proto\022\005group\"N\n\007Chatlo" +
      "g\022\017\n\007creator\030\001 \001(\t\022\020\n\010reported\030\002 \001(\t\022\016\n\006" +
      "server\030\003 \001(\t\022\020\n\010messages\030\004 \003(\tB\031\n\025de.fla" +
      "mefoxes.chatlogP\001b\006proto3"
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
    internal_static_group_Chatlog_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_group_Chatlog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_group_Chatlog_descriptor,
        new java.lang.String[] { "Creator", "Reported", "Server", "Messages", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}