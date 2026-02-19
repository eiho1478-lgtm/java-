package curriculum.i;

/*
 * ポリモーフィズム 
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new FullTimeEmployee("E001", "A"));
		employees.add(new FullTimeEmployee("E002", "B"));
		employees.add(new ContractEmployee("E003", "C"));
		employees.add(new ContractEmployee("E004", "D"));

		for (Employee emp : employees) {
			int wage = emp.calculateDailyWage(9);
			System.out.println(emp.name + " の給料: " + wage + " 円");
		}
	}

}
