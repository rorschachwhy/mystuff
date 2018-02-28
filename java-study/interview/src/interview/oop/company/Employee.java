package interview.oop.company;

import java.util.List;
import java.util.Objects;

public class Employee {
	static List<Employee> allEmployees;
	
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(String name) {
//		this.name = name;
//		this.salary = 0;
		this(name, 0); // 这样写比较好， 
	}
	
	void dowork() {
		loadAllEmployees();
	}
	
	void getPaid(BankEndPoint bank) {
		bank.payment(name, salary);
	}
	
	static void loadAllEmployees() {
		// loads all
	}

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + salary;
//		return result;
		return Objects.hash(name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (salary != other.salary)
//			return false;
//		return true;
		return Objects.equals(this.name, other.name)
				&& Objects.equals(this.salary, other.salary);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}
