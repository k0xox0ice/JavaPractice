package くじ引き;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandumUpdate {

	public static void main(String[] args) {


		//面談に参加する人を格納するリスト
		List<String> members = new ArrayList<String>();

		//ファイル読み込みでリストにメンバーを追加する
		members.add("栗原");
		members.add("上田");
		members.add("大野");
		members.add("鈴村");
		members.add("吉村");

		//シャッフルして順番を変える
		System.out.println("リストをシャッフルします。");
		Collections.shuffle(members);

		//リストの中身を表示する
		System.out.println("===抽選結果===");
		for (int i = 0; i < members.size(); i++) {
			System.out.println(members.get(i));
		}
	}

}
