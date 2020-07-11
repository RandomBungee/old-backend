// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: punishment/punish_service.proto

package com.gitlab.leonklein.punishment;

/**
 * Protobuf type {@code punishment.ChangePunishRequest}
 */
public  final class ChangePunishRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:punishment.ChangePunishRequest)
    ChangePunishRequestOrBuilder {
  // Use ChangePunishRequest.newBuilder() to construct.
  private ChangePunishRequest(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private ChangePunishRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ChangePunishRequest(
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
            com.gitlab.leonklein.punishment.Punish.Builder subBuilder = null;
            if (punish_ != null) {
              subBuilder = punish_.toBuilder();
            }
            punish_ = input.readMessage(com.gitlab.leonklein.punishment.Punish.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(punish_);
              punish_ = subBuilder.buildPartial();
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
    return com.gitlab.leonklein.punishment.PunishServiceOuterClass.internal_static_punishment_ChangePunishRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gitlab.leonklein.punishment.PunishServiceOuterClass.internal_static_punishment_ChangePunishRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gitlab.leonklein.punishment.ChangePunishRequest.class, com.gitlab.leonklein.punishment.ChangePunishRequest.Builder.class);
  }

  public static final int PUNISH_FIELD_NUMBER = 1;
  private com.gitlab.leonklein.punishment.Punish punish_;
  /**
   * <code>optional .punishment.Punish punish = 1;</code>
   */
  public boolean hasPunish() {
    return punish_ != null;
  }
  /**
   * <code>optional .punishment.Punish punish = 1;</code>
   */
  public com.gitlab.leonklein.punishment.Punish getPunish() {
    return punish_ == null ? com.gitlab.leonklein.punishment.Punish.getDefaultInstance() : punish_;
  }
  /**
   * <code>optional .punishment.Punish punish = 1;</code>
   */
  public com.gitlab.leonklein.punishment.PunishOrBuilder getPunishOrBuilder() {
    return getPunish();
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
    if (punish_ != null) {
      output.writeMessage(1, getPunish());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (punish_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPunish());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.gitlab.leonklein.punishment.ChangePunishRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gitlab.leonklein.punishment.ChangePunishRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gitlab.leonklein.punishment.ChangePunishRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gitlab.leonklein.punishment.ChangePunishRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gitlab.leonklein.punishment.ChangePunishRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gitlab.leonklein.punishment.ChangePunishRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.gitlab.leonklein.punishment.ChangePunishRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.gitlab.leonklein.punishment.ChangePunishRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.gitlab.leonklein.punishment.ChangePunishRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gitlab.leonklein.punishment.ChangePunishRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gitlab.leonklein.punishment.ChangePunishRequest prototype) {
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
   * Protobuf type {@code punishment.ChangePunishRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:punishment.ChangePunishRequest)
      com.gitlab.leonklein.punishment.ChangePunishRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gitlab.leonklein.punishment.PunishServiceOuterClass.internal_static_punishment_ChangePunishRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gitlab.leonklein.punishment.PunishServiceOuterClass.internal_static_punishment_ChangePunishRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gitlab.leonklein.punishment.ChangePunishRequest.class, com.gitlab.leonklein.punishment.ChangePunishRequest.Builder.class);
    }

    // Construct using com.gitlab.leonklein.punishment.ChangePunishRequest.newBuilder()
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
      if (punishBuilder_ == null) {
        punish_ = null;
      } else {
        punish_ = null;
        punishBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gitlab.leonklein.punishment.PunishServiceOuterClass.internal_static_punishment_ChangePunishRequest_descriptor;
    }

    public com.gitlab.leonklein.punishment.ChangePunishRequest getDefaultInstanceForType() {
      return com.gitlab.leonklein.punishment.ChangePunishRequest.getDefaultInstance();
    }

    public com.gitlab.leonklein.punishment.ChangePunishRequest build() {
      com.gitlab.leonklein.punishment.ChangePunishRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.gitlab.leonklein.punishment.ChangePunishRequest buildPartial() {
      com.gitlab.leonklein.punishment.ChangePunishRequest result = new com.gitlab.leonklein.punishment.ChangePunishRequest(this);
      if (punishBuilder_ == null) {
        result.punish_ = punish_;
      } else {
        result.punish_ = punishBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gitlab.leonklein.punishment.ChangePunishRequest) {
        return mergeFrom((com.gitlab.leonklein.punishment.ChangePunishRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gitlab.leonklein.punishment.ChangePunishRequest other) {
      if (other == com.gitlab.leonklein.punishment.ChangePunishRequest.getDefaultInstance()) return this;
      if (other.hasPunish()) {
        mergePunish(other.getPunish());
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
      com.gitlab.leonklein.punishment.ChangePunishRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gitlab.leonklein.punishment.ChangePunishRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.gitlab.leonklein.punishment.Punish punish_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.gitlab.leonklein.punishment.Punish, com.gitlab.leonklein.punishment.Punish.Builder, com.gitlab.leonklein.punishment.PunishOrBuilder> punishBuilder_;
    /**
     * <code>optional .punishment.Punish punish = 1;</code>
     */
    public boolean hasPunish() {
      return punishBuilder_ != null || punish_ != null;
    }
    /**
     * <code>optional .punishment.Punish punish = 1;</code>
     */
    public com.gitlab.leonklein.punishment.Punish getPunish() {
      if (punishBuilder_ == null) {
        return punish_ == null ? com.gitlab.leonklein.punishment.Punish.getDefaultInstance() : punish_;
      } else {
        return punishBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .punishment.Punish punish = 1;</code>
     */
    public Builder setPunish(com.gitlab.leonklein.punishment.Punish value) {
      if (punishBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        punish_ = value;
        onChanged();
      } else {
        punishBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .punishment.Punish punish = 1;</code>
     */
    public Builder setPunish(
        com.gitlab.leonklein.punishment.Punish.Builder builderForValue) {
      if (punishBuilder_ == null) {
        punish_ = builderForValue.build();
        onChanged();
      } else {
        punishBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .punishment.Punish punish = 1;</code>
     */
    public Builder mergePunish(com.gitlab.leonklein.punishment.Punish value) {
      if (punishBuilder_ == null) {
        if (punish_ != null) {
          punish_ =
            com.gitlab.leonklein.punishment.Punish.newBuilder(punish_).mergeFrom(value).buildPartial();
        } else {
          punish_ = value;
        }
        onChanged();
      } else {
        punishBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .punishment.Punish punish = 1;</code>
     */
    public Builder clearPunish() {
      if (punishBuilder_ == null) {
        punish_ = null;
        onChanged();
      } else {
        punish_ = null;
        punishBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .punishment.Punish punish = 1;</code>
     */
    public com.gitlab.leonklein.punishment.Punish.Builder getPunishBuilder() {
      
      onChanged();
      return getPunishFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .punishment.Punish punish = 1;</code>
     */
    public com.gitlab.leonklein.punishment.PunishOrBuilder getPunishOrBuilder() {
      if (punishBuilder_ != null) {
        return punishBuilder_.getMessageOrBuilder();
      } else {
        return punish_ == null ?
            com.gitlab.leonklein.punishment.Punish.getDefaultInstance() : punish_;
      }
    }
    /**
     * <code>optional .punishment.Punish punish = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.gitlab.leonklein.punishment.Punish, com.gitlab.leonklein.punishment.Punish.Builder, com.gitlab.leonklein.punishment.PunishOrBuilder> 
        getPunishFieldBuilder() {
      if (punishBuilder_ == null) {
        punishBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.gitlab.leonklein.punishment.Punish, com.gitlab.leonklein.punishment.Punish.Builder, com.gitlab.leonklein.punishment.PunishOrBuilder>(
                getPunish(),
                getParentForChildren(),
                isClean());
        punish_ = null;
      }
      return punishBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:punishment.ChangePunishRequest)
  }

  // @@protoc_insertion_point(class_scope:punishment.ChangePunishRequest)
  private static final com.gitlab.leonklein.punishment.ChangePunishRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gitlab.leonklein.punishment.ChangePunishRequest();
  }

  public static com.gitlab.leonklein.punishment.ChangePunishRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<ChangePunishRequest> PARSER =
      new com.google.protobuf.AbstractParser<ChangePunishRequest>() {
    public ChangePunishRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ChangePunishRequest(input, extensionRegistry);
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
  public com.google.protobuf.Parser<ChangePunishRequest> getParserForType() {
    return PARSER;
  }

  public com.gitlab.leonklein.punishment.ChangePunishRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
