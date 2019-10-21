package practice;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//配列を作成
		String[] subject = new String[3];
		subject[0] = "国語";
		subject[1] = "数学";
		subject[2] = "英語";

		//for文で要素を出力
		System.out.println("*****for文*****");
		for (int i = 0; i < subject.length; i++) {
			System.out.println(subject[i]);
		}

		//拡張for文で要素を出力
		System.out.println("***拡張for文***");
		for (String array: subject) {
			System.out.println(array);
		}



	}

}
