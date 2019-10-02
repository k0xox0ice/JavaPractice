package practice;

public class Pokemon_DisplaySystem {
	//実行クラス

	//地方で新たに登場したポケモンの数

	/**
	 * 実行メソッド
	 * バトルシステム名と世代番号を表示する
	 *
	 * @param regionName 地方名(ローマ字入力)
	 */
	public void run(Pokemon_BattleSystem regionName) {
		System.out.println(regionName.systemName());
		System.out.println(regionName.generationNumber());
		System.out.println(regionName.newPokmons(regionName.getKindNumber()));
	}

}
