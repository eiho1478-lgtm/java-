package curriculum.d;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Battle {
	
	private FileWriter log;
	
	public Battle() {
		try {
			log = new FileWriter("battle_log.txt");
			} catch (IOException e) {
				System.out.println("ログファイル作成に失敗しました");
				}
		}
	
	private void writeLog(String text) {
		try {
			log.write(text + "\n");
			} catch (IOException e) {
				System.out.println("ログ書き込みに失敗しました");
				}
		}
	
	public void fight(Player p, Daemon d) {
		
		Character first;
		Character second;
		
		// 先攻決定（教材仕様）
		if (p.sp > d.sp) {
			first = p;
			second = d;
			} else if (p.sp < d.sp) {
				first = d;
				second = p;
				} else {
					first = (new Random().nextBoolean()) ? p : d;
					second = (first == p) ? d : p;
					}
		
		System.out.println("先攻は " + first.name + " です！");
		writeLog("先攻: " + first.name);
		
		// ターン制バトル
		while (true) {
			
			first.attack(second);
			writeLog(first.name + " → " + second.name + " に " + first.at + " ダメージ");
			
			if (second.isDead()) {
				System.out.println(second.name + " は倒れた！");
				writeLog(second.name + " は倒れた！");
				break;
				}
			
			second.attack(first);
			writeLog(second.name + " → " + first.name + " に " + second.at + " ダメージ");
			
			if (first.isDead()) {
				System.out.println(first.name + " は倒れた！");
				writeLog(first.name + " は倒れた！");
				break;
				}
			}
		
		try {
			log.close();
			} catch (IOException e) {
				System.out.println("ログファイルを閉じられませんでした");
				}
		}
	}