package org.test.duixiang.d3;

public class Test1 {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
//	      Person person = new Person("����", 40);
//          method(person);
		 
//		 Computer c = new Computer();
//  
//          Student student = new Student(21, 120,c);
//          method(student);
//          Teacher teacher = new Teacher("����", 40, 10, "Java EE");
//          method(teacher);
          
          
          
          
	}
		 
     public static  void method(Person p) {
//         System.out.println(p.say());
	      if (p instanceof Teacher) {
	          System.out.println("��ʦ");
	          Teacher t = (Teacher)p;
	          System.out.println("��̬�������ã�" + t.getMajor());
	       } else if (p instanceof Student) {
//	          System.out.println("ѧ��");
	          Student s = (Student)p;
//	          System.out.println("��̬�������ã�" + s.getId());
	      } else {
	          System.out.println("��");
	      }
	      System.out.println(p.say());

     }

	}

