package org.test.xh;

public class lizi2 {
/**
 * �� 1~100֮����������������ܱ�  1 ���������������ݣ�
 * @param args
 */
	public static void main(String[] args) {
	for1:for (int i = 2; i <= 100; i++) {
			boolean flag = true;
			//���2�������1 ���ܱ������ľͲ�������
			for2:for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break ;
					
				}
			}
			if (flag) {
				System.out.print(" " + i);
			}
		}
	}

}
