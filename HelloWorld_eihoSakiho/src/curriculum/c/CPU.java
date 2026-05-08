package curriculum.c;

import java.util.Random;

public class CPU {
	
	private Random random = new Random();

	    // ランダムに 0〜2 を返す
	    public int getHand() {
	        return random.nextInt(3);
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
