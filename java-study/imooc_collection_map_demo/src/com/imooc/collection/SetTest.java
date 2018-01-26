package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {

	public List<Course> courseToSelect;
	private Scanner console;
	public Student student;

	public SetTest() {
		super();
		this.courseToSelect = new ArrayList<Course>();
		this.console = new Scanner(System.in);
	}

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

	public void testForEach() {
		System.out.println("有如下待选课程（通过forEach访问）");

		for (Course cr : courseToSelect) {
			System.out.println("课程：" + cr.id + cr.name);

		}
	}

	public void testForSet(Student st) {
		for (Course cr : st.course) {
			System.out.println("kecheng" + cr.id + cr.name);
		}
	}

	/**
	 * 测试List的contains方法
	 * 
	 * @param args
	 */
	public void testListContains() {
		Course course = courseToSelect.get(0);
		System.out.println("取出了" + course.id + course.name);
		System.out.println("备选课程是否包含：" + course.name + courseToSelect.contains(course));

		Course course2 = new Course(course.id, course.name);
		System.out.println("取出了" + course2.id + course2.name);
		System.out.println("备选课程是否包含：" + course2.name + courseToSelect.contains(course2));

		System.out.println("请输入课程名称");
		String name = console.next();
		Course course3 = new Course();
		course3.name = name;
		System.out.println("取出了" + course3.id + course3.name);
		System.out.println("备选课程是否包含：" + course3.name + courseToSelect.contains(course3));

		if (courseToSelect.contains(course3)) {
			System.out.println(course3.name + "的索引位置为" + courseToSelect.indexOf(course3));
		}
	}

	// 创建学生并选课
	public void createStudentAndSelectCours() {

		student = new Student("1", "xiaoming");
		System.out.println("欢迎学生：" + student.name + "选课");

		Scanner console = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("请输入课程编号");
			String courseId = console.next();
			for (Course cr : courseToSelect) {
				if (cr.id.equals(courseId)) {
					student.course.add(cr);
					// student.course.add(null);
				}
			}
		}
		testForSet(student);
		System.out.println(student.course.size());
	}

	/**
	 * 测试Set的contains方法
	 * 
	 * @param args
	 */
	public void testSetContains() {
		System.out.println("请输入学生已选的课程名称");
		String name = console.next();
		Course cr = new Course();
		cr.name = name;
		System.out.println(name);
		System.out.println("是否包含：" + cr.name + student.course.contains(cr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest st = new SetTest();
		st.addTest();
		st.testForEach();
		st.testListContains();
		// st.createStudentAndSelectCours();
		// st.testSetContains();
		// st.testForEach();

	}

}
