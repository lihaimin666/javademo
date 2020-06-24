package org.test.deb;



public class TestSwitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String season = "summer";
		switch (season) {
		case "spring":
			System.out.println("春暖花开");
			break;
		case "summer":
			System.out.println("夏日炎炎");
			break;
		case "autumn":
			System.out.println("秋高气爽");
			break;
		case "winter":
			System.out.println("冬雪皑皑");
			break;

//		default:
//			System.out.println("季节输入有误");
//			break;
		}
	}

}
