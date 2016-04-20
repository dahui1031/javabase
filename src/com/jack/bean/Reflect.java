/**     
 * @Title: Reflect.java   
 * @Package com.jack.bean   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年4月13日 下午1:39:39   
 * @version V1.0     
 */ 
package com.jack.bean;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**   
 * @ClassName: Reflect   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年4月13日 下午1:39:39   
 *      
 */
public class Reflect {
   public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, ClassNotFoundException {
	Class clazz=Person.class;
	//Person p=(Person) clazz.newInstance();
	//p.method();
	Constructor<Person> con=clazz.getConstructor(String.class);
	Person p=con.newInstance(new Object[]{"zhangsan"});
	p.method();
	Method[] methods=clazz.getDeclaredMethods();
	for(Method method:methods){
		if("setName".equals(method.getName())){
			method.invoke(p, "lisi");
		}
	}
	p.method();
	
	Class PersonClass=Class.forName("Person");
	Person person=(Person)PersonClass.newInstance();
   }
}
