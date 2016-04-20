/**     
 * @Title: SendFactory.java   
 * @Package com.jack.excise   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年3月9日 上午9:58:47   
 * @version V1.0     
 */ 
package com.jack.util;

import com.jack.dao.Sender;
import com.jack.daoimpl.MailSender;
import com.jack.daoimpl.MobileSender;

/**   
 * @ClassName: SendFactory   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年3月9日 上午9:58:47   
 *      
 */
public class SendFactory {
	public static Sender mobileProduce(){
	   return new MobileSender(); 
	}
	public static Sender mailProduce(){
		return new MailSender();
	}
	
	public static Sender mailNowProduce(){
		return new MailSender();
	}
	
	public static Sender mobileNowProduce(){
		return new MobileSender();
	}
}
