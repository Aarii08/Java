//Human00クラス
public class Human00 {
	private String name;
	private int age;

	//コンストラクタ
	public Human00(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//挨拶をするメソッド
	public void hello() {
		System.out.println("こんにちは。私の名前は " + name + " です。" + age + " 歳です。");
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//太郎インスタンスを生成
		Human00 taro = new Human00("太郎", 24);
		taro.hello();

		//花子インスタンスを生成	
		Human00 hanako = new Human00("花子", 28);
		hanako.hello();
	}

}
