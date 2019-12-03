package practice;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public WriteFile() throws IOException {

		//ファイルを開く
		FileWriter fw = new FileWriter("C:\\Users\\k-kurihara\\Documents\\自主学習\\java\\example_java.txt");

		//書き込む
		fw.write("ポケモン");

		//強制書き込み
		fw.flush();

		//ファイルを閉じる
		fw.close();
	}

}
