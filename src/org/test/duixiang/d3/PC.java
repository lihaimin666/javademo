package org.test.duixiang.d3;

public class PC extends Computer {
	String jp;  //����
	String pm;//��Ļ
	String sb;
	
	PC(){
		super("core");
		this.jp=" logic ";
		this.pm=" hp ";
		this.sb=" shubiao ";
	}
	
	PC(double price){
		this();
		this.price=price;
	}
	
	public String getDetails() {
		
		return super.getDetails()+jp+pm+sb+" PC ��";
	}
}
