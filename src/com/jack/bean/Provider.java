/**     
 * @Title: Provider.java   
 * @Package com.jack.bean   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年4月12日 下午4:41:26   
 * @version V1.0     
 */ 
package com.jack.bean;

import java.util.concurrent.BlockingQueue;

/**   
 * @ClassName: Provider   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年4月12日 下午4:41:26   
 *      
 */
public class Provider implements Runnable {

	private final BlockingQueue<String>  queue;
	public  Provider(BlockingQueue<String> q){
		this.queue=q;
	}
	@Override
	public void run() {
		try {
			queue.put("jj");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
