// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: punishment/mute.proto

package de.flamefoxes.punishment;

public final class MuteOuterClass {
  private MuteOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_punishment_Mute_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_punishment_Mute_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025punishment/mute.proto\022\npunishment\"V\n\004M" +
      "ute\022\014\n\004name\030\001 \001(\t\022\021\n\tunique_id\030\002 \001(\t\022\016\n\006" +
      "reason\030\003 \001(\t\022\020\n\010muted_by\030\004 \001(\t\022\013\n\003end\030\005 " +
      "\001(\003B\034\n\030de.flamefoxes.punishmentP\001b\006proto" +
      "3"
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
    internal_static_punishment_Mute_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_punishment_Mute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_punishment_Mute_descriptor,
        new java.lang.String[] { "Name", "UniqueId", "Reason", "MutedBy", "End", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
