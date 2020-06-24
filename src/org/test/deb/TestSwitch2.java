package org.test.deb;



public class TestSwitch2 {

	public static void main(String[] args) {

		char c = 'e';
		switch (c) {
		case 'a':
			System.out.println("A");
			break;
		case 'b':
			System.out.println("B");
			break;
		case 'c':
			System.out.println("C");
			break;
		case 'd':
			System.out.println("D");
			break;
		case 'e':
			System.out.println("E");
			break;

		default:
			System.out.println("Other");
			break;
		}
	}

}
