// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/user_service.proto

package de.flamefoxes.user;

/**
 * Protobuf type {@code user.FindUserRequest}
 */
public  final class FindUserRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:user.FindUserRequest)
    FindUserRequestOrBuilder {
  // Use FindUserRequest.newBuilder() to construct.
  private FindUserRequest(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private FindUserRequest() {
    uniqueId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FindUserRequest(
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
    return de.flamefoxes.user.UserServiceOuterClass.internal_static_user_FindUserRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return de.flamefoxes.user.UserServiceOuterClass.internal_static_user_FindUserRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            de.flamefoxes.user.FindUserRequest.class, de.flamefoxes.user.FindUserRequest.Builder.class);
  }

  public static final int UNIQUE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object uniqueId_;
  /**
   * <code>optional string unique_id = 1;</code>
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
   * <code>optional string unique_id = 1;</code>
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
    if (!getUniqueIdBytes().isEmpty()) {
      output.writeBytes(1, getUniqueIdBytes());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUniqueIdBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getUniqueIdBytes());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static de.flamefoxes.user.FindUserRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.flamefoxes.user.FindUserRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.flamefoxes.user.FindUserRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.flamefoxes.user.FindUserRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.flamefoxes.user.FindUserRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static de.flamefoxes.user.FindUserRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static de.flamefoxes.user.FindUserRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static de.flamefoxes.user.FindUserRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static de.flamefoxes.user.FindUserRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static de.flamefoxes.user.FindUserRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(de.flamefoxes.user.FindUserRequest prototype) {
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
   * Protobuf type {@code user.FindUserRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:user.FindUserRequest)
      de.flamefoxes.user.FindUserRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return de.flamefoxes.user.UserServiceOuterClass.internal_static_user_FindUserRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return de.flamefoxes.user.UserServiceOuterClass.internal_static_user_FindUserRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              de.flamefoxes.user.FindUserRequest.class, de.flamefoxes.user.FindUserRequest.Builder.class);
    }

    // Construct using de.flamefoxes.user.FindUserRequest.newBuilder()
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
      uniqueId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return de.flamefoxes.user.UserServiceOuterClass.internal_static_user_FindUserRequest_descriptor;
    }

    public de.flamefoxes.user.FindUserRequest getDefaultInstanceForType() {
      return de.flamefoxes.user.FindUserRequest.getDefaultInstance();
    }

    public de.flamefoxes.user.FindUserRequest build() {
      de.flamefoxes.user.FindUserRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public de.flamefoxes.user.FindUserRequest buildPartial() {
      de.flamefoxes.user.FindUserRequest result = new de.flamefoxes.user.FindUserRequest(this);
      result.uniqueId_ = uniqueId_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof de.flamefoxes.user.FindUserRequest) {
        return mergeFrom((de.flamefoxes.user.FindUserRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(de.flamefoxes.user.FindUserRequest other) {
      if (other == de.flamefoxes.user.FindUserRequest.getDefaultInstance()) return this;
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
      de.flamefoxes.user.FindUserRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (de.flamefoxes.user.FindUserRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object uniqueId_ = "";
    /**
     * <code>optional string unique_id = 1;</code>
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
     * <code>optional string unique_id = 1;</code>
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
     * <code>optional string unique_id = 1;</code>
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
     * <code>optional string unique_id = 1;</code>
     */
    public Builder clearUniqueId() {
      
      uniqueId_ = getDefaultInstance().getUniqueId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string unique_id = 1;</code>
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


    // @@protoc_insertion_point(builder_scope:user.FindUserRequest)
  }

  // @@protoc_insertion_point(class_scope:user.FindUserRequest)
  private static final de.flamefoxes.user.FindUserRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new de.flamefoxes.user.FindUserRequest();
  }

  public static de.flamefoxes.user.FindUserRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<FindUserRequest> PARSER =
      new com.google.protobuf.AbstractParser<FindUserRequest>() {
    public FindUserRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new FindUserRequest(input, extensionRegistry);
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
  public com.google.protobuf.Parser<FindUserRequest> getParserForType() {
    return PARSER;
  }

  public de.flamefoxes.user.FindUserRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
