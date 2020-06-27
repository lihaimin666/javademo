package org.test.xh;

public class Fobonaqin2 {

	public static void main(String[] args) {
		int f1 = 1; 
		int f2 = 1; 
		 System. out .println( " 斐波那契数列中的前 20 个数为 :" ); 
		 System. out .print(f1 + "\t" + f2 + "\t" ); 
		for ( int i = 3; i <= 20; i++){ 
		int f3 = f1 + f2; 
		f1 = f2; 
		f2 = f3; 
		System. out .print(f3 + "\t" ); 
		if (i % 5 == 0){ 
		 System. out .println(); 
		} 
		 }
	}

}
