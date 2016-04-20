/**     
 * @Title: InnerClassSingleton.java   
 * @Package com.jack.designmodel   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年4月8日 下午4:36:09   
 * @version V1.0     
 */ 
package com.jack.designmodel;

/**   
 * @ClassName: InnerClassSingleton   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年4月8日 下午4:36:09   
 *      
 */
public class InnerClassSingleton {
  private InnerClassSingleton(){}
  
  private static class innerClassSingletonHolder{
	  private static InnerClassSingleton instance=new InnerClassSingleton();
  }
  public static InnerClassSingleton getInstance(){     
      return innerClassSingletonHolder.instance;     
  } 
  
  public static void main(String[] args) {

   
  }
  
}
