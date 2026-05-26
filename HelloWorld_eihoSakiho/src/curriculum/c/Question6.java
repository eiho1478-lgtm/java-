package curriculum.c;

public class Question6 {

	public static void main(String[] args) {

		Player player = new Player();
		CPU cpu = new CPU();
		
		//ループ
		while (true) {
			int pHand = player.getHand();
			int cHand = cpu.getHand();
			
			System.out.println("あなたの手: " + player.handToString(pHand));
			System.out.println("CPUの手: " + cpu.handToString(cHand));
			
			// 勝敗判定
			if (pHand == cHand) {
				System.out.println("あいこです");
				continue;
				}
			
			// プレイヤーの勝利
			if ((pHand == 0 && cHand == 1) ||
					(pHand == 1 && cHand == 2) ||
					(pHand == 2 && cHand == 0)) {
				
				System.out.println("あなたの勝ち！");
				break;
				}
			
			// それ以外は負け
			System.out.println("あなたの負け…");
			}
		}

}
