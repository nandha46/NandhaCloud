package comparatorAndLambda;

/**
 * Example class to Comparable<T> interface to understand how it works..
 * 
 * @author nandh
 *
 */
public class Employee implements Comparable<Employee> {
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
		return Integer.compare(age, o.age);
	}

	@Override
	public String toString() {
		return "[id : " + id + ", name : " + name + ", age :" + age + ", Salary : " + salary + "]\n";

	}
}
