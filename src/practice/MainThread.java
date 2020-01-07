package practice;

import java.util.Scanner;

public class MainThread {

	public static void main(String[] args)  {
		// TODO 自動生成されたメソッド・スタブ

		int i = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("適当な文字を入力してください");
		System.out.println("> ");

		Thread mt = new MultiThread();
		mt.start();

		String input_text = sc.nextLine();

		while (i < 3) {
			System.out.println(input_text + " : " + (i + 1));
			i++;
		}

		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		for (int j = 3; j < 10; j++) {
			System.out.println(input_text + " : " + (j + 1));
		}



	}

}

