package curriculum.g;

public class Main {

	/* カプセル化 
	 * Main クラスで Employee オブジェクトを生成し、set メソッドで「E002」「田中花子」を設定後、get メソッドで出力する。
	 */

	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.setEmployeeld("E002");
		emp.setName("田中花子");

		System.out.println("社員ID: " + emp.getEmployeeld());
		System.out.println("名前: " + emp.getName());
	}

}
