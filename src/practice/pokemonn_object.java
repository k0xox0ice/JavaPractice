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

	}

}
