package comparatorAndLambda;

import java.util.Comparator;
import java.util.logging.Level;

import util.Loggr;

public class EmployeeIdSorter implements Comparator<Employee>  {
	private static final String CLASS_NAME = EmployeeIdSorter.class.getName();
	@Override
	public int compare(Employee o1, Employee o2) {
		final String methodName = "compare";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
		return Integer.compare(o1.id, o2.id);
	}
}
