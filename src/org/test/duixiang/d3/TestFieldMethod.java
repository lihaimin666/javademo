package org.test.duixiang.d3;

public class TestFieldMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
		System.out.println(s.count);//20
		s.display();//20
		Base b = s; //new Sub();
		System.out.println(b == s);//true
		System.out.println(b.count);//10
		b.display();//20
		
		Object objPri = new Integer(5);
		//���������������ʱ����ClassCastException�쳣
		String str = (String)objPri;


	}

}
