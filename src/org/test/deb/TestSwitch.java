package org.test.deb;

public class TestSwitch {

	public static void main(String[] args) {
        //如果没有break语句，则会从满足条件的地方（即与switch
		//（表达式）括号中表达式匹配的case）开始执行，直到switch结构结束。
		int i = 0;
		switch (i) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		default:
			System.out.println("default");
			break;
		}

	}

}
