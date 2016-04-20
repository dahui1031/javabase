/**     
 * @Title: ReadLock.java   
 * @Package com.jack.excise   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年3月19日 下午1:12:41   
 * @version V1.0     
 */ 
package com.jack.excise;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**   
 * @ClassName: ReadLock   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年3月19日 下午1:12:41   
 *      
 */
public class ReadLock {
	private ReentrantReadWriteLock rrw=new ReentrantReadWriteLock();
	public static void main(String[] args) {
		final ReadLock rl=new ReadLock();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				rl.get(Thread.currentThread());
				
			}
		}).start();
		
new Thread(new Runnable() {
			
			@Override
			public void run() {
				rl.get(Thread.currentThread());
				
			}
		}).start();
	}

	public void get(Thread thread){
		rrw.writeLock().lock();
		//rrw.readLock().lock();
		try {
            long start = System.currentTimeMillis();
             
            while(System.currentTimeMillis() - start <= 2) {
                System.out.println(thread.getName()+"正在进行读操作");
            }
            System.out.println(thread.getName()+"读操作完毕");
        } finally {
           // rrw.readLock().unlock();
        	rrw.writeLock().unlock();
        }
	}
}
