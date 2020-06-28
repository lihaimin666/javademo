package org.test.method;

public class Another {
	
	int height;
	int width;
	public  int getArea(int x,int y) {
		
		return x*y;
	}
	
	public  int  printJx(int x,int y) {
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=8;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		return x*y;
	}
}
