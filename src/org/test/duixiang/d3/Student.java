package org.test.duixiang.d3;

public class Student extends Person {
	
	private  int id;
	
	  double score;
	
	Student(){
		
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
	
	
	public String say() {
		return super.say()+"  "+id+" "+score;
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
}
