/**     
 * @Title: Lock.java   
 * @Package com.jack.excise   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年3月19日 下午12:00:11   
 * @version V1.0     
 */ 
package com.jack.excise;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**   
 * @ClassName: Lock   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年3月19日 下午12:00:11   
 *      
 */
public class LockDemo1 {
	private ArrayList<Integer> arraylist=new ArrayList<>();
	Lock lock =new ReentrantLock();
	public static void main(String[] args) {
		final LockDemo1 lockDemo1=new LockDemo1();
		new Thread(new Runnable() {
			@Override
			public void run() {
				lockDemo1.insert(Thread.currentThread());
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				lockDemo1.insert(Thread.currentThread());
			}
		}).start();
	}
	
	public void insert(Thread thread){
		if(lock.tryLock()){
			try{
				System.out.println(thread.getName()+"获取到了锁");
				for(int i=0;i<5;i++){
					arraylist.add(i);
				}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				System.out.println(thread.getName()+"释放了锁");
				lock.unlock();
				System.out.println(arraylist.size());
			}
		}else{
			System.out.println(thread.getName()+"huode了锁");
		}
	}
}


