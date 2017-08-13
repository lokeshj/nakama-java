/*
 * Copyright 2017 The Nakama Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.heroiclabs.nakama;

import com.google.gson.reflect.TypeToken;
import lombok.Data;
import lombok.ToString;

import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.Base64;
import java.util.Map;
import java.util.UUID;

@Data
@ToString(includeFieldNames = true)
public class DefaultSession implements Session {

    private final long createdAt;

    private final long expiresAt;

    private final String handle;

    private final byte[] id;

    private final String token;

    private DefaultSession(final String token) {
        final String[] decoded = token.split("\\.");
        if (decoded.length != 3) {
            throw new IllegalArgumentException("Not a valid token.");
        }
        final String decodedJson = new String(Base64.getDecoder().decode(decoded[1]));
        Type type = new TypeToken<Map<String, Object>>(){}.getType();
        Map<String, Object> jsonMap = DefaultClient.GSON.fromJson(decodedJson, type);

        createdAt = System.currentTimeMillis();
        expiresAt = Math.round(((Double) jsonMap.get("exp")) * 1000L);
        handle = jsonMap.get("han").toString();

        final UUID uid = UUID.fromString(jsonMap.get("uid").toString());
        final ByteBuffer bb = ByteBuffer.wrap(new byte[16]);
        bb.putLong(uid.getMostSignificantBits());
        bb.putLong(uid.getLeastSignificantBits());
        id = bb.array();

        this.token = token;
    }

    public boolean isExpired(final long currentTimeMillis) {
        return (expiresAt - currentTimeMillis) < 0L;
    }

    public static Session restore(final String token) {
        return new DefaultSession(token);
    }
}
