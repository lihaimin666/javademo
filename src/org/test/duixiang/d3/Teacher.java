package org.test.duixiang.d3;

public class Teacher extends Person {
		 private String major;
	     private int id;
	 
	     public Teacher(String name, int id) {
	         this(name, 30, id, "Java");
	     }
	     public Teacher(String name, int age, int id, String major) {
	        super(name, age);
	        this.id = id;
	        this.major = major;
	    }
	    public int getId() {
	        return id;
	    }
	    public String say() {
	        return super.say() + " ¹¤ºÅ£º" + id + " ×¨Òµ£º" + major;
	    }

}
