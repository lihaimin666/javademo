package org.test.deb;

public class fuzhi {

	public static void main(String[] args) {

		//Á¬µÈ
		int i,j;
	    i=j=1;
	    System.out.println(i+"  "+j);
	    i+=j;  //i=i+j;
	    System.out.println(i+"  "+j);
	    i-=j;  //i=i-j;
	    System.out.println(i+"  "+j);
	    
	    i=2;j=3;
	    i*=j;  //i=i*j;
	    System.out.println(i+"  "+j);
	    
	    i/=j;  //i=i/j;
	    System.out.println(i+"  "+j);
	    
	    i=8;  j=5;
	    i%=j;  //i=i%j;
	    System.out.println(i + "  " + j );
	    
	    
	    i = 1;
	    i *= 0.9d;  
	    
	    System.out.println(i);//0
	    i++;
	    System.out.println(i);//1

	}

}
