package com.inherit;

public class Dog extends Animal {
	public int age = 20;
	public Dog() {
//		super(age);
		System.out.println("dddd"+this.age);
	}

	public void eat() {
		System.out.println("gogogo");
	}
	
	public void method(){
		System.out.println(super.age);
	}

	@Override
	public String toString() {
		return "Dog [age=" + age + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		return true;
	}
	
}
