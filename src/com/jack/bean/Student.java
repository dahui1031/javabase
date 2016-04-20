/**     
 * @Title: Student.java   
 * @Package com.jack.bean   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年3月8日 下午5:28:04   
 * @version V1.0     
 */ 
package com.jack.bean;

/**   
 * @ClassName: Student   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年3月8日 下午5:28:04   
 *      
 */
public class Student implements Cloneable{
   private String name;

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

public Student clone(){
	Student stu=null;
	try {
		stu=(Student) super.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return stu;		
}
public String toString(Student stu){
	System.out.println("");
	return stu.getName();
}
   
}
