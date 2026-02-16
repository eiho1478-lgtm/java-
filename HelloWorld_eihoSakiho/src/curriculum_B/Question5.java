package curriculum_B;

public class Question5 {

	/* Q1
	 * 次の条件を満たす メソッド helloWorld を作成してください。
	 * 1.引数なし 2.戻り値なし 3."Hello, World!" を表示
	 * 実行例: Hello, World!
	 */

	public static void helloWorld() { //修飾子 戻り値なし メソッド名(引数なし)
		System.out.println("Hello, World!");
	}

	/* Q2
	 * 次の条件を満たす メソッド doubleValue を作成してください。
	 * 1.引数:整数 (int num) 2.戻り値:整数(引数の2倍の値) 3.戻り値をもとに実行例のように表示
	 * 実行例: 10 を 2 倍すると 20 です。
	 */

	public static int doubleValue(int num) { //修飾子 戻り値int メソッド名(引数:整数)
		return num * 2; //戻り値:整数(引数の2倍の値)
	}

	/* Q3
	 * 次の条件を満たす メソッド isEven を作成してください。
	 * 1.引数:整数 (int num) 2.戻り値:true(偶数なら)、false(奇数なら) 3.num1に7,num2に10を設定し以下の実行例になるように表示
	 * 実行例: 10 は偶数です。7 は奇数です
	 */

	public static boolean isEven (int num) {
		return num % 2 == 0; 
	}
	
	public static void main(String[] args) { //メソッドの呼び出し

		//Q1
		helloWorld(); 

		//Q2
		int input = 10; 
		int result = doubleValue(input);
		System.out.println(input + "を 2 倍すると" + result + "です。");
		
		int num1 = 7;
		int num2 = 10;
		
		//Q3
		if (isEven(num2)) {
			System.out.println(num2 + "は偶数です。");
		} else if (isEven(num2)) {
			System.out.println(num2 + "は奇数です。");
		}
		
		if (isEven(num1)) {
			System.out.println(num1 + "は偶数です。");
		} else if (isEven(num2)) {
			System.out.println(num1 + "は奇数です。");
		}
	}

}
