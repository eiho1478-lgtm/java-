package curriculum_B;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		/* Q1
		 * int 型の配列 を作成し、1, 2, 3, 4, 5 を格納する
		 * 配列の全要素を 順番に表示
		 */
		int[] numbers;
		numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		for (int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
		}

		/* Q2
		 * int 型の配列 {10, 20, 30, 40, 50} を用意する
		 * 配列の要素を 逆順 に表示
		 */
		int[] num = { 10, 20, 30, 40, 50 };
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.println(num[i]);
		}

		/* Q3
		 * int 型の配列 {3, 5, 7, 9, 11} を用意する
		 * 配列の全要素の 合計値 を計算し、表示
		 */
		int[] total = { 3, 5, 7, 9, 11 };
		int sum = 0;
		for (int i : total) {
			sum += i;
		}
		System.out.println("合計" + sum);

		/* Q4
		 * int 型の配列 {12, 7, 9, 21, 5, 18} を用意する
		 * 配列の 最大値と最小値 を求めて表示
		 */
		int[] value = { 12, 7, 9, 21, 5, 18 };
		int max = value[0];
		int min = value[0];
		for (int i : value) {
			max = (i > max) ? i : max;
			min = (i < min) ? i : min;
		}
		System.out.println("最大値 : " + max);
		System.out.println("最小値 : " + min);

		/* Q5
		 * int 型の配列 {1, 2, 3, 4, 5} を用意する
		 * 配列のすべての要素を 2 倍 し、結果を表示
		 * 結果を表示する際の処理に拡張for文を使用してください
		 */
		int[] value2 = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < value2.length; i++) {
			value2[i] *= 2;
		}
		for (int num2 : value2) {
			System.out.println(num2);
		}

		/* Q6
		 * int 型の配列 {4, 7, 10, 15, 20} を用意する
		 * ユーザーが入力した数が 配列に含まれているか を判定し、結果を表示
		 * 結果：（”入力した値”は配列に含まれています／含まれていません）
		 */
		int[] array = { 4, 7, 10, 15, 20 };
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();

		boolean found = false;

		for (int i : array) {
			if (i == input) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println(input + "は配列に含まれています");
		} else {
			System.out.println(input + "含まれていません");
		}
		scanner.close();

		/* Q7
		 * 2次元配列 int[][] array = {{1, 2}, {3, 4}, {5, 6}}; を用意する
		 * 配列の すべての要素を表示 
		 */
		int[][] array2 = {
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 }
		};
		for (int i = 0; i < array2.length; i++) { // 行をループ
			for (int j = 0; j < array2[i].length; j++) { // 列をループ
				System.out.println(array2[i][j] + " ");
			}
			System.out.println();
		}

		/*2次元配列 int[][] array = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}; を用意する
		 * 配列の すべての要素の合計値を表示
		 */
		int[][] array3 = {
				{ 10, 20, 30 },
				{ 40, 50, 60 },
				{ 70, 80, 90 }
		};
		int sum2 = 0;
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				sum2 += array3[i][j];
			}
		}
		System.out.println("合計値:" + sum2);

		/*2次元配列 int[][] array = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}}; を用意する
		 * 配列内の 最大値と最小値 を求めて表示
		 */
		int[][] array4 = {
				{ 12, 15, 8 },
				{ 6, 19, 25 },
				{ 30, 2, 10 }
		};
		int max2 = array4[0][0];
		int min2 = array4[0][0];
		for (int i = 0; i < array4.length; i++) {
			for (int j = 0; j < array4[i].length; j++) {
				if (array4[i][j] > max2) {
					max2 = array4[i][j];
				}
				if (array4[i][j] < min2) {
					min2 = array4[i][j];
				}
			}
		}
		System.out.println("最大値 : " + max2);
		System.out.println("最小値 : " + min2);

		/*3次元配列 int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}; を用意する
		 * 配列内のすべての要素を 表示
		 */
		int[][][] array5 = {
				{
						{ 1, 2 },
						{ 3, 4 }
				},
				{
						{ 5, 6 },
						{ 7, 8 }
				}
		};
		for (int i = 0; i < array5.length; i++) {
			for (int j = 0; j < array5[i].length; j++) {
				for (int k = 0; k < array5[i][j].length; k++) {
					System.out.println(array5[i][j][k] + " ");
				}
				System.out.println();
			}
		}
	}
}
