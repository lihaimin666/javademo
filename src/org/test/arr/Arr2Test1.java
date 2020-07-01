package org.test.arr;


/**
 * 杨辉三角形
 1. 第一行有 1 个元素, 第 n 行有 n 个元素
 2. 每一行的第一个元素和最后一个元素都是 1
 3. 从第三行开始, 对于非第一个元素和最后一个元素的元素. 
    yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];

 */
public class Arr2Test1 {

	public static void main(String[] args) {
		int[][]  yh = new  int [10][10];
		
		int n = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < n; j++) {
				if(i<2) {
					yh[i][j]=1;    //前两行都等于1
				}else {
					if(j==0) {
						yh[i][j]=1;  //每行第一个为1
					}else if(j==n-1) {
						yh[i][j]=1;  //每行最后一个为1
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
