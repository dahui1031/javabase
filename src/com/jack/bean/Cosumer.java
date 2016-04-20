/**     
 * @Title: Cosumer.java   
 * @Package com.jack.bean   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年4月12日 下午4:50:23   
 * @version V1.0     
 */ 
package com.jack.bean;

import java.util.concurrent.BlockingQueue;

/**   
 * @ClassName: Cosumer   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年4月12日 下午4:50:23   
 *      
 */
public class Cosumer implements Runnable{  
	private final BlockingQueue<String> queue;
	public Cosumer(BlockingQueue<String> q){
		this.queue=q;
	}
	@Override
	public void run() {
		try {
			queue.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
