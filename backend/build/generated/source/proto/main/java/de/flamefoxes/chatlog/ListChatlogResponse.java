// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chatlog/chatlog_service.proto

package de.flamefoxes.chatlog;

/**
 * Protobuf type {@code group.ListChatlogResponse}
 */
public  final class ListChatlogResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:group.ListChatlogResponse)
    ListChatlogResponseOrBuilder {
  // Use ListChatlogResponse.newBuilder() to construct.
  private ListChatlogResponse(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private ListChatlogResponse() {
    messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ListChatlogResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              messages_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        messages_ = messages_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return de.flamefoxes.chatlog.ChatlogServiceOuterClass.internal_static_group_ListChatlogResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return de.flamefoxes.chatlog.ChatlogServiceOuterClass.internal_static_group_ListChatlogResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            de.flamefoxes.chatlog.ListChatlogResponse.class, de.flamefoxes.chatlog.ListChatlogResponse.Builder.class);
  }

  public static final int MESSAGES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList messages_;
  /**
   * <code>repeated string messages = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getMessagesList() {
    return messages_;
  }
  /**
   * <code>repeated string messages = 1;</code>
   */
  public int getMessagesCount() {
    return messages_.size();
  }
  /**
   * <code>repeated string messages = 1;</code>
   */
  public java.lang.String getMessages(int index) {
    return messages_.get(index);
  }
  /**
   * <code>repeated string messages = 1;</code>
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
    for (int i = 0; i < messages_.size(); i++) {
      output.writeBytes(1, messages_.getByteString(i));
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
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
  public static de.flamefoxes.chatlog.ListChatlogResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.flamefoxes.chatlog.ListChatlogResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.flamefoxes.chatlog.ListChatlogResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.flamefoxes.chatlog.ListChatlogResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.flamefoxes.chatlog.ListChatlogResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static de.flamefoxes.chatlog.ListChatlogResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static de.flamefoxes.chatlog.ListChatlogResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static de.flamefoxes.chatlog.ListChatlogResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static de.flamefoxes.chatlog.ListChatlogResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static de.flamefoxes.chatlog.ListChatlogResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(de.flamefoxes.chatlog.ListChatlogResponse prototype) {
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
   * Protobuf type {@code group.ListChatlogResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:group.ListChatlogResponse)
      de.flamefoxes.chatlog.ListChatlogResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return de.flamefoxes.chatlog.ChatlogServiceOuterClass.internal_static_group_ListChatlogResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return de.flamefoxes.chatlog.ChatlogServiceOuterClass.internal_static_group_ListChatlogResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              de.flamefoxes.chatlog.ListChatlogResponse.class, de.flamefoxes.chatlog.ListChatlogResponse.Builder.class);
    }

    // Construct using de.flamefoxes.chatlog.ListChatlogResponse.newBuilder()
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
      messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return de.flamefoxes.chatlog.ChatlogServiceOuterClass.internal_static_group_ListChatlogResponse_descriptor;
    }

    public de.flamefoxes.chatlog.ListChatlogResponse getDefaultInstanceForType() {
      return de.flamefoxes.chatlog.ListChatlogResponse.getDefaultInstance();
    }

    public de.flamefoxes.chatlog.ListChatlogResponse build() {
      de.flamefoxes.chatlog.ListChatlogResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public de.flamefoxes.chatlog.ListChatlogResponse buildPartial() {
      de.flamefoxes.chatlog.ListChatlogResponse result = new de.flamefoxes.chatlog.ListChatlogResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        messages_ = messages_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.messages_ = messages_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof de.flamefoxes.chatlog.ListChatlogResponse) {
        return mergeFrom((de.flamefoxes.chatlog.ListChatlogResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(de.flamefoxes.chatlog.ListChatlogResponse other) {
      if (other == de.flamefoxes.chatlog.ListChatlogResponse.getDefaultInstance()) return this;
      if (!other.messages_.isEmpty()) {
        if (messages_.isEmpty()) {
          messages_ = other.messages_;
          bitField0_ = (bitField0_ & ~0x00000001);
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
      de.flamefoxes.chatlog.ListChatlogResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (de.flamefoxes.chatlog.ListChatlogResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureMessagesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        messages_ = new com.google.protobuf.LazyStringArrayList(messages_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string messages = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getMessagesList() {
      return messages_.getUnmodifiableView();
    }
    /**
     * <code>repeated string messages = 1;</code>
     */
    public int getMessagesCount() {
      return messages_.size();
    }
    /**
     * <code>repeated string messages = 1;</code>
     */
    public java.lang.String getMessages(int index) {
      return messages_.get(index);
    }
    /**
     * <code>repeated string messages = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessagesBytes(int index) {
      return messages_.getByteString(index);
    }
    /**
     * <code>repeated string messages = 1;</code>
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
     * <code>repeated string messages = 1;</code>
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
     * <code>repeated string messages = 1;</code>
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
     * <code>repeated string messages = 1;</code>
     */
    public Builder clearMessages() {
      messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string messages = 1;</code>
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


    // @@protoc_insertion_point(builder_scope:group.ListChatlogResponse)
  }

  // @@protoc_insertion_point(class_scope:group.ListChatlogResponse)
  private static final de.flamefoxes.chatlog.ListChatlogResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new de.flamefoxes.chatlog.ListChatlogResponse();
  }

  public static de.flamefoxes.chatlog.ListChatlogResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<ListChatlogResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListChatlogResponse>() {
    public ListChatlogResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ListChatlogResponse(input, extensionRegistry);
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
  public com.google.protobuf.Parser<ListChatlogResponse> getParserForType() {
    return PARSER;
  }

  public de.flamefoxes.chatlog.ListChatlogResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
