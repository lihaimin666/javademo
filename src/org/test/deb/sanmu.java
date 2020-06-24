package org.test.deb;

public class sanmu {

	
	public static void main(String[] args) {
		int x = 0;
		int y = 5;
		// 三目运算符或 三元运算符
//		int b =(x>y)? x:y ;
		
		
//		if(x>y) {
//			b=x;
//		}else {
//			b=y;
//		}
//		
		
//		char  c = (x==1)?'男':'女';
//		
//		System.out.println(b);
		
		int a,b,c,max;
		a=4;b=9;c=6;
		
		//使用三元运算符，获取三个数中的较大数
		max = (a>b)?(a>c?a:c):(b>c?b:c);
		
		int max1 = ( a > b ? a : b ) > c ? ( a > b ? a : b) : c;
		System.out.println(max);
		System.out.println(max1);
		

	}
}
