package org.test.tstring;

public class Test {

	
	public static void main(String[] args) {
		/*
		char[] c = {'a','b','c'};
		
		String st = new String(c);
		
		System.out.println(st);
		
		
		 String cde = "cde";
	     System.out.println("abc" + cde);
	     String cc = "abcdef".substring(2,3);
	     System.out.println(cc);
	     String d = cde.substring(1, 2);
	     System.out.println(d);
	     */
		char[] c = {'a','b','c'};
		StringBuffer  sb = new StringBuffer("abcdefg");
		//×·¼Ó×Ö·û´®
		sb.append(c);
		sb.append("hello");
		//²åÈë×Ö·û´®
		sb.insert(0, "www.baidu.com");
//		System.out.println(sb.toString());
		//·´×ª×Ö·û´®
		sb.reverse();
//		System.out.println(sb.toString());
		
		StringBuilder  stb = new StringBuilder("aaaaawwwww");
		//·µ»Øµ±Ç°ÈÝÁ¿
		stb.append("askdfjlkdsajf;kdjf;lkdsajflkdsjf;lkdsaretretretertre");
		System.out.println(stb.capacity());
		System.out.println(stb.toString());
		System.out.println(stb.indexOf("ww"));
		System.out.println(stb.length());
	     
	}
}
