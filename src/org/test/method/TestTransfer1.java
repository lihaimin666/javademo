package org.test.method;

public class TestTransfer1 {
	public static void swap(DataSwap ds){
		int tmp = ds.a;
		ds.a = ds.b;
		ds.b = tmp;
		System.out.println("swap�����a Field��ֵ��"
			+ ds.a + "��b Field��ֵ��" + ds.b);
	}
	public static void main(String[] args) {
		DataSwap ds = new DataSwap();
		ds.a = 6;
		ds.b = 9;
		swap(ds);
		System.out.println("����������a Field��ֵ��" 
			+ ds.a + "��b Field��ֵ��" + ds.b);
	}

}
