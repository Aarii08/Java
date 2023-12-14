
public class loop {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = 100;
		while (number < 50) {
			number *= 2;
			System.out.println("While01 = " + number);
		}

		System.out.println("-----------------");

		int number1 = 100;
		do {
			number1 *= 2;
			System.out.println("DoWhile01 = " + number1);
		} while (number1 < 50);

		//while文とdo-while文の違いは、条件式をブロックの実行前に評価するか、後に評価するか。
		//do-while文では、ブロックの最初の１回目が必ず実行される。

		for (int number2 = 1; number2 <= 5; number2++) {
			System.out.println("For01 = " + number2);
		}

		System.out.println("--- 拡張for文 ---");

		//拡張for文
		int[] array = { 11, 12, 13, 14, 15, 16, 17 };
		for (int number3 : array) {
			System.out.println("For02 = " + number3);
		}

		System.out.println("------------");

		for (int count = 0; count < 8; count++) {
			if (count == 5) {
				break;
			}
			System.out.println("Break01 = " + count);
		}

		System.out.println("------------");

		for (int count1 = 0; count1 < 8; count1++) {
			if (count1 == 4) {
				continue;
			}
			System.out.println("Continue01 = " + count1);
		}
		
		System.out.println("-------------");
		
	}

}
