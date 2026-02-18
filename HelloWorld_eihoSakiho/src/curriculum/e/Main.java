package curriculum.e;

public class Main {

	/* 基本概念
	 *Main クラスに main() メソッドを作り、以下の操作を行う。
	 *Employee クラスのインスタンス（オブジェクト）を生成する。
	 *name に「山田太郎」を設定する。
	 *work() を呼び出して出力を確認する。
	 */

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setName("山田太郎");
		emp.work();

	}

}