package org.test.xh;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int result=0;
		int i=1;
		while(i<=100) {
			result+=i;
			i++;
		}
		System.out.println("result= "+result);
		
		result=0;
		for(int j=1;j<=100;j++) {
			result+=j;
		}
		System.out.println("result = "+result);
		
		//do while总会执行一冷饮
		result = 0;
		int k=1;
		do {
			
			result+=k;
			k++;
		}while(k<=100);
		
		
	}

}
