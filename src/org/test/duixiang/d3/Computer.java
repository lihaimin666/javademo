package org.test.duixiang.d3;

public class Computer {
	 String cpu;
	 String memory;
	 String data;
	 double price;
	 
	 Computer(){
		 
	 }
	 Computer(double price){
		 this("kkk");
		 this.price=price;
	 }
	 Computer(String cpu ,String memory ,String data,double price){
		 this.cpu=cpu;
		 this.memory=memory;
		 this.data=data;
		 this.price=price;
	 }
	 
	 Computer(String cpu){
		 this(cpu," 8 G"," 120 T ",1200);
	 }
	
	public String getDetails() {
		
		return cpu+memory+data+" Computer ¿‡";
	}
	
	

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
