/**     
 * @Title: ThreadDemo41.java   
 * @Package com.jack.excise   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年3月10日 下午1:52:00   
 * @version V1.0     
 */ 
package com.jack.excise;

public class ThreadDemo41 {
    private static boolean flags =false;
    public static void main(String[] args){
        class Goods{
            private String name;
            private int num;
            public synchronized void produce(String name){
                while(flags)
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                this.name =name+"编号："+num++;
                System.out.println(Thread.currentThread().getName()+"生产了...."+this.name);
                flags =true;
                notifyAll();
            }
            public synchronized void consume(){
                while(!flags)
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                System.out.println(Thread.currentThread().getName()+"消费了******"+name);
                flags =false;
                notifyAll();
            }

        }
        final Goods g =new Goods();
        new Thread(new Runnable(){
            public void run(){
                while(true){
                    g.produce("商品");
                }
            }
        },"生产者一号").start();
        new Thread(new Runnable(){
            public void run(){
                while(true){
                    g.produce("商品");
                }
            }
        },"生产者二号").start();
        new Thread(new Runnable(){
            public void run(){
                while(true){
                    g.consume();
                }
            }
        },"消费者一号").start();
        new Thread(new Runnable(){
            public void run(){
                while(true){
                    g.consume();
                }
            }
        },"消费者二号").start();
    }
}