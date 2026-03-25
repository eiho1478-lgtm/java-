package 自己紹介;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎",20,1.7,60.0);
		
		person1.print();
		
		Person.printTotalCount();
	}

}
