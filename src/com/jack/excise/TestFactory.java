/**     
 * @Title: TestFactory.java   
 * @Package com.jack.excise   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年3月9日 上午11:25:33   
 * @version V1.0     
 */ 
package com.jack.excise;

import com.jack.dao.Provider;
import com.jack.dao.Sender;
import com.jack.util.MobileSendFactory;
import com.jack.util.SendFactory;

/**   
 * @ClassName: TestFactory   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年3月9日 上午11:25:33   
 *      
 */
public class TestFactory {
  public static void main(String[] args){
	 // SendFactory.mailProduce().Send();
	 // SendFactory.mobileNowProduce().SendNow();
	  
	  
	  
	  Provider provider = new MobileSendFactory();  
      Sender sender = provider.produce();  
      sender.Send();
  }
}
