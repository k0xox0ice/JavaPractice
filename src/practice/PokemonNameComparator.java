package practice;

import java.util.Comparator;

public class PokemonNameComparator implements Comparator<Pokemon> {

	/**
	 * オーバーライド
	 * ポケモンの名前順で並び替える
	 *
	 * @param pokemon1, pokemon2 ソート対象のPokemon型オブジェクト
	 */
	@Override
	public int compare(Pokemon pokemon1, Pokemon pokemon2) {
		return pokemon1.getName().compareTo(pokemon2.getName());
	}

}
