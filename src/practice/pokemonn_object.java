package practice;

public class pokemonn_object {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//アプリ画面でゲットしたピカチュウの情報
		Pokemon pikatyu = new Pokemon(1, 2, 3, "ピカチュウ");
		pikatyu.pokemonKind();
		pikatyu.pokemonType("ピカチュウ");
		pikatyu.ballType();
		pikatyu.individualValue(3, 5, 70);
		pikatyu.info(5, 12, 8);
		System.out.println(pikatyu.wantPokemonName() + "と交換したいです。");

		//アプリ画面でゲットしたミュウツーの情報
		Pokemon myutwo = new Pokemon(2, 4, "ミュウツー");
		myutwo.pokemonKind();
		myutwo.pokemonType("ミュウツー");
		myutwo.ballType();
		myutwo.individualValue(13, -14, 15);

		//GoPLUSでゲットしたラルトスの情報
		Pokemon rarutosu = new Pokemon(1, "ラルトス");
		rarutosu.pokemonKind();
		rarutosu.pokemonType("ラルトス");
		rarutosu.individualValue(5, 10, 7);

		//タイプの種類数を表示
		System.out.println();
		pikatyu.getPokemonTypeNumber();

		//サブクラスを読み込む
		BattlePokemon rukario = new BattlePokemon(1, "ルカリオ", 1450);
		rukario.individualValue(10, 10, 15);
		rukario.pokemonSkillCheck(3);
		rukario.info(5, 14, 12);

		System.out.println();
		Object objSuper = new Pokemon(1, 1, 4, "スーパークラス");
		//kind, shiny, ball, nameが出力される
		System.out.println("****************************");
		System.out.println(objSuper);
		Object objSub = new BattlePokemon(1, 1, 4, "サブクラス", 1500);
		//cpが出力される
		System.out.println("****************************");
		System.out.println(objSub);

	}

}
