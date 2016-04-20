/**     
 * @Title: Niodemo.java   
 * @Package com.jack.excise   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年3月25日 下午2:28:35   
 * @version V1.0     
 */ 
package com.jack.excise;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**   
 * @ClassName: Niodemo   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年3月25日 下午2:28:35   
 *      
 */
public class Niodemo {
	public static void main(String[] args) throws IOException {
	    RandomAccessFile aFile = new RandomAccessFile("E:\\aa.txt", "rw");  
	    FileChannel inChannel = aFile.getChannel();  
	      
	    //create buffer with capacity of 48 bytes  
	    ByteBuffer buf = ByteBuffer.allocate(48);  
	      
	    int bytesRead = inChannel.read(buf); //read into buffer.  
	    while (bytesRead != -1) {  
	      
	      buf.flip();  //make buffer ready for read  
	      
	      while(buf.hasRemaining()){  
	          System.out.print((char) buf.get()); // read 1 byte at a time  
	      }  
	      
	      buf.clear(); //make buffer ready for writing  
	      bytesRead = inChannel.read(buf);  
	    }  
	    aFile.close();  
	}

}
