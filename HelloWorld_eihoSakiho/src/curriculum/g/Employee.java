package curriculum.g;

public class Employee {

	/*カプセル化 
	 * 1.Employee クラスを作成し、以下のプライベートフィールドを定義する。
	 * employeeId（文字列型）
	 * name（文字列型）
	 * 
	 * 2.これらのフィールドにアクセスするために、以下のメソッドを用意する。
	 * public void setEmployeeId(String id)
	 * public String getEmployeeId()
	 * public void setName(String name)
	 * public String getName()
	 */

	private String employeeId;
	private String name;

	public void setEmployeeld(String Id) {
		this.employeeId = Id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeld() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

}
