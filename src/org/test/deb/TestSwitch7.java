package org.test.deb;

import java.util.Scanner;

public class TestSwitch7 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);

	    System.out.println("请输入年份：");

	    int year=s.nextInt();      //98  21  1999   2000   

	    System.out.println("请输入月份：");

	    int month=s.nextInt();

	    System.out.println("请输入日期：");

	    int day=s.nextInt();

	    int sum=0;//记录总天数

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
	    case 2: sum+=31; //一月份的31天
	    case 1: sum+=day;
	    }
	    System.out.println("你输入的是" + year + "年的第" + sum + "天");

	}

}
