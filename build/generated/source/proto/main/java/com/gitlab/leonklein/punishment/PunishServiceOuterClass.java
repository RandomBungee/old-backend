// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: punishment/punish_service.proto

package com.gitlab.leonklein.punishment;

public final class PunishServiceOuterClass {
  private PunishServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_punishment_CreatePunishRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_punishment_CreatePunishRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_punishment_CreatePunishResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_punishment_CreatePunishResponse_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_punishment_FindPunishRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_punishment_FindPunishRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_punishment_FindPunishResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_punishment_FindPunishResponse_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_punishment_DeletePunishRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_punishment_DeletePunishRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_punishment_DeletePunishResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_punishment_DeletePunishResponse_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_punishment_ChangePunishRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_punishment_ChangePunishRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_punishment_ChangePunishResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_punishment_ChangePunishResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037punishment/punish_service.proto\022\npunis" +
      "hment\032\027punishment/punish.proto\"9\n\023Create" +
      "PunishRequest\022\"\n\006punish\030\001 \001(\0132\022.punishme" +
      "nt.Punish\":\n\024CreatePunishResponse\022\"\n\006pun" +
      "ish\030\001 \001(\0132\022.punishment.Punish\"&\n\021FindPun" +
      "ishRequest\022\021\n\tunique_id\030\001 \001(\t\"8\n\022FindPun" +
      "ishResponse\022\"\n\006punish\030\001 \001(\0132\022.punishment" +
      ".Punish\"(\n\023DeletePunishRequest\022\021\n\tunique" +
      "_id\030\001 \001(\t\")\n\024DeletePunishResponse\022\021\n\tuni" +
      "que_id\030\001 \001(\t\"9\n\023ChangePunishRequest\022\"\n\006p",
      "unish\030\001 \001(\0132\022.punishment.Punish\":\n\024Chang" +
      "ePunishResponse\022\"\n\006punish\030\001 \001(\0132\022.punish" +
      "ment.Punish2\275\002\n\rPunishService\022K\n\006Create\022" +
      "\037.punishment.CreatePunishRequest\032 .punis" +
      "hment.CreatePunishResponse\022E\n\004Find\022\035.pun" +
      "ishment.FindPunishRequest\032\036.punishment.F" +
      "indPunishResponse\022K\n\006Delete\022\037.punishment" +
      ".DeletePunishRequest\032 .punishment.Delete" +
      "PunishResponse\022K\n\006Change\022\037.punishment.Ch" +
      "angePunishRequest\032 .punishment.ChangePun",
      "ishResponseB#\n\037com.gitlab.leonklein.puni" +
      "shmentP\001b\006proto3"
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
          com.gitlab.leonklein.punishment.PunishOuterClass.getDescriptor(),
        }, assigner);
    internal_static_punishment_CreatePunishRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_punishment_CreatePunishRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_punishment_CreatePunishRequest_descriptor,
        new java.lang.String[] { "Punish", });
    internal_static_punishment_CreatePunishResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_punishment_CreatePunishResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_punishment_CreatePunishResponse_descriptor,
        new java.lang.String[] { "Punish", });
    internal_static_punishment_FindPunishRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_punishment_FindPunishRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_punishment_FindPunishRequest_descriptor,
        new java.lang.String[] { "UniqueId", });
    internal_static_punishment_FindPunishResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_punishment_FindPunishResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_punishment_FindPunishResponse_descriptor,
        new java.lang.String[] { "Punish", });
    internal_static_punishment_DeletePunishRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_punishment_DeletePunishRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_punishment_DeletePunishRequest_descriptor,
        new java.lang.String[] { "UniqueId", });
    internal_static_punishment_DeletePunishResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_punishment_DeletePunishResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_punishment_DeletePunishResponse_descriptor,
        new java.lang.String[] { "UniqueId", });
    internal_static_punishment_ChangePunishRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_punishment_ChangePunishRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_punishment_ChangePunishRequest_descriptor,
        new java.lang.String[] { "Punish", });
    internal_static_punishment_ChangePunishResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_punishment_ChangePunishResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_punishment_ChangePunishResponse_descriptor,
        new java.lang.String[] { "Punish", });
    com.gitlab.leonklein.punishment.PunishOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
