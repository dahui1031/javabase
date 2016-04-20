/**     
 * @Title: ClassInField.java   
 * @Package com.jack.javabase   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author sunxh    
 * @date 2016年4月10日 上午10:53:46   
 * @version V1.0     
 */ 
package com.jack.javabase;

/**   
 * @ClassName: ClassInField   
 * @Description: TODO   
 * @author sunxh
 * @date 2016年4月10日 上午10:53:46   
 *      
 */
public class ClassInField {
	private void internalTracking(boolean b){
		if(b){
			class TrackSlip{
				private String s;
				public TrackSlip(String s){
					this.s=s;
				}
				String getSlip(){
					return s;
				}
			}
			TrackSlip ts=new TrackSlip("slip");
			String s =ts.getSlip();
			System.out.println(s);
		}
	}
	
	public void track(){
		internalTracking(true);
	}
	public static void main(String[] args) {
		ClassInField cif=new ClassInField();
		cif.track();
	}
}
