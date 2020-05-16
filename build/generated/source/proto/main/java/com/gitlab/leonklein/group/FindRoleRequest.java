// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: group/group_service.proto

package com.gitlab.leonklein.group;

/**
 * Protobuf type {@code group.FindRoleRequest}
 */
public  final class FindRoleRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:group.FindRoleRequest)
    FindRoleRequestOrBuilder {
  // Use FindRoleRequest.newBuilder() to construct.
  private FindRoleRequest(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private FindRoleRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FindRoleRequest(
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
            if (role_ != null) {
              subBuilder = role_.toBuilder();
            }
            role_ = input.readMessage(com.gitlab.leonklein.group.Group.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(role_);
              role_ = subBuilder.buildPartial();
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
    return com.gitlab.leonklein.group.GroupServiceOuterClass.internal_static_group_FindRoleRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gitlab.leonklein.group.GroupServiceOuterClass.internal_static_group_FindRoleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gitlab.leonklein.group.FindRoleRequest.class, com.gitlab.leonklein.group.FindRoleRequest.Builder.class);
  }

  public static final int ROLE_FIELD_NUMBER = 1;
  private com.gitlab.leonklein.group.Group role_;
  /**
   * <code>optional .group.Group role = 1;</code>
   */
  public boolean hasRole() {
    return role_ != null;
  }
  /**
   * <code>optional .group.Group role = 1;</code>
   */
  public com.gitlab.leonklein.group.Group getRole() {
    return role_ == null ? com.gitlab.leonklein.group.Group.getDefaultInstance() : role_;
  }
  /**
   * <code>optional .group.Group role = 1;</code>
   */
  public com.gitlab.leonklein.group.GroupOrBuilder getRoleOrBuilder() {
    return getRole();
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
    if (role_ != null) {
      output.writeMessage(1, getRole());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (role_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRole());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.gitlab.leonklein.group.FindRoleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gitlab.leonklein.group.FindRoleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gitlab.leonklein.group.FindRoleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gitlab.leonklein.group.FindRoleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gitlab.leonklein.group.FindRoleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gitlab.leonklein.group.FindRoleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.gitlab.leonklein.group.FindRoleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.gitlab.leonklein.group.FindRoleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.gitlab.leonklein.group.FindRoleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gitlab.leonklein.group.FindRoleRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gitlab.leonklein.group.FindRoleRequest prototype) {
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
   * Protobuf type {@code group.FindRoleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:group.FindRoleRequest)
      com.gitlab.leonklein.group.FindRoleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gitlab.leonklein.group.GroupServiceOuterClass.internal_static_group_FindRoleRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gitlab.leonklein.group.GroupServiceOuterClass.internal_static_group_FindRoleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gitlab.leonklein.group.FindRoleRequest.class, com.gitlab.leonklein.group.FindRoleRequest.Builder.class);
    }

    // Construct using com.gitlab.leonklein.group.FindRoleRequest.newBuilder()
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
      if (roleBuilder_ == null) {
        role_ = null;
      } else {
        role_ = null;
        roleBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gitlab.leonklein.group.GroupServiceOuterClass.internal_static_group_FindRoleRequest_descriptor;
    }

    public com.gitlab.leonklein.group.FindRoleRequest getDefaultInstanceForType() {
      return com.gitlab.leonklein.group.FindRoleRequest.getDefaultInstance();
    }

    public com.gitlab.leonklein.group.FindRoleRequest build() {
      com.gitlab.leonklein.group.FindRoleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.gitlab.leonklein.group.FindRoleRequest buildPartial() {
      com.gitlab.leonklein.group.FindRoleRequest result = new com.gitlab.leonklein.group.FindRoleRequest(this);
      if (roleBuilder_ == null) {
        result.role_ = role_;
      } else {
        result.role_ = roleBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gitlab.leonklein.group.FindRoleRequest) {
        return mergeFrom((com.gitlab.leonklein.group.FindRoleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gitlab.leonklein.group.FindRoleRequest other) {
      if (other == com.gitlab.leonklein.group.FindRoleRequest.getDefaultInstance()) return this;
      if (other.hasRole()) {
        mergeRole(other.getRole());
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
      com.gitlab.leonklein.group.FindRoleRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gitlab.leonklein.group.FindRoleRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.gitlab.leonklein.group.Group role_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.gitlab.leonklein.group.Group, com.gitlab.leonklein.group.Group.Builder, com.gitlab.leonklein.group.GroupOrBuilder> roleBuilder_;
    /**
     * <code>optional .group.Group role = 1;</code>
     */
    public boolean hasRole() {
      return roleBuilder_ != null || role_ != null;
    }
    /**
     * <code>optional .group.Group role = 1;</code>
     */
    public com.gitlab.leonklein.group.Group getRole() {
      if (roleBuilder_ == null) {
        return role_ == null ? com.gitlab.leonklein.group.Group.getDefaultInstance() : role_;
      } else {
        return roleBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .group.Group role = 1;</code>
     */
    public Builder setRole(com.gitlab.leonklein.group.Group value) {
      if (roleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        role_ = value;
        onChanged();
      } else {
        roleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .group.Group role = 1;</code>
     */
    public Builder setRole(
        com.gitlab.leonklein.group.Group.Builder builderForValue) {
      if (roleBuilder_ == null) {
        role_ = builderForValue.build();
        onChanged();
      } else {
        roleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .group.Group role = 1;</code>
     */
    public Builder mergeRole(com.gitlab.leonklein.group.Group value) {
      if (roleBuilder_ == null) {
        if (role_ != null) {
          role_ =
            com.gitlab.leonklein.group.Group.newBuilder(role_).mergeFrom(value).buildPartial();
        } else {
          role_ = value;
        }
        onChanged();
      } else {
        roleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .group.Group role = 1;</code>
     */
    public Builder clearRole() {
      if (roleBuilder_ == null) {
        role_ = null;
        onChanged();
      } else {
        role_ = null;
        roleBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .group.Group role = 1;</code>
     */
    public com.gitlab.leonklein.group.Group.Builder getRoleBuilder() {
      
      onChanged();
      return getRoleFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .group.Group role = 1;</code>
     */
    public com.gitlab.leonklein.group.GroupOrBuilder getRoleOrBuilder() {
      if (roleBuilder_ != null) {
        return roleBuilder_.getMessageOrBuilder();
      } else {
        return role_ == null ?
            com.gitlab.leonklein.group.Group.getDefaultInstance() : role_;
      }
    }
    /**
     * <code>optional .group.Group role = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.gitlab.leonklein.group.Group, com.gitlab.leonklein.group.Group.Builder, com.gitlab.leonklein.group.GroupOrBuilder> 
        getRoleFieldBuilder() {
      if (roleBuilder_ == null) {
        roleBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.gitlab.leonklein.group.Group, com.gitlab.leonklein.group.Group.Builder, com.gitlab.leonklein.group.GroupOrBuilder>(
                getRole(),
                getParentForChildren(),
                isClean());
        role_ = null;
      }
      return roleBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:group.FindRoleRequest)
  }

  // @@protoc_insertion_point(class_scope:group.FindRoleRequest)
  private static final com.gitlab.leonklein.group.FindRoleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gitlab.leonklein.group.FindRoleRequest();
  }

  public static com.gitlab.leonklein.group.FindRoleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<FindRoleRequest> PARSER =
      new com.google.protobuf.AbstractParser<FindRoleRequest>() {
    public FindRoleRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new FindRoleRequest(input, extensionRegistry);
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
  public com.google.protobuf.Parser<FindRoleRequest> getParserForType() {
    return PARSER;
  }

  public com.gitlab.leonklein.group.FindRoleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
