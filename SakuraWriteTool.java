package 第9章;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SakuraWriteTool {

	private int num;
	private String charsLine;
	FileWriter fw = null;


	//コンストラクタ(数字入力)
	public SakuraWriteTool(int num) throws IOException {
		this.num = num;

		try {
			fw = new FileWriter("C:\\Users\\k-kurihara\\Documents\\自主学習\\java\\サクラエディタ書き込み.txt", true);
			fw.write(num);
			fw.flush();
			System.out.println("書き込みに成功しました。");
			fw.close();

		}
		catch (IOException e) {
			System.out.println("エラーが発生しました。");
			System.out.println("入力内容を確認してください。");
			fw.close();
		}
	}

	//コンストラクタ(文字入力)
	public SakuraWriteTool(String charsLine) throws IOException {
		try {
			fw = new FileWriter("C:\\Users\\k-kurihara\\Documents\\自主学習\\java\\サクラエディタ書き込み.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(charsLine);
			bw.newLine();
			bw.flush();
			System.out.println("書き込みに成功しました。");
			bw.close();

		}
		catch (IOException e) {
			System.out.println("エラーが発生しました。");
			System.out.println("入力内容を確認してください。");
			fw.close();
		}
	}

	public void flush() throws IOException{
		try {
			fw.flush();
		}
		catch (IOException e) {
			System.out.println("エラーが発生しました。");
			System.out.println("ファイルを閉じます。");
			fw.close();
		}
	}



}
