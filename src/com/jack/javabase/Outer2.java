/**     
 * @Title: Outer2.java   
 * @Package com.jack.javabase   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年4月10日 上午11:19:32   
 * @version V1.0     
 */ 
package com.jack.javabase;

/**   
 * @ClassName: Outer2   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年4月10日 上午11:19:32   
 *      
 */
public class Outer2 {
  public static void main(String[] args) {
	Outer2 outer=new Outer2();
	Inners inner=outer.getInner("Inner","gz");
}
  
  public Inners getInner(final String name,String city){
	  return new Inners(name,city){
		  private String nameStr=name;
		  public String getName(){
			  return nameStr;
		  }
	  };
  }
}
abstract class Inners{
	Inners(String name,String city){
		System.out.println(city);
	}
	abstract String getName();
}
