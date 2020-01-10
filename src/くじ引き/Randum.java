package くじ引き;

import java.util.Arrays;
import java.util.Random;

public class Randum {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

        int count = 0;
        int r = 0;
        String members[] = {"栗原", "上田", "大野"};
        boolean cheak[] = new boolean[members.length];
        int listNumbers[] = new int[members.length];
        Arrays.fill(listNumbers, -1);

        while (count < members.length) {

			r = Random(members);

			//Random()が返した値がlistNumbers[]に登録されているか調べる
			//登録されていなければcheak[count]にfalseを代入する
			for (int i = 0; i < count; i++) {
				if (listNumbers[i] == r) {
					cheak[count] = true;
					break;
				} else {
					cheak[count] = false;
				}
			}

			//cheak[count]がfalseの場合のみcountを1進める
			if (cheak[count] == true) {
				//処理なし
			} else {
				listNumbers[count] = r;
				count++;
			}
		}


		//結果を表示
		for (int i = 0; i < members.length; i++) {
			System.out.println(members[listNumbers[i]]);
		}
	}

	/**
	 * 配列の要素数以下の自然数をランダムに返す
	 *
	 * @param array 対象の配列
	 * @return Random関数が出した値
	 */
	public static int Random(String[] array) {
		Random rand = new Random();
        int randomNumber = rand.nextInt(array.length);
		return randomNumber;
	}

}
