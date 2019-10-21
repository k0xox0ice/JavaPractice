package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class CalculationLists {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		Iterator<Integer> iterator = list.iterator();

		System.out.println("=== list一覧 ===");
		while (iterator.hasNext() == true) {
			System.out.println(iterator.next());
		}

		/*
		for (int i = 0; i < list.size(); i++) {
			Integer j = list.get(i);
			j = i * i * i * i * i;
			list.set(i, j);
		}
		*/

		/*
		for(Integer i: list) {
			i = i * i * i;
		}
		*/

		System.out.println();
		System.out.println("=== list一覧 ===");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		/*
		while(iterator.hasNext() == true) {
			System.out.println(iterator.next());
		}
		*/

		System.out.println();
		System.out.println("=== streamを使用 ===");
		list.stream().forEach(i -> System.out.println(i));


		System.out.println();
		System.out.println("=== streamを使用 ===");
		//stream()の取得 【1度だけ実行】
		Stream<Integer> stream1 = list.stream();

		//中間操作
		//streamのデータを加工してstreamで返す
		Stream<Integer> stream2 = stream1.map(i -> i * i * i * i * i);

		//終端操作 【1度だけ実行】
		//streamのデータを別データに変換する
		stream2.forEach(i -> System.out.println(i));

		System.out.println();
		System.out.println("=== streamを使用 ===");
		list.stream().map(i -> i * i * 31 * 10).forEach(i -> System.out.println(i));

		System.out.println();
		System.out.println("=== streamを使用 ===");
		list.stream().forEach(i -> System.out.println(i * 123));


		System.out.println();
		System.out.println("=== list2 ===");
		List<Integer> list2 = new ArrayList<>();
		list2.add(0);
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.stream().map(i -> i + 1).forEach(i -> System.out.println(i));
		System.out.println();
		list2.stream().filter(i -> i % 2 == 1).map(i -> i * i).forEach(i -> System.out.println(i));
		System.out.println();
		list2.stream().sorted((a, b) -> b - a).forEach(i -> System.out.println(i));

		//Stringのコレクションを並び替えるstreamを書く
		System.out.println();
		System.out.println("=== list3 ===");
		List<String> list3 = new ArrayList<>();
		list3.add("ダックスフント");
		list3.add("フクロウ");
		list3.add("アメリカンショートヘア");
		list3.stream().forEach(i -> System.out.println(i));
		System.out.println("****************************");
		list3.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));
		System.out.println("****************************");
		list3.stream().sorted(Comparator.naturalOrder()).forEach(i -> System.out.println(i));

		//Mapを並び替えるstreamを書く
		System.out.println();
		System.out.println("=== Map1 ===");
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "ダックスフント");
		map1.put(2, "フクロウ");
		map1.put(3, "アメリカンショートヘア");
		map1.entrySet().stream().forEach(i -> System.out.println(i));
		System.out.println("****************************");
		map1.entrySet().stream().map(i -> i.getKey() + "：" + i.getValue()).forEach(i -> System.out.println(i));
		System.out.println("****************************");
		map1.entrySet().stream().sorted(java.util.Map.Entry.comparingByValue()).map(i -> i.getKey() + "：" + i.getValue()).forEach(i -> System.out.println(i));

	}

}
