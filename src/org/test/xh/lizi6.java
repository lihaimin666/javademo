package org.test.xh;

import java.util.Scanner;

public class lizi6 {
/**
 * 求 1~100之间的质数（质数是能被  1 和自身整除的数据）
 * @param args
 */
	public static void main(String[] args) {
		Scanner  scan ;
		int num=0 ;
		int zshu=0;
		int fshu=0;
	for(int i = 0; i<=100; i=i){ 
	     	
		scan = new Scanner(System.in);
		num=scan.nextInt();
		   if(num==0) { 
		       break;
	     	}
		   if(num<0)
		   {
			   fshu++;
		   }else {
			   zshu++;
			}
		   
	    	
	    }
	
	System.out.println("正數 =" + zshu);
	System.out.println("負數 =" + fshu);
	
	}

}
