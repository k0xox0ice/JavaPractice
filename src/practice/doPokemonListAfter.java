package practice;

public class doPokemonListAfter {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Pokemon pikatyu = new Pokemon(1, 2, 3, "ピカチュウ");
		Pokemon myutwo = new Pokemon(2, 4, "ミュウツー");
		Pokemon rarutosu = new Pokemon(1, "ラルトス");
		Pokemon nakkura = new Pokemon(2, "ナックラー");
		Pokemon hitokage = new Pokemon(1, "ヒトカゲ");
		Pokemon giratelina = new Pokemon(2, 4, "ギラティナ");
		Pokemon suikun = new Pokemon(1, 4, "スイクン");
		Pokemon mikaruge = new Pokemon(1, 1, 2, "ミカルゲ");
		System.out.println();

		PokemonListAfter hold1 = new HoldingPokemonAfter();
		//PokemonListAfter box1 = new UsingPokemonBoxAfter();

		//手持ちへの追加
		hold1.entry(mikaruge);
		hold1.entry(hitokage);
		hold1.entry(suikun);
		hold1.entry(pikatyu);
		hold1.entry(myutwo);

		hold1.arrayDisplay();
		hold1.residueMessage();
		System.out.println();
		hold1.isGetWay(3);


		//ボックスへの登録
		//box1.entry(pikatyu);
		//box1.entry(myutwo);
		//box1.entry(rarutosu);
		//box1.entry(nakkura);
		//box1.entry(hitokage);
		//box1.entry(giratelina);
		//box1.entry(suikun);
		//box1.entry(mikaruge);

		//box1.arrayDisplay();
		//box1.residueMessage();
		//box1.isShiny(8);
		//box1.isNomal(2);


	}

}
