package org.test.deb;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        // �Ӽ��̽�������
	 
	        // next��ʽ�����ַ���
	        System.out.println("next��ʽ���գ�");
	        // �ж��Ƿ�������
	        if (scan.hasNext()) {
	        	
	            String str1 = scan.next();
	            System.out.println("���������Ϊ��" + str1);
	        }
	        scan.close();
	}

}
