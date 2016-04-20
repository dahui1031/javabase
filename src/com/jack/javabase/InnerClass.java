/**     
 * @Title: InnerClass.java   
 * @Package com.jack.javabase   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年4月10日 上午10:29:30   
 * @version V1.0     
 */ 
package com.jack.javabase;

/**   
 * @ClassName: InnerClass   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年4月10日 上午10:29:30   
 *      
 */
public class InnerClass {
public static void main(String[] args) {
	InnerClass innerClass=new InnerClass();
	InnerClass.Inner inner=innerClass.new Inner();
    inner.print("Outer.new");
    
    inner=innerClass.getInner();
    inner.print("Outer.get");
}

public class Inner{
	public void print(String str){
		System.out.println("this is inner str"+str);
	}
}
public Inner getInner(){
	return new Inner();
}

}
