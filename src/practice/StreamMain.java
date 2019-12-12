package practice;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class StreamMain {

	public static void main(String[] args){
		// TODO 自動生成されたメソッド・スタブ

		try {
			String a = "ポケットモンスター";

			Reader r = new StringReader(a);

			char c1 = (char) r.read();
			char c2 = (char) r.read();
			char c3 = (char) r.read();
			char c4 = (char) r.read();

			System.out.println(c1);
			System.out.println(c1 + c2);
			System.out.println(c1 + c2 + c3);
			System.out.println(c1 + c2 + c3 + c4);

			System.out.println();
			System.out.print(c1);
			System.out.print(c2);
			System.out.print(c3);
			System.out.print(c4);
			//System.out.println();
			//System.out.println();

			//読み込んだ文字を変数に代入
			char character1 = c1;
			char character2 = c2;

			//System.out.println(character1 + character2);
			//System.out.println();

			int i = r.read();
			while (i != -1) {
				char c = (char) i;
				System.out.print(c);
				i = r.read();
			}

		}
		catch (IOException e) {
			System.out.println("エラーが発生しました。");
		}

	}

}
