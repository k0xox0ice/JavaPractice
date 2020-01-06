package practice;

import static java.nio.file.StandardCopyOption.*;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.GZIPOutputStream;

import javax.crypto.CipherOutputStream;

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
		}
		catch (IOException e) {
			System.out.println("エラーが発生しました。");
			System.out.println("書き込み先のファイルが開かれていないか確認してください。");
			System.out.println("入力内容を確認してください。");
		}
		finally {
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
		}
		catch (IOException e) {
			System.out.println("エラーが発生しました。");
			System.out.println("書き込み先のファイルが開かれていないか確認してください。");
			System.out.println("入力内容を確認してください。");
		}
		finally {
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
			System.out.println("SelectFileを起動したか確認してください");
			System.out.println("書き込み先のファイルが開かれていないか確認してください。");
			System.out.println("入力内容を確認してください。");
			try {
				bw.close();
			}
			catch (IOException e2){
				System.out.println("エラーが発生しました。");
			}
		}
	}

	public void WritingFile(String charsLine) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName, true);
		CipherOutputStream cos = new CipherOutputStream(fos, null);
		OutputStreamWriter osw = new OutputStreamWriter(cos);
		BufferedWriter bw = new BufferedWriter(osw);
		System.out.println("===ファイルの書き込み開始===");
		try {
			bw.write(charsLine);
			bw.newLine();
			bw.flush();
			System.out.println("書き込みに成功しました。");
		}
		catch(IOException e) {
			System.out.println("エラーが発生しました。");
			System.out.println("書き込み先のファイルが開かれていないか確認してください。");
			System.out.println("入力内容を確認してください。");
		}
		finally {
			bw.close();
		}
	}



	public void LoadingFile() throws IOException{
		try {
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
			catch (IOException e2) {
				System.out.println("読み込み時にエラーが発生しました。");
				br.close();
			}
		} catch (IOException e1) {
			System.out.println("エラーが発生しました。");
			System.out.println("SelectFileを起動したか確認してください");
			fr.close();
		}

	}

	public void FileCopy() throws IOException{
		try {
			Path path1 = Paths.get(fileName);
			Path copyPath = Paths.get("C:\\Users\\k-kurihara\\Documents\\自主学習\\java\\コピーファイル.txt");
			System.out.println("===ファイルコピー開始===");
			Files.copy(path1, copyPath, REPLACE_EXISTING);
			System.out.println("===ファイルコピー完了===");
		}
		catch (IOException e) {
			System.out.println("コピー時にエラーが発生しました。");
		}
	}

	public void Copy9() throws IOException {
		FileInputStream fis = new FileInputStream(fileName);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\k-kurihara\\Documents\\自主学習\\java\\練習9-1.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		GZIPOutputStream gos = new GZIPOutputStream(bos);

		try {
			System.out.println("===ファイルの読み込み/書き込み開始===");
			int i = fis.read();
			while (i != -1) {
				char i2 = (char)i;
				gos.write(i2);
				System.out.print((char)i);
				i = fis.read();
			}
		gos.flush();
		System.out.println();
		System.out.println("===ファイルの読み込み/書き込み完了===");

		}
		catch (IOException e) {
			System.out.println("読み込み時にエラーが発生しました。");
			System.out.println("SelectFileを起動したか確認してください");
			System.out.println("書き込み先のファイルが開かれていないか確認してください。");
			System.out.println("入力内容を確認してください。");
		}
		finally {
			try {
				fis.close();
				gos.close();
			}
			catch (IOException ee) {

			}
		}
	}

	public void FileDelete() throws IOException {

	}



}
