// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: punishment/mute_service.proto

package de.flamefoxes.punishment;

/**
 * Protobuf type {@code punishment.CreateMuteResponse}
 */
public  final class CreateMuteResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:punishment.CreateMuteResponse)
    CreateMuteResponseOrBuilder {
  // Use CreateMuteResponse.newBuilder() to construct.
  private CreateMuteResponse(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private CreateMuteResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CreateMuteResponse(
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
            de.flamefoxes.punishment.Mute.Builder subBuilder = null;
            if (mute_ != null) {
              subBuilder = mute_.toBuilder();
            }
            mute_ = input.readMessage(de.flamefoxes.punishment.Mute.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(mute_);
              mute_ = subBuilder.buildPartial();
            }

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
    return de.flamefoxes.punishment.MuteServiceOuterClass.internal_static_punishment_CreateMuteResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return de.flamefoxes.punishment.MuteServiceOuterClass.internal_static_punishment_CreateMuteResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            de.flamefoxes.punishment.CreateMuteResponse.class, de.flamefoxes.punishment.CreateMuteResponse.Builder.class);
  }

  public static final int MUTE_FIELD_NUMBER = 1;
  private de.flamefoxes.punishment.Mute mute_;
  /**
   * <code>optional .punishment.Mute mute = 1;</code>
   */
  public boolean hasMute() {
    return mute_ != null;
  }
  /**
   * <code>optional .punishment.Mute mute = 1;</code>
   */
  public de.flamefoxes.punishment.Mute getMute() {
    return mute_ == null ? de.flamefoxes.punishment.Mute.getDefaultInstance() : mute_;
  }
  /**
   * <code>optional .punishment.Mute mute = 1;</code>
   */
  public de.flamefoxes.punishment.MuteOrBuilder getMuteOrBuilder() {
    return getMute();
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
    if (mute_ != null) {
      output.writeMessage(1, getMute());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (mute_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMute());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static de.flamefoxes.punishment.CreateMuteResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.flamefoxes.punishment.CreateMuteResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.flamefoxes.punishment.CreateMuteResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.flamefoxes.punishment.CreateMuteResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.flamefoxes.punishment.CreateMuteResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static de.flamefoxes.punishment.CreateMuteResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static de.flamefoxes.punishment.CreateMuteResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static de.flamefoxes.punishment.CreateMuteResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static de.flamefoxes.punishment.CreateMuteResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static de.flamefoxes.punishment.CreateMuteResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(de.flamefoxes.punishment.CreateMuteResponse prototype) {
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
   * Protobuf type {@code punishment.CreateMuteResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:punishment.CreateMuteResponse)
      de.flamefoxes.punishment.CreateMuteResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return de.flamefoxes.punishment.MuteServiceOuterClass.internal_static_punishment_CreateMuteResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return de.flamefoxes.punishment.MuteServiceOuterClass.internal_static_punishment_CreateMuteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              de.flamefoxes.punishment.CreateMuteResponse.class, de.flamefoxes.punishment.CreateMuteResponse.Builder.class);
    }

    // Construct using de.flamefoxes.punishment.CreateMuteResponse.newBuilder()
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
      if (muteBuilder_ == null) {
        mute_ = null;
      } else {
        mute_ = null;
        muteBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return de.flamefoxes.punishment.MuteServiceOuterClass.internal_static_punishment_CreateMuteResponse_descriptor;
    }

    public de.flamefoxes.punishment.CreateMuteResponse getDefaultInstanceForType() {
      return de.flamefoxes.punishment.CreateMuteResponse.getDefaultInstance();
    }

    public de.flamefoxes.punishment.CreateMuteResponse build() {
      de.flamefoxes.punishment.CreateMuteResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public de.flamefoxes.punishment.CreateMuteResponse buildPartial() {
      de.flamefoxes.punishment.CreateMuteResponse result = new de.flamefoxes.punishment.CreateMuteResponse(this);
      if (muteBuilder_ == null) {
        result.mute_ = mute_;
      } else {
        result.mute_ = muteBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof de.flamefoxes.punishment.CreateMuteResponse) {
        return mergeFrom((de.flamefoxes.punishment.CreateMuteResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(de.flamefoxes.punishment.CreateMuteResponse other) {
      if (other == de.flamefoxes.punishment.CreateMuteResponse.getDefaultInstance()) return this;
      if (other.hasMute()) {
        mergeMute(other.getMute());
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
      de.flamefoxes.punishment.CreateMuteResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (de.flamefoxes.punishment.CreateMuteResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private de.flamefoxes.punishment.Mute mute_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        de.flamefoxes.punishment.Mute, de.flamefoxes.punishment.Mute.Builder, de.flamefoxes.punishment.MuteOrBuilder> muteBuilder_;
    /**
     * <code>optional .punishment.Mute mute = 1;</code>
     */
    public boolean hasMute() {
      return muteBuilder_ != null || mute_ != null;
    }
    /**
     * <code>optional .punishment.Mute mute = 1;</code>
     */
    public de.flamefoxes.punishment.Mute getMute() {
      if (muteBuilder_ == null) {
        return mute_ == null ? de.flamefoxes.punishment.Mute.getDefaultInstance() : mute_;
      } else {
        return muteBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .punishment.Mute mute = 1;</code>
     */
    public Builder setMute(de.flamefoxes.punishment.Mute value) {
      if (muteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mute_ = value;
        onChanged();
      } else {
        muteBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .punishment.Mute mute = 1;</code>
     */
    public Builder setMute(
        de.flamefoxes.punishment.Mute.Builder builderForValue) {
      if (muteBuilder_ == null) {
        mute_ = builderForValue.build();
        onChanged();
      } else {
        muteBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .punishment.Mute mute = 1;</code>
     */
    public Builder mergeMute(de.flamefoxes.punishment.Mute value) {
      if (muteBuilder_ == null) {
        if (mute_ != null) {
          mute_ =
            de.flamefoxes.punishment.Mute.newBuilder(mute_).mergeFrom(value).buildPartial();
        } else {
          mute_ = value;
        }
        onChanged();
      } else {
        muteBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .punishment.Mute mute = 1;</code>
     */
    public Builder clearMute() {
      if (muteBuilder_ == null) {
        mute_ = null;
        onChanged();
      } else {
        mute_ = null;
        muteBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .punishment.Mute mute = 1;</code>
     */
    public de.flamefoxes.punishment.Mute.Builder getMuteBuilder() {
      
      onChanged();
      return getMuteFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .punishment.Mute mute = 1;</code>
     */
    public de.flamefoxes.punishment.MuteOrBuilder getMuteOrBuilder() {
      if (muteBuilder_ != null) {
        return muteBuilder_.getMessageOrBuilder();
      } else {
        return mute_ == null ?
            de.flamefoxes.punishment.Mute.getDefaultInstance() : mute_;
      }
    }
    /**
     * <code>optional .punishment.Mute mute = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        de.flamefoxes.punishment.Mute, de.flamefoxes.punishment.Mute.Builder, de.flamefoxes.punishment.MuteOrBuilder> 
        getMuteFieldBuilder() {
      if (muteBuilder_ == null) {
        muteBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            de.flamefoxes.punishment.Mute, de.flamefoxes.punishment.Mute.Builder, de.flamefoxes.punishment.MuteOrBuilder>(
                getMute(),
                getParentForChildren(),
                isClean());
        mute_ = null;
      }
      return muteBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:punishment.CreateMuteResponse)
  }

  // @@protoc_insertion_point(class_scope:punishment.CreateMuteResponse)
  private static final de.flamefoxes.punishment.CreateMuteResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new de.flamefoxes.punishment.CreateMuteResponse();
  }

  public static de.flamefoxes.punishment.CreateMuteResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<CreateMuteResponse> PARSER =
      new com.google.protobuf.AbstractParser<CreateMuteResponse>() {
    public CreateMuteResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new CreateMuteResponse(input, extensionRegistry);
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
  public com.google.protobuf.Parser<CreateMuteResponse> getParserForType() {
    return PARSER;
  }

  public de.flamefoxes.punishment.CreateMuteResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
