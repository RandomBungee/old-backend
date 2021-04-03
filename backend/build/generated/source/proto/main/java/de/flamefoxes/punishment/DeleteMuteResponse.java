// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: punishment/mute_service.proto

package de.flamefoxes.punishment;

/**
 * Protobuf type {@code punishment.DeleteMuteResponse}
 */
public  final class DeleteMuteResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:punishment.DeleteMuteResponse)
    DeleteMuteResponseOrBuilder {
  // Use DeleteMuteResponse.newBuilder() to construct.
  private DeleteMuteResponse(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private DeleteMuteResponse() {
    uniqueId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DeleteMuteResponse(
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
    return de.flamefoxes.punishment.MuteServiceOuterClass.internal_static_punishment_DeleteMuteResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return de.flamefoxes.punishment.MuteServiceOuterClass.internal_static_punishment_DeleteMuteResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            de.flamefoxes.punishment.DeleteMuteResponse.class, de.flamefoxes.punishment.DeleteMuteResponse.Builder.class);
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
  public static de.flamefoxes.punishment.DeleteMuteResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.flamefoxes.punishment.DeleteMuteResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.flamefoxes.punishment.DeleteMuteResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.flamefoxes.punishment.DeleteMuteResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.flamefoxes.punishment.DeleteMuteResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static de.flamefoxes.punishment.DeleteMuteResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static de.flamefoxes.punishment.DeleteMuteResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static de.flamefoxes.punishment.DeleteMuteResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static de.flamefoxes.punishment.DeleteMuteResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static de.flamefoxes.punishment.DeleteMuteResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(de.flamefoxes.punishment.DeleteMuteResponse prototype) {
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
   * Protobuf type {@code punishment.DeleteMuteResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:punishment.DeleteMuteResponse)
      de.flamefoxes.punishment.DeleteMuteResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return de.flamefoxes.punishment.MuteServiceOuterClass.internal_static_punishment_DeleteMuteResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return de.flamefoxes.punishment.MuteServiceOuterClass.internal_static_punishment_DeleteMuteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              de.flamefoxes.punishment.DeleteMuteResponse.class, de.flamefoxes.punishment.DeleteMuteResponse.Builder.class);
    }

    // Construct using de.flamefoxes.punishment.DeleteMuteResponse.newBuilder()
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
      return de.flamefoxes.punishment.MuteServiceOuterClass.internal_static_punishment_DeleteMuteResponse_descriptor;
    }

    public de.flamefoxes.punishment.DeleteMuteResponse getDefaultInstanceForType() {
      return de.flamefoxes.punishment.DeleteMuteResponse.getDefaultInstance();
    }

    public de.flamefoxes.punishment.DeleteMuteResponse build() {
      de.flamefoxes.punishment.DeleteMuteResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public de.flamefoxes.punishment.DeleteMuteResponse buildPartial() {
      de.flamefoxes.punishment.DeleteMuteResponse result = new de.flamefoxes.punishment.DeleteMuteResponse(this);
      result.uniqueId_ = uniqueId_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof de.flamefoxes.punishment.DeleteMuteResponse) {
        return mergeFrom((de.flamefoxes.punishment.DeleteMuteResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(de.flamefoxes.punishment.DeleteMuteResponse other) {
      if (other == de.flamefoxes.punishment.DeleteMuteResponse.getDefaultInstance()) return this;
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
      de.flamefoxes.punishment.DeleteMuteResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (de.flamefoxes.punishment.DeleteMuteResponse) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:punishment.DeleteMuteResponse)
  }

  // @@protoc_insertion_point(class_scope:punishment.DeleteMuteResponse)
  private static final de.flamefoxes.punishment.DeleteMuteResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new de.flamefoxes.punishment.DeleteMuteResponse();
  }

  public static de.flamefoxes.punishment.DeleteMuteResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<DeleteMuteResponse> PARSER =
      new com.google.protobuf.AbstractParser<DeleteMuteResponse>() {
    public DeleteMuteResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new DeleteMuteResponse(input, extensionRegistry);
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
  public com.google.protobuf.Parser<DeleteMuteResponse> getParserForType() {
    return PARSER;
  }

  public de.flamefoxes.punishment.DeleteMuteResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
