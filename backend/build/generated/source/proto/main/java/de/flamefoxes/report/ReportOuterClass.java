// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: report/report.proto

package de.flamefoxes.report;

public final class ReportOuterClass {
  private ReportOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_report_Report_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_report_Report_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023report/report.proto\022\006report\"O\n\006Report\022" +
      "\020\n\010reported\030\001 \001(\t\022\016\n\006server\030\002 \001(\t\022\016\n\006rea" +
      "son\030\003 \001(\t\022\023\n\013reported_by\030\004 \001(\tB\030\n\024de.fla" +
      "mefoxes.reportP\001b\006proto3"
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
    internal_static_report_Report_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_report_Report_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_report_Report_descriptor,
        new java.lang.String[] { "Reported", "Server", "Reason", "ReportedBy", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}