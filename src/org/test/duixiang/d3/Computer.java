package org.test.duixiang.d3;

public class Computer {
	 String cpu;
	 String memory;
	 String data;
	 
	 Computer(){
		 
	 }
	 Computer(String cpu ,String memory ,String data){
		 this.cpu=cpu;
		 this.memory=memory;
		 this.data=data;
		 
		 
	 }
	 
	 Computer(String cpu){
		 this(cpu," 8 G"," 120 T ");
	 }
	
	public String getDetails() {
		
		return cpu+memory+data;
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
