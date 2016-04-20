/**     
 * @Title: MobileSendFactory.java   
 * @Package com.jack.util   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年3月9日 下午8:45:30   
 * @version V1.0     
 */ 
package com.jack.util;

import com.jack.dao.Provider;
import com.jack.dao.Sender;
import com.jack.daoimpl.MobileSender;

/**   
 * @ClassName: MobileSendFactory   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年3月9日 下午8:45:30   
 *      
 */
public class MobileSendFactory implements Provider{

	/** 
	 *  
	 * <p>Title: produce</p>   
	 * <p>Description: </p>   
	 * @return   
	 * @see com.jack.dao.Provider#produce()   
	 */   
	@Override
	public Sender produce() {
		
		return new MobileSender();
	}

}
