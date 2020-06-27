package org.test.method;

public class Methon1 {
	int x=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methon1 m = new Methon1();
		getResult(m);
		System.out.println(m.x);
		
		
	}
	
	
	public static void getResult(Methon1 m) {
		m.x=4;
	}
	
	public static void getResult(int x) {
		x=4;
	}

}
