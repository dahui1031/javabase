/**     
 * @Title: Proxy.java   
 * @Package com.jack.bean   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年4月13日 上午11:13:55   
 * @version V1.0     
 */ 
package com.jack.bean;

/**   
 * @ClassName: Proxy   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年4月13日 上午11:13:55   
 *      
 */
public class Proxy implements Sourceable {

	private Source source;
	public Proxy(){
		super();
		this.source=new Source();
	}
	@Override
	public void method() {
		before();
      source.method();
      after();
	}
    public void before(){
    	System.out.println("before");
    }
    public void after(){
    	System.out.println("after");
    }
}
