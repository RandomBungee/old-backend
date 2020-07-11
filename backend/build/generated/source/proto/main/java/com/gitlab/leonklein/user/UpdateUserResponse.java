// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/user_service.proto

package com.gitlab.leonklein.user;

/**
 * Protobuf type {@code user.UpdateUserResponse}
 */
public  final class UpdateUserResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:user.UpdateUserResponse)
    UpdateUserResponseOrBuilder {
  // Use UpdateUserResponse.newBuilder() to construct.
  private UpdateUserResponse(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private UpdateUserResponse() {
    rank_ = "";
    coins_ = 0L;
    wins_ = 0L;
    banHistory_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    teamspekUnique_ = "";
    discordTag_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UpdateUserResponse(
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
            com.gitlab.leonklein.user.User.Builder subBuilder = null;
            if (user_ != null) {
              subBuilder = user_.toBuilder();
            }
            user_ = input.readMessage(com.gitlab.leonklein.user.User.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(user_);
              user_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();

            rank_ = bs;
            break;
          }
          case 24: {

            coins_ = input.readInt64();
            break;
          }
          case 32: {

            wins_ = input.readInt64();
            break;
          }
          case 42: {
            com.google.protobuf.ByteString bs = input.readBytes();
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              banHistory_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000010;
            }
            banHistory_.add(bs);
            break;
          }
          case 50: {
            com.google.protobuf.ByteString bs = input.readBytes();

            teamspekUnique_ = bs;
            break;
          }
          case 58: {
            com.google.protobuf.ByteString bs = input.readBytes();

            discordTag_ = bs;
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
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        banHistory_ = banHistory_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gitlab.leonklein.user.UserServiceOuterClass.internal_static_user_UpdateUserResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gitlab.leonklein.user.UserServiceOuterClass.internal_static_user_UpdateUserResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gitlab.leonklein.user.UpdateUserResponse.class, com.gitlab.leonklein.user.UpdateUserResponse.Builder.class);
  }

  private int bitField0_;
  public static final int USER_FIELD_NUMBER = 1;
  private com.gitlab.leonklein.user.User user_;
  /**
   * <code>optional .user.User user = 1;</code>
   */
  public boolean hasUser() {
    return user_ != null;
  }
  /**
   * <code>optional .user.User user = 1;</code>
   */
  public com.gitlab.leonklein.user.User getUser() {
    return user_ == null ? com.gitlab.leonklein.user.User.getDefaultInstance() : user_;
  }
  /**
   * <code>optional .user.User user = 1;</code>
   */
  public com.gitlab.leonklein.user.UserOrBuilder getUserOrBuilder() {
    return getUser();
  }

  public static final int RANK_FIELD_NUMBER = 2;
  private volatile java.lang.Object rank_;
  /**
   * <code>optional string rank = 2;</code>
   */
  public java.lang.String getRank() {
    java.lang.Object ref = rank_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        rank_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string rank = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRankBytes() {
    java.lang.Object ref = rank_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rank_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COINS_FIELD_NUMBER = 3;
  private long coins_;
  /**
   * <code>optional int64 coins = 3;</code>
   */
  public long getCoins() {
    return coins_;
  }

  public static final int WINS_FIELD_NUMBER = 4;
  private long wins_;
  /**
   * <code>optional int64 wins = 4;</code>
   */
  public long getWins() {
    return wins_;
  }

  public static final int BAN_HISTORY_FIELD_NUMBER = 5;
  private com.google.protobuf.LazyStringList banHistory_;
  /**
   * <code>repeated string ban_history = 5;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getBanHistoryList() {
    return banHistory_;
  }
  /**
   * <code>repeated string ban_history = 5;</code>
   */
  public int getBanHistoryCount() {
    return banHistory_.size();
  }
  /**
   * <code>repeated string ban_history = 5;</code>
   */
  public java.lang.String getBanHistory(int index) {
    return banHistory_.get(index);
  }
  /**
   * <code>repeated string ban_history = 5;</code>
   */
  public com.google.protobuf.ByteString
      getBanHistoryBytes(int index) {
    return banHistory_.getByteString(index);
  }

  public static final int TEAMSPEK_UNIQUE_FIELD_NUMBER = 6;
  private volatile java.lang.Object teamspekUnique_;
  /**
   * <code>optional string teamspek_unique = 6;</code>
   */
  public java.lang.String getTeamspekUnique() {
    java.lang.Object ref = teamspekUnique_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        teamspekUnique_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string teamspek_unique = 6;</code>
   */
  public com.google.protobuf.ByteString
      getTeamspekUniqueBytes() {
    java.lang.Object ref = teamspekUnique_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      teamspekUnique_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISCORD_TAG_FIELD_NUMBER = 7;
  private volatile java.lang.Object discordTag_;
  /**
   * <code>optional string discord_tag = 7;</code>
   */
  public java.lang.String getDiscordTag() {
    java.lang.Object ref = discordTag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        discordTag_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string discord_tag = 7;</code>
   */
  public com.google.protobuf.ByteString
      getDiscordTagBytes() {
    java.lang.Object ref = discordTag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      discordTag_ = b;
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
    if (user_ != null) {
      output.writeMessage(1, getUser());
    }
    if (!getRankBytes().isEmpty()) {
      output.writeBytes(2, getRankBytes());
    }
    if (coins_ != 0L) {
      output.writeInt64(3, coins_);
    }
    if (wins_ != 0L) {
      output.writeInt64(4, wins_);
    }
    for (int i = 0; i < banHistory_.size(); i++) {
      output.writeBytes(5, banHistory_.getByteString(i));
    }
    if (!getTeamspekUniqueBytes().isEmpty()) {
      output.writeBytes(6, getTeamspekUniqueBytes());
    }
    if (!getDiscordTagBytes().isEmpty()) {
      output.writeBytes(7, getDiscordTagBytes());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (user_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUser());
    }
    if (!getRankBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getRankBytes());
    }
    if (coins_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, coins_);
    }
    if (wins_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, wins_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < banHistory_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(banHistory_.getByteString(i));
      }
      size += dataSize;
      size += 1 * getBanHistoryList().size();
    }
    if (!getTeamspekUniqueBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(6, getTeamspekUniqueBytes());
    }
    if (!getDiscordTagBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(7, getDiscordTagBytes());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.gitlab.leonklein.user.UpdateUserResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gitlab.leonklein.user.UpdateUserResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gitlab.leonklein.user.UpdateUserResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gitlab.leonklein.user.UpdateUserResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gitlab.leonklein.user.UpdateUserResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gitlab.leonklein.user.UpdateUserResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.gitlab.leonklein.user.UpdateUserResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.gitlab.leonklein.user.UpdateUserResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.gitlab.leonklein.user.UpdateUserResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gitlab.leonklein.user.UpdateUserResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gitlab.leonklein.user.UpdateUserResponse prototype) {
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
   * Protobuf type {@code user.UpdateUserResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:user.UpdateUserResponse)
      com.gitlab.leonklein.user.UpdateUserResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gitlab.leonklein.user.UserServiceOuterClass.internal_static_user_UpdateUserResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gitlab.leonklein.user.UserServiceOuterClass.internal_static_user_UpdateUserResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gitlab.leonklein.user.UpdateUserResponse.class, com.gitlab.leonklein.user.UpdateUserResponse.Builder.class);
    }

    // Construct using com.gitlab.leonklein.user.UpdateUserResponse.newBuilder()
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
      if (userBuilder_ == null) {
        user_ = null;
      } else {
        user_ = null;
        userBuilder_ = null;
      }
      rank_ = "";

      coins_ = 0L;

      wins_ = 0L;

      banHistory_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      teamspekUnique_ = "";

      discordTag_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gitlab.leonklein.user.UserServiceOuterClass.internal_static_user_UpdateUserResponse_descriptor;
    }

    public com.gitlab.leonklein.user.UpdateUserResponse getDefaultInstanceForType() {
      return com.gitlab.leonklein.user.UpdateUserResponse.getDefaultInstance();
    }

    public com.gitlab.leonklein.user.UpdateUserResponse build() {
      com.gitlab.leonklein.user.UpdateUserResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.gitlab.leonklein.user.UpdateUserResponse buildPartial() {
      com.gitlab.leonklein.user.UpdateUserResponse result = new com.gitlab.leonklein.user.UpdateUserResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (userBuilder_ == null) {
        result.user_ = user_;
      } else {
        result.user_ = userBuilder_.build();
      }
      result.rank_ = rank_;
      result.coins_ = coins_;
      result.wins_ = wins_;
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        banHistory_ = banHistory_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000010);
      }
      result.banHistory_ = banHistory_;
      result.teamspekUnique_ = teamspekUnique_;
      result.discordTag_ = discordTag_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gitlab.leonklein.user.UpdateUserResponse) {
        return mergeFrom((com.gitlab.leonklein.user.UpdateUserResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gitlab.leonklein.user.UpdateUserResponse other) {
      if (other == com.gitlab.leonklein.user.UpdateUserResponse.getDefaultInstance()) return this;
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      if (!other.getRank().isEmpty()) {
        rank_ = other.rank_;
        onChanged();
      }
      if (other.getCoins() != 0L) {
        setCoins(other.getCoins());
      }
      if (other.getWins() != 0L) {
        setWins(other.getWins());
      }
      if (!other.banHistory_.isEmpty()) {
        if (banHistory_.isEmpty()) {
          banHistory_ = other.banHistory_;
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          ensureBanHistoryIsMutable();
          banHistory_.addAll(other.banHistory_);
        }
        onChanged();
      }
      if (!other.getTeamspekUnique().isEmpty()) {
        teamspekUnique_ = other.teamspekUnique_;
        onChanged();
      }
      if (!other.getDiscordTag().isEmpty()) {
        discordTag_ = other.discordTag_;
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
      com.gitlab.leonklein.user.UpdateUserResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gitlab.leonklein.user.UpdateUserResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.gitlab.leonklein.user.User user_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.gitlab.leonklein.user.User, com.gitlab.leonklein.user.User.Builder, com.gitlab.leonklein.user.UserOrBuilder> userBuilder_;
    /**
     * <code>optional .user.User user = 1;</code>
     */
    public boolean hasUser() {
      return userBuilder_ != null || user_ != null;
    }
    /**
     * <code>optional .user.User user = 1;</code>
     */
    public com.gitlab.leonklein.user.User getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? com.gitlab.leonklein.user.User.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .user.User user = 1;</code>
     */
    public Builder setUser(com.gitlab.leonklein.user.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
        onChanged();
      } else {
        userBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .user.User user = 1;</code>
     */
    public Builder setUser(
        com.gitlab.leonklein.user.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
        onChanged();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .user.User user = 1;</code>
     */
    public Builder mergeUser(com.gitlab.leonklein.user.User value) {
      if (userBuilder_ == null) {
        if (user_ != null) {
          user_ =
            com.gitlab.leonklein.user.User.newBuilder(user_).mergeFrom(value).buildPartial();
        } else {
          user_ = value;
        }
        onChanged();
      } else {
        userBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .user.User user = 1;</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        user_ = null;
        onChanged();
      } else {
        user_ = null;
        userBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .user.User user = 1;</code>
     */
    public com.gitlab.leonklein.user.User.Builder getUserBuilder() {
      
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .user.User user = 1;</code>
     */
    public com.gitlab.leonklein.user.UserOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            com.gitlab.leonklein.user.User.getDefaultInstance() : user_;
      }
    }
    /**
     * <code>optional .user.User user = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.gitlab.leonklein.user.User, com.gitlab.leonklein.user.User.Builder, com.gitlab.leonklein.user.UserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.gitlab.leonklein.user.User, com.gitlab.leonklein.user.User.Builder, com.gitlab.leonklein.user.UserOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }

    private java.lang.Object rank_ = "";
    /**
     * <code>optional string rank = 2;</code>
     */
    public java.lang.String getRank() {
      java.lang.Object ref = rank_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          rank_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string rank = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRankBytes() {
      java.lang.Object ref = rank_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rank_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string rank = 2;</code>
     */
    public Builder setRank(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rank_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string rank = 2;</code>
     */
    public Builder clearRank() {
      
      rank_ = getDefaultInstance().getRank();
      onChanged();
      return this;
    }
    /**
     * <code>optional string rank = 2;</code>
     */
    public Builder setRankBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rank_ = value;
      onChanged();
      return this;
    }

    private long coins_ ;
    /**
     * <code>optional int64 coins = 3;</code>
     */
    public long getCoins() {
      return coins_;
    }
    /**
     * <code>optional int64 coins = 3;</code>
     */
    public Builder setCoins(long value) {
      
      coins_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 coins = 3;</code>
     */
    public Builder clearCoins() {
      
      coins_ = 0L;
      onChanged();
      return this;
    }

    private long wins_ ;
    /**
     * <code>optional int64 wins = 4;</code>
     */
    public long getWins() {
      return wins_;
    }
    /**
     * <code>optional int64 wins = 4;</code>
     */
    public Builder setWins(long value) {
      
      wins_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 wins = 4;</code>
     */
    public Builder clearWins() {
      
      wins_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList banHistory_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureBanHistoryIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        banHistory_ = new com.google.protobuf.LazyStringArrayList(banHistory_);
        bitField0_ |= 0x00000010;
       }
    }
    /**
     * <code>repeated string ban_history = 5;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getBanHistoryList() {
      return banHistory_.getUnmodifiableView();
    }
    /**
     * <code>repeated string ban_history = 5;</code>
     */
    public int getBanHistoryCount() {
      return banHistory_.size();
    }
    /**
     * <code>repeated string ban_history = 5;</code>
     */
    public java.lang.String getBanHistory(int index) {
      return banHistory_.get(index);
    }
    /**
     * <code>repeated string ban_history = 5;</code>
     */
    public com.google.protobuf.ByteString
        getBanHistoryBytes(int index) {
      return banHistory_.getByteString(index);
    }
    /**
     * <code>repeated string ban_history = 5;</code>
     */
    public Builder setBanHistory(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureBanHistoryIsMutable();
      banHistory_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ban_history = 5;</code>
     */
    public Builder addBanHistory(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureBanHistoryIsMutable();
      banHistory_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ban_history = 5;</code>
     */
    public Builder addAllBanHistory(
        java.lang.Iterable<java.lang.String> values) {
      ensureBanHistoryIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, banHistory_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ban_history = 5;</code>
     */
    public Builder clearBanHistory() {
      banHistory_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ban_history = 5;</code>
     */
    public Builder addBanHistoryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureBanHistoryIsMutable();
      banHistory_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object teamspekUnique_ = "";
    /**
     * <code>optional string teamspek_unique = 6;</code>
     */
    public java.lang.String getTeamspekUnique() {
      java.lang.Object ref = teamspekUnique_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          teamspekUnique_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string teamspek_unique = 6;</code>
     */
    public com.google.protobuf.ByteString
        getTeamspekUniqueBytes() {
      java.lang.Object ref = teamspekUnique_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        teamspekUnique_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string teamspek_unique = 6;</code>
     */
    public Builder setTeamspekUnique(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      teamspekUnique_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string teamspek_unique = 6;</code>
     */
    public Builder clearTeamspekUnique() {
      
      teamspekUnique_ = getDefaultInstance().getTeamspekUnique();
      onChanged();
      return this;
    }
    /**
     * <code>optional string teamspek_unique = 6;</code>
     */
    public Builder setTeamspekUniqueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      teamspekUnique_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object discordTag_ = "";
    /**
     * <code>optional string discord_tag = 7;</code>
     */
    public java.lang.String getDiscordTag() {
      java.lang.Object ref = discordTag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          discordTag_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string discord_tag = 7;</code>
     */
    public com.google.protobuf.ByteString
        getDiscordTagBytes() {
      java.lang.Object ref = discordTag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        discordTag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string discord_tag = 7;</code>
     */
    public Builder setDiscordTag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      discordTag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string discord_tag = 7;</code>
     */
    public Builder clearDiscordTag() {
      
      discordTag_ = getDefaultInstance().getDiscordTag();
      onChanged();
      return this;
    }
    /**
     * <code>optional string discord_tag = 7;</code>
     */
    public Builder setDiscordTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      discordTag_ = value;
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


    // @@protoc_insertion_point(builder_scope:user.UpdateUserResponse)
  }

  // @@protoc_insertion_point(class_scope:user.UpdateUserResponse)
  private static final com.gitlab.leonklein.user.UpdateUserResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gitlab.leonklein.user.UpdateUserResponse();
  }

  public static com.gitlab.leonklein.user.UpdateUserResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<UpdateUserResponse> PARSER =
      new com.google.protobuf.AbstractParser<UpdateUserResponse>() {
    public UpdateUserResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new UpdateUserResponse(input, extensionRegistry);
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
  public com.google.protobuf.Parser<UpdateUserResponse> getParserForType() {
    return PARSER;
  }

  public com.gitlab.leonklein.user.UpdateUserResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
