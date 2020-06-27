package org.test.xh;

public class TestFor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Ë®ÏÉ»¨   153 = 1*1*1+5*5*5+3*3*3
		
		for(int i=100;i<=999;i++) {
			
			int bw = i/100;
			int sw = i/10%10;
			int gw = i%10;
			
//			System.out.println(bw+" "+sw+" "+gw);
			
			if(i==(bw*bw*bw+sw*sw*sw+gw*gw*gw)) {
				System.out.println(i);
			}
		}
 		
	}

}
