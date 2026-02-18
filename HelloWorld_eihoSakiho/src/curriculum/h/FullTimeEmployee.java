package curriculum.h;

public class FullTimeEmployee extends Employee {

	/* 継承 
	 * 定数: private static final int HOURLY_RATE = 1200
	 * calculateDailyWage の実装（残業 8h 超過分は 25% 割増）
	 */

	private static final int HOURLY_RATE = 1200;

	public FullTimeEmployee(String Id, String name) {
		super(Id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {

		if (hoursWorked <= 8) {
			return hoursWorked * HOURLY_RATE;
		} else {
			int regularHours = 8;
			int overtime = hoursWorked - 8;

			int regularPay = regularHours * HOURLY_RATE;
			int overtimePay = (int) (overtime * HOURLY_RATE * 1.25);

			return regularPay + overtimePay;
		}
	}

}
