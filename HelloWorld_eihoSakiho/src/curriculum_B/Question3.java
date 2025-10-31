package curriculum_B;


import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
	for (int a = 1; a <= 10; a++) {
	 System.out.println(a);
	 }
	
	for (int b = 2; b <= 20; b+= 2) {
	 System.out.println(b);
	 }
	
	for (int c = 10; c >=1 ; c--) {
	 System.out.println("カウント" + c);
	 }
	
	int sum = 0;
	 for (int d = 1; d <= 100; d++) {
	  sum += d;
	  }
	  System.out.println(sum);
	  
	for (int e = 0; e <=5; e++) {
	for (int f = 0; f <e; f++) {
	 System.out.print("*");
	 }
	 System.out.println();
	 }
	
	
	int g =1;
	 while (g <=10) {
	  System.out.println(g);
	  g++;
	  }
	
	 int h =2;
	 while (h <= 20) {
	  System.out.println(h);
	   h+= 2;
	  }
	 
	int i = 10;
	while (i >= 1) {
	 System.out.println("カウント" + i);
	 i--;
	 }
	
	
	int sum2 = 0;
	int j =1;
	while (j <= 100) {	
	j++; 
	sum2 += j;
	}
	 System.out.println(sum2);
	 }
	
	Scanner scanner = new Scanner(System.in);
	int number;{
		
	do {
		number = scanner.nextInt();
		} while (number != 0);
	System.out.println("終了しました");
	scanner.close();
	
	
	for (int k = 1; k <= 9; k++) {
		 for (int l = 1; l <= 9; l++) {
		  System.out.print(k * l + "\t"); // \t = 横に一定のスペースを空ける
		  }
		  System.out.println(); // println() = 改行
		  }
	
	Scanner scanner = new Scanner(System.in);
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
		   System.out.println("加湿器の残り台数は " +humidifierCount + " 台です");
		    break;
		 default:
		  System.out.println("『" + item + "』は指定の商品ではありません");
		}
	}
	scanner.close();
	}
}
	
	
