/*******************************************************************************
 * Copyright (c) 2017 Intuit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.intuit.oauth2.exception;

import com.intuit.oauth2.http.Response;

/**
 * Exception class to handle connection exceptions
 * 
 * @author dderose
 *
 */
public class ConnectionException extends PlatformException {

	private static final long serialVersionUID = 478461784235051778L;
	
	public ConnectionException(final String errorMessage){
		super(errorMessage);
	}
	
	public ConnectionException(final String errorMessage, final String errorCode){
		super(errorMessage,errorCode);
	}
	
	public ConnectionException(final String errorMessage, final Throwable e){
		super(errorMessage,e);
	}

	public ConnectionException(final String errorMessage, final String statusCode, final String intuit_tid, final Response response){
		super(errorMessage, statusCode, intuit_tid, response);
	}


}
