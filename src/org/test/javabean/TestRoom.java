package org.test.javabean;

public class TestRoom {
	//�ֱ���4������������4��room����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room  r = new Room();
		r.setRoomNum(100);
		r.setAddr("�����");
		r.setArea(95.5);
		
//		System.out.println(" "+r.getRoomNum()+r.getAddr()+r.getArea());
		
		Room r1 =new Room(101);
		
		r.setArea(98.0);
		r.setAddr("street");
		
		System.out.println(" "+r1.getRoomNum()+r1.getAddr()+r1.getArea());
	}

}
