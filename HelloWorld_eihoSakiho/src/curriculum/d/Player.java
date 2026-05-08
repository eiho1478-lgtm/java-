package curriculum.d;

import java.util.Random;
import java.util.Scanner;

public class Player extends Character{
	
	public Player() {
		super("", 0, 0, 0);
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("プレイヤー名を入力してください: ");
		this.name = sc.nextLine();
		
		this.hp = rand.nextInt(41) + 60;  // 60〜100
		this.at = rand.nextInt(11) + 10;  // 10〜20
		this.sp = rand.nextInt(6) + 5;    // 5〜10
		}
	}