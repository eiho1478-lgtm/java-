package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		/* Q1 for 文を使って 1 から 10 までの数字を 1 つずつ表示
		 */
		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
		}

		/* Q2 for 文を使って 2 から 20 までの 偶数 を 1 つずつ表示
		 */
		for (int b = 2; b <= 20; b += 2) {
			System.out.println(b);
		}

		/* Q3 for 文を使って 10 から 1 まで カウントダウンして表示
		 */
		for (int c = 10; c >= 1; c--) {
			System.out.println("カウント" + c);
		}

		/* Q4 for 文を使って 1 から 100 までの合計 を表示
		 */
		int sum = 0;
		for (int d = 1; d <= 100; d++) {
			sum += d;
		}
		System.out.println(sum);

		/* Q5 for 文を使って 以下のような三角形を出力
		 */
		for (int e = 0; e <= 5; e++) {
			for (int f = 0; f < e; f++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/* Q6 while 文を使って 1 から 10 まで を 1 つずつ表示
		 */
		int g = 1;
		while (g <= 10) {
			System.out.println(g);
			g++;
		}

		/* Q7 while 文を使って 2 から 20 までの偶数 を 1 つずつ表示
		 */
		int h = 2;
		while (h <= 20) {
			System.out.println(h);
			h += 2;
		}

		/* Q8 while 文を使って 10 から 1 まで のカウントダウンを表示
		 */
		int i = 10;
		while (i >= 1) {
			System.out.println("カウント" + i);
			i--;
		}

		/* Q9 while 文を使って 1 から 100 までの合計 を表示
		 */
		int sum2 = 0;
		int j = 1;
		while (j <= 100) {
			sum2 += j;
			j++;
		}
		System.out.println(sum2);

		/* Q10 ユーザーから 数値を入力 してもらう
		 * 入力が 0 になるまで 何度でも入力を受け付ける
		 * 0が入力されたら「終了しました」と表示
		 * ※Scannerを使用 ※While文を使用してください
		 */
		Scanner scanner = new Scanner(System.in);
		int number;

		do {
			number = scanner.nextInt();
			scanner.nextLine();
		} while (number != 0);
		System.out.println("終了しました");

		/* for文を使用して下記の通りに出力してください
		 */
		for (int k = 1; k <= 9; k++) {
			for (int l = 1; l <= 9; l++) {
				System.out.print(k * l + "\t"); // \t = 横に一定のスペースを空ける
			}
			System.out.println(); // println() = 改行
		}

		/*Q11　入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
		 * ・拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可
		 * ・Switch文内でテレビとディスプレイは続けて書き、条件演算子で各項目を出力される値を変更してください
		 * ・テレビとディスプレイは同じ商品扱いとし、二つの合計値は常に11になるようにしてください。 
		 * ・例：テレビと受け取った場合、→「テレビの残り台数は〇台です」※〇はランダムで出た数字　ディスプレイは（11-〇）の値
		 * ・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません
		 * ・入力された値は「、」区切りで指定してください
		 * ・そのほかの値が入力された場合そのほかの値が入力された場合『受け取った値』は指定の商品ではありませんが出力されるようにしてください
		 * ・残り台数は0〜11までのランダムな値が出力されるようにしてください
		 */
		Random random = new Random();

		String input = scanner.nextLine();
		String[] items = input.split("、");

		int tvCount = random.nextInt(12); // 0〜11
		int displayCount = 11 - tvCount;

		for (String item : items) {
			switch (item) {
			case "テレビ":
			case "ディスプレイ":
				int count = item.equals("テレビ") ? tvCount : displayCount;
				System.out.println(item + "の残り台数は " + count + " 台です");
				break;
			case "パソコン":
				int pcCount = random.nextInt(12);
				System.out.println("パソコンの残り台数は " + pcCount + " 台です");
				break;
			case "冷蔵庫":
				int fridgeCount = random.nextInt(12);
				System.out.println("冷蔵庫の残り台数は " + fridgeCount + " 台です");
				break;
			case "扇風機":
				int fanCount = random.nextInt(12);
				System.out.println("扇風機の残り台数は " + fanCount + " 台です");
				break;
			case "洗濯機":
				int washerCount = random.nextInt(12);
				System.out.println("洗濯機の残り台数は " + washerCount + " 台です");
				break;
			case "加湿器":
				int humidifierCount = random.nextInt(12);
				System.out.println("加湿器の残り台数は " + humidifierCount + " 台です");
				break;
			default:
				System.out.println("『" + item + "』は指定の商品ではありません");
			}
		}
		scanner.close();
	}
}