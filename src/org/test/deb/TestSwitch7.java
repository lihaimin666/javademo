package org.test.deb;

import java.util.Scanner;

public class TestSwitch7 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);

	    System.out.println("��������ݣ�");

	    int year=s.nextInt();      //98  21  1999   2000   

	    System.out.println("�������·ݣ�");

	    int month=s.nextInt();

	    System.out.println("���������ڣ�");

	    int day=s.nextInt();

	    int sum=0;//��¼������

	    switch(month){
	    case 12: sum+=30;
	    case 11: sum+=31;
	    case 10: sum+=30;
	    case 9: sum+=31;
	    case 8: sum+=31;
	    case 7: sum+=30;
	    case 6: sum+=31;
	    case 5: sum+=30;
	    case 4: sum+=31;
	    case 3:
	        if(year%4==0&&year%100!=0||year%400==0){
	        	sum+=29;
	        } else{
	        	sum+=28;
	        }
	    case 2: sum+=31; //һ�·ݵ�31��
	    case 1: sum+=day;
	    }
	    System.out.println("���������" + year + "��ĵ�" + sum + "��");

	}

}
