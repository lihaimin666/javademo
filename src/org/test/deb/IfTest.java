package org.test.deb;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1= Integer.parseInt(args[0]);
		int num2= Integer.parseInt(args[1]);
		int num3= Integer.parseInt(args[2]);
		int n ;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		if (num1>num2) {
			n=num1;
			num1=num2;
			num2=n;
		}
		if(num1>num3) {
			n=num1;
			num1=num3;
			num3=n;
		}
        if(num2>num3) {
			n=num2;
			num2=num3;
			num3=n;
		}
		
		System.out.println("i="+num1+ " "+" j = " +num2 +"g="+num3);
		
		
		
	}

}
