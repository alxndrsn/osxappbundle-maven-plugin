package org.codehaus.mojo.osxappbundle.encoding;

/*
 * Copyright 2001-2008 The Codehaus.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import junit.framework.TestCase;


public class DefaultEncodingDetectorTest extends TestCase
{
    private DefaultEncodingDetector detector;

    protected void setUp()
        throws Exception
    {
        detector = new DefaultEncodingDetector();
    }


    public void testEncodings() {


        assertEquals( "iso-8859-1", detector.detectXmlEncoding( getClass().getResourceAsStream( "iso-8859-1.xml" )).toLowerCase(  ));
        assertEquals( "iso-8859-1", detector.detectXmlEncoding( getClass().getResourceAsStream( "iso-8859-1-noversion.xml" )).toLowerCase(  ));
        assertEquals( "utf-8", detector.detectXmlEncoding( getClass().getResourceAsStream( "utf-8.xml" )).toLowerCase(  ));
        assertEquals( "utf-8", detector.detectXmlEncoding( getClass().getResourceAsStream( "default.xml" )).toLowerCase(  ));
        assertEquals( "utf-8", detector.detectXmlEncoding( getClass().getResourceAsStream( "default2.xml" )).toLowerCase(  ));
    }



}
