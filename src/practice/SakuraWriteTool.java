package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

//import javax.crypto.CipherOutputStream;

public class SakuraWriteTool {

	private int num;
	private String charsLine;
	private FileWriter fw = null;
	private FileReader fr = null;
	private String fileName;


	public SakuraWriteTool() throws IOException {

	}


	//コンストラクタ(数字入力)
	public SakuraWriteTool(int num) throws IOException {
		this.num = num;
		fw = new FileWriter("C:\\Users\\k-kurihara\\Documents\\自主学習\\java\\サクラエディタ書き込み.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("===ファイルの書き込み開始===");
		try {

			bw.write(num);
			bw.flush();
			System.out.println("書き込みに成功しました。");
			bw.close();

		}
		catch (IOException e) {
			System.out.println("エラーが発生しました。");
			System.out.println("書き込み先のファイルが開かれていないか確認してください。");
			System.out.println("入力内容を確認してください。");
			bw.close();
		}
	}

	//コンストラクタ(文字入力)
	public SakuraWriteTool(String charsLine) throws IOException {
		fw = new FileWriter("C:\\Users\\k-kurihara\\Documents\\自主学習\\java\\サクラエディタ書き込み.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("===ファイルの書き込み開始===");
		try {
			bw.write(charsLine);
			bw.newLine();
			bw.flush();
			System.out.println("書き込みに成功しました。");
			bw.close();
		}
		catch (IOException e) {
			System.out.println("エラーが発生しました。");
			System.out.println("書き込み先のファイルが開かれていないか確認してください。");
			System.out.println("入力内容を確認してください。");
			bw.close();
		}
	}

	public void SelectFile(String fileName) {
		this.fileName = fileName;
	}

	public void WritingFile(int num) throws IOException {
		fw = new FileWriter(fileName, true);
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("===ファイルの書き込み開始===");
		try {
			bw.write(num);
			bw.flush();
			System.out.println("書き込みに成功しました。");
			bw.close();
		}
		catch (IOException e) {
			System.out.println("エラーが発生しました。");
			System.out.println("書き込み先のファイルが開かれていないか確認してください。");
			System.out.println("入力内容を確認してください。");
			bw.close();
		}
	}

	public void WritingFile(String charsLine) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName, true);
		//CipherOutputStream cos = new CipherOutputStream(fos);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		System.out.println("===ファイルの書き込み開始===");
		try {
			bw.write(charsLine);
			bw.newLine();
			bw.flush();
			System.out.println("書き込みに成功しました。");
			bw.close();
		}
		catch(IOException e) {
			System.out.println("エラーが発生しました。");
			System.out.println("書き込み先のファイルが開かれていないか確認してください。");
			System.out.println("入力内容を確認してください。");
			bw.close();
		}
	}



	public void LoadingFile() throws IOException{
		fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		System.out.println("===ファイルの読み込み開始===");
		try {
			int i = br.read();
			while (i != -1) {
				System.out.print((char)i);
				i = br.read();
			}
			System.out.println("===ファイルの読み込み完了===");
			br.close();
		}
		catch (IOException e) {
			System.out.println("読み込み時にエラーが発生しました。");
			br.close();
		}

	}



}
