package org.test.xh;

public class Fobonaqin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1 = 1; 
		int f2 = 1; 
		int sum = 0; 
		for ( int i = 3; i <= 12; i++){ 
		sum = f1 + f2; 
		f1 = f2; 
		f2 = sum; 
		} 
		System. out .println( " һ������һ���ڣ� 12 ���£��ܷ�ֳ�� " + sum + 
		" �ԡ� " );
	}

}
