package curriculum_A;

public class Question1 {

	public static void main(String[] args) {
		/* Q1 各型の変数を宣言し、初期値を設定
		 * Q2 Q1で宣言した各型の変数に指定された値を代入
		 * Q3 Q2の値を代入した変数を用いて出力
		 */
		
		// 初期値を 0 に設定
		byte byteNum = 0;
		// 10 を代入
		byteNum = 10;
		// 出力: 10
		System.out.println(byteNum);
		
		// 初期  値を 0 に設定
		short shortNum = 0;
		// 100 を代入
		shortNum = 100;
		// 出力: 100
		System.out.println(shortNum);
		
		// 初期  値を 0 に設定
		int intNum = 0;
		// 1000 を代入
		intNum = 1000;
		// 出力: 1000
		System.out.println(intNum);
		
		// 初期値を 0 に設定
		long longNum = 0;
		// 10000 を代入
		longNum = 10000;
		// 出力: 10000
		System.out.println(longNum);
		
		// 初期値を 0 に設定
		float floatNum = 0;
		// 9.5f を代入
		floatNum = 9.5f;
		// 出力: 9.5f
		System.out.println(floatNum);
		
		// 初期値を 0 に設定
		double doubleNum = 0;
		// 10.5 を代入
		doubleNum = 10.5;
		// 出力: 10.5
		System.out.println(doubleNum);
		
		// 初期値を設定
		char letter;
		// "a"を代入
		letter = 'a';
		// 出力: "a"
		System.out.println(letter);
		
		// 初期値を設定
		String letters;
		// "ハロー"を代入
		letters = "ハロー";
		// 出力: "ハロー"
		System.out.println(letters);
		
		// 初期値を設定
		boolean isBoolean;
		// trueを代入
		isBoolean = true;
		// 出力: true
		System.out.println(isBoolean);
		
		// 自己代入で 10000 に足し算
		longNum = longNum + 1110;
		// 出力: 11110
		System.out.println(longNum);
		
		// 自己代入で 1000 から引き算
		intNum = intNum - 980;
		// 出力: 20
		System.out.println(intNum);
		
		// 自己代入
		letters = "a ハロー true";
		// 出力: "a ハロー true"
		System.out.println(letters);
		
		// x に 11100 を 代入
		int y = 11100;
		// 自己代入で足し算
		y = y + 30;
		// 出力: 11130
		System.out.println(y);
		
		long e = 100000;
		long r = 100000;
		// 自己代入でかけ算
		long prise = e * r;
		System.out.println(prise);
		
		// d に 10.5 を 代入
		double d = 10.5;
		// 自己代入で割り算
		d /= 100;
		System.out.println(d);
		
		// p に 10 を 代入
		byte p = 10;
		// 自己代入でひき算
		p -= 100;
		System.out.println(p);
		
		/* Q4 name という String型の変数 を宣言し、その変数に "山田太郎" という値を代入してください。
		 * name変数を使用してコンソールに こんにちは、山田太郎さん! と出力してください。
		 */
		
		// name に "山田太郎" を 代入
		String name = "山田太郎";
		// // 出力 "こんにちは、山田太郎さん!"
		System.out.println("こんにちは、" + name + "さん！");
		
		/* Q5 age という int型の変数 を宣言し、その変数に 25 を代入してください。
		 * age変数を使用してコンソールに 年齢: 25歳 という出力してください。
		 */
		
		// age に 25 を 代入
		int age = 25;
		// 出力 "年齢: 25歳"
		System.out.println("年齢: " + age + "歳");
		
		/* Q6 num1 という int型の変数 を宣言し、10 を代入
		 * num2 という int型の変数 を宣言し、5 を代入
		 * num1 と num2 を足した結果を sum という変数に代入し、コンソールに出力してください。
		 */
		
		// num1 に 10 を 代入
		int num1 = 10;
		// num2 に 5 を 代入
		int num2 = 5;
		// sun に 変数 num1,2 を 代入
		int sun = num1 + num2;
		// 出力:15
		System.out.println(sun);
		
		/* Q7 score という int型の変数 を宣言し、80 を代入
		 * score に 20 を加えて、更新する
		 * 最終スコア: 100 をscoreを使用してコンソールに出力してください。
		 */
		
		// score に 80 を 代入
		int score = 80;
		// 自己代入で 80 に足し算
		score += 20;
		// 出力: 100
		System.out.println("最終スコア: " + score);
		
		/* Q8 price という double型の変数 を宣言し、99.99 を代入
		 * price を int型 に変換し、整数価格: 99 とコンソールに出力してください。
		 */
		
		// price に 99.99 を 代入
		double price = 99.99;
		// 強制型変換
		int intPrice = (int) price;
		// 出力: "整数価格: 99"
		System.out.println("整数価格: " + intPrice);
		
		/* Q9 String 型の変数 numStr に "123" を代入
		 * numStr を int 型に変換し、
		 * 変換後の値: の後ろにnumStr + 10 した結果をコンソールに出力してください。
		 */
		
		// numStr に "123" を 代入
		String numStr = "123";
		// 強制型変換
		int Num = Integer.parseInt(numStr);
		// 出力: 133
		System.out.println(Num + 10);
		
		/* Q10 int 型の変数 num に 50 を代入
		 * num を String 型に変換し、"得点: 50点" の形で出力
		 */
		
		// num に 50 を 代入
		int num = 50;
		// 強制型変換
		String str = String.valueOf(num);
		// 出力: "得点: 50点"
		System.out.println("得点: " + str + "点");
		
		/* Q11 次の条件を満たすプログラムを条件演算子を使用して作成してください。
		 * int 型の変数 a に 10 を代入
		 * int 型の変数 b に 20 を代入
		 * a が b より小さいかどうかを boolean 変数 result に代入
		 * result の値を出力
		 */
		
		// a に 10 を 代入
		int a = 10;
		// b に 20 を 代入
		int b = 20;
		boolean result = (a < b);
		System.out.println(result);
		
		/* Q12 条件演算子(三項演算子)を使用してください。
		 * int 型の変数 x に 15 を代入
		 * x が 10 以上なら "OK"、そうでなければ "NG" を出力
		 */
		
		// x に 15 を 代入
		int x = 15;
		String Result = (x >= 10) ? "OK" : "NO";
		System.out.println(Result);
		
		/* Q13 String text = "私はJavaが好きです。Javaは楽しい!";という
		 * 文章の中にある 「Java」 を 「Python」 に置き換えて出力させてください。
		 */
		
		String text1 = "私はJavaが好きです。Javaは楽しい！";
		// "Java" を "Python" に　置換
		String text2 = text1.replace("Java", "Python");
		System.out.println(text2);

	}

}
