// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/team_user.proto

package com.gitlab.leonklein.user;

/**
 * Protobuf type {@code user.TeamUser}
 */
public  final class TeamUser extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:user.TeamUser)
    TeamUserOrBuilder {
  // Use TeamUser.newBuilder() to construct.
  private TeamUser(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private TeamUser() {
    totalBans_ = 0L;
    totalMutes_ = 0L;
    totalReports_ = 0L;
    totalReportAccept_ = 0L;
    totalReportDenied_ = 0L;
    totalWrongbans_ = 0L;
    totalWrongmutes_ = 0L;
    admission_ = 0;
    uniqueId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TeamUser(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            totalBans_ = input.readInt64();
            break;
          }
          case 16: {

            totalMutes_ = input.readInt64();
            break;
          }
          case 24: {

            totalReports_ = input.readInt64();
            break;
          }
          case 32: {

            totalReportAccept_ = input.readInt64();
            break;
          }
          case 40: {

            totalReportDenied_ = input.readInt64();
            break;
          }
          case 48: {

            totalWrongbans_ = input.readInt64();
            break;
          }
          case 56: {

            totalWrongmutes_ = input.readInt64();
            break;
          }
          case 64: {

            admission_ = input.readInt32();
            break;
          }
          case 74: {
            com.google.protobuf.ByteString bs = input.readBytes();

            uniqueId_ = bs;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gitlab.leonklein.user.TeamUserOuterClass.internal_static_user_TeamUser_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gitlab.leonklein.user.TeamUserOuterClass.internal_static_user_TeamUser_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gitlab.leonklein.user.TeamUser.class, com.gitlab.leonklein.user.TeamUser.Builder.class);
  }

  public static final int TOTAL_BANS_FIELD_NUMBER = 1;
  private long totalBans_;
  /**
   * <code>optional int64 total_bans = 1;</code>
   */
  public long getTotalBans() {
    return totalBans_;
  }

  public static final int TOTAL_MUTES_FIELD_NUMBER = 2;
  private long totalMutes_;
  /**
   * <code>optional int64 total_mutes = 2;</code>
   */
  public long getTotalMutes() {
    return totalMutes_;
  }

  public static final int TOTAL_REPORTS_FIELD_NUMBER = 3;
  private long totalReports_;
  /**
   * <code>optional int64 total_reports = 3;</code>
   */
  public long getTotalReports() {
    return totalReports_;
  }

  public static final int TOTAL_REPORT_ACCEPT_FIELD_NUMBER = 4;
  private long totalReportAccept_;
  /**
   * <code>optional int64 total_report_accept = 4;</code>
   */
  public long getTotalReportAccept() {
    return totalReportAccept_;
  }

  public static final int TOTAL_REPORT_DENIED_FIELD_NUMBER = 5;
  private long totalReportDenied_;
  /**
   * <code>optional int64 total_report_denied = 5;</code>
   */
  public long getTotalReportDenied() {
    return totalReportDenied_;
  }

  public static final int TOTAL_WRONGBANS_FIELD_NUMBER = 6;
  private long totalWrongbans_;
  /**
   * <code>optional int64 total_wrongbans = 6;</code>
   */
  public long getTotalWrongbans() {
    return totalWrongbans_;
  }

  public static final int TOTAL_WRONGMUTES_FIELD_NUMBER = 7;
  private long totalWrongmutes_;
  /**
   * <code>optional int64 total_wrongmutes = 7;</code>
   */
  public long getTotalWrongmutes() {
    return totalWrongmutes_;
  }

  public static final int ADMISSION_FIELD_NUMBER = 8;
  private int admission_;
  /**
   * <code>optional int32 admission = 8;</code>
   */
  public int getAdmission() {
    return admission_;
  }

  public static final int UNIQUE_ID_FIELD_NUMBER = 9;
  private volatile java.lang.Object uniqueId_;
  /**
   * <code>optional string unique_id = 9;</code>
   */
  public java.lang.String getUniqueId() {
    java.lang.Object ref = uniqueId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        uniqueId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string unique_id = 9;</code>
   */
  public com.google.protobuf.ByteString
      getUniqueIdBytes() {
    java.lang.Object ref = uniqueId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uniqueId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (totalBans_ != 0L) {
      output.writeInt64(1, totalBans_);
    }
    if (totalMutes_ != 0L) {
      output.writeInt64(2, totalMutes_);
    }
    if (totalReports_ != 0L) {
      output.writeInt64(3, totalReports_);
    }
    if (totalReportAccept_ != 0L) {
      output.writeInt64(4, totalReportAccept_);
    }
    if (totalReportDenied_ != 0L) {
      output.writeInt64(5, totalReportDenied_);
    }
    if (totalWrongbans_ != 0L) {
      output.writeInt64(6, totalWrongbans_);
    }
    if (totalWrongmutes_ != 0L) {
      output.writeInt64(7, totalWrongmutes_);
    }
    if (admission_ != 0) {
      output.writeInt32(8, admission_);
    }
    if (!getUniqueIdBytes().isEmpty()) {
      output.writeBytes(9, getUniqueIdBytes());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (totalBans_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, totalBans_);
    }
    if (totalMutes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, totalMutes_);
    }
    if (totalReports_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, totalReports_);
    }
    if (totalReportAccept_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, totalReportAccept_);
    }
    if (totalReportDenied_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, totalReportDenied_);
    }
    if (totalWrongbans_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, totalWrongbans_);
    }
    if (totalWrongmutes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, totalWrongmutes_);
    }
    if (admission_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(8, admission_);
    }
    if (!getUniqueIdBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(9, getUniqueIdBytes());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.gitlab.leonklein.user.TeamUser parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gitlab.leonklein.user.TeamUser parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gitlab.leonklein.user.TeamUser parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gitlab.leonklein.user.TeamUser parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gitlab.leonklein.user.TeamUser parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gitlab.leonklein.user.TeamUser parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.gitlab.leonklein.user.TeamUser parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.gitlab.leonklein.user.TeamUser parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.gitlab.leonklein.user.TeamUser parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gitlab.leonklein.user.TeamUser parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gitlab.leonklein.user.TeamUser prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code user.TeamUser}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:user.TeamUser)
      com.gitlab.leonklein.user.TeamUserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gitlab.leonklein.user.TeamUserOuterClass.internal_static_user_TeamUser_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gitlab.leonklein.user.TeamUserOuterClass.internal_static_user_TeamUser_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gitlab.leonklein.user.TeamUser.class, com.gitlab.leonklein.user.TeamUser.Builder.class);
    }

    // Construct using com.gitlab.leonklein.user.TeamUser.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      totalBans_ = 0L;

      totalMutes_ = 0L;

      totalReports_ = 0L;

      totalReportAccept_ = 0L;

      totalReportDenied_ = 0L;

      totalWrongbans_ = 0L;

      totalWrongmutes_ = 0L;

      admission_ = 0;

      uniqueId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gitlab.leonklein.user.TeamUserOuterClass.internal_static_user_TeamUser_descriptor;
    }

    public com.gitlab.leonklein.user.TeamUser getDefaultInstanceForType() {
      return com.gitlab.leonklein.user.TeamUser.getDefaultInstance();
    }

    public com.gitlab.leonklein.user.TeamUser build() {
      com.gitlab.leonklein.user.TeamUser result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.gitlab.leonklein.user.TeamUser buildPartial() {
      com.gitlab.leonklein.user.TeamUser result = new com.gitlab.leonklein.user.TeamUser(this);
      result.totalBans_ = totalBans_;
      result.totalMutes_ = totalMutes_;
      result.totalReports_ = totalReports_;
      result.totalReportAccept_ = totalReportAccept_;
      result.totalReportDenied_ = totalReportDenied_;
      result.totalWrongbans_ = totalWrongbans_;
      result.totalWrongmutes_ = totalWrongmutes_;
      result.admission_ = admission_;
      result.uniqueId_ = uniqueId_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gitlab.leonklein.user.TeamUser) {
        return mergeFrom((com.gitlab.leonklein.user.TeamUser)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gitlab.leonklein.user.TeamUser other) {
      if (other == com.gitlab.leonklein.user.TeamUser.getDefaultInstance()) return this;
      if (other.getTotalBans() != 0L) {
        setTotalBans(other.getTotalBans());
      }
      if (other.getTotalMutes() != 0L) {
        setTotalMutes(other.getTotalMutes());
      }
      if (other.getTotalReports() != 0L) {
        setTotalReports(other.getTotalReports());
      }
      if (other.getTotalReportAccept() != 0L) {
        setTotalReportAccept(other.getTotalReportAccept());
      }
      if (other.getTotalReportDenied() != 0L) {
        setTotalReportDenied(other.getTotalReportDenied());
      }
      if (other.getTotalWrongbans() != 0L) {
        setTotalWrongbans(other.getTotalWrongbans());
      }
      if (other.getTotalWrongmutes() != 0L) {
        setTotalWrongmutes(other.getTotalWrongmutes());
      }
      if (other.getAdmission() != 0) {
        setAdmission(other.getAdmission());
      }
      if (!other.getUniqueId().isEmpty()) {
        uniqueId_ = other.uniqueId_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.gitlab.leonklein.user.TeamUser parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gitlab.leonklein.user.TeamUser) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long totalBans_ ;
    /**
     * <code>optional int64 total_bans = 1;</code>
     */
    public long getTotalBans() {
      return totalBans_;
    }
    /**
     * <code>optional int64 total_bans = 1;</code>
     */
    public Builder setTotalBans(long value) {
      
      totalBans_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 total_bans = 1;</code>
     */
    public Builder clearTotalBans() {
      
      totalBans_ = 0L;
      onChanged();
      return this;
    }

    private long totalMutes_ ;
    /**
     * <code>optional int64 total_mutes = 2;</code>
     */
    public long getTotalMutes() {
      return totalMutes_;
    }
    /**
     * <code>optional int64 total_mutes = 2;</code>
     */
    public Builder setTotalMutes(long value) {
      
      totalMutes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 total_mutes = 2;</code>
     */
    public Builder clearTotalMutes() {
      
      totalMutes_ = 0L;
      onChanged();
      return this;
    }

    private long totalReports_ ;
    /**
     * <code>optional int64 total_reports = 3;</code>
     */
    public long getTotalReports() {
      return totalReports_;
    }
    /**
     * <code>optional int64 total_reports = 3;</code>
     */
    public Builder setTotalReports(long value) {
      
      totalReports_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 total_reports = 3;</code>
     */
    public Builder clearTotalReports() {
      
      totalReports_ = 0L;
      onChanged();
      return this;
    }

    private long totalReportAccept_ ;
    /**
     * <code>optional int64 total_report_accept = 4;</code>
     */
    public long getTotalReportAccept() {
      return totalReportAccept_;
    }
    /**
     * <code>optional int64 total_report_accept = 4;</code>
     */
    public Builder setTotalReportAccept(long value) {
      
      totalReportAccept_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 total_report_accept = 4;</code>
     */
    public Builder clearTotalReportAccept() {
      
      totalReportAccept_ = 0L;
      onChanged();
      return this;
    }

    private long totalReportDenied_ ;
    /**
     * <code>optional int64 total_report_denied = 5;</code>
     */
    public long getTotalReportDenied() {
      return totalReportDenied_;
    }
    /**
     * <code>optional int64 total_report_denied = 5;</code>
     */
    public Builder setTotalReportDenied(long value) {
      
      totalReportDenied_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 total_report_denied = 5;</code>
     */
    public Builder clearTotalReportDenied() {
      
      totalReportDenied_ = 0L;
      onChanged();
      return this;
    }

    private long totalWrongbans_ ;
    /**
     * <code>optional int64 total_wrongbans = 6;</code>
     */
    public long getTotalWrongbans() {
      return totalWrongbans_;
    }
    /**
     * <code>optional int64 total_wrongbans = 6;</code>
     */
    public Builder setTotalWrongbans(long value) {
      
      totalWrongbans_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 total_wrongbans = 6;</code>
     */
    public Builder clearTotalWrongbans() {
      
      totalWrongbans_ = 0L;
      onChanged();
      return this;
    }

    private long totalWrongmutes_ ;
    /**
     * <code>optional int64 total_wrongmutes = 7;</code>
     */
    public long getTotalWrongmutes() {
      return totalWrongmutes_;
    }
    /**
     * <code>optional int64 total_wrongmutes = 7;</code>
     */
    public Builder setTotalWrongmutes(long value) {
      
      totalWrongmutes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 total_wrongmutes = 7;</code>
     */
    public Builder clearTotalWrongmutes() {
      
      totalWrongmutes_ = 0L;
      onChanged();
      return this;
    }

    private int admission_ ;
    /**
     * <code>optional int32 admission = 8;</code>
     */
    public int getAdmission() {
      return admission_;
    }
    /**
     * <code>optional int32 admission = 8;</code>
     */
    public Builder setAdmission(int value) {
      
      admission_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 admission = 8;</code>
     */
    public Builder clearAdmission() {
      
      admission_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object uniqueId_ = "";
    /**
     * <code>optional string unique_id = 9;</code>
     */
    public java.lang.String getUniqueId() {
      java.lang.Object ref = uniqueId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          uniqueId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string unique_id = 9;</code>
     */
    public com.google.protobuf.ByteString
        getUniqueIdBytes() {
      java.lang.Object ref = uniqueId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uniqueId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string unique_id = 9;</code>
     */
    public Builder setUniqueId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uniqueId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string unique_id = 9;</code>
     */
    public Builder clearUniqueId() {
      
      uniqueId_ = getDefaultInstance().getUniqueId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string unique_id = 9;</code>
     */
    public Builder setUniqueIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uniqueId_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:user.TeamUser)
  }

  // @@protoc_insertion_point(class_scope:user.TeamUser)
  private static final com.gitlab.leonklein.user.TeamUser DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gitlab.leonklein.user.TeamUser();
  }

  public static com.gitlab.leonklein.user.TeamUser getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<TeamUser> PARSER =
      new com.google.protobuf.AbstractParser<TeamUser>() {
    public TeamUser parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new TeamUser(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<TeamUser> getParserForType() {
    return PARSER;
  }

  public com.gitlab.leonklein.user.TeamUser getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

