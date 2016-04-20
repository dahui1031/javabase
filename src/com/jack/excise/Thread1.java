/**     
 * @Title: Thread.java   
 * @Package com.jack.excise   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年3月8日 下午2:54:51   
 * @version V1.0     
 */ 
package com.jack.excise;

import com.jack.bean.Person;
import com.jack.bean.Student;

/**   
 * @ClassName: Thread   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年3月8日 下午2:54:51   
 *      
 */
public class Thread1{
	


public static void main(String[] args) {
	  Student s=new Student();	
	  s.setName("zhangsan");
	  Student s1=s.clone();
	 // s1.setName("lisi");
	  System.out.println(s.getName()+"---"+s1.getName());
	  
	  Person p=new Person();
	  p.setName("lala");
	  Person p1=p;
	  p1.setName("oooo");
	  System.out.println(p1.getName()+"___"+p.getName());
	  
	  int a=2;
	  int b=a;
	  a=5;
	  System.out.println(b);
	  
	  
	  String aaa="11111";
	  String bbb=aaa;
	  bbb="2222";
	  System.out.println(aaa);
	  
	  
}

}
