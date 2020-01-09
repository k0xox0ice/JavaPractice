package くじ引き;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RamdumList {

	public static void main(String[] args) {

		List<String> members = loadingMembers("C:\\Users\\k-kurihara\\Documents\\その他\\くじ引き_面談用\\くじ引きメンバー一覧.txt");

		//シャッフルして順番を変える
		System.out.println("リストをシャッフルします。");
		Collections.shuffle(members);

		//リストの中身を表示する
		System.out.println("===抽選結果===");
		for (int i = 0; i < members.size(); i++) {
			System.out.println(members.get(i));
		}
	}

	/**
	 * ファイルに入力された内容をmembersリストに格納する
	 *
	 * @param filePath 読みこませるファイルパス
	 */
	public static List<String> loadingMembers(String filePath){

		List<String> list = new ArrayList<String>();
		FileReader fr = null;
		int i = 0;
		String nameBox = "";

		try {
			fr = new FileReader(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		File cheak = new File(filePath);



		//ファイルから文字を読み込み配列に格納する
		if (cheak.exists() == true) {

			System.out.println("ファイルを見つけました。読込を開始します。");

			try {
				i = fr.read();
			} catch (IOException e) {
				e.printStackTrace();
			}

			//ファイルから読み込んだ文字をnameBoxに代入する
			while (i != -1) {

				char nameChar = (char) i;
				String nameString = String.valueOf(nameChar);
				nameBox += nameString;
				try {
					i = fr.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			//splidメソッドを使用して改行コードで区切り配列に格納する
			list = Arrays.asList(nameBox.split("\n"));


			/*
			while(i != -1) {
				char nameChar = (char) i;
				//System.out.println(nameChar);
				String nameString = String.valueOf(nameChar);

				if (nameString == ",") {
					System.out.println(nameString);
				} else {

				}


				if (nameString == ",") {
					list.add(nameString);
					nameBox = null;
					try {
						i = fr.read();
					} catch (IOException e) {
						e.printStackTrace();
					}
				} else {
					try {
						nameBox += nameString;
						i = fr.read();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			*/

			System.out.println("リストへの格納が終わりました。");

		} else {
			System.out.println("ファイルを見つけることができませんでした。");
		}

		return list;

	}
}
