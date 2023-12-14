
public class Chapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int distance = 5;
		if (distance <= 5) {
			System.out.println("とても近いです");
		} else if (distance <= 10) {
			System.out.println("近いです");
		} else if (distance <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}

		System.out.println("------------");

		String dayOfWeek = "Monday";
		switch (dayOfWeek) {
		case "Friday":
			System.out.println("金曜日");
			break;
		case "Sunday":
			System.out.println("日曜日");
			break;
		case "Monday":
			System.out.println("月曜日");
			break;
		default:
			System.out.println("曜日ではありません");
		}
	}

}
