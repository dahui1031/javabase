/**     
 * @Title: StringIntern.java   
 * @Package com.jack.excise   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年3月19日 下午1:45:51   
 * @version V1.0     
 */ 
package com.jack.excise;

/**   
 * @ClassName: StringIntern   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年3月19日 下午1:45:51   
 *      
 */
public class StringIntern {
	public static void main(String[] args) {
		
		String aa="123";
		String bb=new String("123");
		bb=bb.intern();
		System.out.println(aa==bb);
	}
}
