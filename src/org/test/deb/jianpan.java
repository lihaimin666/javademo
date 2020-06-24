package org.test.deb;

import java.util.Scanner;

public class jianpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int score=input.nextInt();
		
		System.out.println("您的当前成绩是： "+score);
		
		if(score==100) {
			System.out.println("奖励一辆BMW");
		}else if(score>=80 && score<=99) {
			System.out.println("奖励一个台iphoneXs");
		}else if(score>=60 && score<80) {
			System.out.println("奖励一本参考书");
		}else {
			System.out.println(" nothing~~");
		}
			
	}

}
