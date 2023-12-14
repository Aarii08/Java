package classmethod;

import classmethod.human.Human04;

public class ClassMethod04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//Human04インスタンスを生成すると、コンストラクタ内の処理が実行される
		Human04 yamada = new Human04("山田");
		
		//静的メンバーは、インスタンス生成せずに直接使用できる
		Human04.staticMethodPrint();
		
		//staticなクラス定数もインスタンを生成せずに参照できる
		System.out.println(Human04.GREETING);
		
		//インスタンスメンバーは直接使用できない
//		Human04.instanceMethodPrint();
//		System.out.println(Human04.name);

		yamada.instanceMethodPrint();
		
		Human04 sato = new Human04("佐藤");
		
		Human04.staticMethodPrint();
		System.out.println(Human04.GREETING);
		sato.instanceMethodPrint();
	}

}
