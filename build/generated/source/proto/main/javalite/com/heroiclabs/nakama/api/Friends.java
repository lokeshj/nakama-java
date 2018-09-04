// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * A collection of zero or more friends of the user.
 * </pre>
 *
 * Protobuf type {@code nakama.api.Friends}
 */
public  final class Friends extends
    com.google.protobuf.GeneratedMessageLite<
        Friends, Friends.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.Friends)
    FriendsOrBuilder {
  private Friends() {
    friends_ = emptyProtobufList();
  }
  public static final int FRIENDS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.heroiclabs.nakama.api.Friend> friends_;
  /**
   * <pre>
   * The Friend objects.
   * </pre>
   *
   * <code>repeated .nakama.api.Friend friends = 1;</code>
   */
  public java.util.List<com.heroiclabs.nakama.api.Friend> getFriendsList() {
    return friends_;
  }
  /**
   * <pre>
   * The Friend objects.
   * </pre>
   *
   * <code>repeated .nakama.api.Friend friends = 1;</code>
   */
  public java.util.List<? extends com.heroiclabs.nakama.api.FriendOrBuilder> 
      getFriendsOrBuilderList() {
    return friends_;
  }
  /**
   * <pre>
   * The Friend objects.
   * </pre>
   *
   * <code>repeated .nakama.api.Friend friends = 1;</code>
   */
  public int getFriendsCount() {
    return friends_.size();
  }
  /**
   * <pre>
   * The Friend objects.
   * </pre>
   *
   * <code>repeated .nakama.api.Friend friends = 1;</code>
   */
  public com.heroiclabs.nakama.api.Friend getFriends(int index) {
    return friends_.get(index);
  }
  /**
   * <pre>
   * The Friend objects.
   * </pre>
   *
   * <code>repeated .nakama.api.Friend friends = 1;</code>
   */
  public com.heroiclabs.nakama.api.FriendOrBuilder getFriendsOrBuilder(
      int index) {
    return friends_.get(index);
  }
  private void ensureFriendsIsMutable() {
    if (!friends_.isModifiable()) {
      friends_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(friends_);
     }
  }

  /**
   * <pre>
   * The Friend objects.
   * </pre>
   *
   * <code>repeated .nakama.api.Friend friends = 1;</code>
   */
  private void setFriends(
      int index, com.heroiclabs.nakama.api.Friend value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureFriendsIsMutable();
    friends_.set(index, value);
  }
  /**
   * <pre>
   * The Friend objects.
   * </pre>
   *
   * <code>repeated .nakama.api.Friend friends = 1;</code>
   */
  private void setFriends(
      int index, com.heroiclabs.nakama.api.Friend.Builder builderForValue) {
    ensureFriendsIsMutable();
    friends_.set(index, builderForValue.build());
  }
  /**
   * <pre>
   * The Friend objects.
   * </pre>
   *
   * <code>repeated .nakama.api.Friend friends = 1;</code>
   */
  private void addFriends(com.heroiclabs.nakama.api.Friend value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureFriendsIsMutable();
    friends_.add(value);
  }
  /**
   * <pre>
   * The Friend objects.
   * </pre>
   *
   * <code>repeated .nakama.api.Friend friends = 1;</code>
   */
  private void addFriends(
      int index, com.heroiclabs.nakama.api.Friend value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureFriendsIsMutable();
    friends_.add(index, value);
  }
  /**
   * <pre>
   * The Friend objects.
   * </pre>
   *
   * <code>repeated .nakama.api.Friend friends = 1;</code>
   */
  private void addFriends(
      com.heroiclabs.nakama.api.Friend.Builder builderForValue) {
    ensureFriendsIsMutable();
    friends_.add(builderForValue.build());
  }
  /**
   * <pre>
   * The Friend objects.
   * </pre>
   *
   * <code>repeated .nakama.api.Friend friends = 1;</code>
   */
  private void addFriends(
      int index, com.heroiclabs.nakama.api.Friend.Builder builderForValue) {
    ensureFriendsIsMutable();
    friends_.add(index, builderForValue.build());
  }
  /**
   * <pre>
   * The Friend objects.
   * </pre>
   *
   * <code>repeated .nakama.api.Friend friends = 1;</code>
   */
  private void addAllFriends(
      java.lang.Iterable<? extends com.heroiclabs.nakama.api.Friend> values) {
    ensureFriendsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, friends_);
  }
  /**
   * <pre>
   * The Friend objects.
   * </pre>
   *
   * <code>repeated .nakama.api.Friend friends = 1;</code>
   */
  private void clearFriends() {
    friends_ = emptyProtobufList();
  }
  /**
   * <pre>
   * The Friend objects.
   * </pre>
   *
   * <code>repeated .nakama.api.Friend friends = 1;</code>
   */
  private void removeFriends(int index) {
    ensureFriendsIsMutable();
    friends_.remove(index);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < friends_.size(); i++) {
      output.writeMessage(1, friends_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < friends_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, friends_.get(i));
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.Friends parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.Friends parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Friends parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.Friends parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Friends parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.Friends parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Friends parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.Friends parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Friends parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.Friends parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.Friends prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * A collection of zero or more friends of the user.
   * </pre>
   *
   * Protobuf type {@code nakama.api.Friends}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.Friends, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.Friends)
      com.heroiclabs.nakama.api.FriendsOrBuilder {
    // Construct using com.heroiclabs.nakama.api.Friends.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1;</code>
     */
    public java.util.List<com.heroiclabs.nakama.api.Friend> getFriendsList() {
      return java.util.Collections.unmodifiableList(
          instance.getFriendsList());
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1;</code>
     */
    public int getFriendsCount() {
      return instance.getFriendsCount();
    }/**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1;</code>
     */
    public com.heroiclabs.nakama.api.Friend getFriends(int index) {
      return instance.getFriends(index);
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1;</code>
     */
    public Builder setFriends(
        int index, com.heroiclabs.nakama.api.Friend value) {
      copyOnWrite();
      instance.setFriends(index, value);
      return this;
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1;</code>
     */
    public Builder setFriends(
        int index, com.heroiclabs.nakama.api.Friend.Builder builderForValue) {
      copyOnWrite();
      instance.setFriends(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1;</code>
     */
    public Builder addFriends(com.heroiclabs.nakama.api.Friend value) {
      copyOnWrite();
      instance.addFriends(value);
      return this;
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1;</code>
     */
    public Builder addFriends(
        int index, com.heroiclabs.nakama.api.Friend value) {
      copyOnWrite();
      instance.addFriends(index, value);
      return this;
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1;</code>
     */
    public Builder addFriends(
        com.heroiclabs.nakama.api.Friend.Builder builderForValue) {
      copyOnWrite();
      instance.addFriends(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1;</code>
     */
    public Builder addFriends(
        int index, com.heroiclabs.nakama.api.Friend.Builder builderForValue) {
      copyOnWrite();
      instance.addFriends(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1;</code>
     */
    public Builder addAllFriends(
        java.lang.Iterable<? extends com.heroiclabs.nakama.api.Friend> values) {
      copyOnWrite();
      instance.addAllFriends(values);
      return this;
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1;</code>
     */
    public Builder clearFriends() {
      copyOnWrite();
      instance.clearFriends();
      return this;
    }
    /**
     * <pre>
     * The Friend objects.
     * </pre>
     *
     * <code>repeated .nakama.api.Friend friends = 1;</code>
     */
    public Builder removeFriends(int index) {
      copyOnWrite();
      instance.removeFriends(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.Friends)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.Friends();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        friends_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.heroiclabs.nakama.api.Friends other = (com.heroiclabs.nakama.api.Friends) arg1;
        friends_= visitor.visitList(friends_, other.friends_);
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
                if (!friends_.isModifiable()) {
                  friends_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(friends_);
                }
                friends_.add(
                    input.readMessage(com.heroiclabs.nakama.api.Friend.parser(), extensionRegistry));
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.Friends.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.api.Friends)
  private static final com.heroiclabs.nakama.api.Friends DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Friends();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.Friends getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Friends> PARSER;

  public static com.google.protobuf.Parser<Friends> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
