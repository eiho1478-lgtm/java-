package curriculum.d;

public class Question7 {
	
	public static void main(String[] args) {
		
		Player player = new Player();
		Daemon daemon = new Daemon();
		
		System.out.println("=== ステータス ===");
		player.showStatus();
		daemon.showStatus();
		
		Battle battle = new Battle();
		battle.fight(player, daemon);
		
		System.out.println("バトル結果は battle_log.txt に出力されました");
		}
	}