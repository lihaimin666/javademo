package org.test.duixiang.d3;

public class NotePad extends Computer {
	String file;
	String menu;
	NotePad(){
		this.file=" default file ";
		this.menu =" default menu ";
	}
	
	NotePad(double price){
		 this("default file","default menu");
	     this.price=price;
	}
	NotePad(String file,String menu){
		super("¿áÖÐ ÖÐ");
		this.file=file;
		this.menu=menu;
	}
	public String getDetails() {
		
		return super.getDetails()+file+menu+" NotePad Àà";
	}
}
