package org.test.deb;

import java.util.Scanner;

public class IfTest4 {

	
	static int i=3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入身高 ：");
		Scanner input = new Scanner(System.in);
		int shengao = input.nextInt();
		System.out.println("请输入财富 ：");
		Scanner input1 = new Scanner(System.in);
		int caifu = input.nextInt();
		System.out.println("请输入帅否 ：");
		Scanner input2 = new Scanner(System.in);
		boolean  isShuai = input2.nextBoolean();
		
		if(shengao>180 && caifu>1000 && isShuai ) {
			System.out.println("我一定要嫁给他!!!");
		}
		else if(shengao>180 || caifu>1000 || isShuai ) {
			System.out.println("嫁吧，比上不足，比下有余。");
		}else {
			System.out.println("不嫁！");
		}
		
		
	}

}
