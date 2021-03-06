/*
 * Copyright 2011 Goldman Sachs.
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

package com.gs.collections.impl.list.immutable;

import com.gs.collections.impl.test.Verify;
import org.junit.Test;

public class ImmutableSingletonListSerializationTest
{
    @Test
    public void serializedForm()
    {
        Verify.assertSerializedForm(
                "rO0ABXNyAD1jb20uZ3MuY29sbGVjdGlvbnMuaW1wbC5saXN0LmltbXV0YWJsZS5JbW11dGFibGVT\n"
                        + "aW5nbGV0b25MaXN0AAAAAAAAAAECAAFMAAhlbGVtZW50MXQAEkxqYXZhL2xhbmcvT2JqZWN0O3hw\n"
                        + "c3IAEWphdmEubGFuZy5JbnRlZ2VyEuKgpPeBhzgCAAFJAAV2YWx1ZXhyABBqYXZhLmxhbmcuTnVt\n"
                        + "YmVyhqyVHQuU4IsCAAB4cAAAAAE=",
                new ImmutableSingletonList<Integer>(1));
    }
}
