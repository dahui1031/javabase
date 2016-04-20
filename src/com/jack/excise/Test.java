package com.jack.excise;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {

	private ArrayList<Integer> arrayList = new ArrayList<Integer>();
	 Lock lock=new ReentrantLock();
    public static void main(String[] argv) {
    	final Test test=new Test();
    	new Thread(new Runnable() {
			@Override
			public void run() {
                 test.insert(Thread.currentThread());				
			}
		}).start();
    	
    	new Thread(new Runnable() {
			
			@Override
			public void run() {
				 test.insert(Thread.currentThread());
			}
		}).start();
    } 
    
    public void insert(Thread thread){
     
      lock.lock();
      try{
    	  System.out.println(thread.getName()+"得到了锁");
    	  for(int i=0;i<5000;i++){
    		  arrayList.add(i);
    	  }
      }catch(Exception e){
    	  e.printStackTrace();
      }finally{
    	  System.out.println(thread.getName()+"释放了锁");
    	  lock.unlock();
    	  System.out.println(arrayList.size());
      }
      
    }
}