package org.test.duixiang.d3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Person p = new Person();
		
//		System.out.println(p.say());
		
//		Student s = new Student();
		
//		System.out.println(s.say());
		
//		Person person = new Student("����", 120);       //��̬����
//		          System.out.println(person.getId());           //����
//        System.out.println(person.getName());
//        System.out.println(person.say());     //�鷽������
        
		
		Person[] person = {new Person("����", 32),
	                         new Student("����", 21, 120, 90.0),
	                         new Student("����", 22, 119, 91.5),
	                         new Teacher("����ʦ", 35, 10, "Java EE"),
	                         new Teacher("����ʦ", 11)};
 
         for (int i = 0; i< person.length - 1; i++) {
            for (int j = i + 1; j < person.length; j++) {
               if (person[i].getAge() > person[j].getAge()) {
                    Person p = person[i];
                    person[i] = person[j];
                    person[j] = p;
                }
            }
        }
         
        for (int i = 0; i < person.length; i++) {
        	System.out.println(person[i].getAge());
		}
				


	}

}
