package org.test.deb;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class TestSwitch6 {
	public static void main(String[] args) {
		System.out.println("�밴�ո�ʽ:2019-1-3");
        System.out.print("����������:");
        Scanner in = new Scanner(System.in);
        String today = in.nextLine(); //��¼�û����������
        in.close();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = (Date) sdf.parse(today);//��ȡdate
            Calendar calendar =Calendar.getInstance();
            calendar.setTime(date);//תΪ�µ�calendar
            System.out.println("������ĵ�"+calendar.get(Calendar.DAY_OF_YEAR)+"��");
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("�����������,����������!");
        }
	}
}
