package practice;

public class Chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int date = 20231220;
		String content = "牛乳を買う";
		
		Task task = new Task(date, content);
		task.print();
		
		task.done();
		
		task.print();
	}

}
