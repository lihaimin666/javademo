package org.test.arr;

import java.util.Scanner;

/**
 * . �Ӽ��̶���ѧ���ɼ����ҳ���߷֣������ѧ���ɼ��ȼ���
	�ɼ�>=��߷�-10    �ȼ�Ϊ��A��   
	�ɼ�>=��߷�-20    �ȼ�Ϊ��B��
	�ɼ�>=��߷�-30    �ȼ�Ϊ��C��   
	����                            �ȼ�Ϊ��D��
	��ʾ���ȶ���ѧ��������������������int���飬���ѧ���ɼ���
 */
public class Score {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ѧ������:");
		int n = scan.nextInt();
		
		int[]  arr =new int[n];
		
		//���շ���
		System.out.println("������"+n+"ѧ���ĳɼ�:");
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
		
		System.out.println("��߷��ǣ�"+max);
		
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
