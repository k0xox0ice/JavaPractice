package practice;

import java.util.Iterator;

public abstract class PokemonList implements Iterator<String> {
	/*
	捕まえたポケモンを保管するためのクラス
	登録した順に番号を付ける
	Iteratorインタフェースを実装しオーバーライドする
	*/

	//ポケモンの登録番号
	private int counter;

	//ポケモンの名前を保管する配列を作成
	//この配列は0番目の要素に値を代入しない
	private int ENTRY_MAX_NUMBER;
	private final int INFORMATION_NUMBER = 3;
	private final int INFORMATION_KIND = 0;
	private final int INFORMATION_SHINY = 1;
	private final int INFORMATION_BALL = 2;
	private int[][] entryListInformation = new int[ENTRY_MAX_NUMBER][INFORMATION_NUMBER];
	private String[] entryListName = new String[ENTRY_MAX_NUMBER];


	/**
	 * オーバーライド
	 * 配列に登録されているポケモンの数を表す変数counterを見て
	 * 次の要素があるかどうかを判断する
	 *
	 * 次の要素があればtrueを返す
	 *
	 */
	@Override
	public boolean hasNext() {

		if (counter < ENTRY_MAX_NUMBER) {
			counter++;
			return true;
		} else {
			return false;
		}

		/*for (int i = 0; i < ENTRY_MAX_NUMBER; i++) {
			if (i < counter) {
				return true;
			}
		}
		return false;*/

		/*int i = 0;
		while (i < ENTRY_MAX_NUMBER) {
			if (i < counter) {
				i++;
				continue;
			} else {
				return false;
			}
		}
		return true;*/
	}

	/**
	 * オーバーライド
	 * 配列に登録されている次の要素を確認し、
	 * 登録されているポケモン名を戻り値として返す
	 */
	@Override
	public String next() {
		int i = 0;
		while (i < counter) {
			i++;
			return getEntryListName(i);
		}
	}

	/**
	 * 配列の残り枠を表示する
	 *
	 * @return 作成時の要素数から登録したポケモンの数を引いた値を返す
	 */
	public int residueSlot() {
		return ENTRY_MAX_NUMBER - counter - 1;
	}

	/**
	 * 抽象クラス
	 * 配列の残り枠の数を表示する
	 *
	 * @return 値を代入していない配列の要素数を返す
	 */
	abstract public void residueMessage();

	/**
	 * ゲットしたポケモンをボックスに登録するためのメソッド
	 * Pokemonクラスのフィールド変数を配列に登録して管理を行う
	 *
	 * @param pokemonName Pokemonクラスから作成したインスタンス名
	 */
	public void entry(Pokemon pokemonName) {
		//登録番号を振る
		int entryNumber = ++counter;
		//ゲッターを使用してPokemonクラスの各フィールド変数(以下の4種類)を登録する
		//kind, shiny, ball, name
		int entryKind = pokemonName.getKind();
		int entryShiny = pokemonName.getShiny();
		int entryBall = pokemonName.getBall();
		String entryName = pokemonName.getName();
		//登録番号を参考にしてPokemonクラスの各フィールド変数の値を配列に代入する
		entryListInformation[entryNumber][INFORMATION_KIND] = entryKind;
		entryListInformation[entryNumber][INFORMATION_SHINY] = entryShiny;
		entryListInformation[entryNumber][INFORMATION_BALL] = entryBall;
		entryListName[entryNumber] = entryName;
	}

	public void arrayDisplay() {
		//System.out.println("num   name             kind   shiny   ball");
		for (int i = 1; i < 10; i++) {
			System.out.print(i + "   ");
			System.out.println(entryListName[i] + "   ");
			//System.out.print(entryListInformation[i][INFORMATION_KIND] + "      ");
			//System.out.print(entryListInformation[i][INFORMATION_SHINY] + "       ");
			//System.out.println(entryListInformation[i][INFORMATION_BALL] + "      ");
		}

		for (int i = 10; i < 31; i++) {
			System.out.print(i + "  ");
			System.out.println(entryListName[i] + "   ");
		}
	}

