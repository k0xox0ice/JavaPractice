package practice;

public class pokemonn_object {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//アプリ画面でゲットしたピカチュウの情報
		Pokemon pikatyu = new Pokemon(1, 2, 3, "ピカチュウ");
		pikatyu.pokemonType();
		pikatyu.ballType();
		pikatyu.individualValue(3, 5, 70);

		//アプリ画面でゲットしたミュウツーの情報
		Pokemon myutwo = new Pokemon(2, 4, "ミュウツー");
		myutwo.pokemonType();
		myutwo.ballType();
		myutwo.individualValue(13, -14, 15);

		//GoPLUSでゲットしたラルトスの情報
		Pokemon rarutosu = new Pokemon(1, "ラルトス");
		rarutosu.pokemonType();
		rarutosu.individualValue(5, 10, 7);
	}

}
