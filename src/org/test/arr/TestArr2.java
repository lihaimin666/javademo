package org.test.arr;

/**
 * 创建一个char类型的26个元素的数组，分别 放置'A'-'Z‘。
使用for循环访问所有元素并打印出来。
提示：char类型数据运算 'A'+1 -> 'B'，'0'+1 -> '1‘
 */
public class TestArr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a = new char[26];
		for(int i=0;i<26;i++) {
			a[i]=(char) ('A'+i);
			System.out.print(a[i]);
		}
		
		System.out.println();
		
		char[] b = new char[36];
		int n= 0;
		for(int i=0;i<36;i++) {
			
			if(i<26) {
				b[i]=(char) ('A'+i);
				System.out.print(b[i]);
			}else {
				b[i]= (char) ('0'+n);
				n++;
				System.out.print(b[i]);
			}
		}
		
		System.out.println(b.length);
	}

}
