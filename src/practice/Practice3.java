package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("練習問題3-1");
		System.out.println("(1) Set");
		System.out.println("(2) List");
		System.out.println("(3) Map");

		System.out.println();
		System.out.println("練習問題3-2");

		//インスタンス作成
		Hero saito = new Hero("斎藤");
		Hero suzuki = new Hero("鈴木");

		//ArrayListに格納
		List<Hero> heroList = new ArrayList<>();
		heroList.add(saito);
		heroList.add(suzuki);

		//ArrayListから順番に取り出し名前を表示する
		for (int i = 0; i < heroList.size(); i++) {
			System.out.println(heroList.get(i).getName());
		}

		System.out.println();
		System.out.println("練習問題3-3");

		//HashMapに格納
		Map<Hero, Integer> heroMap = new HashMap<>();
		heroMap.put(saito, 3);
		heroMap.put(suzuki, 7);

		//HashMapから値を取り出し表示する
		for (Hero keyName: heroMap.keySet()) {
			//倒した敵の数を変数に代入する
			int value = heroMap.get(keyName);
			System.out.println(keyName.getName() + "が倒した敵=" + value);
		}
	}


}
