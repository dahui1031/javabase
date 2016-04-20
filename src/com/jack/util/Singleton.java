/**     
 * @Title: singleton.java   
 * @Package com.jack.util   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年3月10日 上午9:42:37   
 * @version V1.0     
 */ 
package com.jack.util;

/**   
 * @ClassName: singleton   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年3月10日 上午9:42:37   
 *      
 */
public class Singleton {
   private static Singleton instance=null;
   private Singleton(){
	   
   }
   public static synchronized Singleton getInstance(){
	   if(instance==null){
		   instance=new Singleton();
	   }
	   return instance;
   }
   public Object readResolve(){
	   return instance;
   }
}
