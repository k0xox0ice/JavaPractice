package practice;

import java.io.File;
import java.io.IOException;

public class MakeDirFile {
	public MakeDirFile() throws IOException {
		//作成の流れ
		//  ディレクトリ作成 -> ファイル作成

			//ディレクトリ作成
			//  mkdirメソッドを使用

			//ファイルを作成
			//createNewFileメソッドを使用

		//参考URL: https://www.sejuku.net/blog/20527


		//インスタンス作成
		File dir = new File("C:\\Users\\k-kurihara\\Documents\\自主学習\\java");
		//ディレクトリ作成
		dir.mkdir();

		//インスタンス作成
		File file = new File("C:\\Users\\k-kurihara\\Documents\\自主学習\\java\\example_java.txt");
		//ファイル作成
		file.createNewFile();

	}


}
