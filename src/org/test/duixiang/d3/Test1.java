package org.test.duixiang.d3;

public class Test1 {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
//	      Person person = new Person("张三", 40);
//          method(person);
		 
//		 Computer c = new Computer();
//  
//          Student student = new Student(21, 120,c);
//          method(student);
//          Teacher teacher = new Teacher("王五", 40, 10, "Java EE");
//          method(teacher);
          
          
          
          
	}
		 
     public static  void method(Person p) {
//         System.out.println(p.say());
	      if (p instanceof Teacher) {
	          System.out.println("教师");
	          Teacher t = (Teacher)p;
	          System.out.println("本态方法调用：" + t.getMajor());
	       } else if (p instanceof Student) {
//	          System.out.println("学生");
	          Student s = (Student)p;
//	          System.out.println("本态方法调用：" + s.getId());
	      } else {
	          System.out.println("人");
	      }
	      System.out.println(p.say());

     }

	}

