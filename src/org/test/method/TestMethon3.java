package org.test.method;

public class TestMethon3 {

	/**
	 * ���������ֱ����һ��int����������int������һ���ַ���������
	 * �ֱ�ִ��ƽ�����㲢����������˲�������������ַ�����Ϣ��
                 �������main ()�����зֱ��ò��������������������
    * @param args
    */
	
	public static void main(String[] args) {
		TestMethon3  t = new TestMethon3();
//		System.out.println(t.mOL(3));
//		System.out.println(t.mOL("wallace"));
//		System.out.println(t.mOL(4, 5));
		
		System.out.println(t.max(2, 3, 6));
		
	}
	//һ��int����
	public int mOL(int i) {
		return i*i;
	}
	//����int����
	public int mOL(int i,int j) {
			
			return i*j;
	}
	//һ���ַ�������
	public String mOL(String name) {
		return name;
	}
	
	
	
	public int max(int x,int y) {
		int s;
		if(x>y) {
			s=x;
		}else {s=y;}
		
		return s;
	}
	public double max(double x ,double y) {
		double s;
		if(x>y) {
			s=x;
		}else {s=y;}
		
		return s;
	}
	public double max(double x ,double y,double z) {
		double s=(x>y)?(x>z?x:z):(y>z?y:z);
		return s;
	}
	
	public int m(int i,int j) {
		
		return 8;
	}
}
