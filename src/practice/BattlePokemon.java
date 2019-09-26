package practice;

public class BattlePokemon extends Pokemon {
	public BattlePokemon()
	//スーパーコンストラクタ
	super(kind, shiny, ball, name);

	public void pokemonCPCheck(int cp) {
		if (0 <= cp && cp <= 1500) {
			System.out.println("スーパークラスで戦えます。");
		} else if (1500 < cp && cp <= 2500) {
			System.out.println("ハイパーリーグで戦えます。");
		} else if (2500 < cp) {
			System.out.println("マスターリーグで戦えます。");
		} else {
			System.out.println("CPの値が正しくありません。");
			System.out.println("再入力してください。");
		}
	}

}
