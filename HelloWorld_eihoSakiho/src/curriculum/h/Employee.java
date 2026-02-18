package curriculum.h;

public abstract class Employee {

	/* 継承 
	 * 抽象クラス Employee
	 * フィールド: employeeId（文字列）、name（文字列）
	 * コンストラクタ: Employee(String id, String name)
	 * メソッド:public String getEmployeeId()
	 * public String getName()
	 * public abstract int calculateDailyWage(int hoursWorked)
	 */

	private String employeeId;
	private String name;

	public Employee(String Id, String name) {
		this.employeeId = Id;
		this.name = name;
	}

	public String getEmployeeId() {
		return name;
	}

	public String getname() {
		return name;
	}

	public abstract int calculateDailyWage(int hoursWorked);

}
