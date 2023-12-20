package practice;

public class Chapter16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human[] humans = new Human[] {
				new Student(),
				new Programmer(),
				new Driver(),
				new Teacher(),
				new Doctor(),
		};
		
		for (Human h : humans) {
			h.work();
			if (h instanceof Programmer) {
				 ((Programmer) h).study();
			}
		}

	}

}
