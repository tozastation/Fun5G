// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: device_config.proto

package mclab;

/**
 * Protobuf type {@code device_config.GetConfigResponse}
 */
public  final class GetConfigResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:device_config.GetConfigResponse)
    GetConfigResponseOrBuilder {
  // Use GetConfigResponse.newBuilder() to construct.
  private GetConfigResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetConfigResponse() {
    channel_ = "";
    hwMode_ = "";
    ip_ = "";
    powerOnOff_ = "";
    ssid_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetConfigResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
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
            java.lang.String s = input.readStringRequireUtf8();

            channel_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            hwMode_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            ip_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            powerOnOff_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            ssid_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return mclab.AP_proto.internal_static_device_config_GetConfigResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return mclab.AP_proto.internal_static_device_config_GetConfigResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            mclab.GetConfigResponse.class, mclab.GetConfigResponse.Builder.class);
  }

  public static final int CHANNEL_FIELD_NUMBER = 1;
  private volatile java.lang.Object channel_;
  /**
   * <code>optional string channel = 1;</code>
   */
  public java.lang.String getChannel() {
    java.lang.Object ref = channel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      channel_ = s;
      return s;
    }
  }
  /**
   * <code>optional string channel = 1;</code>
   */
  public com.google.protobuf.ByteString
      getChannelBytes() {
    java.lang.Object ref = channel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      channel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HW_MODE_FIELD_NUMBER = 2;
  private volatile java.lang.Object hwMode_;
  /**
   * <code>optional string hw_mode = 2;</code>
   */
  public java.lang.String getHwMode() {
    java.lang.Object ref = hwMode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hwMode_ = s;
      return s;
    }
  }
  /**
   * <code>optional string hw_mode = 2;</code>
   */
  public com.google.protobuf.ByteString
      getHwModeBytes() {
    java.lang.Object ref = hwMode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hwMode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IP_FIELD_NUMBER = 3;
  private volatile java.lang.Object ip_;
  /**
   * <code>optional string ip = 3;</code>
   */
  public java.lang.String getIp() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ip_ = s;
      return s;
    }
  }
  /**
   * <code>optional string ip = 3;</code>
   */
  public com.google.protobuf.ByteString
      getIpBytes() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ip_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POWER_ON_OFF_FIELD_NUMBER = 4;
  private volatile java.lang.Object powerOnOff_;
  /**
   * <code>optional string power_on_off = 4;</code>
   */
  public java.lang.String getPowerOnOff() {
    java.lang.Object ref = powerOnOff_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      powerOnOff_ = s;
      return s;
    }
  }
  /**
   * <code>optional string power_on_off = 4;</code>
   */
  public com.google.protobuf.ByteString
      getPowerOnOffBytes() {
    java.lang.Object ref = powerOnOff_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      powerOnOff_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SSID_FIELD_NUMBER = 5;
  private volatile java.lang.Object ssid_;
  /**
   * <code>optional string ssid = 5;</code>
   */
  public java.lang.String getSsid() {
    java.lang.Object ref = ssid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ssid_ = s;
      return s;
    }
  }
  /**
   * <code>optional string ssid = 5;</code>
   */
  public com.google.protobuf.ByteString
      getSsidBytes() {
    java.lang.Object ref = ssid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ssid_ = b;
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
    if (!getChannelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, channel_);
    }
    if (!getHwModeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, hwMode_);
    }
    if (!getIpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ip_);
    }
    if (!getPowerOnOffBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, powerOnOff_);
    }
    if (!getSsidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, ssid_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getChannelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, channel_);
    }
    if (!getHwModeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, hwMode_);
    }
    if (!getIpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ip_);
    }
    if (!getPowerOnOffBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, powerOnOff_);
    }
    if (!getSsidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, ssid_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof mclab.GetConfigResponse)) {
      return super.equals(obj);
    }
    mclab.GetConfigResponse other = (mclab.GetConfigResponse) obj;

    boolean result = true;
    result = result && getChannel()
        .equals(other.getChannel());
    result = result && getHwMode()
        .equals(other.getHwMode());
    result = result && getIp()
        .equals(other.getIp());
    result = result && getPowerOnOff()
        .equals(other.getPowerOnOff());
    result = result && getSsid()
        .equals(other.getSsid());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + CHANNEL_FIELD_NUMBER;
    hash = (53 * hash) + getChannel().hashCode();
    hash = (37 * hash) + HW_MODE_FIELD_NUMBER;
    hash = (53 * hash) + getHwMode().hashCode();
    hash = (37 * hash) + IP_FIELD_NUMBER;
    hash = (53 * hash) + getIp().hashCode();
    hash = (37 * hash) + POWER_ON_OFF_FIELD_NUMBER;
    hash = (53 * hash) + getPowerOnOff().hashCode();
    hash = (37 * hash) + SSID_FIELD_NUMBER;
    hash = (53 * hash) + getSsid().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static mclab.GetConfigResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mclab.GetConfigResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mclab.GetConfigResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mclab.GetConfigResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mclab.GetConfigResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static mclab.GetConfigResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static mclab.GetConfigResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static mclab.GetConfigResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static mclab.GetConfigResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static mclab.GetConfigResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(mclab.GetConfigResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code device_config.GetConfigResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:device_config.GetConfigResponse)
      mclab.GetConfigResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return mclab.AP_proto.internal_static_device_config_GetConfigResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return mclab.AP_proto.internal_static_device_config_GetConfigResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              mclab.GetConfigResponse.class, mclab.GetConfigResponse.Builder.class);
    }

    // Construct using mclab.GetConfigResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      channel_ = "";

      hwMode_ = "";

      ip_ = "";

      powerOnOff_ = "";

      ssid_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return mclab.AP_proto.internal_static_device_config_GetConfigResponse_descriptor;
    }

    public mclab.GetConfigResponse getDefaultInstanceForType() {
      return mclab.GetConfigResponse.getDefaultInstance();
    }

    public mclab.GetConfigResponse build() {
      mclab.GetConfigResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public mclab.GetConfigResponse buildPartial() {
      mclab.GetConfigResponse result = new mclab.GetConfigResponse(this);
      result.channel_ = channel_;
      result.hwMode_ = hwMode_;
      result.ip_ = ip_;
      result.powerOnOff_ = powerOnOff_;
      result.ssid_ = ssid_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof mclab.GetConfigResponse) {
        return mergeFrom((mclab.GetConfigResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(mclab.GetConfigResponse other) {
      if (other == mclab.GetConfigResponse.getDefaultInstance()) return this;
      if (!other.getChannel().isEmpty()) {
        channel_ = other.channel_;
        onChanged();
      }
      if (!other.getHwMode().isEmpty()) {
        hwMode_ = other.hwMode_;
        onChanged();
      }
      if (!other.getIp().isEmpty()) {
        ip_ = other.ip_;
        onChanged();
      }
      if (!other.getPowerOnOff().isEmpty()) {
        powerOnOff_ = other.powerOnOff_;
        onChanged();
      }
      if (!other.getSsid().isEmpty()) {
        ssid_ = other.ssid_;
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
      mclab.GetConfigResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (mclab.GetConfigResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object channel_ = "";
    /**
     * <code>optional string channel = 1;</code>
     */
    public java.lang.String getChannel() {
      java.lang.Object ref = channel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        channel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string channel = 1;</code>
     */
    public com.google.protobuf.ByteString
        getChannelBytes() {
      java.lang.Object ref = channel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        channel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string channel = 1;</code>
     */
    public Builder setChannel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      channel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string channel = 1;</code>
     */
    public Builder clearChannel() {
      
      channel_ = getDefaultInstance().getChannel();
      onChanged();
      return this;
    }
    /**
     * <code>optional string channel = 1;</code>
     */
    public Builder setChannelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      channel_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object hwMode_ = "";
    /**
     * <code>optional string hw_mode = 2;</code>
     */
    public java.lang.String getHwMode() {
      java.lang.Object ref = hwMode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hwMode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string hw_mode = 2;</code>
     */
    public com.google.protobuf.ByteString
        getHwModeBytes() {
      java.lang.Object ref = hwMode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hwMode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string hw_mode = 2;</code>
     */
    public Builder setHwMode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hwMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string hw_mode = 2;</code>
     */
    public Builder clearHwMode() {
      
      hwMode_ = getDefaultInstance().getHwMode();
      onChanged();
      return this;
    }
    /**
     * <code>optional string hw_mode = 2;</code>
     */
    public Builder setHwModeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hwMode_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ip_ = "";
    /**
     * <code>optional string ip = 3;</code>
     */
    public java.lang.String getIp() {
      java.lang.Object ref = ip_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ip_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string ip = 3;</code>
     */
    public com.google.protobuf.ByteString
        getIpBytes() {
      java.lang.Object ref = ip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string ip = 3;</code>
     */
    public Builder setIp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ip_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string ip = 3;</code>
     */
    public Builder clearIp() {
      
      ip_ = getDefaultInstance().getIp();
      onChanged();
      return this;
    }
    /**
     * <code>optional string ip = 3;</code>
     */
    public Builder setIpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ip_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object powerOnOff_ = "";
    /**
     * <code>optional string power_on_off = 4;</code>
     */
    public java.lang.String getPowerOnOff() {
      java.lang.Object ref = powerOnOff_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        powerOnOff_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string power_on_off = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPowerOnOffBytes() {
      java.lang.Object ref = powerOnOff_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        powerOnOff_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string power_on_off = 4;</code>
     */
    public Builder setPowerOnOff(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      powerOnOff_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string power_on_off = 4;</code>
     */
    public Builder clearPowerOnOff() {
      
      powerOnOff_ = getDefaultInstance().getPowerOnOff();
      onChanged();
      return this;
    }
    /**
     * <code>optional string power_on_off = 4;</code>
     */
    public Builder setPowerOnOffBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      powerOnOff_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ssid_ = "";
    /**
     * <code>optional string ssid = 5;</code>
     */
    public java.lang.String getSsid() {
      java.lang.Object ref = ssid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ssid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string ssid = 5;</code>
     */
    public com.google.protobuf.ByteString
        getSsidBytes() {
      java.lang.Object ref = ssid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ssid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string ssid = 5;</code>
     */
    public Builder setSsid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ssid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string ssid = 5;</code>
     */
    public Builder clearSsid() {
      
      ssid_ = getDefaultInstance().getSsid();
      onChanged();
      return this;
    }
    /**
     * <code>optional string ssid = 5;</code>
     */
    public Builder setSsidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ssid_ = value;
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


    // @@protoc_insertion_point(builder_scope:device_config.GetConfigResponse)
  }

  // @@protoc_insertion_point(class_scope:device_config.GetConfigResponse)
  private static final mclab.GetConfigResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new mclab.GetConfigResponse();
  }

  public static mclab.GetConfigResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetConfigResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetConfigResponse>() {
    public GetConfigResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetConfigResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetConfigResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetConfigResponse> getParserForType() {
    return PARSER;
  }

  public mclab.GetConfigResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

