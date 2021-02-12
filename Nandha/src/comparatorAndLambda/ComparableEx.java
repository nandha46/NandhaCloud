package comparatorAndLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx {

	public static void main (String[] args) {
		Employee e1 = new Employee(1,"adam",18,5.5d);
		Employee e2 = new Employee(0,"berd",16,2.4d);
		Employee e3 = new Employee(2,"cate",17,3.5d);
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Collections.sort(list);
		// Comparator implemented class version of id sorter
		EmployeeIdSorter employeeIdSorter = new EmployeeIdSorter();
		Collections.sort(list, employeeIdSorter );
		// Lambda expression version of Id sorter comparator
		Collections.sort(list, (Employee x,Employee y) ->  Integer.compare(x.id, y.id) );
		// Comparator implemented version of Salary sorter
		EmployeeSalarySorter employeeSalarySorter = new EmployeeSalarySorter();
		Collections.sort(list,employeeSalarySorter);
		System.out.println(list.toString());
	}
}
