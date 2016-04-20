/**     
 * @Title: ThreadDemo1.java   
 * @Package com.jack.excise   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年3月10日 上午10:47:25   
 * @version V1.0     
 */ 
package com.jack.excise;


@SuppressWarnings("unchecked")
public class ThreadDemo1 {
public static void main(String[] args){
	 Demo d = new Demo();
     d.start();
     for(int i=0;i<60;i++){
         System.out.println(Thread.currentThread().getName()+i);
     }
}
}


class Demo extends Thread{
	public void run(){
		for(int i=0;i<60;i++){
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
}