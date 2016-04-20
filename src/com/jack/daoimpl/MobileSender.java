/**     
 * @Title: MobileSender.java   
 * @Package com.jack.daoimpl   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年3月9日 上午9:39:27   
 * @version V1.0     
 */ 
package com.jack.daoimpl;

import com.jack.dao.Sender;

/**   
 * @ClassName: MobileSender   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年3月9日 上午9:39:27   
 *      
 */
public class MobileSender implements Sender {

	/** 
	 *  
	 * <p>Title: Send</p>   
	 * <p>Description: </p>      
	 * @see com.jack.dao.Sender#Send()   
	 */
	@Override
	public void Send() {
		System.out.println("this is mobilesender");
	}

	/** 
	 *  
	 * <p>Title: SendNow</p>   
	 * <p>Description: </p>      
	 * @see com.jack.dao.Sender#SendNow()   
	 */   
	@Override
	public void SendNow() {
		System.out.println("now is mobilesender");
		
	}

}
