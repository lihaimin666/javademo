package org.test.xh;

import java.util.Scanner;

public class lizi6 {
/**
 * �� 1~100֮����������������ܱ�  1 ���������������ݣ�
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
	
	System.out.println("���� =" + zshu);
	System.out.println("ؓ�� =" + fshu);
	
	}

}
