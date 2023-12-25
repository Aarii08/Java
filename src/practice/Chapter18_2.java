package practice;

public class Chapter18_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		StringBuffer sb = new StringBuffer();
	
		for (int i = 1; i <= 100; i++) {
			sb.append(i).append(",");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		String data = new String(sb);
		System.out.println(data);
		
		String[] dataArray = data.split(",");
		for (String d : dataArray) {
			System.out.println(d);
		}
	}

}
