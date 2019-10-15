package practice;

public class UsingPokemonBoxAfter extends PokemonListAfter {

	/**
	 * コンストラクタ
	 * ボックスの上限値30にする
	 * 配列は要素番号0は使用しないため、最大要素数は31にしている
	 */
	public UsingPokemonBoxAfter() {
		super();
		setEntryMaxNumber(31);
		Pokemon[] list = new Pokemon[getEntryMaxNumber()];
		setEntrylist(list);
	}

	/**
	 * コンストラクタ
	 * ボックスの上限値+1の値を引数に入力する
	 * 配列の要素番号0は使用しないためである
	 * @param number entryList[]の要素数
	 */
	public UsingPokemonBoxAfter(int number) {
		super();
		setEntryMaxNumber(number);
		Pokemon[] list = new Pokemon[getEntryMaxNumber()];
		setEntrylist(list);
	}

	/**
	 * ボックスの空き状況を出力する
	 */
	@Override
	public void residueMessage() {
		System.out.println("=== ボックスの空き状況 ===");
		if (residueSlot() > 0) {
			System.out.println("ボックスに送れるポケモンの数は" + residueSlot() + "匹です。");
		} else if (residueSlot() == 0) {
			System.out.println("ボックスの空きはありません。");
		} else {
			System.out.println("登録したポケモンがボックスの上限を超えています。");
			System.out.println("設定を見直してください。");
		}
	}

}
