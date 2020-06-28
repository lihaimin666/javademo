package org.test.duixiang;

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal("Ã¨");
//		a.setClassType("¹·");
		
		System.out.println(a.getClassType());
		a.eat();
		a.sleep();
	}

}
