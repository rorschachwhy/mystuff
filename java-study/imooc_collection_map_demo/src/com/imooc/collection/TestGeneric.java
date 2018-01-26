package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

	public List<Course> courses;

	public TestGeneric() {
		super();
		this.courses = new ArrayList<Course>();
	}

	public void testAdd() {
		Course cr1 = new Course("1", "daxue");
		courses.add(cr1);
		// courses.add("aaa");

		Course cr2 = new Course("2", "daxue2");
		courses.add(cr2);

		// 这样写会报错，因为子类没有继承父类的含参构造方法：
		// ChildCourse ccr3 = new ChildCourse("3","ss");
		ChildCourse ccr3 = new ChildCourse();
		ccr3.id = "3";
		ccr3.name = "sss";
		courses.add(ccr3);

	}

	public void testForEach() {
		for (Course cr : courses) {
			System.out.println(cr.id + cr.name);
		}
	}

	/**
	 * 泛型不能使用基本类型
	 * 
	 * @param args
	 */
	public void testBasicType() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		System.out.println(list.get(0));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGeneric tg = new TestGeneric();
		tg.testAdd();
		tg.testForEach();
		tg.testBasicType();
	}

}
