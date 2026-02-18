package curriculum.f;

public class Employee {

	/* クラスとオブジェクト 
	 * Employee クラスに以下のメンバを持たせる。
	 * employeeId（文字列型）フィールド
	 * name（文字列型）フィールド
	 * showInfo() メソッド：社員ID: [employeeId], 名前: [name] と出力する。
	 */

	String employeeId;
	String name;

	void setEmployeeld(String employeeld) {
		this.employeeId = employeeld;
	}

	void setName(String name) {
		this.name = name;
	}

	void showlnho() {
		System.out.println("社員ID: " + this.employeeId + " 名前: " + this.name);
	}

}
