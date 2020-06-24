package org.test.xh;

public class Testfor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//打印1~100之间所有奇数的和
		
		int sum = 0;
		
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		
		System.out.println(sum);
	}

}
