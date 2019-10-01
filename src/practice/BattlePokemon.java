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
	public BattlePokemon(int kind, int shiny, int ball, String name, int cp) {
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
	 * オーバーライド
	 * toStringメソッドをオーバーライドする
	 *
	 * @return BattlePokemonクラスのフィールド変数の値を出力
	 */
	@Override
	public String toString() {
		return "cp = " + cp;
	}

	/**
	 * 個体値の各パラメータが正常な値であるかを確認
	 * 0 <= && >= 15であれば正常
	 * それ以外ならば不適切であると判断
	 *
	 * @param value
	 * @return true (0 <= parameter && parameter <= 15) / false 左記以外
	 */

	/**
	 * オーバーライド
	 * 個体値の計算を行う
	 * atkの値を確認し、値ごとに異なるメッセージを出力する
	 *
	 * @param hp  HP  の個体値(範囲指定: 0 <= hp  <= 15)
	 * @param atk 攻撃の個体値(範囲指定: 0 <= atk <= 15)
	 * @param def 防御の個体値(範囲指定: 0 <= def <= 15)
	 */
	@Override
	public void individualValue(int hp, int atk, int def) {

		boolean isError = false;
		int i = getCp();

		/*
		//0 <= hp <= 15であるかをチェック
		if (isCheakParameter(hp) == false) {
			System.out.println("hpの値が不適切です。");
			isError = true;
		}
		//0 <= atk <= 15であるかをチェック
		if (isCheakParameter(atk) == false) {
			System.out.println("atkの値が不適切です。");
			isError = true;
		}
		//0 <= def <= 15であるかをチェック
		if (isCheakParameter(def) == false) {
			System.out.println("defの値が不適切です。");
			isError = true;
		}

		if (isError == false) {
			//個体値計算
			double value = (hp + atk + def) / 45.0 * 100;
			//個体値計算結果を出力
			System.out.println("個体値は" + value + "% です。");*/

		super.individualValue(hp, atk, def);

		if (isError == false) {
			//atkを参照して値ごとにメッセージを出力
			if (atk >= 10) {
				System.out.println("atkの値が高めです。");
				System.out.println("atkの値が低い個体を探しましょう。");
			} else if (atk >= 5) {
				System.out.println("atkの値は少し高めです。");
			} else {
				System.out.println("atkの個体値は低めです。");
				System.out.println("この個体を育成しましょう。");
			}
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
