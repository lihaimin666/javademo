package org.test.deb;

public class IfTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		if (b = false) // ���д��if(b=false)�ܱ���ͨ��������ܣ�����ǣ�
			System.out.println("a");
		else if (b)
			System.out.println("b");
		else if (!b)
			System.out.println("c");
		else
			System.out.println("d");
		
	}

}
