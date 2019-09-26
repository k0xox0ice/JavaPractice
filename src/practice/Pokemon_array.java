package practice;

import java.util.Arrays;

public class Pokemon_array {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//対戦で使用したいポケモンを配列に代入する
		String[] battlePokemons = new String[5];
		battlePokemons[0] = "ポリゴン";
		battlePokemons[1] = "ポワルン(雪の姿)";
		battlePokemons[2] = "デオキシス(ディフェンスフォルム)";
		battlePokemons[3] = "ガブリアス";
		battlePokemons[4] = "ジャローダ";

		//ゲットしたポケモンを配列に代入する
		String[] capturePokemons = new String[] {"ミネズミ", "マメパト", "ヨーテリー"};

		//交換したいポケモンを配列に代入する
		String[] exchangePokemons = {"クレセリア", "グラードン"};

		//配列の要素を出力する
		System.out.println("対戦で使いたいポケモン");
		System.out.println(Arrays.toString(battlePokemons));
		System.out.println();
		System.out.println("交換したいポケモン");
		System.out.println(Arrays.toString(exchangePokemons));

		//battlePokemonsの参照をコピーする
		String[] copyPokemons = battlePokemons;
		copyPokemons[0] = null;
		copyPokemons[1] = "ポワルン";
		copyPokemons[2] = "デオキシス";
		copyPokemons[3] = null;
		copyPokemons[4] = null;

		//battlePokemonsの要素を出力
		System.out.println("*************************************");
		System.out.println("対戦で使いたいポケモン");
		System.out.println(Arrays.toString(battlePokemons));
		System.out.println(copyPokemons[0]);
		System.out.println(copyPokemons[0].toString());

		//オブジェクトの配列
		Pokemon[] pokemonGO = new Pokemon[3];
		pokemonGO[0] = new Pokemon(1, 1, 3, "ピカチュウ");
		pokemonGO[1] = new Pokemon(2, 4, "ミュウツー");
		pokemonGO[2] = new Pokemon(2, "ラルトス");
		System.out.println();
		for (int i = 0; i < pokemonGO.length; i++) {
			pokemonGO[i].pokemonKind();
			pokemonGO[i].ballType();
			pokemonGO[i].individualValue(5, 10, 15);
			System.out.println();
		}
	}

}
