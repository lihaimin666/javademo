package org.test.xh;

public class lizi3 {
/**
 * 求 1~100之间的质数（质数是能被  1 和自身整除的数据）
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
