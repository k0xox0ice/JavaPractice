package practice;

import java.util.Comparator;

public class PokemonBallGuideNumberComparator implements Comparator<Pokemon> {

	@Override
	public int compare(Pokemon pokemon1, Pokemon pokemon2) {
		if ((pokemon1.getBall() == pokemon2.getBall()) == false) {
			return Integer.valueOf(pokemon1.getBall()).compareTo(Integer.valueOf(pokemon2.getBall()));
		} else {
			return Integer.valueOf(pokemon1.getGuideNumber()).compareTo(Integer.valueOf(pokemon2.getGuideNumber()));
		}

	}

}
