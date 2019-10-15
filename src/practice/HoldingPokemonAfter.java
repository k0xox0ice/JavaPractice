package practice;

public class HoldingPokemonAfter extends PokemonListAfter {

	/**
	 * コンストラクタ
	 * 配列の要素数を7にする
	 * ポケモン登録数は6であるが、
	 * 要素番号0は使用しないため最大要素数は7にする
	 */
	public HoldingPokemonAfter() {
		super();
		setEntryMaxNumber(7);
		Pokemon[] list = new Pokemon[getEntryMaxNumber()];
		setEntrylist(list);
	}

	/**
	 * コンストラクタ
	 * ボックスの上限値+1の値を引数に入力する
	 * 配列の要素番号0は使用しないためである
	 * @param number entryList[]の要素数
	 */
	public HoldingPokemonAfter(int number) {
		super();
		setEntryMaxNumber(number);
		Pokemon[] list = new Pokemon[getEntryMaxNumber()];
		setEntrylist(list);
	}

	/**
	 * シングルバトル開始時に出すポケモンの名前を表示する
	 */
	public void singleBattle() {
		System.out.println("シングルバトルで出すポケモンは");
		System.out.println(getEntryList(1).getName());
	}

	/**
	 * ダブルバトル開始時に出すポケモンの名前を表示する
	 */
	public void doubleBattle() {
		System.out.println("ダブルバトルで出すポケモンは");
		System.out.println(getEntryList(1).getName() + "と" + getEntryList(2).getName());
	}

	/**
	 * 手持ちに加えられるポケモンの数を出力する
	 */
	@Override
	public void residueMessage() {
		System.out.println("=== 手持ちの空き情報 ===");
		if (residueSlot() == 0) {
			System.out.println("これ以上手持ちにポケモンを加えられません。");
		} else {
			System.out.println("あと" + residueSlot() + "匹手持ちに加えられます。");
		}
	}

	/**
	 * 手持ちのポケモンの数を表示する
	 */
	public void holdingList() {
		System.out.println("手持ちのポケモンは" + getCounter() + "匹です。");
	}

}
