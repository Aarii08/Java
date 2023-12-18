
public class DriveCar {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car c1 = new Car();  //Carクラスのオブジェクト c1 を生成
		
		c1.setNo(2525);  //c1 のナンバーを 2525 に設定
		c1.run(30);  //c1 の速度を 30 に設定
		c1.display();  //c1 のナンバー、速度を表示
		
		c1.stop();  //c1 の速度を0に設定
		c1.display();  //c1 のナンバー、速度を表示
	}

}
