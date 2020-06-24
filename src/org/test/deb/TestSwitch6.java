package org.test.deb;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class TestSwitch6 {
	public static void main(String[] args) {
		System.out.println("请按照格式:2019-1-3");
        System.out.print("输入年月日:");
        Scanner in = new Scanner(System.in);
        String today = in.nextLine(); //记录用户输入的日期
        in.close();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = (Date) sdf.parse(today);//获取date
            Calendar calendar =Calendar.getInstance();
            calendar.setTime(date);//转为新的calendar
            System.out.println("是这年的第"+calendar.get(Calendar.DAY_OF_YEAR)+"天");
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("日期输入错误,请重新输入!");
        }
	}
}
