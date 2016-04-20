/**     
 * @Title: Source.java   
 * @Package com.jack.bean   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年4月13日 上午11:12:21   
 * @version V1.0     
 */ 
package com.jack.bean;

import com.jack.bean.Sourceable;;

/**   
 * @ClassName: Source   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年4月13日 上午11:12:21   
 *      
 */
public class Source implements Sourceable {

	/** 
	 *  
	 * <p>Title: method</p>   
	 * <p>Description: </p>      
	 * @see com.jack.bean.Sourceable#method()   
	 */   
	@Override
	public void method() {
		System.out.println("具体实现方法");
	}


}
