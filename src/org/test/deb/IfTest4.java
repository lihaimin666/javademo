package org.test.deb;

import java.util.Scanner;

public class IfTest4 {

	
	static int i=3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������� ��");
		Scanner input = new Scanner(System.in);
		int shengao = input.nextInt();
		System.out.println("������Ƹ� ��");
		Scanner input1 = new Scanner(System.in);
		int caifu = input.nextInt();
		System.out.println("������˧�� ��");
		Scanner input2 = new Scanner(System.in);
		boolean  isShuai = input2.nextBoolean();
		
		if(shengao>180 && caifu>1000 && isShuai ) {
			System.out.println("��һ��Ҫ�޸���!!!");
		}
		else if(shengao>180 || caifu>1000 || isShuai ) {
			System.out.println("�ްɣ����ϲ��㣬�������ࡣ");
		}else {
			System.out.println("���ޣ�");
		}
		
		
	}

}
