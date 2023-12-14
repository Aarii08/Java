
public class If01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = 7;
		if (number < 5) {
			System.out.println(number + " は5未満です");
		}
		if (number < 10) {
			System.out.println(number + " は10未満です");
		}
		if (number < 15) {
			System.out.println(number + " は15未満です");
		}
		System.out.println("-----------------------");

		int number1 = 7;
		if (number1 < 5) {
			System.out.println(number1 + " は5未満です");
		} else if (number < 10) {
			System.out.println(number1 + " は5以上、10未満です");
		} else if (number < 15) {
			System.out.println(number1 + " は10以上、15未満です");
		} else {
			System.out.println(number1 + " は15未満ではないです");
		}

		System.out.println("----------------------");
		System.out.println("--- switch ---");

		int val = 2;
		switch (val) {
		case 3:
			System.out.println("よくできました!");
			break;
		case 2:
			System.out.println("ふつうでした!");
			break;
		default:
			System.out.println("がんばろう!");
		}
	}

}
