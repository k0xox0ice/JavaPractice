package practice;

public class CharacterProcess {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String s1 = "";
		String s2 = "1";
		String s3 = "Javaの学習";

		String s5 = "0123456789";
		String s6 = " A bc　D　";

		if (s1.equals(s2) == true) {
			System.out.println("s1とs2は等しい");
		} else if (s1.equalsIgnoreCase(s3) == true) {
			System.out.println("s1とs3は等しい");
		} else if (s1.length() >= 5) {
			System.out.println("s1は5文字以上");
		} else if (s1.isEmpty() == true) {
			System.out.println("s1は空文字");
		} else {
			System.out.println("s1は5文字未満");
		}

		if (s3.contains("java") == true) {
			System.out.println("contains() = " + s3.contains("java"));
		} else if (s3.startsWith("学習") == true) {
			System.out.println("startsWith() = " + s3.startsWith("学習"));
		} else if (s3.endsWith("の") == true) {
			System.out.println("endsWith() = " + s3.endsWith("の"));
		} else {
			System.out.println(s3.indexOf("学習"));
			System.out.println(s3.lastIndexOf("あ"));
		}

		System.out.println(s5.charAt(3));
		System.out.println(s5.substring(3));
		System.out.println(s5.substring(3, 8));

		System.out.println();
		System.out.println(s6.toLowerCase());
		System.out.println(s6.toUpperCase());
		System.out.println(s6.trim());
		System.out.println(s6.replace("b", "c"));

		System.out.println();
		StringBuilder sb = new StringBuilder();

		/*
		for (int i = 0; i < 1000; i++) {
			sb.append("Java");
		}
		System.out.println(sb.toString());
		*/

		//sb.append("Java");
		//sb.append("学習");
		//sb.append("しよう");

		sb.append("Java").append("学習").append("しよう");

		System.out.println(sb.toString());

		boolean[] b = new boolean[6];
		String a1 = "Java1234だ";
		b[0] = a1.matches("Java1234だ"); //true
		b[1] = a1.matches("Java.234だ");
		b[2] = a1.matches(".*");
		b[3] = a1.matches("Java[0-9]{1,}だ");
		b[4] = a1.matches("Ja[avz]{2}[0-9]{1,4}だ");
		b[5] = a1.matches("^J.*だ$");

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		String[] word = a1.split("[14]");
		for (String c : word) {
			System.out.print(c + "->");
		}

		String word2 = a1.replaceAll("1234", "X");
		System.out.println(word2);
		System.out.println();

		String FORMAT = ("名前：%10s  タイプ1：%7s  タイプ2：%7s");

		String[][] statusData = new String[4][3];
		statusData[0][0] = "rukario";
		statusData[0][1] = "kakutou";
		statusData[0][2] = "hagane";

		statusData[1][0] = "burakki";
		statusData[1][1] = "aku";
		statusData[1][2] = "";

		statusData[2][0] = "zeruneasu";
		statusData[2][1] = "feari";
		statusData[2][2] = "";

		statusData[3][0] = "giratelina";
		statusData[3][1] = "gousuto";
		statusData[3][2] = "doragon";

		for (int i = 0; i < statusData.length ; i++) {
			String pokemonStatus = String.format(FORMAT, statusData[i][0], statusData[i][1], statusData[i][2]);
			System.out.println(pokemonStatus);
		}

	}
}
