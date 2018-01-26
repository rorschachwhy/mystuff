package com.imooc.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class MethodDemo4 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<String>();

		list2.add("hello");
		// list1.add(20); //错误的
		Class c1 = list1.getClass();
		Class c2 = list2.getClass();
		System.out.println(c1 == c2);
		// 反射的操作都是编译之后的操作

		/*
		 * c1 == c2 结果返回true 说明编译之后集合的泛型是去泛型化的 Java中集合的泛型，是防止错误输入的，只在编译阶段有效
		 * 绕过编译就无效了 验证：我们通过方法的反射来操作，绕过编译，实现 list1.add(20); //错误的
		 */
		try {
			Method m = c2.getMethod("add", Object.class);
			m.invoke(list2, 20);
			System.out.println(list2.size());
			System.out.println(list2);

			// 现在不能这么遍历来，因为有一个20，不是String
			// for (String string : list2) {
			// System.out.println(string);
			// }

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
