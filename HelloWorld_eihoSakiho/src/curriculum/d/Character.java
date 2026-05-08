package curriculum.d;

public class Character {

	String name; //名前
	int hp; //HP
	int at; //AT
	int sp; //SP
	
	//コントラストを定義
	public Character(String name, int hp, int at, int sp) {
		//フィールドに値をセット
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
		}
	
	public boolean isDead() {
		return hp <= 0;
		}
	
	public void attack(Character target) {
		target.hp -= this.at;
		System.out.println(this.name + " の攻撃！ " + target.name + " に " + this.at + " のダメージ！");
	    }
	
	public void showStatus() {
		System.out.println(name + " [HP:" + hp + " AT:" + at + " SP:" + sp + "]");
	    }
	}