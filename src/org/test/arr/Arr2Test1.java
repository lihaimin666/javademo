package org.test.arr;


/**
 * ���������
 1. ��һ���� 1 ��Ԫ��, �� n ���� n ��Ԫ��
 2. ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض��� 1
 3. �ӵ����п�ʼ, ���ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ��. 
    yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];

 */
public class Arr2Test1 {

	public static void main(String[] args) {
		int[][]  yh = new  int [10][10];
		
		int n = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < n; j++) {
				if(i<2) {
					yh[i][j]=1;    //ǰ���ж�����1
				}else {
					if(j==0) {
						yh[i][j]=1;  //ÿ�е�һ��Ϊ1
					}else if(j==n-1) {
						yh[i][j]=1;  //ÿ�����һ��Ϊ1
					}else {
						yh[i][j]=yh[i-1][j-1]+yh[i-1][j];
					}
				}
				System.out.print(" "+yh[i][j]);
			}
			System.out.println();
			n++;
		}

	}

}
