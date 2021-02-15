package comparatorAndLambda;

import java.util.logging.Level;

import util.Loggr;

/**
 * Example class to Comparable<T> interface to understand how it works..
 * 
 * @author nandh
 *
 */
public class Employee implements Comparable<Employee> {
	private static final String CLASS_NAME = Employee.class.getName();
	int id;
	String name;
	int age;
	double salary;

	public Employee(int id, String name, int age, double salary) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		final String methodName = "compareTo";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
		return Integer.compare(age, o.age);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		final String methodName = "toString";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
		return "[id : " + id + ", name : " + name + ", age :" + age + ", Salary : " + salary + "]\n";

	}
}
