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
package com.inet.web.controller;

import javax.servlet.http.HttpServletRequest;

import com.inet.web.core.ajax.AbstractWebOSTxAjaxContent;

/**
 * AbstractWebOSTxAjaxContentController.
 * 
 * @author <a href="mailto:dungnguyen@truthinet.com">Dung Nguyen</a>
 * @version 1.0i
 * 
 * Create date Aug 1, 2008
 * <pre>
 *  Initialization AbstractWebOSTxAjaxContentController class.
 * </pre>
 */
public abstract class AbstractWebOSTxAjaxContentController<T> extends
		AbstractWebOSTxAjaxContent<T> {
	//~ Methods ===============================================================	
	/**
	 * Create <tt>AbstractWebOSTxAjaxContentController</tt> instance from
	 * the given service.
	 */
	public AbstractWebOSTxAjaxContentController(T service) {
		super(service) ;
	}
	
	
	/**
	 * @see com.inet.web.core.ajax.AbstractAjaxContent#getErrorMessage()
	 */
	protected String getErrorMessage() {
		return "iwebos.access.not_enough_privileged";
	}
	
	/**
	 * @see com.inet.web.core.ajax.AbstractAjaxContent#hasRight(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	protected boolean hasRight(HttpServletRequest request) {
		return true;	
	}
}
