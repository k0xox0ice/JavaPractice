package practice;

import java.util.Iterator;

public abstract class PokemonListAfter implements Iterator<Pokemon> {
	/*
	捕まえたポケモンを保管するためのクラス
	登録した順に番号を付ける
	Iteratorインタフェースを実装しオーバーライドする
	*/

	//ポケモンの登録番号
	private int counter;

	//ポケモンの名前を保管する配列を作成
	//この配列は0番目の要素に値を代入しない
	private int entryMaxNumber;

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

		if (counter < entryMaxNumber) {
			counter++;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * オーバーライド
	 * 配列に登録されている次の要素を確認し、
	 * 登録されているポケモン名を戻り値として返す
	 */
	@Override
	public Pokemon next() {
		return entryList[counter];
	}

	/**
	 * 配列の残り枠を表示する
	 *
	 * @return 作成時の要素数から登録したポケモンの数を引いた値を返す
	 */
	public int residueSlot() {
		return entryMaxNumber - counter - 1;
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

		System.out.println(entryList.length);

		for (int i = 1; i < 7; i++) {
			System.out.print(i + "   ");
			System.out.println(entryList[i].getName() + "   ");
		}

		//登録番号を参考にしてPokemonインスタンスを配列に代入する
		entryList[entryNumber] = pokemonName;
	}

	public void arrayDisplay() {
		//System.out.println("num   name             kind   shiny   ball");
		for (int i = 1; i < 10; i++) {
			System.out.print(i + "   ");
			System.out.println(entryList[i] + "   ");
			//System.out.print(entryListInformation[i][INFORMATION_KIND] + "      ");
			//System.out.print(entryListInformation[i][INFORMATION_SHINY] + "       ");
			//System.out.println(entryListInformation[i][INFORMATION_BALL] + "      ");
		}

		for (int i = 10; i < 31; i++) {
			System.out.print(i + "  ");
			System.out.println(entryList[i] + "   ");
		}
	}

	/**
	 * 色違いかどうかを判断する
	 *
	 * @param listNumber 配列の登録番号
	 */
	public void isShiny(int listNumber) {
		System.out.print(listNumber + "：" + entryList[listNumber].getName());
		if (entryList[listNumber].getShiny() == 1) {
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
		System.out.print(listNumber + "：" + entryList[listNumber].getName());
		if ((entryList[listNumber].getKind() == 1)
				&& (entryList[listNumber].getBall() == 1)) {
			System.out.println("のゲット方法：GoPLUS");
		} else {
			System.out.println("のゲット方法：アプリ画面");
			if (entryList[listNumber].getBall() == 2) {
				System.out.println("【スーパーボール】を使用");
			} else if (entryList[listNumber].getBall() == 3) {
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
		System.out.print(listNumber + "：" + entryList[listNumber].getName());
		if (entryList[listNumber].getKind() == 1) {
			System.out.println("は【通常ポケモン】");
		} else if (entryList[listNumber].getKind() == 2) {
			System.out.println("は【伝説のポケモン】");
		} else {
			System.out.println("は【幻のポケモン】");
		}
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
	public void setEntryMaxNumber(int number) {
		entryMaxNumber = number;
	}

	public int getEntryMaxNumber() {
		return entryMaxNumber;
	}

	public Pokemon getEntryList(int number) {
		return entryList[number];
	}


}
