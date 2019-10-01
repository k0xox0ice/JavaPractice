package practice;

public class Pokemon_override {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//中外どちらから見ているかを正しく認識する
		//変数rugiaはスーパークラスの型のためサブクラスでのみ定義した内容は参照できない
		//11行の定義でもサブクラスを定義しているクラスファイルからであればサブクラス内の全変数、メソッドを参照可能
		Pokemon rugia = new BattlePokemon(1, 1, 4, "ルギア", 3800);
		Pokemon raikou = new Pokemon(1, 1, 1, "ライコウ");


		//Pokemon型では未定義となりエラーが発生する
		//rugia.pokemonSkillCheak(2);
		//rugia.getCp();

		//型変換ができず、エラーが発生
		//BattlePokemon houou = new Pokemon(1, 1, 1, "ホウオウ");

		//ダウンキャスト
		//BattlePokemonn suikun = (BattlePokemon)rugia;
		System.out.println(rugia instanceof Pokemon);
		System.out.println(rugia instanceof BattlePokemon);
		System.out.println(rugia instanceof Object);
		System.out.println(raikou instanceof BattlePokemon);

		//toStringメソッドの実行
		//フィールド変数の値を返す
		System.out.println();
		System.out.println("toStringメソッドの確認");
		System.out.println(rugia.toString());
		System.out.println(rugia);

		Pokemon suikun = new Pokemon(1, 1, 4, "スイクン");
		System.out.println(suikun);
		suikun.individualValue(12, 4, 14);
		rugia.individualValue(12, 4, 14);

		Pokemon entei = create();
		entei.individualValue(7, 12, 9);

	}

	//共変戻り値
	public static Pokemon create() {
		return new BattlePokemon(1, 1, 4, "エンテイ", 2500);
	}

}
