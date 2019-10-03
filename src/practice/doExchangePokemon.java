package practice;

public class doExchangePokemon {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Pokemon pityu = new Pokemon(1, "ピチュー");
		System.out.print("-> ");
		Interface.infomation(pityu);

		System.out.println("-----------------------------------");
		BattlePokemon kureseria = new BattlePokemon(1, 1, 4, "クレセリア", 1500);
		System.out.print("-> ");
		Interface.infomation(kureseria);

	}

}
