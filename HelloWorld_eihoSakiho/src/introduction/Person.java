package introduction;

public class Person {
	
	//インスタンスフィールドを定義
	String name; //名前
	int age; //年齢：整数
	double height; //身長：データ型
	double weight; //体重：データ型
	
	static int totalCount = 0;
	
	//コントラストを定義
	public Person(String name,int age,double height,double weight) { //定義
		//フィールドに値をセット
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		totalCount++;
	}
	public double bmi() { //BMIの戻り値、定義と計算
		return this.weight / (this.height * this.height); 
	}
	
	public void print() { //他の戻り値、定義 出力
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.printf("BMIは%.2fです%n",this.bmi()); //Math.round で四捨五入
	}
	
	public static void printTotalCount() {
		System.out.println("合計" + totalCount + "人です");
	}

}
