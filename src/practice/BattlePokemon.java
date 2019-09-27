package practice;
public class BattlePokemon extends Pokemon {
	//ポケモンのCP値
	private int cp;

	/**
	 * コンストラクタ
	 * ゲットしたポケモンのパラメータ設定する
	 * GoPLUSで捕獲した場合はメッセージでGoPLUSを表示する
	 *
	 * 捕獲したポケモンのCPを表示する
	 * CPから3つリーグから活躍できるリーグを表示する
	 *    スーパーリーグ、ハイパーリーグ、マスターリーグ
	 *
	 * @param type ポケモンの種類の判別(1: 通常,2: 伝説,3: 幻)
	 * @param shiny 色違いの判別(1: 通常色,2: 色違い)
	 * @param ball 捕獲時に使用したボールの判別
	 *    (1: モンスターボール,2: スーパーボール,3: ハイパーボール,4: プレミアボール)
	 * @param name 捕獲したポケモンの個体名
	 * @param cp 捕獲したポケモンのCPの値
	 */
	public BattlePokemon (int kind, int shiny, int ball, String name, int cp) {
		//スーパーコンストラクタを呼び出す
		super(kind, shiny, ball, name);
		this.cp = cp;

		//ポケモンのCPを表示
		System.out.println("ポケモンのCP：" + cp);

		//CPの値のよってどのリーグで戦えるかを表示
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

	/**
	 * コンストラクタ
	 * 通常色のポケモンをゲットした場合のパラメータ設定する
	 *    (shiny = 1、通常色ポケモンに指定)
	 *
	 * @param type ポケモンの種類の判別(1: 通常,2: 伝説,3: 幻)
	 * @param ball 捕獲時に使用したボールの判別
	 *    (1: モンスターボール,2: スーパーボール,3: ハイパーボール,4: プレミアボール)
	 * @param name 捕獲したポケモンの個体名
	 * @param cp 捕獲したポケモンのCPの値
	 */
	public BattlePokemon(int kind, int ball, String name, int cp) {
		this(kind, 1, ball, name, cp);
	}

	/**
	 * コンストラクタ
	 * GoPLUSで捕獲したポケモンのパラメータ設定する
	 *    (type = 1、通常のポケモン
	 *     ball = 1、モンスターボールで捕獲に指定)
	 *
	 * @param shiny(1: 通常色,2: 色違い)
	 * @param name 捕獲したポケモンの個体名
	 * @param cp 捕獲したポケモンのCPの値
	 */
	public BattlePokemon(int shiny, String name, int cp) {
		this(1, shiny, 1, name, cp);
	}


	/**
	 * どのリーグで対戦できるかを表示
	 * CPの値でどのリーグで活躍できるかを判断する
	 *    スーパーリーグ、ハイパーリーグ、マスターリーグ
	 */
	/*public void pokemonCPCheck () {
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
	}*/

	/**
	 * ポケモンの技が解放されているかを表示
	 * skillNumberが2, 3以外の場合、エラーメッセージを表示
	 *
	 * @param skillNumber ポケモンが持っている技の数(ノーマル、スペシャル技を含む)
	 */
	public void pokemonSkillCheck(int skillNumber) {
		switch (skillNumber) {
			case 2:
				System.out.println("技の解放ができます。");
				break;
			case 3:
				System.out.println("技は解放済です。");
				break;
			default:
				System.out.println("技の数が正しくありません。2つまたは3つです。");
				System.out.println("再入力してください。");
		}
	}

	/**
	 * ゲッター
	 * CPの値を取得
	 *
	 * @return 捕獲したポケモンのCP
	 */
	public int getCp() {
		return this.cp;
	}

}
