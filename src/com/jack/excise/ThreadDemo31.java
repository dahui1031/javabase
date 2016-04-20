/**     
 * @Title: ThreadDemo31.java   
 * @Package com.jack.excise   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年3月10日 下午1:23:17   
 * @version V1.0     
 */ 
package com.jack.excise;

public class ThreadDemo31 {
    public static void main(String[] args){
        Ticket1 t =new Ticket1();
        Thread t1 = new Thread(t,"窗口一");
        Thread t2 = new Thread(t,"窗口二");
        Thread t3 = new Thread(t,"窗口三");
        Thread t4 = new Thread(t,"窗口四");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class Ticket1 implements Runnable{
    private int ticket = 4000;
    public synchronized void  saleTicket(){
        if(ticket>0)
            System.out.println(Thread.currentThread().getName()+"卖出了"+ticket--);

    }
    public void run(){
        while(true){
            saleTicket();
        }
    }
}