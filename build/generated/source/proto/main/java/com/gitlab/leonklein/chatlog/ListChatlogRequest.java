// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chatlog/chatlog_service.proto

package com.gitlab.leonklein.chatlog;

/**
 * Protobuf type {@code group.ListChatlogRequest}
 */
public  final class ListChatlogRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:group.ListChatlogRequest)
    ListChatlogRequestOrBuilder {
  // Use ListChatlogRequest.newBuilder() to construct.
  private ListChatlogRequest(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private ListChatlogRequest() {
    server_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ListChatlogRequest(
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

            server_ = bs;
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
    return com.gitlab.leonklein.chatlog.ChatlogServiceOuterClass.internal_static_group_ListChatlogRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gitlab.leonklein.chatlog.ChatlogServiceOuterClass.internal_static_group_ListChatlogRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gitlab.leonklein.chatlog.ListChatlogRequest.class, com.gitlab.leonklein.chatlog.ListChatlogRequest.Builder.class);
  }

  public static final int SERVER_FIELD_NUMBER = 1;
  private volatile java.lang.Object server_;
  /**
   * <code>optional string server = 1;</code>
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
   * <code>optional string server = 1;</code>
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
    if (!getServerBytes().isEmpty()) {
      output.writeBytes(1, getServerBytes());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!getServerBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getServerBytes());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.gitlab.leonklein.chatlog.ListChatlogRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gitlab.leonklein.chatlog.ListChatlogRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gitlab.leonklein.chatlog.ListChatlogRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gitlab.leonklein.chatlog.ListChatlogRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gitlab.leonklein.chatlog.ListChatlogRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gitlab.leonklein.chatlog.ListChatlogRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.gitlab.leonklein.chatlog.ListChatlogRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.gitlab.leonklein.chatlog.ListChatlogRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.gitlab.leonklein.chatlog.ListChatlogRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gitlab.leonklein.chatlog.ListChatlogRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gitlab.leonklein.chatlog.ListChatlogRequest prototype) {
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
   * Protobuf type {@code group.ListChatlogRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:group.ListChatlogRequest)
      com.gitlab.leonklein.chatlog.ListChatlogRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gitlab.leonklein.chatlog.ChatlogServiceOuterClass.internal_static_group_ListChatlogRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gitlab.leonklein.chatlog.ChatlogServiceOuterClass.internal_static_group_ListChatlogRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gitlab.leonklein.chatlog.ListChatlogRequest.class, com.gitlab.leonklein.chatlog.ListChatlogRequest.Builder.class);
    }

    // Construct using com.gitlab.leonklein.chatlog.ListChatlogRequest.newBuilder()
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
      server_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gitlab.leonklein.chatlog.ChatlogServiceOuterClass.internal_static_group_ListChatlogRequest_descriptor;
    }

    public com.gitlab.leonklein.chatlog.ListChatlogRequest getDefaultInstanceForType() {
      return com.gitlab.leonklein.chatlog.ListChatlogRequest.getDefaultInstance();
    }

    public com.gitlab.leonklein.chatlog.ListChatlogRequest build() {
      com.gitlab.leonklein.chatlog.ListChatlogRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.gitlab.leonklein.chatlog.ListChatlogRequest buildPartial() {
      com.gitlab.leonklein.chatlog.ListChatlogRequest result = new com.gitlab.leonklein.chatlog.ListChatlogRequest(this);
      result.server_ = server_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gitlab.leonklein.chatlog.ListChatlogRequest) {
        return mergeFrom((com.gitlab.leonklein.chatlog.ListChatlogRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gitlab.leonklein.chatlog.ListChatlogRequest other) {
      if (other == com.gitlab.leonklein.chatlog.ListChatlogRequest.getDefaultInstance()) return this;
      if (!other.getServer().isEmpty()) {
        server_ = other.server_;
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
      com.gitlab.leonklein.chatlog.ListChatlogRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gitlab.leonklein.chatlog.ListChatlogRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object server_ = "";
    /**
     * <code>optional string server = 1;</code>
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
     * <code>optional string server = 1;</code>
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
     * <code>optional string server = 1;</code>
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
     * <code>optional string server = 1;</code>
     */
    public Builder clearServer() {
      
      server_ = getDefaultInstance().getServer();
      onChanged();
      return this;
    }
    /**
     * <code>optional string server = 1;</code>
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
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:group.ListChatlogRequest)
  }

  // @@protoc_insertion_point(class_scope:group.ListChatlogRequest)
  private static final com.gitlab.leonklein.chatlog.ListChatlogRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gitlab.leonklein.chatlog.ListChatlogRequest();
  }

  public static com.gitlab.leonklein.chatlog.ListChatlogRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<ListChatlogRequest> PARSER =
      new com.google.protobuf.AbstractParser<ListChatlogRequest>() {
    public ListChatlogRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ListChatlogRequest(input, extensionRegistry);
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
  public com.google.protobuf.Parser<ListChatlogRequest> getParserForType() {
    return PARSER;
  }

  public com.gitlab.leonklein.chatlog.ListChatlogRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

