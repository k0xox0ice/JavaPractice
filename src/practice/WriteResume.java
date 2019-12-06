package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteResume {
	public WriteResume() throws IOException {

		//ファイルを開く

		//FileWriterクラスのインスタンスを作成
		//ファイルパスは自分で設定すること
		FileWriter fw = new FileWriter("C:\\Users\\k-kurihara\\Documents\\自主学習\\java\\活動報告書_レジュメ.txt");

		//BufferedWriterクラスのインスタンスを作成
		BufferedWriter bw = new BufferedWriter(fw);

		//ファイルに書き込む
		bw.write("活動報告 レジュメ");
		bw.newLine();
		bw.newLine();
		bw.write("1. 自己紹介");
		bw.newLine();
		bw.write("	名前、出身校、研究内容、CMK志望理由");
		bw.newLine();
		bw.newLine();
		bw.write("2. 1年間の活動の流れ");
		bw.newLine();
		bw.write("	1年間で行ってきた業務の全体の流れを説明");
		bw.newLine();
		bw.newLine();
		bw.write("3. 1つの業務をピックアップして説明する");
		bw.newLine();
		bw.newLine();
		bw.write("4. 仕事の中でぶつかった壁");
		bw.newLine();
		bw.newLine();
		bw.write("5. 新人へのアドバイス");
		bw.newLine();
		bw.write("	・質問をする");
		bw.newLine();
		bw.write("	・勉強を続ける");
		bw.newLine();
		bw.write("	・気分転換");
		bw.newLine();
		bw.write("	・得意不得意を見つける");
		bw.newLine();

		//強制書き込み
		bw.flush();

		//ファイルを閉じる
		bw.close();

	}

}
