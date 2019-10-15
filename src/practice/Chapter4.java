package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import practice.Pokemon;

public class Chapter4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Pokemon pikatyu = new Pokemon(1, 2, 3, "ピカチュウ");
		pikatyu.setGuideNumber(25);
		Pokemon mikaruge = new Pokemon(1, 1, 1, "ミカルゲ");
		mikaruge.setGuideNumber(442);
		Pokemon pikatyu2 = new Pokemon(1, 2, 3, "ピカチュウ");
		pikatyu2.setGuideNumber(25);
		Pokemon myutwo = new Pokemon(2, 4, "ミュウツー");
		myutwo.setGuideNumber(150);
		Pokemon rarutosu = new Pokemon(1, "ラルトス");
		rarutosu.setGuideNumber(280);
		Pokemon nakkura = new Pokemon(2, "ナックラー");
		nakkura.setGuideNumber(328);
		Pokemon hitokage = new Pokemon(1, "ヒトカゲ");
		hitokage.setGuideNumber(4);
		Pokemon giratelina = new Pokemon(2, 4, "ギラティナ");
		giratelina.setGuideNumber(487);

		System.out.println();
		System.out.println("eqauls()実行");
		System.out.println(mikaruge.equals(pikatyu));
		System.out.println(pikatyu.equals(pikatyu));
		System.out.println(pikatyu2.equals(pikatyu));
		System.out.println();

		Set<Pokemon> pokemonSet = new HashSet<>();
		pokemonSet.add(pikatyu);

		List<Pokemon> pokemonList = new ArrayList<>();
		pokemonList.add(pikatyu);
		pokemonList.add(mikaruge);
		pokemonList.add(rarutosu);
		pokemonList.add(hitokage);

		System.out.println("=== リスト一覧 ===");
		for (int i = 0; i < pokemonList.size(); i++) {
			System.out.println(pokemonList.get(i).getName());
		}
		System.out.println();

		Collections.sort(pokemonList);

		System.out.println("*** リスト一覧 ***");
		for (Pokemon p: pokemonList) {
			System.out.println(p.getName());
		}


		System.out.println();
		System.out.println("要素数：" + pokemonSet.size());

		System.out.println();
		System.out.println("remove実行");
		pokemonSet.remove(pikatyu);
		System.out.println();

		System.out.println("要素数：" + pokemonSet.size());



	}

}
