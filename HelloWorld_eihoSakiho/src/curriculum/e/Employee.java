package curriculum.e;

public class Employee {

	/*1 基本概念
	 * クラス名は Employee とする。
	 * Employee クラスには以下のメンバを持たせる。
	 * name（文字列型）フィールド
	 * work() メソッド：[name]は働いています。 と出力する。
	 */

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;

	}

	public void work() {
		System.out.println(this.name + "は働いています。");
	}

}
