package overload;

import extend.human.Human;
import extend.human.Student;

public class Overload {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human human = new Student("佐藤", 17, 70);

		Overload polymorphism = new Overload();

		polymorphism.printName();
		polymorphism.printName("松本");
		polymorphism.printName("松本", "清水");
		polymorphism.printName(human);
	}
	
	public void printName() {
		System.out.println("中川です。");
	}
	
	public void printName(String name) {
		System.out.println(name + "です。");
	}
	
	public void printName(String name1, String name2) {
		System.out.println(name1 + "と" + name2 + "です。");
	}
	
	public void printName(Human human) {
		System.out.println(human.getName() + "です。");
	}

}
