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
	        return super.say() + " 工号：" + id + " 专业：" + major+"  Teacher 类";
	    }
	    
	    
		public String getMajor() {
			return major;
		}
		public void setMajor(String major) {
			this.major = major;
		}
		public void setId(int id) {
			this.id = id;
		}

}
