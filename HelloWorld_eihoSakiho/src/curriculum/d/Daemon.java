package curriculum.d;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Daemon extends Character {
	
	public Daemon() {
		super("", 0, 0, 0);
		loadDaemon();
		}
	
	private void loadDaemon() {
		try (BufferedReader br = new BufferedReader(new FileReader("daemon_status.txt"))) {
			
			this.name = br.readLine();
			this.hp = Integer.parseInt(br.readLine());
			this.at = Integer.parseInt(br.readLine());
			this.sp = Integer.parseInt(br.readLine());
			
		} catch (IOException e) {
			System.out.println("Daemon のステータス読み込みに失敗しました");
			}
		}
	}