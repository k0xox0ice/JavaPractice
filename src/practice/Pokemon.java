package practice;

public class Pokemon {

	//ポケモンの種類の判別
	private int kind;

	//色違いの判別
	private int shiny;

	//捕獲時に使用したボールの判別
	private int ball;

	//捕獲したポケモンの個体名
	private String name;

	//捕獲時にいた国
	private static String getInCountry = "日本";

	/**
	 * ゲットしたポケモンのパラメータ設定するコンストラクタ
	 * GoPLUSで捕獲した場合はメッセージでGoPLUSを表示する
	 *
	 * @param type ポケモンの種類の判別(1: 通常,2: 伝説,3: 幻)
	 * @param shiny 色違いの判別(1: 通常色,2: 色違い)
	 * @param ball 捕獲時に使用したボールの判別
	 *    (1: モンスターボール,2: スーパーボール,3: ハイパーボール,4: プレミアボール)
	 * @param name 捕獲したポケモンの個体名
	 */
	public Pokemon(int kind, int shiny, int ball, String name) {
		this.kind = kind;
		this.shiny = shiny;
		this.ball = ball;
		this.name = name;
		System.out.println();
		if (kind == 1 && ball == 1) {
			System.out.println("*** GoPLUSでゲットしたポケモン情報 ***");
		} else {
			System.out.println("*** ゲットしたポケモン情報 ***");
		}
		System.out.println("ポケモン名：" + name);
		System.out.println("ゲットした場所：" + getInCountry);
	}

	/**
	 * 通常色のポケモンをゲットした場合のパラメータ設定するコンストラクタ
	 *    (shiny = 1、通常色ポケモンに指定)
	 *
	 * @param type ポケモンの種類の判別(1: 通常,2: 伝説,3: 幻)
	 * @param ball 捕獲時に使用したボールの判別
	 *    (1: モンスターボール,2: スーパーボール,3: ハイパーボール,4: プレミアボール)
	 * @param name 捕獲したポケモンの個体名
	 */
	public Pokemon(int kind, int ball, String name) {
		this(kind, 1, ball, name);
	}

	/**
	 * GoPLUSで捕獲したポケモンのパラメータ設定するコンストラクタ
	 *    (type = 1、通常のポケモン
	 *     ball = 1、モンスターボールで捕獲に指定)
	 *
	 * @param shiny(1: 通常色,2: 色違い)
	 * @param name 捕獲したポケモンの個体名
	 */
	public Pokemon(int shiny, String name) {
		this(1, shiny, 1, name);
	}

	/**
	 * 捕獲ポケモンの種類を表示(通常、伝説、幻)
	 * 捕獲ポケモンの色違いの有無を表示
	 *
	 * @param kind ポケモンの種類の判別(1: 通常,2: 伝説,3: 幻)
	 * @param shiny 色違いの判別(1: 通常色,2: 色違い)
	 */
	public void pokemonKind() {
		//ポケモンの種類を表示
		if (kind == 1) {
			System.out.print("通常のポケモン");
		} else if (kind == 2) {
			System.out.print("伝説のポケモン");
		} else if (kind == 3) {
			System.out.print("幻のポケモン");
		}

		//色違いの有無を表示
		if (shiny == 1) {
			System.out.println(" & 通常色");
		} else {
			System.out.println(" & 色違い");
		}
	}

	/**
	 * 個体値の各パラメータが正常な値であるかを確認
	 * 0 <= && >= 15であれば正常
	 * それ以外ならば不適切であると判断
	 *
	 * @param value
	 * @return true (0 <= parameter && parameter <= 15) / false 左記以外
	 */
	private boolean isCheakParameter(int parameter) {
		if (0 <= parameter && parameter <= 15) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 個体値を%表記で表示する
	 * 各パラメータが範囲外の場合は、エラーメッセージを表示する
	 *
	 * @param hp HPの個体値(範囲指定: 0 <= hp <= 15)
	 * @param atk 攻撃の個体値(範囲指定: 0 <= atk <= 15)
	 * @param def 防御の個体値(範囲指定: 0 <= def <= 15)
	 */
	public void individualValue(int hp, int atk, int def) {

		boolean isError = false;

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
			double value = (hp + atk + def) / 45.0 * 100;
			System.out.println("個体値は" + value + "% です。");
		}
	}

