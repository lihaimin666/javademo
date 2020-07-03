package org.test.tstring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        ArrayList  arr = new ArrayList();

        for (String data : Arrays.asList("B", "E", "D", "C", "A")) {
            hashSet.add(data);
            linkedHashSet.add(data);
            treeSet.add(data);
            arr.add(data);
        }

        //����֤����
        System.out.println("Ordering in HashSet :" + hashSet);

        //FIFO��֤��װ����˳������
        System.out.println("Order of element in LinkedHashSet :" + linkedHashSet);

        //�ڲ�ʵ������
        System.out.println("Order of objects in TreeSet :" + treeSet);
        
        
        
       
        
	}

}
