// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chatlog/chatlog.proto

package com.gitlab.leonklein.chatlog;

/**
 * Protobuf type {@code group.Chatlog}
 */
public  final class Chatlog extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:group.Chatlog)
    ChatlogOrBuilder {
  // Use Chatlog.newBuilder() to construct.
  private Chatlog(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private Chatlog() {
    creator_ = "";
    reported_ = "";
    server_ = "";
    messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Chatlog(
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
            com.google.protobuf.ByteString bs = input.readBytes();

            creator_ = bs;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();

            reported_ = bs;
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();

            server_ = bs;
            break;
          }
          case 34: {
            com.google.protobuf.ByteString bs = input.readBytes();
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              messages_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000008;
            }
            messages_.add(bs);
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        messages_ = messages_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gitlab.leonklein.chatlog.ChatlogOuterClass.internal_static_group_Chatlog_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gitlab.leonklein.chatlog.ChatlogOuterClass.internal_static_group_Chatlog_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gitlab.leonklein.chatlog.Chatlog.class, com.gitlab.leonklein.chatlog.Chatlog.Builder.class);
  }

  private int bitField0_;
  public static final int CREATOR_FIELD_NUMBER = 1;
  private volatile java.lang.Object creator_;
  /**
   * <code>optional string creator = 1;</code>
   */
  public java.lang.String getCreator() {
    java.lang.Object ref = creator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        creator_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string creator = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCreatorBytes() {
    java.lang.Object ref = creator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      creator_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REPORTED_FIELD_NUMBER = 2;
  private volatile java.lang.Object reported_;
  /**
   * <code>optional string reported = 2;</code>
   */
  public java.lang.String getReported() {
    java.lang.Object ref = reported_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        reported_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string reported = 2;</code>
   */
  public com.google.protobuf.ByteString
      getReportedBytes() {
    java.lang.Object ref = reported_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      reported_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVER_FIELD_NUMBER = 3;
  private volatile java.lang.Object server_;
  /**
   * <code>optional string server = 3;</code>
   */
  public java.lang.String getServer() {
    java.lang.Object ref = server_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        server_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string server = 3;</code>
   */
  public com.google.protobuf.ByteString
      getServerBytes() {
    java.lang.Object ref = server_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      server_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGES_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList messages_;
  /**
   * <code>repeated string messages = 4;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getMessagesList() {
    return messages_;
  }
  /**
   * <code>repeated string messages = 4;</code>
   */
  public int getMessagesCount() {
    return messages_.size();
  }
  /**
   * <code>repeated string messages = 4;</code>
   */
  public java.lang.String getMessages(int index) {
    return messages_.get(index);
  }
  /**
   * <code>repeated string messages = 4;</code>
   */
  public com.google.protobuf.ByteString
      getMessagesBytes(int index) {
    return messages_.getByteString(index);
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
    if (!getCreatorBytes().isEmpty()) {
      output.writeBytes(1, getCreatorBytes());
    }
    if (!getReportedBytes().isEmpty()) {
      output.writeBytes(2, getReportedBytes());
    }
    if (!getServerBytes().isEmpty()) {
      output.writeBytes(3, getServerBytes());
    }
    for (int i = 0; i < messages_.size(); i++) {
      output.writeBytes(4, messages_.getByteString(i));
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCreatorBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getCreatorBytes());
    }
    if (!getReportedBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getReportedBytes());
    }
    if (!getServerBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, getServerBytes());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < messages_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(messages_.getByteString(i));
      }
      size += dataSize;
      size += 1 * getMessagesList().size();
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.gitlab.leonklein.chatlog.Chatlog parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gitlab.leonklein.chatlog.Chatlog parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gitlab.leonklein.chatlog.Chatlog parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gitlab.leonklein.chatlog.Chatlog parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gitlab.leonklein.chatlog.Chatlog parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gitlab.leonklein.chatlog.Chatlog parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.gitlab.leonklein.chatlog.Chatlog parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.gitlab.leonklein.chatlog.Chatlog parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.gitlab.leonklein.chatlog.Chatlog parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gitlab.leonklein.chatlog.Chatlog parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gitlab.leonklein.chatlog.Chatlog prototype) {
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
   * Protobuf type {@code group.Chatlog}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:group.Chatlog)
      com.gitlab.leonklein.chatlog.ChatlogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gitlab.leonklein.chatlog.ChatlogOuterClass.internal_static_group_Chatlog_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gitlab.leonklein.chatlog.ChatlogOuterClass.internal_static_group_Chatlog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gitlab.leonklein.chatlog.Chatlog.class, com.gitlab.leonklein.chatlog.Chatlog.Builder.class);
    }

    // Construct using com.gitlab.leonklein.chatlog.Chatlog.newBuilder()
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
      creator_ = "";

      reported_ = "";

      server_ = "";

      messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gitlab.leonklein.chatlog.ChatlogOuterClass.internal_static_group_Chatlog_descriptor;
    }

    public com.gitlab.leonklein.chatlog.Chatlog getDefaultInstanceForType() {
      return com.gitlab.leonklein.chatlog.Chatlog.getDefaultInstance();
    }

    public com.gitlab.leonklein.chatlog.Chatlog build() {
      com.gitlab.leonklein.chatlog.Chatlog result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.gitlab.leonklein.chatlog.Chatlog buildPartial() {
      com.gitlab.leonklein.chatlog.Chatlog result = new com.gitlab.leonklein.chatlog.Chatlog(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.creator_ = creator_;
      result.reported_ = reported_;
      result.server_ = server_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        messages_ = messages_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.messages_ = messages_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gitlab.leonklein.chatlog.Chatlog) {
        return mergeFrom((com.gitlab.leonklein.chatlog.Chatlog)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gitlab.leonklein.chatlog.Chatlog other) {
      if (other == com.gitlab.leonklein.chatlog.Chatlog.getDefaultInstance()) return this;
      if (!other.getCreator().isEmpty()) {
        creator_ = other.creator_;
        onChanged();
      }
      if (!other.getReported().isEmpty()) {
        reported_ = other.reported_;
        onChanged();
      }
      if (!other.getServer().isEmpty()) {
        server_ = other.server_;
        onChanged();
      }
      if (!other.messages_.isEmpty()) {
        if (messages_.isEmpty()) {
          messages_ = other.messages_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureMessagesIsMutable();
          messages_.addAll(other.messages_);
        }
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
      com.gitlab.leonklein.chatlog.Chatlog parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gitlab.leonklein.chatlog.Chatlog) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object creator_ = "";
    /**
     * <code>optional string creator = 1;</code>
     */
    public java.lang.String getCreator() {
      java.lang.Object ref = creator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          creator_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string creator = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCreatorBytes() {
      java.lang.Object ref = creator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        creator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string creator = 1;</code>
     */
    public Builder setCreator(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      creator_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string creator = 1;</code>
     */
    public Builder clearCreator() {
      
      creator_ = getDefaultInstance().getCreator();
      onChanged();
      return this;
    }
    /**
     * <code>optional string creator = 1;</code>
     */
    public Builder setCreatorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      creator_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object reported_ = "";
    /**
     * <code>optional string reported = 2;</code>
     */
    public java.lang.String getReported() {
      java.lang.Object ref = reported_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          reported_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string reported = 2;</code>
     */
    public com.google.protobuf.ByteString
        getReportedBytes() {
      java.lang.Object ref = reported_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reported_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string reported = 2;</code>
     */
    public Builder setReported(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      reported_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string reported = 2;</code>
     */
    public Builder clearReported() {
      
      reported_ = getDefaultInstance().getReported();
      onChanged();
      return this;
    }
    /**
     * <code>optional string reported = 2;</code>
     */
    public Builder setReportedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      reported_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object server_ = "";
    /**
     * <code>optional string server = 3;</code>
     */
    public java.lang.String getServer() {
      java.lang.Object ref = server_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          server_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string server = 3;</code>
     */
    public com.google.protobuf.ByteString
        getServerBytes() {
      java.lang.Object ref = server_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        server_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string server = 3;</code>
     */
    public Builder setServer(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      server_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string server = 3;</code>
     */
    public Builder clearServer() {
      
      server_ = getDefaultInstance().getServer();
      onChanged();
      return this;
    }
    /**
     * <code>optional string server = 3;</code>
     */
    public Builder setServerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      server_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureMessagesIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        messages_ = new com.google.protobuf.LazyStringArrayList(messages_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated string messages = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getMessagesList() {
      return messages_.getUnmodifiableView();
    }
    /**
     * <code>repeated string messages = 4;</code>
     */
    public int getMessagesCount() {
      return messages_.size();
    }
    /**
     * <code>repeated string messages = 4;</code>
     */
    public java.lang.String getMessages(int index) {
      return messages_.get(index);
    }
    /**
     * <code>repeated string messages = 4;</code>
     */
    public com.google.protobuf.ByteString
        getMessagesBytes(int index) {
      return messages_.getByteString(index);
    }
    /**
     * <code>repeated string messages = 4;</code>
     */
    public Builder setMessages(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMessagesIsMutable();
      messages_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string messages = 4;</code>
     */
    public Builder addMessages(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMessagesIsMutable();
      messages_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string messages = 4;</code>
     */
    public Builder addAllMessages(
        java.lang.Iterable<java.lang.String> values) {
      ensureMessagesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, messages_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string messages = 4;</code>
     */
    public Builder clearMessages() {
      messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string messages = 4;</code>
     */
    public Builder addMessagesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMessagesIsMutable();
      messages_.add(value);
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


    // @@protoc_insertion_point(builder_scope:group.Chatlog)
  }

  // @@protoc_insertion_point(class_scope:group.Chatlog)
  private static final com.gitlab.leonklein.chatlog.Chatlog DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gitlab.leonklein.chatlog.Chatlog();
  }

  public static com.gitlab.leonklein.chatlog.Chatlog getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<Chatlog> PARSER =
      new com.google.protobuf.AbstractParser<Chatlog>() {
    public Chatlog parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new Chatlog(input, extensionRegistry);
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
  public com.google.protobuf.Parser<Chatlog> getParserForType() {
    return PARSER;
  }

  public com.gitlab.leonklein.chatlog.Chatlog getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

