/**     
 * @Title: FileStreamDemo.java   
 * @Package com.jack.excise   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年3月25日 下午4:01:37   
 * @version V1.0     
 */ 
package com.jack.excise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/**   
 * @ClassName: FileStreamDemo   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年3月25日 下午4:01:37   
 *      
 */
public class FileStreamDemo {
	public static void main(String[] args) throws IOException {
		
		File file=new File("E:\\aa.txt");
		/*InputStream in=null;
		in=new FileInputStream(file);
		int temp;
		while((temp=in.read())!=-1){
			System.out.println(temp);
		}
		in.close();
		
		
		byte[] tempbyte=new byte[100];
		int byteread=0;
		in=new FileInputStream(file);
		while ((byteread = in.read(tempbyte)) != -1) {
            System.out.write(tempbyte, 0, byteread);
        }
		in.close();*/
		
		
		BufferedReader br=new BufferedReader(new FileReader(file));
		
		while(br.read()!=-1){
			String s=br.readLine();
			System.out.println(s);
		}
	}
	
  
}
