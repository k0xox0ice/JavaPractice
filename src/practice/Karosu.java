package practice;

public class Karosu extends Pokemon_BattleSystem {

	/**
	 * コンストラクタ
	 * スーパークラスのコンストラクタを呼び出す
	 *
	 * @param kindNumber 地方で登場したポケモンの数
	 */
	public Karosu(int kindNumber) {
		super(kindNumber);
	}

	@Override
	public String systemName() {
		return "メガシンカ";
	}

	@Override
	public String generationNumber() {
		return "第6世代";
	}
}
