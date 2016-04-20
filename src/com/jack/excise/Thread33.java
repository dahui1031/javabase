/**     
 * @Title: Thread33.java   
 * @Package com.jack.excise   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年3月10日 下午1:54:50   
 * @version V1.0     
 */ 
package com.jack.excise;

/**   
 * @ClassName: Thread33   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年3月10日 下午1:54:50   
 *      
 */
public class Thread33 {
    public static void main(String[] args){
        class Person{
            public String name;
            private String gender;
            public void set(String name,String gender){
                this.name =name;
                this.gender =gender;
            }
            public void get(){
                System.out.println(this.name+"...."+this.gender);
            }
        }
        final Person p =new Person();
        new Thread(new Runnable(){
            public void run(){
                int x=0;
                while(true){
                    synchronized (p) {
                        if(x==0){
                            p.set("张三", "男");
                        }else{
                            p.set("lili", "nv");
                        }
                        x=(x+1)%2;    
                    }

                }
            }
        }).start();
        new Thread(new Runnable(){
            public void run(){
                while(true){
                    synchronized (p) {
                        p.get();
                    }
                }
            }
        }).start();
    }

}
