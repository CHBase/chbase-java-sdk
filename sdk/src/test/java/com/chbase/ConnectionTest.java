/*
 * Copyright 2011 Microsoft Corp.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.chbase;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.imposters.ByteBuddyClassImposteriser;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JMock.class)
public class ConnectionTest {
	
	private Mockery context = new JUnit4Mockery() {{
        setImposteriser(ByteBuddyClassImposteriser.INSTANCE);
    }};

    private Authenticator authenticator =  
        context.mock(Authenticator.class); 

	/**
     * Create the test case
     *
     */
    public ConnectionTest()
    {
    }
    
    @Test
    public void Authenticate()
    {
    	final Connection connection = new Connection();
    	connection.setAuthenticator(authenticator);
    	context.checking(new Expectations() {{
            oneOf(authenticator).authenticate(connection, false);
        }});
    	connection.authenticate();
    }
}
