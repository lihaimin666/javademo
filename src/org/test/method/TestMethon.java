package org.test.method;

public class TestMethon {

	public static void main(String[] args) {
		TestMethon  t = new TestMethon();
		
		int area = t.getArea(3,5);
		
		System.out.println(area);
		
		System.out.println(t.welcome("wallace"));
		
		Cat  c = new Cat();
		c.mm(3, 4);
		
	}
	
	
	public  int getArea(int x,int y ) {
		return x*y;
	}
	
	
	public  String welcome(String name) {
		
		return "欢迎 "+name+"来到公司";
	}

}
