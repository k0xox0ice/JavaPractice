package practice;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public WriteFile() throws IOException {

		FileWriter fw;
		try {
			//ファイルを開く
			fw = new FileWriter("C:\\Users\\k-kurihara\\Documents\\自主学習\\java\\example_java.txt", true);

			//書き込む
			fw.write("ポケモン");

			//強制書き込み
			fw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//ファイルを閉じる
			fw.close();
		}
	}

}
