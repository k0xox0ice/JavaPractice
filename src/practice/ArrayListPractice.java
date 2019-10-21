package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import practice.Pokemon;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//ArrayListの宣言
		List<String> subject = new ArrayList<String>();

		//add()で要素を追加
		subject.add("国語");
		subject.add("数学");
		subject.add("英語");

		//forSentence(subject);
		//expansionFor(subject);

		//配列の要素名を変更
		subject.set(1, "数学Ⅰ");
		//配列の途中に要素を追加
		subject.add(2, "数学Ⅱ");
		subject.add(3, "数学Ⅲ");

		//forSentence(subject);

		if (subject.size() == 5) {
			subject.add("社会");
			//System.out.println("社会は" + subject.indexOf("社会") + "番目");
		}

		subject.add("理科");

		//forSentence(subject);

		if (subject.contains("理科") == true) {
			subject.set(subject.indexOf("理科"), "化学");
			subject.add(subject.indexOf("化学") + 1, "物理");
			//useIterator(subject);
		}

		subject.remove(4);
		//useIterator(subject);

		List<Integer> numberList = new LinkedList<Integer>();

		Pokemon pikatyu = new Pokemon(1, "ピカチュウ");
		System.out.println(pikatyu.getInstanceNumber());
		Pokemon abo = new Pokemon(2, "アーボ");
		Pokemon giratelina = new Pokemon(3, 2, 4, "ギラティナ");
		System.out.println();
		List<Pokemon> holding = new ArrayList<>();
		holding.add(pikatyu);
		holding.add(abo);
		holding.add(giratelina);
		useIterator2(holding);

	}

	/**
	 * for文でArrayListの要素を出力する
	 *
	 * @param arrayName ArrayListの変数名
	 */
	public static void forSentence(List<String> arrayName) {
		System.out.println("*****for文*****");
		for (int i = 0; i < arrayName.size(); i++) {
			System.out.println(arrayName.get(i));
		}
	}

	/**
	 * 拡張for文でArrayListの要素を出力する
	 *
	 * @param arrayName ArrayListの変数名
	 */
	public static void expansionFor(List<String> arrayName) {
		System.out.println("***拡張for文***");
		for (String array : arrayName) {
			System.out.println(array);
		}
	}

	/**
	 * イテレータを使用してArrayListの要素を出力する
	 *
	 * @param arrayName ArrayListの変数名
	 */
	public static void useIterator(List<String> arrayName) {
		Iterator<String> it = arrayName.iterator();
		System.out.println("*****イテレータ*****");
		while (it.hasNext() == true) {
			String array = it.next();
			System.out.println(array);
		}
	}

	public static void useIterator2(List<Pokemon> arrayName) {
		Iterator<Pokemon> it = arrayName.iterator();
		System.out.println("*****イテレータ*****");
		while (it.hasNext() == true) {
			Pokemon array = it.next();
			System.out.println(array);
			System.out.println(((Pokemon) arrayName).getInstanceNumber());
			//System.out.println("ポケモン名：" + array.getName());
			System.out.println("-------------------------");
		}
	}

}
