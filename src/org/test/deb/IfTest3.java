package org.test.deb;

public class IfTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		if (b = false) // 如果写成if(b=false)能编译通过吗？如果能，结果是？
			System.out.println("a");
		else if (b)
			System.out.println("b");
		else if (!b)
			System.out.println("c");
		else
			System.out.println("d");
		
	}

}
