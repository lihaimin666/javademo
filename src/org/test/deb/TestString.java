package org.test.deb;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 10;
		String str = "abcdef";
		String str1 = str + "xyz";

		str1 += "123";
		char c = '��';

		double pi = 3.1416;
		str1 += pi;
		boolean b = false;
		str1 += b;
		str1 += c;

		System.out.println("str1 = " + str1);

		String str5 = "4";
		String str4 = 3.1415 + "";

		String str2 = 3.5d + "";
		System.out.println(str2);

		System.out.println('a' + 1 + "hello");
		// char �����ASCII���
		System.out.println('a' -'b' +"wallace");
		
		System.out.println(7%5);
		System.out.println(8%4);
		
		int  abc = 1;
		abc++;
		abc =abc+abc;
		System.out.println(abc);
		
		
	}

}
