package com.imooc.reflect;

public class ClassDemo1 {

	public static void main(String[] args) {
		// Foo的实例对象如何表示
		Foo foo1 = new Foo();
		// Foo这个类，也是一个实例对象，Class类的实例对象，如何表示：
		// 任何一个类都是Class的实例对象，这个实例对象有三种表示方式

		// 第一种表示方式----》实际在告诉我们任何一个类都有一个隐含的静态成员变量class
		Class c1 = Foo.class;
		// 第二种表达方式----》已知该类的对象，通过getClass方法
		Class c2 = foo1.getClass();
		/*
		 * 官网 c1，c2 表示类Foo类的类类型（class type） 万事万物皆对象 这个对象我们称为该类的类类型
		 */

		// 尽管c1 or c2 都代表了Foo类的类类型，一个类只可能是Class类的一个实例对象
		System.out.println(c1 == c2);
		System.out.println(c1.toString());

		// 第三种表达方式----》
		Class c3 = null;
		try {
			c3 = Class.forName("com.imooc.reflect.Foo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(c2 == c3);

		// 我们完全可以通过该类的类类型创建该类的对象实例----》通过c1 or c2 or c3创建Foo的实例对象
		try {
			Foo foo2 = (Foo) c1.newInstance();// 需要有无参的构造方法
			foo2.print();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Foo {
	void print() {
		System.out.println("foo");
	}

}
