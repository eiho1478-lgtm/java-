package curriculum_A;

public class Question1 {

	public static void main(String[] args) {
		byte byteNum = 0;      // 初期値を 0 に設定
		byteNum = 10;          // 10 を代入
		System.out.println(byteNum); // 出力: 10
		
		short shortNum = 0;    // 初期  値を 0 に設定
		shortNum = 100;        // 100 を代入
		System.out.println(shortNum); // 出力: 100
		
		int intNum = 0;        // 初期  値を 0 に設定
		intNum = 1000;         // 1000 を代入
		System.out.println(intNum); // 出力: 1000
		
		long longNum = 0;      // 初期  値を 0 に設定
		longNum = 10000;       // 10000 を代入
		System.out.println(longNum); // 出力: 10000
		
		float floatNum = 0;    // 初期  値を 0 に設定
		floatNum = 9.5f;       // 9.5f を代入
		System.out.println(floatNum);
		
		double doubleNum = 0;  // 初期  値を 0 に設定
		doubleNum = 10.5;      // 10.5 を代入
		System.out.println(doubleNum);
		
		char letter; // 
		letter = 'a'; // "a"を代入
		System.out.println(letter);
		
		String letters;
		letters = "ハロー";// "ハロー"を代入
		System.out.println(letters);
		
		boolean isBoolean;
		isBoolean = true;// trueを代入
		System.out.println(isBoolean);
		
		
		int number = 11110;
		System.out.println(number); // 出力: 11110
		
		number = 20;
		System.out.println(number);
		
		letters = "a ハロー true";
		System.out.println(letters);
		
		int X = 11100;
		X = X+30; // 自己代入で足し算
		System.out.println(X);
		
		long A = 100000;
	    long B = 100000;
	    long prise = A * B; // 自己代入でかけ算
	    System.out.println(prise);
		
		double D = 10.5;
		D /= 100; // 自己代入で割り算
		System.out.println(D);
		
		byte p = 10;
		p -= 100; // 自己代入でひき算
		System.out.println(p);
		
		
		String name = "山田太郎";
		System.out.println("こんにちは、" + name + "さん！");
		
		int age = 25;
		System.out.println("年齢: " + age + "歳");
		
		int num1 = 10;
		int num2 = 5;
		int sun = num1 + num2;
		System.out.println(sun); // 出力:15 
		
		int score = 80;
		score +=20;
		System.out.println("最終スコア: " + score); // 出力: 100
		
		
		double price = 99.99;
		int intPrice = (int) price; // 強制型変換
		System.out.println("整数価格: "+intPrice);
		
		String numStr = "123";
		int Num = Integer.parseInt(numStr); // 強制型変換
		System.out.println(Num + 10); // 出力: 133
		
		int num = 50;
		String str= String.valueOf(num); // 強制型変換
		System.out.println("得点: "+str+"点" );
		
		int a = 10;
		int b = 20;
		boolean result = (a<b);
		System.out.println(result);
		
		int x = 15;String Result = (x>=10) ? "OK" : "NO";System.out.println(Result);
		
		String text = "私はJavaが好きです。Javaは楽しい！";
		text = "私はPythonが好きです。Pythonは楽しい！";
		System.out.println(text);

	}

}
