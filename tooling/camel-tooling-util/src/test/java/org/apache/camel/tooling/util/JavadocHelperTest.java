/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.tooling.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavadocHelperTest {

    private static final String JAVADOC = ""
                                          + "     * When in streaming mode, then the splitter splits the original message on-demand, and each splitted\n"
                                          + "     * message is processed one by one. This reduces memory usage as the splitter do not split all the messages first,\n"
                                          + "     * but then we do not know the total size, and therefore the {@link org.apache.camel.Exchange#SPLIT_SIZE} is empty.\n"
                                          + "     * <p/>\n"
                                          + "     * In non-streaming mode (default) the splitter will split each message first, to know the total size, and then\n"
                                          + "     * process each message one by one. This requires to keep all the splitted messages in memory and therefore requires\n"
                                          + "     * more memory. The total size is provided in the {@link org.apache.camel.Exchange#SPLIT_SIZE} header.\n"
                                          + "     * <p/>\n"
                                          + "     * The streaming mode also affects the aggregation behavior.\n"
                                          + "     * If enabled then Camel will process replies out-of-order, eg in the order they come back.\n"
                                          + "     * If disabled, Camel will process replies in the same order as the messages was splitted.\n"
                                          + "     *\n"
                                          + "     * @return the builder\n"
                                          + "     */\n";

    private static final String EXPECTED_OUT
            = "When in streaming mode, then the splitter splits the original message on-demand, and each splitted message is processed one by one."
              + " This reduces memory usage as the splitter do not split all the messages first, but then we do not know the total size, and therefore"
              + " the org.apache.camel.Exchange#SPLIT_SIZE is empty. In non-streaming mode (default) the splitter will split each message first, to know"
              + " the total size, and then process each message one by one. This requires to keep all the splitted messages in memory and therefore requires"
              + " more memory. The total size is provided in the org.apache.camel.Exchange#SPLIT_SIZE header. The streaming mode also affects the aggregation"
              + " behavior. If enabled then Camel will process replies out-of-order, eg in the order they come back. If disabled, Camel will process replies"
              + " in the same order as the messages was splitted.";

    private static final String JAVADOC2 = ""
                                           + "     **\n"
                                           + "     * Sets a grace period after which the mock endpoint will re-assert\n"
                                           + "     * to ensure the preliminary assertion is still valid.\n"
                                           + "     * <p/>\n"
                                           + "     * This is used for example to assert that <b>exactly</b> a number of messages \n"
                                           + "     * arrives. For example if {@link #expectedMessageCount(int)} was set to 5, then\n"
                                           + "     * the assertion is satisfied when 5 or more message arrives. To ensure that\n"
                                           + "     * exactly 5 messages arrives, then you would need to wait a little period\n"
                                           + "     * to ensure no further message arrives. This is what you can use this\n"
                                           + "     * {@link #setAssertPeriod(long)} method for.\n"
                                           + "     * <p/>\n"
                                           + "     * By default this period is disabled.\n"
                                           + "     *\n"
                                           + "     * @param period grace period in millis\n"
                                           + "     *\n";

    private static final String EXPECTED_OUT2
            = "Sets a grace period after which the mock endpoint will re-assert to ensure the preliminary assertion "
              + "is still valid. This is used for example to assert that exactly a number of messages arrives. For example if expectedMessageCount(int)"
              + " was set to 5, then the assertion is satisfied when 5 or more message arrives. To ensure that exactly 5 messages arrives, then you would need"
              + " to wait a little period to ensure no further message arrives. This is what you can use this setAssertPeriod(long) method for. By default"
              + " this period is disabled.";

    @Test
    public void testSanitizeJavaDoc() throws Exception {
        String s = "* more memory. The total size is provided in the {@link org.apache.camel.Exchange#SPLIT_SIZE} header.";
        String s2 = JavadocHelper.sanitizeDescription(s, false);
        Assertions.assertEquals("more memory. The total size is provided in the org.apache.camel.Exchange#SPLIT_SIZE header.",
                s2);

        String out = JavadocHelper.sanitizeDescription(JAVADOC, false);
        Assertions.assertEquals(EXPECTED_OUT, out);

        String out2 = JavadocHelper.sanitizeDescription(JAVADOC2, false);
        Assertions.assertEquals(EXPECTED_OUT2, out2);
    }

    @Test
    public void testSanitizeJavaDocLink() throws Exception {
        String s = " * Provides methods to create, delete, find, and update {@link Customer}\n"
                   + " * objects. This class does not need to be instantiated directly. Instead, use";
        String s2 = JavadocHelper.sanitizeDescription(s, false);
        Assertions.assertEquals(
                "Provides methods to create, delete, find, and update Customer objects. This class does not need to be instantiated directly. Instead, use",
                s2);

        s = " * Provides methods to interact with {@link Transaction Transactions}.\n"
            + " * E.g. sales, credits, refunds, searches, etc.\n";
        String s3 = JavadocHelper.sanitizeDescription(s, false);
        Assertions.assertEquals("Provides methods to interact with Transactions. E.g. sales, credits, refunds, searches, etc.",
                s3);
    }

    @Test
    public void testltgtInJavaDoc() throws Exception {
        String s = " * valid for versions < 26.0.";
        String s2 = JavadocHelper.sanitizeDescription(s, false);
        Assertions.assertEquals(s.substring(3), s2);
        String s3 = " * valid for versions >= 26.0.";
        String s4 = JavadocHelper.sanitizeDescription(s3, false);
        Assertions.assertEquals(s3.substring(3), s4);
    }

    @Test
    public void testRemoveXmlTagsInJavaDoc() throws Exception {
        String s = " * foo <xs:foo a=\"x\" b=\"y\"> bar";
        String s2 = JavadocHelper.sanitizeDescription(s, false);
        Assertions.assertEquals("foo bar", s2);
        String s3 = " * foo </xs:foo> bar";
        String s4 = JavadocHelper.sanitizeDescription(s3, false);
        Assertions.assertEquals("foo bar", s4);
        String s5 = " * foo </xs:foo > bar";
        String s6 = JavadocHelper.sanitizeDescription(s5, false);
        Assertions.assertEquals("foo bar", s6);
        String s7 = " * this < is not an xml > tag";
        String s8 = JavadocHelper.sanitizeDescription(s7, false);
        Assertions.assertEquals(s7.substring(3), s8);
    }

    @Test
    public void testXmlEncode() throws Exception {
        String s = "foo &amp; bar &gt; baz &lt; foo &quot; bar";
        String s2 = JavadocHelper.xmlEncode(s);
        Assertions.assertEquals(s, s2);
        String s3 = "foo & bar > baz < foo \" bar";
        String s4 = JavadocHelper.xmlEncode(s3);
        Assertions.assertEquals(s, s4);
    }
}