	/*public void entryInformation(Pokemon pokemonName) {
		//ポケモンの付属情報を登録する配列を作成
		int[][] entryListInformation = new int[ENTRY_MAX_NUMBER][INFORMATION_NUMBER];
		//登録番号を振る
			int entryNumber = ++counter;
		//Pokemonクラスからkind, shiny, ballの値を取得する
			int entryKind = pokemonName.getKind();
			int entryShiny = pokemonName.getShiny();
			int entryBall = pokemonName.getBall();
		//登録番号を参考にしてPokemonクラスの各フィールド変数の値を配列に代入する
			entryListInformation[entryNumber][INFORMATION_KIND] = entryKind;
			entryListInformation[entryNumber][INFORMATION_SHINY] = entryShiny;
			entryListInformation[entryNumber][INFORMATION_BALL] = entryBall;

		System.out.println("kind   shiny   ball");
		for (int i = 1; i < entryListInformation.length; i++) {
			System.out.print(entryListInformation[i][0] + "      ");
			System.out.print(entryListInformation[i][1] + "       ");
			System.out.println(entryListInformation[i][2]);
		}
	}*/

	/*public void entryName(Pokemon pokemonName) {
		//ポケモン名を登録する配列を作成
		String[] entryListName = new String[ENTRY_MAX_NUMBER];
		//登録番号を振る
		int entryNumber = ++counter;
		//Pokemonクラスからnameの値を取得する
		String name = pokemonName.getName();
		//登録番号を参考にして配列に代入する
		entryListName[entryNumber] = name;

		for (int i = 1; i < entryListName.length; i++) {
			System.out.println(entryListName[i]);
		}

	}*/

	/**
	 * 色違いかどうかを判断する
	 *
	 * @param listNumber 配列の登録番号
	 */
	public void isShiny(int listNumber) {
		System.out.print(listNumber + "：" + entryListName[listNumber]);
		if (entryListInformation[listNumber][1] == 1) {
			System.out.println("は【通常色】");
		} else {
			System.out.println("は【色違い】");
		}
	}

	/**
	 * ゲット方法を表示する
	 * アプリ画面からゲットした場合は、使用したボールの種類も表示する
	 *
	 * @param listNumber 配列の登録番号
	 */
	public void isGetWay(int listNumber) {
		System.out.print(listNumber + "：" + entryListName[listNumber]);
		if ((entryListInformation[listNumber][INFORMATION_KIND] == 1)
				&& (entryListInformation[listNumber][INFORMATION_BALL] == 1)) {
			System.out.println("のゲット方法：GoPLUS");
		} else {
			System.out.println("のゲット方法：アプリ画面");
			if (entryListInformation[listNumber][2] == 2) {
				System.out.println("【スーパーボール】を使用");
			} else if (entryListInformation[listNumber][2] == 3) {
				System.out.println("【ハイパーボール】を使用");
			} else {
				System.out.println("【プレミアボール】を使用");
			}
		}
	}

	/**
	 * 通常ポケモンかどうかを表示する
	 *
	 * @param listNumber 配列の登録番号
	 */
	public void isNomal(int listNumber) {
		System.out.print(listNumber + "：" + entryListName[listNumber]);
		if (entryListInformation[listNumber][INFORMATION_KIND] == 1) {
			System.out.println("は【通常ポケモン】");
		} else if (entryListInformation[listNumber][INFORMATION_KIND] == 2) {
			System.out.println("は【伝説のポケモン】");
		} else {
			System.out.println("は【幻のポケモン】");
		}
	}

	public String setEntryListName(int number, String name) {
		return entryListName[number] = name;
	}

	/**
	 * ゲッター
	 * 配列に登録したポケモンの数を返す
	 *
	 * @return 配列に登録されたポケモンの数を返す
	 */
	public int getCounter() {
		return counter;
	}

	/**
	 * セッター
	 * ポケモンを登録する配列の要素の最大数を入力する
	 *
	 * @param maxNumber ポケモンを登録する配列の最大要素数を入力する
	 * ボックス -> 30、手持ち -> 6 を入力
	 */
	public void setEntryMaxNumber(int maxNumber) {
		ENTRY_MAX_NUMBER = maxNumber;
	}

	/**
	 * ゲッター
	 * entryListNameに格納されたポケモン名を取得する
	 *
	 * @param number 取得したいポケモンの登録番号
	 * @return 登録番号に対応したポケモン名
	 */
	public String getEntryListName(int number) {
		return entryListName[number];
	}

	public int getEntryMaxNumber() {
		return ENTRY_MAX_NUMBER;
	}

}
