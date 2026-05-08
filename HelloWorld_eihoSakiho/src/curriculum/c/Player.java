package curriculum.c;

import java.util.Scanner;

public class Player {
	
	private Scanner scanner = new Scanner(System.in);

	    // ユーザーの手を入力して返す
	    public int getHand() {
	        System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
	        return scanner.nextInt();
	    }

	    // 数字 → 手の名前
	    public String handToString(int hand) {
	        switch (hand) {
	            case 0: return "グー";
	            case 1: return "チョキ";
	            case 2: return "パー";
	        }
	        return "";
	    }
	}
