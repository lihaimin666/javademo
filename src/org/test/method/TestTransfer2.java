package org.test.method;

public class TestTransfer2 {
    //值传递，只修改局部变量，不影响main方法的值 。
	public static void main(String[] args) {
		int a = 6;
		int b = 9;
//		swap(a, b);
		
		double x=7.5;
		double y=8.9;
		swap(x,y);
//		System.out.println("交换结束后，变量a的值是" + a + "；变量b的值是" + b);
		System.out.println("交换结束后，变量x的值是" + x + "；变量y的值是" + y);
	}

	public static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("swap方法里，a的值是" + a + "；b的值是" + b);
	}
	
	public static void swap(double a, double b) {
		double tmp = a;
		a = b;
		b = tmp;
		System.out.println("swap方法里，a的值是" + a + "；b的值是" + b);
	}
}
