package org.test.deb;

public class sanmu {

	
	public static void main(String[] args) {
		int x = 0;
		int y = 5;
		// ��Ŀ������� ��Ԫ�����
//		int b =(x>y)? x:y ;
		
		
//		if(x>y) {
//			b=x;
//		}else {
//			b=y;
//		}
//		
		
//		char  c = (x==1)?'��':'Ů';
//		
//		System.out.println(b);
		
		int a,b,c,max;
		a=4;b=9;c=6;
		
		//ʹ����Ԫ���������ȡ�������еĽϴ���
		max = (a>b)?(a>c?a:c):(b>c?b:c);
		
		int max1 = ( a > b ? a : b ) > c ? ( a > b ? a : b) : c;
		System.out.println(max);
		System.out.println(max1);
		

	}
}
