package org.test.xh;

public class lizi3 {
/**
 * �� 1~100֮����������������ܱ�  1 ���������������ݣ�
 * @param args
 */
	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			boolean flag = true;
			if (i%5==0) {
				flag = false;
				break;
			}
			
			System.out.println("out");
			System.out.println(flag);
		}
		
		
	}

}
