package practice;

import java.util.Comparator;

public class PokemonBallComparator implements Comparator<Pokemon> {

	/**
	 * オーバーライド
	 * Pokemonインスタンスの配列を並び替える
	 * Pokemon型インスタンスのフィールド変数 ballを基準にする
	 */
	@Override
	public int compare(Pokemon pokemon1, Pokemon pokemon2) {
		return Integer.valueOf(pokemon1.getBall()).compareTo(Integer.valueOf(pokemon2.getBall()));
	}

}
