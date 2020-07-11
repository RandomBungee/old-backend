// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/team_user_service.proto

package com.gitlab.leonklein.user;

/**
 * Protobuf type {@code user.UpdateTeamUserResponse}
 */
public  final class UpdateTeamUserResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:user.UpdateTeamUserResponse)
    UpdateTeamUserResponseOrBuilder {
  // Use UpdateTeamUserResponse.newBuilder() to construct.
  private UpdateTeamUserResponse(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private UpdateTeamUserResponse() {
    totalBans_ = 0L;
    totalMutes_ = 0L;
    totalReports_ = 0L;
    totalWrongban_ = 0L;
    totalWrongmute_ = 0L;
    totalReportsAccept_ = 0L;
    totalReportsDenied_ = 0L;
    admission_ = 0;
    uniqueId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UpdateTeamUserResponse(
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
          case 10: {
            com.gitlab.leonklein.user.TeamUser.Builder subBuilder = null;
            if (teamuser_ != null) {
              subBuilder = teamuser_.toBuilder();
            }
            teamuser_ = input.readMessage(com.gitlab.leonklein.user.TeamUser.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(teamuser_);
              teamuser_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            totalBans_ = input.readInt64();
            break;
          }
          case 24: {

            totalMutes_ = input.readInt64();
            break;
          }
          case 32: {

            totalReports_ = input.readInt64();
            break;
          }
          case 40: {

            totalWrongban_ = input.readInt64();
            break;
          }
          case 48: {

            totalWrongmute_ = input.readInt64();
            break;
          }
          case 56: {

            totalReportsAccept_ = input.readInt64();
            break;
          }
          case 64: {

            totalReportsDenied_ = input.readInt64();
            break;
          }
          case 72: {

            admission_ = input.readInt32();
            break;
          }
          case 82: {
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
    return com.gitlab.leonklein.user.TeamUserServiceOuterClass.internal_static_user_UpdateTeamUserResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gitlab.leonklein.user.TeamUserServiceOuterClass.internal_static_user_UpdateTeamUserResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gitlab.leonklein.user.UpdateTeamUserResponse.class, com.gitlab.leonklein.user.UpdateTeamUserResponse.Builder.class);
  }

  public static final int TEAMUSER_FIELD_NUMBER = 1;
  private com.gitlab.leonklein.user.TeamUser teamuser_;
  /**
   * <code>optional .user.TeamUser teamuser = 1;</code>
   */
  public boolean hasTeamuser() {
    return teamuser_ != null;
  }
  /**
   * <code>optional .user.TeamUser teamuser = 1;</code>
   */
  public com.gitlab.leonklein.user.TeamUser getTeamuser() {
    return teamuser_ == null ? com.gitlab.leonklein.user.TeamUser.getDefaultInstance() : teamuser_;
  }
  /**
   * <code>optional .user.TeamUser teamuser = 1;</code>
   */
  public com.gitlab.leonklein.user.TeamUserOrBuilder getTeamuserOrBuilder() {
    return getTeamuser();
  }

  public static final int TOTAL_BANS_FIELD_NUMBER = 2;
  private long totalBans_;
  /**
   * <code>optional int64 total_bans = 2;</code>
   */
  public long getTotalBans() {
    return totalBans_;
  }

  public static final int TOTAL_MUTES_FIELD_NUMBER = 3;
  private long totalMutes_;
  /**
   * <code>optional int64 total_mutes = 3;</code>
   */
  public long getTotalMutes() {
    return totalMutes_;
  }

  public static final int TOTAL_REPORTS_FIELD_NUMBER = 4;
  private long totalReports_;
  /**
   * <code>optional int64 total_reports = 4;</code>
   */
  public long getTotalReports() {
    return totalReports_;
  }

  public static final int TOTAL_WRONGBAN_FIELD_NUMBER = 5;
  private long totalWrongban_;
  /**
   * <code>optional int64 total_wrongban = 5;</code>
   */
  public long getTotalWrongban() {
    return totalWrongban_;
  }

  public static final int TOTAL_WRONGMUTE_FIELD_NUMBER = 6;
  private long totalWrongmute_;
  /**
   * <code>optional int64 total_wrongmute = 6;</code>
   */
  public long getTotalWrongmute() {
    return totalWrongmute_;
  }

  public static final int TOTAL_REPORTS_ACCEPT_FIELD_NUMBER = 7;
  private long totalReportsAccept_;
  /**
   * <code>optional int64 total_reports_accept = 7;</code>
   */
  public long getTotalReportsAccept() {
    return totalReportsAccept_;
  }

  public static final int TOTAL_REPORTS_DENIED_FIELD_NUMBER = 8;
  private long totalReportsDenied_;
  /**
   * <code>optional int64 total_reports_denied = 8;</code>
   */
  public long getTotalReportsDenied() {
    return totalReportsDenied_;
  }

  public static final int ADMISSION_FIELD_NUMBER = 9;
  private int admission_;
  /**
   * <code>optional int32 admission = 9;</code>
   */
  public int getAdmission() {
    return admission_;
  }

  public static final int UNIQUE_ID_FIELD_NUMBER = 10;
  private volatile java.lang.Object uniqueId_;
  /**
   * <code>optional string unique_id = 10;</code>
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
   * <code>optional string unique_id = 10;</code>
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
    if (teamuser_ != null) {
      output.writeMessage(1, getTeamuser());
    }
    if (totalBans_ != 0L) {
      output.writeInt64(2, totalBans_);
    }
    if (totalMutes_ != 0L) {
      output.writeInt64(3, totalMutes_);
    }
    if (totalReports_ != 0L) {
      output.writeInt64(4, totalReports_);
    }
    if (totalWrongban_ != 0L) {
      output.writeInt64(5, totalWrongban_);
    }
    if (totalWrongmute_ != 0L) {
      output.writeInt64(6, totalWrongmute_);
    }
    if (totalReportsAccept_ != 0L) {
      output.writeInt64(7, totalReportsAccept_);
    }
    if (totalReportsDenied_ != 0L) {
      output.writeInt64(8, totalReportsDenied_);
    }
    if (admission_ != 0) {
      output.writeInt32(9, admission_);
    }
    if (!getUniqueIdBytes().isEmpty()) {
      output.writeBytes(10, getUniqueIdBytes());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (teamuser_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTeamuser());
    }
    if (totalBans_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, totalBans_);
    }
    if (totalMutes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, totalMutes_);
    }
    if (totalReports_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, totalReports_);
    }
    if (totalWrongban_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, totalWrongban_);
    }
    if (totalWrongmute_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, totalWrongmute_);
    }
    if (totalReportsAccept_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, totalReportsAccept_);
    }
    if (totalReportsDenied_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, totalReportsDenied_);
    }
    if (admission_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(9, admission_);
    }
    if (!getUniqueIdBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(10, getUniqueIdBytes());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.gitlab.leonklein.user.UpdateTeamUserResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gitlab.leonklein.user.UpdateTeamUserResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gitlab.leonklein.user.UpdateTeamUserResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gitlab.leonklein.user.UpdateTeamUserResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gitlab.leonklein.user.UpdateTeamUserResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gitlab.leonklein.user.UpdateTeamUserResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.gitlab.leonklein.user.UpdateTeamUserResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.gitlab.leonklein.user.UpdateTeamUserResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.gitlab.leonklein.user.UpdateTeamUserResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gitlab.leonklein.user.UpdateTeamUserResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gitlab.leonklein.user.UpdateTeamUserResponse prototype) {
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
   * Protobuf type {@code user.UpdateTeamUserResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:user.UpdateTeamUserResponse)
      com.gitlab.leonklein.user.UpdateTeamUserResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gitlab.leonklein.user.TeamUserServiceOuterClass.internal_static_user_UpdateTeamUserResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gitlab.leonklein.user.TeamUserServiceOuterClass.internal_static_user_UpdateTeamUserResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gitlab.leonklein.user.UpdateTeamUserResponse.class, com.gitlab.leonklein.user.UpdateTeamUserResponse.Builder.class);
    }

    // Construct using com.gitlab.leonklein.user.UpdateTeamUserResponse.newBuilder()
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
      if (teamuserBuilder_ == null) {
        teamuser_ = null;
      } else {
        teamuser_ = null;
        teamuserBuilder_ = null;
      }
      totalBans_ = 0L;

      totalMutes_ = 0L;

      totalReports_ = 0L;

      totalWrongban_ = 0L;

      totalWrongmute_ = 0L;

      totalReportsAccept_ = 0L;

      totalReportsDenied_ = 0L;

      admission_ = 0;

      uniqueId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gitlab.leonklein.user.TeamUserServiceOuterClass.internal_static_user_UpdateTeamUserResponse_descriptor;
    }

    public com.gitlab.leonklein.user.UpdateTeamUserResponse getDefaultInstanceForType() {
      return com.gitlab.leonklein.user.UpdateTeamUserResponse.getDefaultInstance();
    }

    public com.gitlab.leonklein.user.UpdateTeamUserResponse build() {
      com.gitlab.leonklein.user.UpdateTeamUserResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.gitlab.leonklein.user.UpdateTeamUserResponse buildPartial() {
      com.gitlab.leonklein.user.UpdateTeamUserResponse result = new com.gitlab.leonklein.user.UpdateTeamUserResponse(this);
      if (teamuserBuilder_ == null) {
        result.teamuser_ = teamuser_;
      } else {
        result.teamuser_ = teamuserBuilder_.build();
      }
      result.totalBans_ = totalBans_;
      result.totalMutes_ = totalMutes_;
      result.totalReports_ = totalReports_;
      result.totalWrongban_ = totalWrongban_;
      result.totalWrongmute_ = totalWrongmute_;
      result.totalReportsAccept_ = totalReportsAccept_;
      result.totalReportsDenied_ = totalReportsDenied_;
      result.admission_ = admission_;
      result.uniqueId_ = uniqueId_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gitlab.leonklein.user.UpdateTeamUserResponse) {
        return mergeFrom((com.gitlab.leonklein.user.UpdateTeamUserResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gitlab.leonklein.user.UpdateTeamUserResponse other) {
      if (other == com.gitlab.leonklein.user.UpdateTeamUserResponse.getDefaultInstance()) return this;
      if (other.hasTeamuser()) {
        mergeTeamuser(other.getTeamuser());
      }
      if (other.getTotalBans() != 0L) {
        setTotalBans(other.getTotalBans());
      }
      if (other.getTotalMutes() != 0L) {
        setTotalMutes(other.getTotalMutes());
      }
      if (other.getTotalReports() != 0L) {
        setTotalReports(other.getTotalReports());
      }
      if (other.getTotalWrongban() != 0L) {
        setTotalWrongban(other.getTotalWrongban());
      }
      if (other.getTotalWrongmute() != 0L) {
        setTotalWrongmute(other.getTotalWrongmute());
      }
      if (other.getTotalReportsAccept() != 0L) {
        setTotalReportsAccept(other.getTotalReportsAccept());
      }
      if (other.getTotalReportsDenied() != 0L) {
        setTotalReportsDenied(other.getTotalReportsDenied());
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
      com.gitlab.leonklein.user.UpdateTeamUserResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gitlab.leonklein.user.UpdateTeamUserResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.gitlab.leonklein.user.TeamUser teamuser_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.gitlab.leonklein.user.TeamUser, com.gitlab.leonklein.user.TeamUser.Builder, com.gitlab.leonklein.user.TeamUserOrBuilder> teamuserBuilder_;
    /**
     * <code>optional .user.TeamUser teamuser = 1;</code>
     */
    public boolean hasTeamuser() {
      return teamuserBuilder_ != null || teamuser_ != null;
    }
    /**
     * <code>optional .user.TeamUser teamuser = 1;</code>
     */
    public com.gitlab.leonklein.user.TeamUser getTeamuser() {
      if (teamuserBuilder_ == null) {
        return teamuser_ == null ? com.gitlab.leonklein.user.TeamUser.getDefaultInstance() : teamuser_;
      } else {
        return teamuserBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .user.TeamUser teamuser = 1;</code>
     */
    public Builder setTeamuser(com.gitlab.leonklein.user.TeamUser value) {
      if (teamuserBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        teamuser_ = value;
        onChanged();
      } else {
        teamuserBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .user.TeamUser teamuser = 1;</code>
     */
    public Builder setTeamuser(
        com.gitlab.leonklein.user.TeamUser.Builder builderForValue) {
      if (teamuserBuilder_ == null) {
        teamuser_ = builderForValue.build();
        onChanged();
      } else {
        teamuserBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .user.TeamUser teamuser = 1;</code>
     */
    public Builder mergeTeamuser(com.gitlab.leonklein.user.TeamUser value) {
      if (teamuserBuilder_ == null) {
        if (teamuser_ != null) {
          teamuser_ =
            com.gitlab.leonklein.user.TeamUser.newBuilder(teamuser_).mergeFrom(value).buildPartial();
        } else {
          teamuser_ = value;
        }
        onChanged();
      } else {
        teamuserBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .user.TeamUser teamuser = 1;</code>
     */
    public Builder clearTeamuser() {
      if (teamuserBuilder_ == null) {
        teamuser_ = null;
        onChanged();
      } else {
        teamuser_ = null;
        teamuserBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .user.TeamUser teamuser = 1;</code>
     */
    public com.gitlab.leonklein.user.TeamUser.Builder getTeamuserBuilder() {
      
      onChanged();
      return getTeamuserFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .user.TeamUser teamuser = 1;</code>
     */
    public com.gitlab.leonklein.user.TeamUserOrBuilder getTeamuserOrBuilder() {
      if (teamuserBuilder_ != null) {
        return teamuserBuilder_.getMessageOrBuilder();
      } else {
        return teamuser_ == null ?
            com.gitlab.leonklein.user.TeamUser.getDefaultInstance() : teamuser_;
      }
    }
    /**
     * <code>optional .user.TeamUser teamuser = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.gitlab.leonklein.user.TeamUser, com.gitlab.leonklein.user.TeamUser.Builder, com.gitlab.leonklein.user.TeamUserOrBuilder> 
        getTeamuserFieldBuilder() {
      if (teamuserBuilder_ == null) {
        teamuserBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.gitlab.leonklein.user.TeamUser, com.gitlab.leonklein.user.TeamUser.Builder, com.gitlab.leonklein.user.TeamUserOrBuilder>(
                getTeamuser(),
                getParentForChildren(),
                isClean());
        teamuser_ = null;
      }
      return teamuserBuilder_;
    }

    private long totalBans_ ;
    /**
     * <code>optional int64 total_bans = 2;</code>
     */
    public long getTotalBans() {
      return totalBans_;
    }
    /**
     * <code>optional int64 total_bans = 2;</code>
     */
    public Builder setTotalBans(long value) {
      
      totalBans_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 total_bans = 2;</code>
     */
    public Builder clearTotalBans() {
      
      totalBans_ = 0L;
      onChanged();
      return this;
    }

    private long totalMutes_ ;
    /**
     * <code>optional int64 total_mutes = 3;</code>
     */
    public long getTotalMutes() {
      return totalMutes_;
    }
    /**
     * <code>optional int64 total_mutes = 3;</code>
     */
    public Builder setTotalMutes(long value) {
      
      totalMutes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 total_mutes = 3;</code>
     */
    public Builder clearTotalMutes() {
      
      totalMutes_ = 0L;
      onChanged();
      return this;
    }

    private long totalReports_ ;
    /**
     * <code>optional int64 total_reports = 4;</code>
     */
    public long getTotalReports() {
      return totalReports_;
    }
    /**
     * <code>optional int64 total_reports = 4;</code>
     */
    public Builder setTotalReports(long value) {
      
      totalReports_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 total_reports = 4;</code>
     */
    public Builder clearTotalReports() {
      
      totalReports_ = 0L;
      onChanged();
      return this;
    }

    private long totalWrongban_ ;
    /**
     * <code>optional int64 total_wrongban = 5;</code>
     */
    public long getTotalWrongban() {
      return totalWrongban_;
    }
    /**
     * <code>optional int64 total_wrongban = 5;</code>
     */
    public Builder setTotalWrongban(long value) {
      
      totalWrongban_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 total_wrongban = 5;</code>
     */
    public Builder clearTotalWrongban() {
      
      totalWrongban_ = 0L;
      onChanged();
      return this;
    }

    private long totalWrongmute_ ;
    /**
     * <code>optional int64 total_wrongmute = 6;</code>
     */
    public long getTotalWrongmute() {
      return totalWrongmute_;
    }
    /**
     * <code>optional int64 total_wrongmute = 6;</code>
     */
    public Builder setTotalWrongmute(long value) {
      
      totalWrongmute_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 total_wrongmute = 6;</code>
     */
    public Builder clearTotalWrongmute() {
      
      totalWrongmute_ = 0L;
      onChanged();
      return this;
    }

    private long totalReportsAccept_ ;
    /**
     * <code>optional int64 total_reports_accept = 7;</code>
     */
    public long getTotalReportsAccept() {
      return totalReportsAccept_;
    }
    /**
     * <code>optional int64 total_reports_accept = 7;</code>
     */
    public Builder setTotalReportsAccept(long value) {
      
      totalReportsAccept_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 total_reports_accept = 7;</code>
     */
    public Builder clearTotalReportsAccept() {
      
      totalReportsAccept_ = 0L;
      onChanged();
      return this;
    }

    private long totalReportsDenied_ ;
    /**
     * <code>optional int64 total_reports_denied = 8;</code>
     */
    public long getTotalReportsDenied() {
      return totalReportsDenied_;
    }
    /**
     * <code>optional int64 total_reports_denied = 8;</code>
     */
    public Builder setTotalReportsDenied(long value) {
      
      totalReportsDenied_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 total_reports_denied = 8;</code>
     */
    public Builder clearTotalReportsDenied() {
      
      totalReportsDenied_ = 0L;
      onChanged();
      return this;
    }

    private int admission_ ;
    /**
     * <code>optional int32 admission = 9;</code>
     */
    public int getAdmission() {
      return admission_;
    }
    /**
     * <code>optional int32 admission = 9;</code>
     */
    public Builder setAdmission(int value) {
      
      admission_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 admission = 9;</code>
     */
    public Builder clearAdmission() {
      
      admission_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object uniqueId_ = "";
    /**
     * <code>optional string unique_id = 10;</code>
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
     * <code>optional string unique_id = 10;</code>
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
     * <code>optional string unique_id = 10;</code>
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
     * <code>optional string unique_id = 10;</code>
     */
    public Builder clearUniqueId() {
      
      uniqueId_ = getDefaultInstance().getUniqueId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string unique_id = 10;</code>
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


    // @@protoc_insertion_point(builder_scope:user.UpdateTeamUserResponse)
  }

  // @@protoc_insertion_point(class_scope:user.UpdateTeamUserResponse)
  private static final com.gitlab.leonklein.user.UpdateTeamUserResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gitlab.leonklein.user.UpdateTeamUserResponse();
  }

  public static com.gitlab.leonklein.user.UpdateTeamUserResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<UpdateTeamUserResponse> PARSER =
      new com.google.protobuf.AbstractParser<UpdateTeamUserResponse>() {
    public UpdateTeamUserResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new UpdateTeamUserResponse(input, extensionRegistry);
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
  public com.google.protobuf.Parser<UpdateTeamUserResponse> getParserForType() {
    return PARSER;
  }

  public com.gitlab.leonklein.user.UpdateTeamUserResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

