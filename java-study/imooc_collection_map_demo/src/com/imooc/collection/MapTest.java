package com.imooc.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

	public Map<String, Student> students;

	public MapTest() {
		this.students = new HashMap<String, Student>();
	}

	/**
	 * 测试添加：输入学生id，判断是否被占用 若未被占用，则输入姓名，创建新学生对象，并且添加到students中
	 * 
	 * @param args
	 */
	public void testPut() {
		Scanner console = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入学生ID");
			String ID = console.next();
			if (students.get(ID) == null) {
				System.out.println("请输入学生姓名：");
				Student newStu = new Student(ID, console.next());
				students.put(ID, newStu);
				System.out.println("成功添加学生：" + students.get(ID).name);
			} else {
				System.out.println("学生ID已存在");
				// continue;
			}
		}

	}

	public void testFor() {
		for (Student st : students.values()) {
			System.out.println(st);
		}
	}

	/**
	 * 测试Map的keySet方法
	 */
	public void testKeyTest() {
		Set<String> keySet = students.keySet();

		System.out.println("总共有：" + keySet.size());
		for (String ID : keySet) {
			Student stu = students.get(ID);
			if (stu != null) {
				System.out.println("姓名为：" + stu.name);
			}
		}
	}

	/**
	 * 测试Map的entrySet
	 */
	public void testEntrySet() {
		Set<Entry<String, Student>> entrySet = students.entrySet();

		for (Entry<String, Student> entry : entrySet) {
			System.out.println("取得键" + entry.getKey());
			System.out.println("取得值" + entry.getValue().name);
		}
	}

	/**
	 * 删除Map中的元素
	 * 
	 * @param args
	 */
	public void remove() {
		Scanner console = new Scanner(System.in);

		while (true) {
			System.out.println("请输入要删除的学生ID");
			String stuId = console.next();
			if (students.get(stuId) == null) {
				System.out.println("输入的ID不存在");
				continue;
			}
			students.remove(stuId);
			System.out.println(stuId + "已被删除");
			break;
		}
	}

	/**
	 * 利用put方法修改Map中的已有映射
	 * 
	 * @param args
	 */
	public void testModify() {
		Scanner console = new Scanner(System.in);
		while (true) {
			System.out.println("请输入要修改的学生ID：");
			String stuID = console.next();
			Student stu = students.get(stuID);
			if (stu == null) {
				System.out.println("ID 不存在");
				continue;
			}
			System.out.println("要修改的学生信息：" + stu.id + stu.name);
			System.out.println("请输入新的学生姓名：");
			stu.name = console.next();
			students.put(stuID, stu);
			System.out.println("");
			break;
		}
	}

	/**
	 * 测试Map中，是否包含每个Key或者Value
	 * 
	 * @param args
	 */
	public void testContainsKeyOrValue() {
		Scanner console = new Scanner(System.in);

		// 使用containsKey方法验证key
		System.out.println("请输入要查询的学生ID");
		String id = console.next();
		System.out.println("您输入的学生ID为：" + id + "在学生映射表是否存在：" + students.containsKey(id));
		if (students.containsKey(id)) {
			System.out.println("对应的学生为：" + students.get(id).name);
		}

		// 使用 方法验证value
		System.out.println("请输入要查询的姓名：");
		String name = console.next();
		System.out.println("是否存在" + name + students.containsValue(new Student(null, name)));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mt = new MapTest();
		mt.testPut();
		mt.testFor();

		//
		// mt.testKeyTest();
		// mt.remove();
		// mt.testEntrySet();
		// mt.testModify();
		// mt.testEntrySet();

		mt.testContainsKeyOrValue();
	}

}
