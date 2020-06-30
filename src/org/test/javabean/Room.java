package org.test.javabean;

/**
 * 属性：房号、面积、地址
方法：getDetails 返回String，描述房间详细信息
构造器：0-3个参数的重载构造器，使用this（）调用
使用封装
 */
public class Room {
      private int roomNum;
      private double area;
      private String addr;
      
      
       Room(){
    	  
      }
      
      Room(int roomNum){
    	  this(roomNum,25,"");
      }
      
      Room(int roomNum,double area){
    	  this(roomNum,area,"");
    	  
      }
      Room(int roomNum,double area,String addr){
    	  this.roomNum=roomNum;
    	  this.area=area;
    	  this.addr=addr;
      }
      
    
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
      
      
}
