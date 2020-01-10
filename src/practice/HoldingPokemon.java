package practice;

public class HoldingPokemon extends PokemonList {

	/**
	 * コンストラクタ
	 * 配列の要素数を7にする
	 * ポケモン登録数は6であるが、
	 * 要素番号0は使用しないため要素数を6+1している
	 */
	public HoldingPokemon() {
		super();
		//setEntryMaxNumber(6);
	}

	/**
	 * シングルバトル開始時に出すポケモンの名前を表示する
	 */
	public void singleBattle() {
		System.out.println("シングルバトルで出すポケモンは");
		System.out.println(getEntryListName(1));
	}

	/**
	 * ダブルバトル開始時に出すポケモンの名前を表示する
	 */
	public void doubleBattle() {
		System.out.println("ダブルバトルで出すポケモンは");
		System.out.println(getEntryListName(1) + "と" + getEntryListName(2));
	}

	/**
	 * 手持ちに加えられるポケモンの数を出力する
	 */
	@Override
	public void residueMessage() {
		int holdNumber = 30 - residueSlot();
		System.out.println("=== 手持ちの空き情報 ===");
		if (holdNumber > 6) {
			System.out.println("これ以上手持ちにポケモンを加えられません。");
		} else if (0 < holdNumber && holdNumber < 6) {
			{
				System.out.println("あと" + (6 - holdNumber) + "匹手持ちに加えられます。");
			}
		} else {
			System.out.println("登録したポケモンが手持ちの上限を超えています。");
			System.out.println("設定を見直してください。");
		}
	}

	@Override
	public void arrayDisplay() {
		//System.out.println("num   name             kind   shiny   ball");
		for (int i = 1; i < 7; i++) {
			System.out.print(i + "   ");
			System.out.println(getEntryListName(i) + "   ");
			//System.out.print(entryListInformation[i][INFORMATION_KIND] + "      ");
			//System.out.print(entryListInformation[i][INFORMATION_SHINY] + "       ");
			//System.out.println(entryListInformation[i][INFORMATION_BALL] + "      ");
		}
	}


	/**
	 * 手持ちのポケモンの数を表示する
	 *
	 */
	public void holdingList() {
		System.out.println("手持ちのポケモンは" + getCounter() + "匹です。");
	}

	@Override
	public String next() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
