package practice;

public abstract class Pokemon_BattleSystem implements FamousPokemon {

	//ポリモーフィズムの確認
	//スーパークラス

	//地方で新しく登場したポケモンの数
	private int kindNumber;

	//改行用の変数
	public static final String CHANGE_LINE = System.getProperty("line.separator");

	/**
	 * コンストラクタ
	 *
	 * @param kindNumber 新たに出現するポケモンの数
	 */
	public Pokemon_BattleSystem(int kindNumber) {
		this.kindNumber = kindNumber;
	}

	/**
	 * 地方特有のバトルシステムの名称を出力する
	 *
	 * @return 返り値なし
	 */
	/*public String systemName() {
		return null;
	}*/
	public abstract String systemName();

	/**
	 * 地方名に対応した世代番号を出力する
	 *
	 * @return 返り値なし
	 */
	/*public String generationNumber() {
		return null;
	}*/
	public abstract String generationNumber();

	/**
	 * 地方で新たに出現したポケモンの数を表示する
	 *
	 * @param kindNumber 新たに出現するポケモンの数
	 * @return
	 */
	public String newPokmons(int kindNumber) {
		return kindNumber + "種類のポケモンが登場";
	}

	/**
	 * ゲッター
	 * kindNumberの値を返す
	 *
	 * @return
	 */
	public int getKindNumber() {
		return kindNumber;
	}

}
