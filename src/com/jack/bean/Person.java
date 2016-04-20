/**     
 * @Title: Person.java   
 * @Package com.jack.bean   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年3月8日 下午6:25:44   
 * @version V1.0     
 */ 
package com.jack.bean;

/**   
 * @ClassName: Person   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年3月8日 下午6:25:44   
 *      
 */
public class Person {
   public String name; 
   public Person(){}
   public Person(String name){
	   this.name=name;
   }

   
   public void method(){
	   System.out.println(name);
   }
   
/**
 * @return name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
   
}
