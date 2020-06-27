package org.test.method;

import java.util.Scanner;

public class Method {

	
	
	
	public static void main(String[] args) {
//		int area = getArea(2,3);
//		System.out.println(area);
//		System.out.println(getArea(4,3));
		
//		printJx();
		
		Another  m = new Another();
		m.printJx(5,6);
//		m.getArea(6, 7);
		
		Cat  c = new Cat();
		
		c.test("red", "test");
		String cad = c.maojiao();
		
		System.out.println(cad);
		System.out.println(c.mm(10, 8));
//		c.mm(x, y, xy)
		
		
		
		System.out.println(m.getArea(6, 7));
		
//		Scanner  scan = new Scanner(System.in);
//		
//		scan.nextInt();
	}
	
	
	

}
