package practice;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Dofile {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ

		//インスタンス作成
		MakeDirFile makeFile = new MakeDirFile();

		//ファイルに書き込む
		WriteFile writeFile = new WriteFile();

		//ファイルに上書き
		WriteFile2 writeFile2 = new WriteFile2();

		//ファイルに追記
		WriteFile writeFile3 = new WriteFile();

		//ファイルに書き込む
		WriteResume resume = new WriteResume();

		//ファイルを読み込む
		ReadClass read = new ReadClass();
		System.out.println();


		/*
		System.out.println("===ファイル書き込み===");
		SakuraWriteTool file0 = new SakuraWriteTool("「12523」を入力");
		SakuraWriteTool file1 = new SakuraWriteTool(1);
		SakuraWriteTool file2 = new SakuraWriteTool(" エルレイド");
		SakuraWriteTool file3 = new SakuraWriteTool(2);
		SakuraWriteTool file4 = new SakuraWriteTool(" ルカリオ");
		file4.LoadingFile("C:\\Users\\k-kurihara\\Documents\\自主学習\\java\\サクラエディタ書き込み.txt");
		*/

		SakuraWriteTool file = new SakuraWriteTool();
		file.SelectFile("C:\\Users\\k-kurihara\\Documents\\自主学習\\java\\サクラエディタ書き込み.txt");
		//file.WritingFile("ポケットモンスター");
		file.LoadingFile();

		Path p1 = Paths.get("C:\\Users\\k-kurihara\\Documents\\自主学習\\java\\活動報告書_レジュメ.txt");
		//Files useFile = new Files();

		SakuraWriteTool file2 = new SakuraWriteTool();
		file2.SelectFile("C:\\Users\\k-kurihara\\Documents\\自主学習\\java\\活動報告書_レジュメ.txt");
		file2.FileCopy();
		file2.Copy9();

		SakuraWriteTool file3 = new SakuraWriteTool();
		file3.SelectFile("C:\\Users\\k-kurihara\\Documents\\自主学習\\java\\コピーファイル.txt");
		file3.FileDelete();

	}

}
