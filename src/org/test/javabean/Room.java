package org.test.javabean;

/**
 * ���ԣ����š��������ַ
������getDetails ����String������������ϸ��Ϣ
��������0-3�����������ع�������ʹ��this��������
ʹ�÷�װ
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
