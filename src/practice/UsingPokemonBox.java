package practice;

public class UsingPokemonBox extends PokemonList {

	/**
	 * コンストラクタ
	 * ボックスの上限値を決定する
	 *
	 * @param ENTRY_MAX_NUMBER ボックスの上限値+1の値を入力する
	 */
	public UsingPokemonBox(int ENTRY_MAX_NUMBER) {
		super();
		setEntryMaxNumber(ENTRY_MAX_NUMBER);
	}

	/**
	 * ボックスのの残り枠を表示する
	 */
	@Override
	public void residueMessage() {
		if (residueSlot() > 0) {
			System.out.println("ボックスに送れるポケモンの数は" + residueSlot() + "匹です。");
		} if (residueSlot() == 0) {
			System.out.println("ボックスの空きはありません。");
		} else {
			System.out.println("登録したポケモンがボックスの上限を超えています。");
			System.out.println("設定を見直してください。");
		}
	}

}
