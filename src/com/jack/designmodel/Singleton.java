/**     
 * @Title: Singleton.java   
 * @Package com.jack.designmodel   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年4月12日 下午5:35:31   
 * @version V1.0     
 */ 
package com.jack.designmodel;

/**   
 * @ClassName: Singleton   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年4月12日 下午5:35:31   
 *      
 */
public class Singleton {
	private final static  Singleton instance=new Singleton();
	Singleton(){}
    public static Singleton getSingleton(){
    	return instance;
    }
}
