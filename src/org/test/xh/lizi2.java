package org.test.xh;

public class lizi2 {
/**
 * 求 1~100之间的质数（质数是能被  1 和自身整除的数据）
 * @param args
 */
	public static void main(String[] args) {
	for1:for (int i = 2; i <= 100; i++) {
			boolean flag = true;
			//如果2到自身减1 有能被整除的就不是质数
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
