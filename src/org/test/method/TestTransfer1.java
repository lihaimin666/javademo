package org.test.method;

public class TestTransfer1 {
	//���ݵ�ַ���޸ĵ�ַ�ռ��ֵ 
	public static void main(String[] args) {
		DataSwap ds = new DataSwap();
		ds.a = 6;
		ds.b = 9;
		swap(ds);
		System.out.println("����������a Field��ֵ��" 
			+ ds.a + "��b Field��ֵ��" + ds.b);
	}
	
	public static void swap(DataSwap swapname){
		int tmp = swapname.a;
		swapname.a = swapname.b;
		swapname.b = tmp;
		System.out.println("swap�����a Field��ֵ��"
			+ swapname.a + "��b Field��ֵ��" + swapname.b);
	}

}
