package org.test.duixiang.d3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Person p = new Person();
		
//		System.out.println(p.say());
		
//		Student s = new Student();
		
//		System.out.println(s.say());
		
//		Person person = new Student("李四", 120);       //多态引用
//		          System.out.println(person.getId());           //错误
//        System.out.println(person.getName());
//        System.out.println(person.say());     //虚方法调用
        
		
//		Person[] person = {new Person("张三", 32),
//	                         new Student("李四", 21, 120, 90.0),
//	                         new Student("王五", 22, 119, 91.5),
//	                         new Teacher("刘老师", 35, 10, "Java EE"),
//	                         new Teacher("张老师", 11)};
// 
//         for (int i = 0; i< person.length - 1; i++) {
//            for (int j = i + 1; j < person.length; j++) {
//               if (person[i].getAge() > person[j].getAge()) {
//                    Person p = person[i];
//                    person[i] = person[j];
//                    person[j] = p;
//                }
//            }
//        }
//         
//        for (int i = 0; i < person.length; i++) {
//        	System.out.println(person[i].getAge());
//		}
				
		Computer  c = new Computer();
		listPrice(c);
		PC p = new PC();
		listPrice(p);
		NotePad n = new NotePad();
		listPrice(n);
//		if(n instanceof Computer) {
//			System.out.println("isTrue!");
//		}
		
//		if(p  instanceof PC) {
//			System.out.println("isTrue!");
//		}else {
//			System.out.println("isFalse!");
//		}
	}
	
	public static void listPrice(Computer c){
//		System.out.println(c.getDetails());
		if(c instanceof Computer) {
			System.out.println(c.getDetails());
		}
		
	}

}
