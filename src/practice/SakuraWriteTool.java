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
import java.util.Scanner;
import java.util.zip.GZIPOutputStream;

import javax.crypto.CipherOutputStream;

public class SakuraWriteTool {

	private int num;
	private String charsLine;
	private FileWriter fw = null;
	private FileReader fr = null;
	private String fileName = null;


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

	/**
	 * ファイルパスを指定
	 * @param fileName ファイルパス(ファイル名まで含む)
	 */
	public void SelectFile(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * 対象のファイルにint型の数字を書き込む
	 * <br>バファーフィルタを通して書き込みを行う
	 * <br>使用前にSelectFileメソッドでパス指定を行う必要がある
	 * @param num 書き込む数字
	 * @throws IOException
	 */
	public void WritingFile(int num) throws IOException {
		System.out.println("===ファイルの書き込み開始===");
		fileNameCheak();
		fw = new FileWriter(fileName, true);
		BufferedWriter bw = new BufferedWriter(fw);
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

	/**
	 * 対象のファイルにString型の文字列を書き込む
	 * <br>バファーフィルタを通して書き込みを行う
	 * <br>使用前にSelectFileメソッドでパス指定を行う必要がある
	 * @param charsLine 書き込む文字列
	 * @throws IOException
	 */
	public void WritingFile(String charsLine) throws IOException {
		System.out.println("===ファイルの書き込み開始===");
		fileNameCheak();
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



	/**
	 * ファイルの読み込みを行う
	 * <br>読み込んだ内容をコンソールに出力する
	 * <br>使用前にSelectFileメソッドでパス指定を行う必要がある
	 * @throws IOException
	 */
	public void LoadingFile() throws IOException{
		try {
			System.out.println("===ファイルの読み込み開始===");
			fileNameCheak();
			fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
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
		} catch (IOException ee) {
			System.out.println("エラーが発生しました。");
			System.out.println("SelectFileを起動したか確認してください");
			fr.close();
		}

	}

	/**
	 * ファイルのコピーを行う
	 * <br>コピーしたファイル名は「コピーファイル.txt」になる
	 * <br>使用前にSelectFileメソッドでパス指定を行う必要がある
	 * @throws IOException
	 */
	public void FileCopy() throws IOException{
		try {
			System.out.println("===ファイルコピー開始===");
			fileNameCheak();
			Path path1 = Paths.get(fileName);
			Path copyPath = Paths.get("C:\\Users\\k-kurihara\\Documents\\自主学習\\java\\コピーファイル.txt");
			Files.copy(path1, copyPath, REPLACE_EXISTING);
			System.out.println("===ファイルコピー完了===");
		}
		catch (IOException e) {
			System.out.println("コピー時にエラーが発生しました。");
		}
	}

	/**
	 * Java実践編9章の練習問題の解答
	 * <br>ファイルのコピーをFileInputStreamとFileOutputStreamを使用して作成した。
	 * <br>使用前にSelectFileメソッドでパス指定を行う必要がある
	 * @throws IOException
	 */
	public void Copy9() throws IOException {
		System.out.println("===ファイルの読み込み/書き込み開始===");
		fileNameCheak();
		FileInputStream fis = new FileInputStream(fileName);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\k-kurihara\\Documents\\自主学習\\java\\練習9-1.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		GZIPOutputStream gos = new GZIPOutputStream(bos);

		try {
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

	/**
	 * ファイルの削除を行う
	 * <br>削除を行うか否かをコマンド入力で確認する
	 * <br>   1: 削除を行う / 2: 削除を中止する
	 * <br>コマンドで1, 2以外を入力した場合は再度入力する内容のメッセージを表示する
	 * <br>使用前にSelectFileメソッドでパス指定を行う必要がある
	 * @throws IOException
	 */
	public void FileDelete() throws IOException {
		boolean isErrorCheak = true;

		Scanner scanner = new Scanner(System.in);
		System.out.println("ファイルの削除を行いますか？");
		System.out.println("削除したいファイルがSelectFileメソッドで指定したか確認してください。");
		System.out.println("値を入力してください。(1: 削除開始 2: 削除中止)");
		System.out.print("   > ");

		//入力した内容をインスタンスから取得
		int input_num = scanner.nextInt();
		System.out.println(input_num);

		if (input_num == 1) {
			try {
				System.out.println("===ファイルの削除開始===");
				fileNameCheak();
				Path path1 = Paths.get(fileName);
				Files.delete(path1);
				isErrorCheak = false;
			}
			catch (IOException e) {
				System.out.println("対象ファイルのパスを確認することができませんでした。");
			}

			if (isErrorCheak == false) {
				System.out.println("===ファイルの削除完了===");
			} else {
				System.out.println("===ファイルの削除失敗===");
			}

		} else if (input_num == 2) {
			System.out.println("===ファイルの削除中止===");
		} else {
			System.out.println("入力する値は1または2にして再入力してください。");
		}
	}

	/**
	 * SelectFileメソッドでパス指定をしたかの確認を行う
	 * <br>fileNameがnullの場合、プログラムを終了させる
	 * <br>filenameに値が入力されている場合、そのままプログラムを続行させる
	 */
	public void fileNameCheak() {
		if (fileName == null) {
			System.out.println("SelectFileメソッドでファイルパスが指定されていません。");
			System.out.println("ファイルパスを指定してから再度操作を行ってください。");
			System.out.println("プログラムを終了します。");
			System.exit(0);
		} else {
		}
	}
}
