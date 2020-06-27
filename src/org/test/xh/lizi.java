package org.test.xh;

public class lizi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  result =0;
		for(int i=1;i<=100;i++) {
			
			if(i%2==0) {
				result+=i;
			}
		}
		System.out.println("result = "+result);
		
		int j=1;
		result =0;
		while(j<=100) {
			if(j%2==0) {
				result+=j;
			}
			j++;
		}
		System.out.println("result = "+result);
	}
	
}
