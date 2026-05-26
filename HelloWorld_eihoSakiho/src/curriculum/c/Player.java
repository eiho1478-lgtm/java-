package curriculum.c;

import java.util.Scanner;

public class Player {
	
	private Scanner scanner = new Scanner(System.in);

	    // ユーザーの手を入力して返す
	    public int getHand() {
	    	while (true) {
	        System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
	        
	        if (!scanner.hasNextInt()) {
	        	System.out.println("数字を入力してください。");
	        	continue;
	        	}
	        
	        int hand = scanner.nextInt();
	        
	        //0〜2以外
	        if (hand == 0 || hand == 1 || hand == 2) {
	        	return hand;
	        	}
	        
	        System.out.println("0, 1, 2 のいずれかを入力してください。");
	        }
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
