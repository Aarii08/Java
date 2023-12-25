package practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Chapter19_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try (FileOutputStream fos = new FileOutputStream("/Applications/Eclipse_2023-12.app/Contents/workspace/test.txt")) {
			fos.write(0x41);
		} catch (FileNotFoundException e) {
			System.out.println("ファイルがありませんでした。");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("エラーです。");
			e.printStackTrace();
		}
	}

}
