package practice;

import java.io.FileWriter;
import java.io.IOException;

public class Chapter19_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("/Applications/Eclipse_2023-12.app/Contents/workspace/test.txt", true);
			fw.write("書き込み");
		} catch (IOException e) {
			System.out.println("エラーです。");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
