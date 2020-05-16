// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: group/group_service.proto

package com.gitlab.leonklein.group;

/**
 * Protobuf type {@code group.CreateGroupRequest}
 */
public  final class CreateGroupRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:group.CreateGroupRequest)
    CreateGroupRequestOrBuilder {
  // Use CreateGroupRequest.newBuilder() to construct.
  private CreateGroupRequest(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private CreateGroupRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CreateGroupRequest(
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
            com.gitlab.leonklein.group.Group.Builder subBuilder = null;
            if (group_ != null) {
              subBuilder = group_.toBuilder();
            }
            group_ = input.readMessage(com.gitlab.leonklein.group.Group.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(group_);
              group_ = subBuilder.buildPartial();
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
    return com.gitlab.leonklein.group.GroupServiceOuterClass.internal_static_group_CreateGroupRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gitlab.leonklein.group.GroupServiceOuterClass.internal_static_group_CreateGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gitlab.leonklein.group.CreateGroupRequest.class, com.gitlab.leonklein.group.CreateGroupRequest.Builder.class);
  }

  public static final int GROUP_FIELD_NUMBER = 1;
  private com.gitlab.leonklein.group.Group group_;
  /**
   * <code>optional .group.Group group = 1;</code>
   */
  public boolean hasGroup() {
    return group_ != null;
  }
  /**
   * <code>optional .group.Group group = 1;</code>
   */
  public com.gitlab.leonklein.group.Group getGroup() {
    return group_ == null ? com.gitlab.leonklein.group.Group.getDefaultInstance() : group_;
  }
  /**
   * <code>optional .group.Group group = 1;</code>
   */
  public com.gitlab.leonklein.group.GroupOrBuilder getGroupOrBuilder() {
    return getGroup();
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
    if (group_ != null) {
      output.writeMessage(1, getGroup());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (group_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGroup());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.gitlab.leonklein.group.CreateGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gitlab.leonklein.group.CreateGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gitlab.leonklein.group.CreateGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gitlab.leonklein.group.CreateGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gitlab.leonklein.group.CreateGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gitlab.leonklein.group.CreateGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.gitlab.leonklein.group.CreateGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.gitlab.leonklein.group.CreateGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.gitlab.leonklein.group.CreateGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gitlab.leonklein.group.CreateGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gitlab.leonklein.group.CreateGroupRequest prototype) {
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
   * Protobuf type {@code group.CreateGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:group.CreateGroupRequest)
      com.gitlab.leonklein.group.CreateGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gitlab.leonklein.group.GroupServiceOuterClass.internal_static_group_CreateGroupRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gitlab.leonklein.group.GroupServiceOuterClass.internal_static_group_CreateGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gitlab.leonklein.group.CreateGroupRequest.class, com.gitlab.leonklein.group.CreateGroupRequest.Builder.class);
    }

    // Construct using com.gitlab.leonklein.group.CreateGroupRequest.newBuilder()
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
      if (groupBuilder_ == null) {
        group_ = null;
      } else {
        group_ = null;
        groupBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gitlab.leonklein.group.GroupServiceOuterClass.internal_static_group_CreateGroupRequest_descriptor;
    }

    public com.gitlab.leonklein.group.CreateGroupRequest getDefaultInstanceForType() {
      return com.gitlab.leonklein.group.CreateGroupRequest.getDefaultInstance();
    }

    public com.gitlab.leonklein.group.CreateGroupRequest build() {
      com.gitlab.leonklein.group.CreateGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.gitlab.leonklein.group.CreateGroupRequest buildPartial() {
      com.gitlab.leonklein.group.CreateGroupRequest result = new com.gitlab.leonklein.group.CreateGroupRequest(this);
      if (groupBuilder_ == null) {
        result.group_ = group_;
      } else {
        result.group_ = groupBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gitlab.leonklein.group.CreateGroupRequest) {
        return mergeFrom((com.gitlab.leonklein.group.CreateGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gitlab.leonklein.group.CreateGroupRequest other) {
      if (other == com.gitlab.leonklein.group.CreateGroupRequest.getDefaultInstance()) return this;
      if (other.hasGroup()) {
        mergeGroup(other.getGroup());
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
      com.gitlab.leonklein.group.CreateGroupRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gitlab.leonklein.group.CreateGroupRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.gitlab.leonklein.group.Group group_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.gitlab.leonklein.group.Group, com.gitlab.leonklein.group.Group.Builder, com.gitlab.leonklein.group.GroupOrBuilder> groupBuilder_;
    /**
     * <code>optional .group.Group group = 1;</code>
     */
    public boolean hasGroup() {
      return groupBuilder_ != null || group_ != null;
    }
    /**
     * <code>optional .group.Group group = 1;</code>
     */
    public com.gitlab.leonklein.group.Group getGroup() {
      if (groupBuilder_ == null) {
        return group_ == null ? com.gitlab.leonklein.group.Group.getDefaultInstance() : group_;
      } else {
        return groupBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .group.Group group = 1;</code>
     */
    public Builder setGroup(com.gitlab.leonklein.group.Group value) {
      if (groupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        group_ = value;
        onChanged();
      } else {
        groupBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .group.Group group = 1;</code>
     */
    public Builder setGroup(
        com.gitlab.leonklein.group.Group.Builder builderForValue) {
      if (groupBuilder_ == null) {
        group_ = builderForValue.build();
        onChanged();
      } else {
        groupBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .group.Group group = 1;</code>
     */
    public Builder mergeGroup(com.gitlab.leonklein.group.Group value) {
      if (groupBuilder_ == null) {
        if (group_ != null) {
          group_ =
            com.gitlab.leonklein.group.Group.newBuilder(group_).mergeFrom(value).buildPartial();
        } else {
          group_ = value;
        }
        onChanged();
      } else {
        groupBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .group.Group group = 1;</code>
     */
    public Builder clearGroup() {
      if (groupBuilder_ == null) {
        group_ = null;
        onChanged();
      } else {
        group_ = null;
        groupBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .group.Group group = 1;</code>
     */
    public com.gitlab.leonklein.group.Group.Builder getGroupBuilder() {
      
      onChanged();
      return getGroupFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .group.Group group = 1;</code>
     */
    public com.gitlab.leonklein.group.GroupOrBuilder getGroupOrBuilder() {
      if (groupBuilder_ != null) {
        return groupBuilder_.getMessageOrBuilder();
      } else {
        return group_ == null ?
            com.gitlab.leonklein.group.Group.getDefaultInstance() : group_;
      }
    }
    /**
     * <code>optional .group.Group group = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.gitlab.leonklein.group.Group, com.gitlab.leonklein.group.Group.Builder, com.gitlab.leonklein.group.GroupOrBuilder> 
        getGroupFieldBuilder() {
      if (groupBuilder_ == null) {
        groupBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.gitlab.leonklein.group.Group, com.gitlab.leonklein.group.Group.Builder, com.gitlab.leonklein.group.GroupOrBuilder>(
                getGroup(),
                getParentForChildren(),
                isClean());
        group_ = null;
      }
      return groupBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:group.CreateGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:group.CreateGroupRequest)
  private static final com.gitlab.leonklein.group.CreateGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gitlab.leonklein.group.CreateGroupRequest();
  }

  public static com.gitlab.leonklein.group.CreateGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<CreateGroupRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateGroupRequest>() {
    public CreateGroupRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new CreateGroupRequest(input, extensionRegistry);
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
  public com.google.protobuf.Parser<CreateGroupRequest> getParserForType() {
    return PARSER;
  }

  public com.gitlab.leonklein.group.CreateGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
