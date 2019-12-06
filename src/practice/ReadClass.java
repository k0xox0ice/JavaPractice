package practice;

import java.io.FileReader;
import java.io.IOException;

public class ReadClass {
	public ReadClass() throws IOException {

		//ファイルを開く
		FileReader fr = new FileReader("C:\\Users\\k-kurihara\\Documents\\自主学習\\java\\example_java.txt");

		//読み込んだ文字を変数に格納する
		int i = fr.read();

		//全ての文字を出力する
		while (i != -1) {
			//文字型にキャストする
			char character = (char) i;
			System.out.println(character);
			i = fr.read();
		}


		/*
		//読み込む
		fr.read();

		//ファイルを閉じる
		fr.close();
		*/

	}

}
