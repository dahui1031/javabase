/**     
 * @Title: Test.java   
 * @Package com.jack.util   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年4月11日 下午6:45:28   
 * @version V1.0     
 */ 
package com.jack.util;

/**   
 * @ClassName: Test   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年4月11日 下午6:45:28   
 *      
 */
public class Test {
	
	public static void main(String[] args) {
		
		String str="hello world";
		String[] s=str.split(""); str.toCharArray();
		StringBuilder sb=new StringBuilder("");
		for(int i=s.length-1;i>=0;i--){
			sb.append(s[i]);
		}
		System.out.println(sb.toString());
	}
}
