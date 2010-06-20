/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/
package org.apache.cayenne;

import java.util.Map;

import junit.framework.TestCase;

public class BaseContextTest extends TestCase {

    public void testUserPropertiesLazyInit() {
        BaseContext context = new MockBaseContext();
        assertNull(context.userProperties);

        Map<String, Object> properties = context.getUserProperties();
        assertNotNull(properties);
        assertSame(properties, context.getUserProperties());
    }

    public void testBindThreadDeserializationChannel() {

        assertNull(BaseContext.getThreadDeserializationChannel());

        try {
            DataChannel channel = new MockDataChannel();
            BaseContext.bindThreadDeserializationChannel(channel);
            assertSame(channel, BaseContext.getThreadDeserializationChannel());
        }
        finally {
            BaseContext.bindThreadDeserializationChannel(null);
        }

        assertNull(BaseContext.getThreadDeserializationChannel());
    }
}
