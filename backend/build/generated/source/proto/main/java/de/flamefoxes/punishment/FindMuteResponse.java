// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: punishment/mute_service.proto

package de.flamefoxes.punishment;

/**
 * Protobuf type {@code punishment.FindMuteResponse}
 */
public  final class FindMuteResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:punishment.FindMuteResponse)
    FindMuteResponseOrBuilder {
  // Use FindMuteResponse.newBuilder() to construct.
  private FindMuteResponse(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private FindMuteResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FindMuteResponse(
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
    return de.flamefoxes.punishment.MuteServiceOuterClass.internal_static_punishment_FindMuteResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return de.flamefoxes.punishment.MuteServiceOuterClass.internal_static_punishment_FindMuteResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            de.flamefoxes.punishment.FindMuteResponse.class, de.flamefoxes.punishment.FindMuteResponse.Builder.class);
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
  public static de.flamefoxes.punishment.FindMuteResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.flamefoxes.punishment.FindMuteResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.flamefoxes.punishment.FindMuteResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.flamefoxes.punishment.FindMuteResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.flamefoxes.punishment.FindMuteResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static de.flamefoxes.punishment.FindMuteResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static de.flamefoxes.punishment.FindMuteResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static de.flamefoxes.punishment.FindMuteResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static de.flamefoxes.punishment.FindMuteResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static de.flamefoxes.punishment.FindMuteResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(de.flamefoxes.punishment.FindMuteResponse prototype) {
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
   * Protobuf type {@code punishment.FindMuteResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:punishment.FindMuteResponse)
      de.flamefoxes.punishment.FindMuteResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return de.flamefoxes.punishment.MuteServiceOuterClass.internal_static_punishment_FindMuteResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return de.flamefoxes.punishment.MuteServiceOuterClass.internal_static_punishment_FindMuteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              de.flamefoxes.punishment.FindMuteResponse.class, de.flamefoxes.punishment.FindMuteResponse.Builder.class);
    }

    // Construct using de.flamefoxes.punishment.FindMuteResponse.newBuilder()
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
      return de.flamefoxes.punishment.MuteServiceOuterClass.internal_static_punishment_FindMuteResponse_descriptor;
    }

    public de.flamefoxes.punishment.FindMuteResponse getDefaultInstanceForType() {
      return de.flamefoxes.punishment.FindMuteResponse.getDefaultInstance();
    }

    public de.flamefoxes.punishment.FindMuteResponse build() {
      de.flamefoxes.punishment.FindMuteResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public de.flamefoxes.punishment.FindMuteResponse buildPartial() {
      de.flamefoxes.punishment.FindMuteResponse result = new de.flamefoxes.punishment.FindMuteResponse(this);
      if (muteBuilder_ == null) {
        result.mute_ = mute_;
      } else {
        result.mute_ = muteBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof de.flamefoxes.punishment.FindMuteResponse) {
        return mergeFrom((de.flamefoxes.punishment.FindMuteResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(de.flamefoxes.punishment.FindMuteResponse other) {
      if (other == de.flamefoxes.punishment.FindMuteResponse.getDefaultInstance()) return this;
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
      de.flamefoxes.punishment.FindMuteResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (de.flamefoxes.punishment.FindMuteResponse) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:punishment.FindMuteResponse)
  }

  // @@protoc_insertion_point(class_scope:punishment.FindMuteResponse)
  private static final de.flamefoxes.punishment.FindMuteResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new de.flamefoxes.punishment.FindMuteResponse();
  }

  public static de.flamefoxes.punishment.FindMuteResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<FindMuteResponse> PARSER =
      new com.google.protobuf.AbstractParser<FindMuteResponse>() {
    public FindMuteResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new FindMuteResponse(input, extensionRegistry);
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
  public com.google.protobuf.Parser<FindMuteResponse> getParserForType() {
    return PARSER;
  }

  public de.flamefoxes.punishment.FindMuteResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

