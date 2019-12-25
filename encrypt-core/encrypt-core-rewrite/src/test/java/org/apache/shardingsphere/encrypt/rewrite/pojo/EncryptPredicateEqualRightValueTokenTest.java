/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.encrypt.rewrite.pojo;

import org.apache.shardingsphere.encrypt.rewrite.token.pojo.EncryptPredicateEqualRightValueToken;
import org.apache.shardingsphere.encrypt.rewrite.token.pojo.EncryptPredicateRightValueToken;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public final class EncryptPredicateEqualRightValueTokenTest {
    
    @Test
    public void assertToStringWithoutPlaceholderWithoutTableOwnerWithEqual() {
        Map<Integer, Object> indexValues = new LinkedHashMap<>();
        indexValues.put(0, "a");
        EncryptPredicateRightValueToken actual = new EncryptPredicateEqualRightValueToken(0, 0, indexValues, Collections.<Integer>emptyList());
        assertThat(actual.toString(), is("'a'"));
    }
    
    @Test
    public void assertToStringWithPlaceholderWithoutTableOwnerWithEqual() {
        EncryptPredicateRightValueToken actual = new EncryptPredicateEqualRightValueToken(0, 0, Collections.<Integer, Object>emptyMap(), Collections.singletonList(0));
        assertThat(actual.toString(), is("?"));
    }
}
