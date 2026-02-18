package curriculum.h;

public class PartTimeEmployee extends Employee {

	/* 継承 
	 * 定数: private static final int HOURLY_RATE = 1000
	 * calculateDailyWage の実装（割増なし）
	 */

	private static final int HOURLY_RATE = 1000;

	public PartTimeEmployee(String Id, String name) {
		super(Id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		return hoursWorked * HOURLY_RATE;

	}

}
