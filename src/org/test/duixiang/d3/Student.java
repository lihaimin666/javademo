package org.test.duixiang.d3;

public class Student extends Person {
	
	public static int ttttt;
	
	private  int id;
	
	  double score;
	  
	  Computer  computer;
	
	public Student(){
		
	}
	 public Student(String name, int id) {
		           this(name, 20, id, 100.0);
		 }
	 public Student(String name, int age, int id, double score) {
	           super(name, age);
	         this.id = id;
	         this.score = score;
		     }


	Student(int id,int score){
		this.id=id;
		this.score=score;
	}
	
	Student(int id,int score,Computer c){
		this.id=id;
		this.score=score;
		this.computer=c;
	}
	
	
	
	public static void ss() {
		System.out.println("我是静态方法");
	}
	
	public String say() {
		return super.say()+"  "+id+" "+score +computer.getDetails()+"  Student 类";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	
	public String toString() {
		
		return "  "+id+" "+score +"  Student 类";
//		return  "重写OBJECT方法ToString方法";
	}
}
