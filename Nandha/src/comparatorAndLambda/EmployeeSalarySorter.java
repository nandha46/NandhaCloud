package comparatorAndLambda;

import java.util.Comparator;
import java.util.logging.Level;

import util.Loggr;

public class EmployeeSalarySorter implements Comparator<Employee> {
	private static final String CLASS_NAME = EmployeeSalarySorter.class.getName();
	@Override
	public int compare(Employee o1, Employee o2) {
		final String methodName = "compare";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
		return Double.compare(o1.salary, o2.salary);
	}

}
