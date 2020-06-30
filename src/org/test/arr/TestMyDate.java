package org.test.arr;

public class TestMyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate[] d;
		
		d = new MyDate[10];
		
		for(int i=0;i<10;i++) {
			d[i]=new MyDate(i+1,i+1,1900+i);
			d[i].display();
		}
		
		System.out.println(d.length);
	}

}