	/**
	 * 捕獲時に使用したボールを表示
	 */
	public void ballType() {
		String message = "で捕獲しました。";

		if (ball == 1) {
			System.out.println("モンスターボール" + message);
		} else if (ball == 2) {
			System.out.println("スーパーボール" + message);
		} else if (ball == 3) {
			System.out.println("ハイパーボール" + message);
		} else if (ball == 4) {
			System.out.println("プレミアボール" + message);
		}
	}

	/**
	 * ポケモンのタイプを表示する
	 *
	 * @param name タイプを表示させたいポケモンの名前
	 */
	public void pokemonType (String name) {
		//ポケモンのタイプを配列に格納する
		String[] pokemonType = new String[18];
		pokemonType[0]  = "ノーマル";
		pokemonType[1]  = "ほのお";
		pokemonType[2]  = "みず";
		pokemonType[3]  = "でんき";
		pokemonType[4]  = "くさ";
		pokemonType[5]  = "こおり";
		pokemonType[6]  = "エスパー";
		pokemonType[7]  = "かくとう";
		pokemonType[8]  = "どく";
		pokemonType[9]  = "じめん";
		pokemonType[10] = "ひこう";
		pokemonType[11] = "むし";
		pokemonType[12] = "いわ";
		pokemonType[13] = "ゴースト";
		pokemonType[14] = "ドラゴン";
		pokemonType[15] = "あく";
		pokemonType[16] = "はがね";
		pokemonType[17] = "フェアリー";

		String message = " タイプです。";

		if (name == "ピカチュウ") {
			System.out.println(pokemonType[3] + message);
		} else if (name == "ミュウツー") {
			System.out.println(pokemonType[6] + message);
		} else if (name == "ラルトス") {
			System.out.println(pokemonType[6] + "&" + pokemonType[17] + message);
		}

	}

	/**
	 * ゲッター
	 * kindの値を取得
	 *
	 * @return kind ポケモンの種類の判別(1: 通常,2: 伝説,3: 幻)
	 */
	public int getKind() {
		return kind;
	}

	/**
	 * セッター
	 * kindの値を変更する
	 *
	 * @param kind ポケモンの種類の判別(1: 通常,2: 伝説,3: 幻)
	 */
	public void setKind(int kind) {
		this.kind = kind;
	}

	/**
	 * ゲッター
	 * returnの値を取得
	 *
	 * @return shiny 色違いの判別(1: 通常色,2: 色違い)
	 */
	public int getShiny() {
		return shiny;
	}

	/**
	 * セッター
	 * shinyの値を変更する
	 *
	 * @param shiny 色違いの判別(1: 通常色,2: 色違い)
	 */
	public void setShiny(int shiny) {
		this.shiny = shiny;
	}

	/**
	 * ゲッター
	 * ballの値を取得
	 *
	 * @return ball 捕獲時に使用したボールの判別
	 *    (1: モンスターボール,2: スーパーボール,3: ハイパーボール,4: プレミアボール)
	 */
	public int getBall() {
		return ball;
	}

	/**
	 * セッター
	 * ballの値を変更する
	 *
	 * @param ball 捕獲時に使用したボールの判別
	 *    (1: モンスターボール,2: スーパーボール,3: ハイパーボール,4: プレミアボール)
	 */
	public void setBall(int ball) {
		this.ball = ball;
	}

	/**
	 * ゲッター
	 * nameの値を取得
	 *
	 * @return name 捕獲したポケモンの個体名
	 */
	public String getName() {
		return name;
	}

	/**
	 * セッター
	 * nameの値を変更する
	 *
	 * @param name 捕獲したポケモンの個体名
	 */
	public void setName(String name) {
		this.name = name;
	}

}
