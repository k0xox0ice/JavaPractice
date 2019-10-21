package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetArray {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//HashSetの配列を作成
		Set<String> subject = new HashSet<>();
		//subjectに要素を代入する
		subject.add("英語");
		subject.add("書道");
		subject.add("体育");
		subject.add("国語");
		subject.add("数学");
		//subjectの内容を調べる
		if (subject.isEmpty() == false) {
			System.out.println("要素数：" + subject.size());
		} else {
			System.out.println("要素数：0");
		}

		if (subject.contains("体育") == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		//全要素を出力する
		Iterator<String> it = subject.iterator();
		System.out.println("*******イテレータ*******");
		while (it.hasNext() == true) {
			String array = it.next();
			System.out.print(array + " -> ");
		}
		System.out.println();
		//要素を削除する
		subject.remove("国語");
		System.out.println("*******イテレータ*******");
		Iterator<String> it2 = subject.iterator();
		while (it2.hasNext() == true) {
			String array = it2.next();
			System.out.print(array + " -> ");
		}

		//LinkedHashSetの配列を作成
		Set<String> subject2 = new LinkedHashSet<>();
		//subjectに要素を代入する
		subject2.add("英語");
		subject2.add("書道");
		subject2.add("体育");
		subject2.add("国語");
		subject2.add("数学");
		Iterator<String> it3 = subject2.iterator();
		System.out.println();
		System.out.println("*******イテレータ*******");
		while (it3.hasNext() == true) {
			String array = it3.next();
			System.out.print(array + " -> ");
		}

	}

}
