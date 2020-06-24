package org.test.deb;

public class bijiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = false;
		//
		if (b1 = true)
			System.out.println("结果为真");
		else
			System.out.println("结果为假");

		boolean b2 = true;
		boolean b3 = true;

		System.out.println(b2 && b3);
		System.out.println(b2 && b3);

		System.out.println(true & false);// 结果为false
		System.out.println(true & true);// 结果为true
		System.out.println(false & false);// 结果为false
		System.out.println(false & true); // 结果为false

		System.out.println(true && false);// 结果为false
		System.out.println(true && true);// 结果为true
		System.out.println(false && false);// 结果为false
		System.out.println(false && true);// 结果为false

		System.out.println(true | false);// 结果为true
		System.out.println(true | true);// 结果为true
		System.out.println(false | false);// 结果为false
		System.out.println(false | true);// 结果为true
		System.out.println(true || false);// 结果为true
		System.out.println(true || true);// 结果为true
		System.out.println(false || false);// 结果为fals
		System.out.println(false || true);// 结果为true

	}

}
