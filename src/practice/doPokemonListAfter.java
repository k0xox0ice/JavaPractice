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
		HoldingPokemonAfter hold2 = new HoldingPokemonAfter();
		PokemonListAfter box1 = new UsingPokemonBoxAfter();

		//手持ちへの追加
		hold1.entry(mikaruge);
		hold1.entry(hitokage);
		hold1.entry(suikun);
		hold1.entry(pikatyu);
		hold1.entry(myutwo);

		hold2.entry(myutwo);
		hold2.entry(giratelina);
		hold2.entry(suikun);

		hold1.arrayDisplay();
		System.out.println();
		System.out.println("residueMessage()実行");
		hold1.residueMessage();
		System.out.println();
		hold1.isGetWay(3);

		System.out.println();
		hold2.singleBattle();
		hold2.doubleBattle();
		hold2.holdingList();

		box1.entry(pikatyu);
		box1.entry(myutwo);
		box1.entry(rarutosu);
		box1.entry(nakkura);
		box1.entry(hitokage);
		box1.entry(pikatyu);
		box1.entry(rarutosu);
		box1.entry(giratelina);
		box1.entry(suikun);
		box1.entry(mikaruge);
		box1.entry(hitokage);

		System.out.println();
		box1.arrayDisplay();
		System.out.println();
		System.out.println("residueMessage()実行");
		box1.residueMessage();
		System.out.println();
		box1.isShiny(7);
		box1.isNomal(2);


		System.out.println();
		System.out.println("Interatorの実行");
		System.out.println("* * * * * * * * * *");
		while (hold1.hasNext() == true) {
			System.out.println(hold1.next());
			System.out.println("* * * * * * * * * *");
		}
		System.out.println();

		System.out.println("Interatorの実行");
		while (box1.hasNext() == true) {
			System.out.println(box1.next().getName());
		}

	}

}
