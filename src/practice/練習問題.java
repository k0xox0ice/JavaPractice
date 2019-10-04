package practice;

public class 練習問題 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//練習1-1
		System.out.println("練習問題1-1");

		//StringBuilderのオブジェクト作成
		StringBuilder sb = new StringBuilder();
		//バッファ領域に文字を登録する
		for (int i = 0; i < 100; i++) {
			sb.append((i + 1) + ",");
		}

		//バッファ領域に登録した値を取り出す
		String numberList = sb.toString();

		//split()を使用してnumberListを配列に変える
		String[] a = numberList.split("[,]");

		//練習問題1-2
		System.out.println();
		System.out.println("練習問題1-2");

		public void practice2 () {
			if (folder.endsWith("\\") == false) {
				folder = folder + "\\";
			}
			return folder + file;
		}


	}

}
