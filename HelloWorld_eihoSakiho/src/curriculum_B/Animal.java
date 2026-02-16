package curriculum_B;

public class Animal {
	
	//Q5 動物名、体長、速度の変数を持ち各変数のgetterとsetterを作成
	
	private String name; // 動物名
	private double length; // 体長
	private int speed; // 速度
	
	// name の setter / getter
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	// length の sette / rgetter
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return this.length;
	}
	
	// speed の setter / getter
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}

}