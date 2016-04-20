/**     
 * @Title: LockInterrupt.java   
 * @Package com.jack.excise   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年3月19日 下午12:43:14   
 * @version V1.0     
 */ 
package com.jack.excise;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**   
 * @ClassName: LockInterrupt   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年3月19日 下午12:43:14   
 *      
 */
public class LockInterrupt {
	private Lock lock=new ReentrantLock();
	public static void main(String[] args) {
		LockInterrupt li=new LockInterrupt();
		Mythread th1=new Mythread(li);
		Mythread th2=new Mythread(li);
		th1.start();
		th2.start();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		th2.interrupt();
	}
	
	public void insert(Thread thread) throws InterruptedException{
		lock.lockInterruptibly();
		try{
			
			System.out.println(thread.getName()+"获得了锁");
			long startTime=System.currentTimeMillis();
			for(;;){
				if(System.currentTimeMillis() - startTime >= 10000)
					break;
			}
		}catch(Exception e){
			
		}finally{
			System.out.println(Thread.currentThread().getName()+"执行finally");
            lock.unlock();
            System.out.println(thread.getName()+"释放了锁");
		}
	}
  
}

class Mythread extends Thread{
	private LockInterrupt lockInterrupt=null;
	public Mythread(LockInterrupt lockInterrupt){
		this.lockInterrupt=lockInterrupt;
	}
	public void run(){
		try {
			lockInterrupt.insert(Thread.currentThread());
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+"被中断");
        }
	}
}
