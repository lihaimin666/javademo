package org.test.xh;

public class lizi2 {

	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
//				System.out.println("out");
			}
			if (flag) {
				System.out.print(" " + i);
			}
		}
	}

}
