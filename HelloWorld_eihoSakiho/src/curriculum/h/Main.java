package curriculum.h;

public class Main {

	/* 継承 
	 * B：Main クラスで以下を実装する。
	 * FullTimeEmployee と PartTimeEmployee のオブジェクトを作成し、9h 勤務時の給与を出力する。
	 */

	public static void main(String[] args) {

		Employee full = new FullTimeEmployee("a", "d");
		Employee part = new PartTimeEmployee("a", "d");

		int fullWage = full.calculateDailyWage(9);
		int partWage = part.calculateDailyWage(9);

		System.out.println("正社員の給与: " + fullWage + "円");
		System.out.println("パートの給与: " + partWage + "円");

	}

}
