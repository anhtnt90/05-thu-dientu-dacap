/*****************************************************************
   Copyright 2006 by Hien Nguyen (hiennguyen@truthinet.com)

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
package com.inet.mail.demo;

import com.inet.mail.AbstractMailFactory;
import com.inet.mail.MailConfigureFactory;
import com.inet.mail.data.MailProtocol;
import com.inet.mail.data.MailSecurity;

public class TestConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		// create connect to server from the default setting.
		AbstractMailFactory mailFactory = MailConfigureFactory.createFactory() ;
		System.out.println(System.currentTimeMillis() - time);
		int i = 0;
		while (i < 10)
		{
			time = System.currentTimeMillis();
			mailFactory.connect(MailProtocol.POP3,MailSecurity.NONE,"mail.truthinet.com.vn",110,"hiennguyen@truthinet.com.vn", "hiennguyen");
			System.out.println(System.currentTimeMillis() - time);
			mailFactory.close() ;
			i++;
		}
		//mailFactory.createFolder("sent");
		// close connection.
		mailFactory.close() ;

	}

}
