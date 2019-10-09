package practice;

import java.util.HashMap;
import java.util.Map;

public class MapArray {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//pokemonList配列を作成
		Map<Integer, String> pokemonList = new HashMap<>();
		//配列要素を格納する
		pokemonList.put(1, "フシギダネ");
		pokemonList.put(3, "フシギバナ");
		pokemonList.put(4, "ヒトカゲ");
		pokemonList.put(6, "リザードン");
		pokemonList.put(151, "ミュウ");

		System.out.println("ゲットした種類は" + pokemonList.size() + "種類です。");
		cheakMythical(pokemonList);
		totalPokemons(pokemonList);

		pokemonList.remove(151);
		cheakMythical(pokemonList);

		System.out.println("ゲットしたポケモンの一覧です。");
		System.out.println(pokemonList.keySet());
		System.out.println("-----------------------------------------------");
		totalPokemons(pokemonList);

	}

	public static void cheakMythical(Map<Integer, String> arrayName) {
		if (arrayName.containsKey(151) == true) {
			System.out.println("幻のポケモンはゲット済です。");
		} else {
			System.out.println("幻のポケモンに出会えていません。");
		}
	}

	public static void totalPokemons(Map<Integer, String> arrayName) {
		for (int keyNumber : arrayName.keySet()) {
			String pokemonName = arrayName.get(keyNumber);
			System.out.println(keyNumber + "：" + pokemonName);
		}
	}

}
