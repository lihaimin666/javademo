package org.test.deb;



public class TestSwitch3 {

	public static void main(String[] args) {
		
		String str ;
		int score = -1;
		str = score>60?"合格":"不合格";
		switch (str) {
		case "合格":
			System.out.println("合格");
			break;
		case "不合格":
			System.out.println("不合格");
			break;
		default:
			System.out.println("不合格");
			break;
		}
	}

}
