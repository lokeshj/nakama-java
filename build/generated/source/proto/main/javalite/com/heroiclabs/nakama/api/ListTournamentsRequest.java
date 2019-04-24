// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama/api/api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * List active/upcoming tournaments based on given filters.
 * </pre>
 *
 * Protobuf type {@code nakama.api.ListTournamentsRequest}
 */
public  final class ListTournamentsRequest extends
    com.google.protobuf.GeneratedMessageLite<
        ListTournamentsRequest, ListTournamentsRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.ListTournamentsRequest)
    ListTournamentsRequestOrBuilder {
  private ListTournamentsRequest() {
    cursor_ = "";
  }
  public static final int CATEGORY_START_FIELD_NUMBER = 1;
  private com.google.protobuf.UInt32Value categoryStart_;
  /**
   * <pre>
   * The start of the categories to include. Defaults to 0.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value category_start = 1;</code>
   */
  public boolean hasCategoryStart() {
    return categoryStart_ != null;
  }
  /**
   * <pre>
   * The start of the categories to include. Defaults to 0.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value category_start = 1;</code>
   */
  public com.google.protobuf.UInt32Value getCategoryStart() {
    return categoryStart_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : categoryStart_;
  }
  /**
   * <pre>
   * The start of the categories to include. Defaults to 0.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value category_start = 1;</code>
   */
  private void setCategoryStart(com.google.protobuf.UInt32Value value) {
    if (value == null) {
      throw new NullPointerException();
    }
    categoryStart_ = value;
    
    }
  /**
   * <pre>
   * The start of the categories to include. Defaults to 0.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value category_start = 1;</code>
   */
  private void setCategoryStart(
      com.google.protobuf.UInt32Value.Builder builderForValue) {
    categoryStart_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * The start of the categories to include. Defaults to 0.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value category_start = 1;</code>
   */
  private void mergeCategoryStart(com.google.protobuf.UInt32Value value) {
    if (categoryStart_ != null &&
        categoryStart_ != com.google.protobuf.UInt32Value.getDefaultInstance()) {
      categoryStart_ =
        com.google.protobuf.UInt32Value.newBuilder(categoryStart_).mergeFrom(value).buildPartial();
    } else {
      categoryStart_ = value;
    }
    
  }
  /**
   * <pre>
   * The start of the categories to include. Defaults to 0.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value category_start = 1;</code>
   */
  private void clearCategoryStart() {  categoryStart_ = null;
    
  }

  public static final int CATEGORY_END_FIELD_NUMBER = 2;
  private com.google.protobuf.UInt32Value categoryEnd_;
  /**
   * <pre>
   * The end of the categories to include. Defaults to 128.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value category_end = 2;</code>
   */
  public boolean hasCategoryEnd() {
    return categoryEnd_ != null;
  }
  /**
   * <pre>
   * The end of the categories to include. Defaults to 128.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value category_end = 2;</code>
   */
  public com.google.protobuf.UInt32Value getCategoryEnd() {
    return categoryEnd_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : categoryEnd_;
  }
  /**
   * <pre>
   * The end of the categories to include. Defaults to 128.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value category_end = 2;</code>
   */
  private void setCategoryEnd(com.google.protobuf.UInt32Value value) {
    if (value == null) {
      throw new NullPointerException();
    }
    categoryEnd_ = value;
    
    }
  /**
   * <pre>
   * The end of the categories to include. Defaults to 128.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value category_end = 2;</code>
   */
  private void setCategoryEnd(
      com.google.protobuf.UInt32Value.Builder builderForValue) {
    categoryEnd_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * The end of the categories to include. Defaults to 128.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value category_end = 2;</code>
   */
  private void mergeCategoryEnd(com.google.protobuf.UInt32Value value) {
    if (categoryEnd_ != null &&
        categoryEnd_ != com.google.protobuf.UInt32Value.getDefaultInstance()) {
      categoryEnd_ =
        com.google.protobuf.UInt32Value.newBuilder(categoryEnd_).mergeFrom(value).buildPartial();
    } else {
      categoryEnd_ = value;
    }
    
  }
  /**
   * <pre>
   * The end of the categories to include. Defaults to 128.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value category_end = 2;</code>
   */
  private void clearCategoryEnd() {  categoryEnd_ = null;
    
  }

  public static final int START_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.UInt32Value startTime_;
  /**
   * <pre>
   * The start time for tournaments. Defaults to epoch.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value start_time = 3;</code>
   */
  public boolean hasStartTime() {
    return startTime_ != null;
  }
  /**
   * <pre>
   * The start time for tournaments. Defaults to epoch.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value start_time = 3;</code>
   */
  public com.google.protobuf.UInt32Value getStartTime() {
    return startTime_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : startTime_;
  }
  /**
   * <pre>
   * The start time for tournaments. Defaults to epoch.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value start_time = 3;</code>
   */
  private void setStartTime(com.google.protobuf.UInt32Value value) {
    if (value == null) {
      throw new NullPointerException();
    }
    startTime_ = value;
    
    }
  /**
   * <pre>
   * The start time for tournaments. Defaults to epoch.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value start_time = 3;</code>
   */
  private void setStartTime(
      com.google.protobuf.UInt32Value.Builder builderForValue) {
    startTime_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * The start time for tournaments. Defaults to epoch.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value start_time = 3;</code>
   */
  private void mergeStartTime(com.google.protobuf.UInt32Value value) {
    if (startTime_ != null &&
        startTime_ != com.google.protobuf.UInt32Value.getDefaultInstance()) {
      startTime_ =
        com.google.protobuf.UInt32Value.newBuilder(startTime_).mergeFrom(value).buildPartial();
    } else {
      startTime_ = value;
    }
    
  }
  /**
   * <pre>
   * The start time for tournaments. Defaults to epoch.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value start_time = 3;</code>
   */
  private void clearStartTime() {  startTime_ = null;
    
  }

  public static final int END_TIME_FIELD_NUMBER = 4;
  private com.google.protobuf.UInt32Value endTime_;
  /**
   * <pre>
   * The end time for tournaments. Defaults to +1 year from current Unix time.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value end_time = 4;</code>
   */
  public boolean hasEndTime() {
    return endTime_ != null;
  }
  /**
   * <pre>
   * The end time for tournaments. Defaults to +1 year from current Unix time.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value end_time = 4;</code>
   */
  public com.google.protobuf.UInt32Value getEndTime() {
    return endTime_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : endTime_;
  }
  /**
   * <pre>
   * The end time for tournaments. Defaults to +1 year from current Unix time.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value end_time = 4;</code>
   */
  private void setEndTime(com.google.protobuf.UInt32Value value) {
    if (value == null) {
      throw new NullPointerException();
    }
    endTime_ = value;
    
    }
  /**
   * <pre>
   * The end time for tournaments. Defaults to +1 year from current Unix time.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value end_time = 4;</code>
   */
  private void setEndTime(
      com.google.protobuf.UInt32Value.Builder builderForValue) {
    endTime_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * The end time for tournaments. Defaults to +1 year from current Unix time.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value end_time = 4;</code>
   */
  private void mergeEndTime(com.google.protobuf.UInt32Value value) {
    if (endTime_ != null &&
        endTime_ != com.google.protobuf.UInt32Value.getDefaultInstance()) {
      endTime_ =
        com.google.protobuf.UInt32Value.newBuilder(endTime_).mergeFrom(value).buildPartial();
    } else {
      endTime_ = value;
    }
    
  }
  /**
   * <pre>
   * The end time for tournaments. Defaults to +1 year from current Unix time.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value end_time = 4;</code>
   */
  private void clearEndTime() {  endTime_ = null;
    
  }

  public static final int LIMIT_FIELD_NUMBER = 6;
  private com.google.protobuf.Int32Value limit_;
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 6;</code>
   */
  public boolean hasLimit() {
    return limit_ != null;
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 6;</code>
   */
  public com.google.protobuf.Int32Value getLimit() {
    return limit_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : limit_;
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 6;</code>
   */
  private void setLimit(com.google.protobuf.Int32Value value) {
    if (value == null) {
      throw new NullPointerException();
    }
    limit_ = value;
    
    }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 6;</code>
   */
  private void setLimit(
      com.google.protobuf.Int32Value.Builder builderForValue) {
    limit_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 6;</code>
   */
  private void mergeLimit(com.google.protobuf.Int32Value value) {
    if (limit_ != null &&
        limit_ != com.google.protobuf.Int32Value.getDefaultInstance()) {
      limit_ =
        com.google.protobuf.Int32Value.newBuilder(limit_).mergeFrom(value).buildPartial();
    } else {
      limit_ = value;
    }
    
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 6;</code>
   */
  private void clearLimit() {  limit_ = null;
    
  }

  public static final int CURSOR_FIELD_NUMBER = 8;
  private java.lang.String cursor_;
  /**
   * <pre>
   * A next page cursor for listings (optional).
   * </pre>
   *
   * <code>optional string cursor = 8;</code>
   */
  public java.lang.String getCursor() {
    return cursor_;
  }
  /**
   * <pre>
   * A next page cursor for listings (optional).
   * </pre>
   *
   * <code>optional string cursor = 8;</code>
   */
  public com.google.protobuf.ByteString
      getCursorBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(cursor_);
  }
  /**
   * <pre>
   * A next page cursor for listings (optional).
   * </pre>
   *
   * <code>optional string cursor = 8;</code>
   */
  private void setCursor(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    cursor_ = value;
  }
  /**
   * <pre>
   * A next page cursor for listings (optional).
   * </pre>
   *
   * <code>optional string cursor = 8;</code>
   */
  private void clearCursor() {
    
    cursor_ = getDefaultInstance().getCursor();
  }
  /**
   * <pre>
   * A next page cursor for listings (optional).
   * </pre>
   *
   * <code>optional string cursor = 8;</code>
   */
  private void setCursorBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    cursor_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (categoryStart_ != null) {
      output.writeMessage(1, getCategoryStart());
    }
    if (categoryEnd_ != null) {
      output.writeMessage(2, getCategoryEnd());
    }
    if (startTime_ != null) {
      output.writeMessage(3, getStartTime());
    }
    if (endTime_ != null) {
      output.writeMessage(4, getEndTime());
    }
    if (limit_ != null) {
      output.writeMessage(6, getLimit());
    }
    if (!cursor_.isEmpty()) {
      output.writeString(8, getCursor());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (categoryStart_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCategoryStart());
    }
    if (categoryEnd_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCategoryEnd());
    }
    if (startTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getStartTime());
    }
    if (endTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getEndTime());
    }
    if (limit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getLimit());
    }
    if (!cursor_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(8, getCursor());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.ListTournamentsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.ListTournamentsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListTournamentsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.ListTournamentsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListTournamentsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ListTournamentsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListTournamentsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ListTournamentsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListTournamentsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ListTournamentsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.ListTournamentsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * List active/upcoming tournaments based on given filters.
   * </pre>
   *
   * Protobuf type {@code nakama.api.ListTournamentsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.ListTournamentsRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.ListTournamentsRequest)
      com.heroiclabs.nakama.api.ListTournamentsRequestOrBuilder {
    // Construct using com.heroiclabs.nakama.api.ListTournamentsRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The start of the categories to include. Defaults to 0.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value category_start = 1;</code>
     */
    public boolean hasCategoryStart() {
      return instance.hasCategoryStart();
    }
    /**
     * <pre>
     * The start of the categories to include. Defaults to 0.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value category_start = 1;</code>
     */
    public com.google.protobuf.UInt32Value getCategoryStart() {
      return instance.getCategoryStart();
    }
    /**
     * <pre>
     * The start of the categories to include. Defaults to 0.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value category_start = 1;</code>
     */
    public Builder setCategoryStart(com.google.protobuf.UInt32Value value) {
      copyOnWrite();
      instance.setCategoryStart(value);
      return this;
      }
    /**
     * <pre>
     * The start of the categories to include. Defaults to 0.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value category_start = 1;</code>
     */
    public Builder setCategoryStart(
        com.google.protobuf.UInt32Value.Builder builderForValue) {
      copyOnWrite();
      instance.setCategoryStart(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The start of the categories to include. Defaults to 0.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value category_start = 1;</code>
     */
    public Builder mergeCategoryStart(com.google.protobuf.UInt32Value value) {
      copyOnWrite();
      instance.mergeCategoryStart(value);
      return this;
    }
    /**
     * <pre>
     * The start of the categories to include. Defaults to 0.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value category_start = 1;</code>
     */
    public Builder clearCategoryStart() {  copyOnWrite();
      instance.clearCategoryStart();
      return this;
    }

    /**
     * <pre>
     * The end of the categories to include. Defaults to 128.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value category_end = 2;</code>
     */
    public boolean hasCategoryEnd() {
      return instance.hasCategoryEnd();
    }
    /**
     * <pre>
     * The end of the categories to include. Defaults to 128.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value category_end = 2;</code>
     */
    public com.google.protobuf.UInt32Value getCategoryEnd() {
      return instance.getCategoryEnd();
    }
    /**
     * <pre>
     * The end of the categories to include. Defaults to 128.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value category_end = 2;</code>
     */
    public Builder setCategoryEnd(com.google.protobuf.UInt32Value value) {
      copyOnWrite();
      instance.setCategoryEnd(value);
      return this;
      }
    /**
     * <pre>
     * The end of the categories to include. Defaults to 128.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value category_end = 2;</code>
     */
    public Builder setCategoryEnd(
        com.google.protobuf.UInt32Value.Builder builderForValue) {
      copyOnWrite();
      instance.setCategoryEnd(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The end of the categories to include. Defaults to 128.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value category_end = 2;</code>
     */
    public Builder mergeCategoryEnd(com.google.protobuf.UInt32Value value) {
      copyOnWrite();
      instance.mergeCategoryEnd(value);
      return this;
    }
    /**
     * <pre>
     * The end of the categories to include. Defaults to 128.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value category_end = 2;</code>
     */
    public Builder clearCategoryEnd() {  copyOnWrite();
      instance.clearCategoryEnd();
      return this;
    }

    /**
     * <pre>
     * The start time for tournaments. Defaults to epoch.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value start_time = 3;</code>
     */
    public boolean hasStartTime() {
      return instance.hasStartTime();
    }
    /**
     * <pre>
     * The start time for tournaments. Defaults to epoch.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value start_time = 3;</code>
     */
    public com.google.protobuf.UInt32Value getStartTime() {
      return instance.getStartTime();
    }
    /**
     * <pre>
     * The start time for tournaments. Defaults to epoch.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value start_time = 3;</code>
     */
    public Builder setStartTime(com.google.protobuf.UInt32Value value) {
      copyOnWrite();
      instance.setStartTime(value);
      return this;
      }
    /**
     * <pre>
     * The start time for tournaments. Defaults to epoch.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value start_time = 3;</code>
     */
    public Builder setStartTime(
        com.google.protobuf.UInt32Value.Builder builderForValue) {
      copyOnWrite();
      instance.setStartTime(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The start time for tournaments. Defaults to epoch.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value start_time = 3;</code>
     */
    public Builder mergeStartTime(com.google.protobuf.UInt32Value value) {
      copyOnWrite();
      instance.mergeStartTime(value);
      return this;
    }
    /**
     * <pre>
     * The start time for tournaments. Defaults to epoch.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value start_time = 3;</code>
     */
    public Builder clearStartTime() {  copyOnWrite();
      instance.clearStartTime();
      return this;
    }

    /**
     * <pre>
     * The end time for tournaments. Defaults to +1 year from current Unix time.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value end_time = 4;</code>
     */
    public boolean hasEndTime() {
      return instance.hasEndTime();
    }
    /**
     * <pre>
     * The end time for tournaments. Defaults to +1 year from current Unix time.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value end_time = 4;</code>
     */
    public com.google.protobuf.UInt32Value getEndTime() {
      return instance.getEndTime();
    }
    /**
     * <pre>
     * The end time for tournaments. Defaults to +1 year from current Unix time.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value end_time = 4;</code>
     */
    public Builder setEndTime(com.google.protobuf.UInt32Value value) {
      copyOnWrite();
      instance.setEndTime(value);
      return this;
      }
    /**
     * <pre>
     * The end time for tournaments. Defaults to +1 year from current Unix time.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value end_time = 4;</code>
     */
    public Builder setEndTime(
        com.google.protobuf.UInt32Value.Builder builderForValue) {
      copyOnWrite();
      instance.setEndTime(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The end time for tournaments. Defaults to +1 year from current Unix time.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value end_time = 4;</code>
     */
    public Builder mergeEndTime(com.google.protobuf.UInt32Value value) {
      copyOnWrite();
      instance.mergeEndTime(value);
      return this;
    }
    /**
     * <pre>
     * The end time for tournaments. Defaults to +1 year from current Unix time.
     * </pre>
     *
     * <code>optional .google.protobuf.UInt32Value end_time = 4;</code>
     */
    public Builder clearEndTime() {  copyOnWrite();
      instance.clearEndTime();
      return this;
    }

    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 6;</code>
     */
    public boolean hasLimit() {
      return instance.hasLimit();
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 6;</code>
     */
    public com.google.protobuf.Int32Value getLimit() {
      return instance.getLimit();
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 6;</code>
     */
    public Builder setLimit(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.setLimit(value);
      return this;
      }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 6;</code>
     */
    public Builder setLimit(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      copyOnWrite();
      instance.setLimit(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 6;</code>
     */
    public Builder mergeLimit(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.mergeLimit(value);
      return this;
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 6;</code>
     */
    public Builder clearLimit() {  copyOnWrite();
      instance.clearLimit();
      return this;
    }

    /**
     * <pre>
     * A next page cursor for listings (optional).
     * </pre>
     *
     * <code>optional string cursor = 8;</code>
     */
    public java.lang.String getCursor() {
      return instance.getCursor();
    }
    /**
     * <pre>
     * A next page cursor for listings (optional).
     * </pre>
     *
     * <code>optional string cursor = 8;</code>
     */
    public com.google.protobuf.ByteString
        getCursorBytes() {
      return instance.getCursorBytes();
    }
    /**
     * <pre>
     * A next page cursor for listings (optional).
     * </pre>
     *
     * <code>optional string cursor = 8;</code>
     */
    public Builder setCursor(
        java.lang.String value) {
      copyOnWrite();
      instance.setCursor(value);
      return this;
    }
    /**
     * <pre>
     * A next page cursor for listings (optional).
     * </pre>
     *
     * <code>optional string cursor = 8;</code>
     */
    public Builder clearCursor() {
      copyOnWrite();
      instance.clearCursor();
      return this;
    }
    /**
     * <pre>
     * A next page cursor for listings (optional).
     * </pre>
     *
     * <code>optional string cursor = 8;</code>
     */
    public Builder setCursorBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCursorBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.ListTournamentsRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.ListTournamentsRequest();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.heroiclabs.nakama.api.ListTournamentsRequest other = (com.heroiclabs.nakama.api.ListTournamentsRequest) arg1;
        categoryStart_ = visitor.visitMessage(categoryStart_, other.categoryStart_);
        categoryEnd_ = visitor.visitMessage(categoryEnd_, other.categoryEnd_);
        startTime_ = visitor.visitMessage(startTime_, other.startTime_);
        endTime_ = visitor.visitMessage(endTime_, other.endTime_);
        limit_ = visitor.visitMessage(limit_, other.limit_);
        cursor_ = visitor.visitString(!cursor_.isEmpty(), cursor_,
            !other.cursor_.isEmpty(), other.cursor_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
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
                com.google.protobuf.UInt32Value.Builder subBuilder = null;
                if (categoryStart_ != null) {
                  subBuilder = categoryStart_.toBuilder();
                }
                categoryStart_ = input.readMessage(com.google.protobuf.UInt32Value.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(categoryStart_);
                  categoryStart_ = subBuilder.buildPartial();
                }

                break;
              }
              case 18: {
                com.google.protobuf.UInt32Value.Builder subBuilder = null;
                if (categoryEnd_ != null) {
                  subBuilder = categoryEnd_.toBuilder();
                }
                categoryEnd_ = input.readMessage(com.google.protobuf.UInt32Value.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(categoryEnd_);
                  categoryEnd_ = subBuilder.buildPartial();
                }

                break;
              }
              case 26: {
                com.google.protobuf.UInt32Value.Builder subBuilder = null;
                if (startTime_ != null) {
                  subBuilder = startTime_.toBuilder();
                }
                startTime_ = input.readMessage(com.google.protobuf.UInt32Value.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(startTime_);
                  startTime_ = subBuilder.buildPartial();
                }

                break;
              }
              case 34: {
                com.google.protobuf.UInt32Value.Builder subBuilder = null;
                if (endTime_ != null) {
                  subBuilder = endTime_.toBuilder();
                }
                endTime_ = input.readMessage(com.google.protobuf.UInt32Value.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(endTime_);
                  endTime_ = subBuilder.buildPartial();
                }

                break;
              }
              case 50: {
                com.google.protobuf.Int32Value.Builder subBuilder = null;
                if (limit_ != null) {
                  subBuilder = limit_.toBuilder();
                }
                limit_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(limit_);
                  limit_ = subBuilder.buildPartial();
                }

                break;
              }
              case 66: {
                String s = input.readStringRequireUtf8();

                cursor_ = s;
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
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.ListTournamentsRequest.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:nakama.api.ListTournamentsRequest)
  private static final com.heroiclabs.nakama.api.ListTournamentsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ListTournamentsRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.ListTournamentsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ListTournamentsRequest> PARSER;

  public static com.google.protobuf.Parser<ListTournamentsRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

