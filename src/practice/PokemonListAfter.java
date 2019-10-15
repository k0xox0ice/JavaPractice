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

	//イテレーター用の変数
	private int iteratorCount = 0;

	//ポケモンの名前を保管する配列を作成
	//この配列は0番目の要素に値を代入しない
	private int entryMaxNumber;
	private Pokemon[] entryList;

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

		if (iteratorCount < counter) {
			iteratorCount++;
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
		return entryList[iteratorCount];
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

		//System.out.println(entryList.length);

		//登録番号を参考にしてPokemonインスタンスを配列に代入する
		entryList[entryNumber] = pokemonName;

	}

	/**
	 * 配列に登録したポケモン名の一覧を出力する
	 * 登録していない要素は"-----"で表示する
	 */
	public void arrayDisplay() {
		System.out.println("=== リスト一覧 ===");
		//配列に登録されたポケモンを出力する
		for (int i = 1; i <= counter; i++) {
			if (i <= 9) {
				System.out.println(i + " ：" + entryList[i].getName());
			} else if (9 < i && i <= counter) {
				System.out.println(i + "：" + entryList[i].getName());
			}
		}

		//登録されていない配列要素は---で出力する
		for (int i = counter + 1; i < entryMaxNumber; i++) {
			if (i <= 9) {
				System.out.println(i + " ：" + "-----");
			} else if (9 < i && i <= entryMaxNumber) {
				System.out.println(i + "：" + "-----");
			}
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
	 * @param maxNumber entryMaxNumberに代入する値
	 * ボックス -> 30、手持ち -> 6 を入力
	 */
	public void setEntryMaxNumber(int number) {
		entryMaxNumber = number;
	}

	/**
	 * ゲッター
	 * ポケモンを登録する配列の要素の最大数を取得する
	 *
	 * @return entryMaxNumberの値を返す
	 */
	public int getEntryMaxNumber() {
		return entryMaxNumber;
	}

	/**
	 * ゲッター
	 * 配列に登録した任意の配列番号のポケモンを呼び出す
	 * @param listNumber 登録した配列番号
	 * @return listNumberに対応するPokemonインスタンス
	 */
	public Pokemon getEntryList(int listNumber) {
		return entryList[listNumber];
	}

	/**
	 * セッター
	 * ポケモンを登録する配列に作成した配列を代入する
	 * スーパークラスでポケモンを登録するための配列の名前のみ宣言している
	 * サブクラスのコンストラクタで作成した配列を代入するために使用する
	 */
	public Pokemon[] setEntrylist(Pokemon[] array) {
		entryList = array;
		return entryList;
	}

}
