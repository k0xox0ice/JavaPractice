package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile2 {
	public WriteFile2() throws IOException {

		//ファイルを開く
		FileWriter fw = new FileWriter("C:\\Users\\k-kurihara\\Documents\\自主学習\\java\\example_java.txt", false);
		BufferedWriter bw = new BufferedWriter(fw);

		//書き込み
		bw.write("ポケットモンスター ソード 手持ちリスト");
		bw.newLine();
		bw.write("1: インテレオン");
		bw.newLine();
		bw.write("2: セキタンザン");
		bw.newLine();
		bw.write("3: ネギガナイト");
		bw.newLine();
		bw.write("4: アーマーガア");
		bw.newLine();
		bw.write("5: ギャロップ");
		bw.newLine();
		bw.write("6: タチフサグマ");

		//強制書き込み
		bw.flush();

		//ファイルを閉じる
		bw.close();

	}

}
