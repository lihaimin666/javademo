package org.test.deb;



public class TestSwitch3 {

	public static void main(String[] args) {
		
		String str ;
		int score = -1;
		str = score>60?"�ϸ�":"���ϸ�";
		switch (str) {
		case "�ϸ�":
			System.out.println("�ϸ�");
			break;
		case "���ϸ�":
			System.out.println("���ϸ�");
			break;
		default:
			System.out.println("���ϸ�");
			break;
		}
	}

}
