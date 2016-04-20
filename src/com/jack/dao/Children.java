/**     
 * @Title: Children.java   
 * @Package com.jack.dao   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年4月16日 下午5:00:00   
 * @version V1.0     
 */ 
package com.jack.dao;

/**   
 * @ClassName: Children   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年4月16日 下午5:00:00   
 *      
 */
public class Children extends Father{
	static{
		System.out.println("children out---------");
	}
	{
		System.out.println("children out");
	}
	public Children(){
		System.out.println("children 的构筑方法");
	}
	static void Children(){
		System.out.println("children 的静态方法");
	}
	public static void main(String[] args) {
         new Children();
         int x=3;
         int y=(x++)+(++x);
         System.out.println(y);
	}
}
