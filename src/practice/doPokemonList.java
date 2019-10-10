package practice;

public class doPokemonList {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Pokemon pikatyu = new Pokemon(1, 2, 3, "ピカチュウ");

		/*
		Pokemon pikatyu = new Pokemon(1, 2, 3, "ピカチュウ");
		Pokemon myutwo = new Pokemon(2, 4, "ミュウツー");
		Pokemon rarutosu = new Pokemon(1, "ラルトス");
		Pokemon nakkura = new Pokemon(2, "ナックラー");
		Pokemon hitokage = new Pokemon(1, "ヒトカゲ");
		Pokemon giratelina = new Pokemon(2, 4, "ギラティナ");
		Pokemon suikun = new Pokemon(1, 4, "スイクン");
		Pokemon mikaruge = new Pokemon(1, 1, 2, "ミカルゲ");
		*/

		//PokemonList box1 = new UsingPokemonBox(31);

		HoldingPokemon hold = new HoldingPokemon();

		//hold.entryListName2[1] = "ピカチュウ";

		hold.entry(pikatyu);
		System.out.println(hold.entryListName[1]);

		/*
		box1.entry(pikatyu);
		box1.entry(myutwo);
		box1.entry(rarutosu);
		box1.entry(nakkura);
		box1.entry(hitokage);
		box1.entry(giratelina);
		box1.entry(suikun);
		box1.entry(mikaruge);
		*/

		//box1.residueMessage();


	}

}
