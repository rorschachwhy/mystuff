package com.inherit;

public class Initail {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.age = 12;
		// dog.name = "qq";

		// dog.eat();
		// dog.method();

		Dog dog2 = new Dog();
		dog2.age = 12;

		// System.out.println(dog.equals(dog2));

		Animal animal = dog;
		Dog dog3 = (Dog) animal;

		System.out.println(dog3.toString());

		if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
		} else {
			System.out.println("sss");
		}

	}

}
