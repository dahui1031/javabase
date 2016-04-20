/**     
 * @Title: HungrySingleton.java   
 * @Package com.jack.designmodel   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年4月8日 下午4:33:59   
 * @version V1.0     
 */ 
package com.jack.designmodel;


/**   
 * @ClassName: HungrySingleton   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年4月8日 下午4:33:59   
 *      
 */
public class HungrySingleton {

	private HungrySingleton(){}
	private static HungrySingleton instance=new HungrySingleton();
	/**
	 * @return instance
	 */
	public static HungrySingleton getInstance() {
		if(instance==null){
			synchronized (instance) {
				if(instance==null){
				instance=new HungrySingleton();
				}
			}
		}
		return instance;
	}
}
