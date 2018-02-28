package interview.oop.company;

import java.util.LinkedList;

public class Tester {

	public static void main(String[] args) {
		Employee employee1 = new Employee("John", 10000);
		Employee employee2 = new Employee("Mary", 20000);
		Employee employee3 = new Employee("John");
		employee3.salary = 10000;

		System.out.println("employee1 == employee3 ?" + (employee1 == employee3));
		System.out.println("employee1.equals(employee3) ?" + (employee1.equals(employee3)));
		System.out.println("employee2.equals(employee3) ?" + (employee2.equals(employee3)));
	
		LinkedList<Employee> employees = new LinkedList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	
	}
}
