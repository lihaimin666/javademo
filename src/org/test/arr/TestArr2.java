package org.test.arr;

/**
 * ����һ��char���͵�26��Ԫ�ص����飬�ֱ� ����'A'-'Z����
ʹ��forѭ����������Ԫ�ز���ӡ������
��ʾ��char������������ 'A'+1 -> 'B'��'0'+1 -> '1��
 */
public class TestArr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a = new char[26];
		for(int i=0;i<26;i++) {
			a[i]=(char) ('A'+i);
			System.out.print(a[i]);
		}
		
		System.out.println();
		
		char[] b = new char[36];
		int n= 0;
		for(int i=0;i<36;i++) {
			
			if(i<26) {
				b[i]=(char) ('A'+i);
				System.out.print(b[i]);
			}else {
				b[i]= (char) ('0'+n);
				n++;
				System.out.print(b[i]);
			}
		}
		
		System.out.println(b.length);
	}

}
