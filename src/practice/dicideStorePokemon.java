package practice;

/**
 * インタフェース
 * 各個体値を入力しボックスに残すかどうかの判断を行う
 *
 * @author k-kurihara
 */
public abstract interface dicideStorePokemon {
	//ボックスに残すか否かのメッセージを表示する
	public abstract void info(int hp, int atk, int def);

}

