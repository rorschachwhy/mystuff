package com.imooc.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CheckedOutputStream;

/**
 * 备选课程
 */
public class ListTest {
	/**
	 * 用于存放备选课程的list
	 */
	public List courseToSelect;

	public ListTest() {
		super();
		this.courseToSelect = new ArrayList();
	}

	/**
	 * 用于往couresToSelect中添加备选课程
	 */
	public void addTest() {
		Course cr1 = new Course("1", "数据结构");
		courseToSelect.add(cr1);
		Course temp = (Course) courseToSelect.get(0);
		System.out.println("添加了课程：" + temp.id + ":" + temp.name);

		Course cr2 = new Course("2", "C语言");
		courseToSelect.add(0, cr2);
		Course temp2 = (Course) courseToSelect.get(0);
		System.out.println("添加了课程：" + temp2.id + ":" + temp2.name);

		// Course cr3 = new Course("3", "test");
		// couresToSelect.add(3, cr2);
		// Course temp3 = (Course) couresToSelect.get(2);
		// System.out.println("添加了课程：" + temp3.id + ":" + temp3.name);

		Course[] course = { new Course("3", "离散数学"), new Course("4", "汇编语言") };
		courseToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) courseToSelect.get(2);
		Course temp4 = (Course) courseToSelect.get(3);
		System.out.println("添加了两门课程：" + temp3.id + ":" + temp3.name + ":" + temp4.id + ":" + temp4.name);

		Course[] course2 = { new Course("5", "高等数学"), new Course("6", "大学英语") };
		courseToSelect.addAll(2, Arrays.asList(course2));
		Course temp5 = (Course) courseToSelect.get(2);
		Course temp6 = (Course) courseToSelect.get(3);
		System.out.println("添加了两门课程：" + temp5.id + ":" + temp5.name + ":" + temp6.id + ":" + temp6.name);

	}

	public void testGet() {
		int size = courseToSelect.size();
		System.out.println("课程如下：");
		for (int i = 0; i < size; i++) {
			Course cr = (Course) courseToSelect.get(i);
			System.out.println("课程：" + cr.id + cr.name);
		}
	}

	/**
	 * 通过迭代器来遍历list
	 * 
	 */
	public void testIterator() {
		Iterator it = courseToSelect.iterator();
		System.out.println("有如下待选课程（通过迭代器访问）");
		while (it.hasNext()) {
			Course cr = (Course) it.next();
			System.out.println("课程：" + cr.id + cr.name);

		}
	}

	/**
	 * 通过foreach访问
	 * 
	 * @param args
	 */
	public void testForEach() {
		System.out.println("有如下待选课程（通过forEach访问）");

		for (Object obj : courseToSelect) {
			Course cr = (Course) obj;
			System.out.println("课程：" + cr.id + cr.name);

		}
	}

	/**
	 * 修改元素
	 * 
	 * @param args
	 */
	public void testModify() {
		courseToSelect.set(4, new Course("7", "mao"));
	}

	/**
	 * 删除元素
	 * 
	 * @param args
	 */
	public void testRemove() {
		// Course cr = (Course) couresToSelect.get(4);
		// System.out.println("课程要被删除了："+cr.id +":"+cr.name);
		// couresToSelect.remove(cr);

		System.out.println("即将删除4、5位置的课程");
		Course[] course = { (Course) courseToSelect.get(4), (Course) courseToSelect.get(5) };
		courseToSelect.removeAll(Arrays.asList(course));

		System.out.println("成功删除");
		testForEach();
	}

	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.addTest();
		lt.testGet();
		lt.testIterator();
		lt.testForEach();
		lt.testModify();
		lt.testForEach();
		lt.testRemove();
	}

}
