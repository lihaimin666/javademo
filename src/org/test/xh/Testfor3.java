package org.test.xh;

import java.util.Scanner;

public class Testfor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//打印1~100之间所有奇数的和
		Scanner  scan = new Scanner(System.in);
		int j =scan.nextInt();
		int sum = 0;
		int c = 0;
		for(int i=1;i<=j;i++) {
			if(i%7==0) {
				sum+=i;
				c++;
			}
		}
		
		System.out.println(c+" "+sum);
	
	}

}
