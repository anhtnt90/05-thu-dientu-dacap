/*****************************************************************
   Copyright 2006 by Dung Nguyen (dungnguyen@truthinet.com)

   Licensed under the iNet Solutions Corp.,;
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.truthinet.com/licenses

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*****************************************************************/
package com.inet.mail.sun;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * SunSMTPSimpleAuthenticator
 *
 * @author <a href="mailto:dungnguyen@truthinet.com">Dung Nguyen</a>
 * @version 1.0i
 * 
 * @date Feb 1, 2008
 * <pre>
 *  Initialization SunSMTPSimpleAuthenticator class.
 * </pre>
 */
public class SunSMTPSimpleAuthenticator extends Authenticator{
	//-------------------------------------------------------------
	// Class variable.
	//
	String username ; // user name.
 	String password ; // password.
 	
 	//------------------------------------------------------------
 	// Class functions.
 	//
 	/**
 	 * Create SunSMTPSimpleAuthenticator instance.
 	 */
 	public SunSMTPSimpleAuthenticator(String username, String password){
 		this.username = username ;
 		this.password = password ;
 	}
 	
 	/**
 	 * @see javax.mail.Authenticator#getPasswordAuthentication()
 	 */
 	protected PasswordAuthentication getPasswordAuthentication() {
 		return new PasswordAuthentication(this.username, this.password) ;
 	}
}
