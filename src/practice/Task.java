package practice;

public class Task {

	private int date;
	private String content;
	private boolean done = false;
	
	public Task(int date, String content) {
		this.date = date;
		this.content = content;
	}
	
	public String done() {
		if (done == false) {
			return "未完了";
		} else {
			return "完了";
		}
	}
	
	public String print() {
		return this.date + "のタスク" + "「" + this.content + "」" + done(); 
	}
}
