package practice;

public class Arora extends Pokemon_BattleSystem {

	/**
	 * コンストラクタ
	 * スーパークラスのコンストラクタを呼び出す
	 *
	 * @param kindNumber 地方で登場したポケモンの数
	 */
	public Arora(int kindNumber) {
		super(kindNumber);
	}

	@Override
	public String systemName() {
		return "Z技";
	}

	@Override
	public String generationNumber() {
		return "第7世代";
	}
}
