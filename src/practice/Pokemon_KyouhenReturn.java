package practice;

public class Pokemon_KyouhenReturn {

	//共変戻り値
	public static Pokemon create() {
		return new BattlePokemon(1, 1, 4, "エンテイ", 2500);
	}

	Pokemon entei = create();
	//entei.individualValue(7, 12, 9);
}
