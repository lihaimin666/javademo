package org.test.deb;

import java.util.Scanner;

public class jianpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int score=input.nextInt();
		
		System.out.println("���ĵ�ǰ�ɼ��ǣ� "+score);
		
		if(score==100) {
			System.out.println("����һ��BMW");
		}else if(score>=80 && score<=99) {
			System.out.println("����һ��̨iphoneXs");
		}else if(score>=60 && score<80) {
			System.out.println("����һ���ο���");
		}else {
			System.out.println(" nothing~~");
		}
			
	}

}
