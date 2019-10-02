package practice;

public class Houen extends Pokemon_BattleSystem{

	/**
	 * コンストラクタ
	 * スーパークラスのコンストラクタを呼び出す
	 *
	 * @param kindNumber 地方で登場したポケモンの数
	 */
	public Houen(int kindNumber) {
		super(kindNumber);
	}

	@Override
	public String systemName() {
		return "ダブルバトル" + CHANGE_LINE + "特性の追加";
	}

	/*@Override
	public String generationNumber() {
		int totalNumber = getKindNumber() * 2;
		return totalNumber + "種類のポケモンが新たに登場";
	}*/

	@Override
	public String generationNumber() {
		return "第3世代";
	}

	/**
	 * リメイク時に新たに追加された対戦関連の情報
	 *
	 * @return
	 */
	public String remakeInformation() {
		return "新たなメガシンカポケモンの追加";
	}



}
