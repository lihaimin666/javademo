package org.test.method;

public class TestTransfer2 {
    //ֵ���ݣ�ֻ�޸ľֲ���������Ӱ��main������ֵ ��
	public static void main(String[] args) {
		int a = 6;
		int b = 9;
//		swap(a, b);
		
		double x=7.5;
		double y=8.9;
		swap(x,y);
//		System.out.println("���������󣬱���a��ֵ��" + a + "������b��ֵ��" + b);
		System.out.println("���������󣬱���x��ֵ��" + x + "������y��ֵ��" + y);
	}

	public static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("swap�����a��ֵ��" + a + "��b��ֵ��" + b);
	}
	
	public static void swap(double a, double b) {
		double tmp = a;
		a = b;
		b = tmp;
		System.out.println("swap�����a��ֵ��" + a + "��b��ֵ��" + b);
	}
}
