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
package com.inet.mail.business.sr;

import java.util.List;

import javax.ejb.Local;

import com.inet.base.ejb.exception.EJBException;
import com.inet.mail.persistence.MailFilter;

/**
 * MailFilterSL
 *
 * @author <a href="mailto:dungnguyen@truthinet.com">Dung Nguyen</a>
 * @version 1.0i
 * 
 * Create date: Jan 25, 2008
 * <pre>
 *  Initialization MailFilterSL class.
 * </pre>
 */
@Local
public interface MailFilterSL extends MailFilterBase {
	/**
	 * Find all mail filters of owner
	 * 
	 * @param owner the given user code. 
	 * 
	 * @return the {@link List} of {@link MailFilter} instance.
	 * @throws EJBException when error occurs during finding {@link MailFilter} instance.
	 */
	List<MailFilter> findByUser(String owner) throws EJBException ;
}
