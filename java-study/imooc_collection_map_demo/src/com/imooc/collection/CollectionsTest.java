package com.imooc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest {

	/**
	 * 1、通过Collections.sort()方法，对Integer泛型的List进行排序
	 * 
	 * @param args
	 */
	public void testSort1() {
		List<Integer> integerList = new ArrayList<Integer>();
		// for (int i = 0; i < 10; i++) {
		// integerList.add((int) (Math.random()*100));
		// }
		Random random = new Random();
		Integer k;
		for (int i = 0; i < 10; i++) {
			do {
				k = random.nextInt(100);
			} while (integerList.contains(k));
			integerList.add(k);
		}

		for (Integer integer : integerList) {
			System.out.println(integer);
		}
		System.out.println("----------------------");
		Collections.sort(integerList);

		for (Integer integer : integerList) {
			System.out.println(integer);
		}

	}

	/**
	 * 1、通过Collections.sort()方法，对String泛型的List进行排序
	 * 
	 * @param args
	 */
	public void testSort2() {
		List<String> stringList = new ArrayList<String>();
		stringList.add("microsoft");
		stringList.add("google");
		stringList.add("lenovo");
		System.out.println("----------------------");
		for (String string : stringList) {
			System.out.println(string);
		}

		System.out.println("----------------------");
		Collections.sort(stringList);
		for (String string : stringList) {
			System.out.println(string);
		}
		Collections.sort(stringList);
	}

	public void testSort3() {
		List<Student> studentList = new ArrayList<Student>();
		Random random = new Random();
		studentList.add(new Student(random.nextInt(1000) + "", "Mike"));
		studentList.add(new Student(random.nextInt(1000) + "", "An红"));
		studentList.add(new Student(random.nextInt(1000) + "", "LU小明"));

		for (Student student : studentList) {
			System.out.println(student.id + student.name);
		}

		System.out.println("----------------------");
		Collections.sort(studentList);

		for (Student student : studentList) {
			System.out.println(student.id + student.name);
		}
		System.out.println("----------------------");
		Collections.sort(studentList,new StudentComparator());

		for (Student student : studentList) {
			System.out.println(student.id + student.name);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionsTest ct = new CollectionsTest();
		// ct.testSort1();
		// ct.testSort2();
		ct.testSort3();
	}

}
