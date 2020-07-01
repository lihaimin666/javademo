package org.test.arr;

import java.util.Scanner;

/**
 * . 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
	成绩>=最高分-10    等级为’A’   
	成绩>=最高分-20    等级为’B’
	成绩>=最高分-30    等级为’C’   
	其余                            等级为’D’
	提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
 */
public class Score {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生个数:");
		int n = scan.nextInt();
		
		int[]  arr =new int[n];
		
		//接收分数
		System.out.println("请输入"+n+"学生的成绩:");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		int max=0;
		
		for(int i=0;i<n;i++) {
			
			if(arr[i]>max) {
				max =arr[i];
			}
		}
//		System.out.println(max);
		
		System.out.println("最高分是："+max);
		
		for(int i=0;i<n;i++) {
			if(arr[i]>=max-10) {
				System.out.println("student " +i+"score is "+arr[i]+"grade is A");
			}else
			if(arr[i]>=max-20) {
				System.out.println("student " +i+"score is "+arr[i]+"grade is B");
			}else
			if(arr[i]>=max-30) {
				System.out.println("student " +i+"score is "+arr[i]+"grade is C");
			}else {
				System.out.println("student " +i+"score is "+arr[i]+"grade is D");
			}
			
		}
		
		
		
		
		
	}

}
