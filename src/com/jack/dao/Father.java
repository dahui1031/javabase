/**     
 * @Title: Father.java   
 * @Package com.jack.dao   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年4月16日 下午4:58:10   
 * @version V1.0     
 */ 
package com.jack.dao;

/**   
 * @ClassName: Father   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年4月16日 下午4:58:10   
 *      
 */
public class Father {
	static{
		System.out.println("fataher out--");
	}
	{
		System.out.println("father非静态输出1");
	}
	
	public Father(){
		System.out.println("father构造方法");
	}
	static void father(){
		System.out.println("静态块");
	}
	
	public static void main(String[] args) {
		new Father();
	}
}
