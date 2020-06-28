package org.test.method;

public class Methon1 {
	int x=3;
	int y=4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		getResult(x);
		Methon1 m = new Methon1();
		getResult(m);
//		System.out.println(x);
		System.out.println(m.x);
		System.out.println(m.y);
		
		Cat c = new Cat();
		c.mm(4, 3);
		c.mm(3, 3, "dfdf");
		
	}
	
	
	public static void getResult(Methon1 m) {
		m.x=7;
		m.y=9;
	}
	
	public static void getResult(int x) {
		x=4;
	}

}
