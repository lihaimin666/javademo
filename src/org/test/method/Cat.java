package org.test.method;

public class Cat {

	int i;
	
	int b;
	
	public Cat() {
		
	}
	public Cat(int x,int y) {
		i=x;
		b=y;
	}
      public String test(String color,String aihao) {
    	  
    	  return "i am "+color+ aihao;
      }
      
      
      private String tt() {
    	  return "i am a private";
      }
      
      
      public String maojiao() {
    	  return "miao";
      }
      
      public int mm(int x,int y) {
    	  
    	  int z = x*y;
    	  z *=10;
    	  return z;
      }
      
      public int mm(int x,int y ,int xy) {
    	  
    	  return 9;
      }
}
