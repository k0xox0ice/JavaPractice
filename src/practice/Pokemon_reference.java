package practice;

public class Pokemon_reference {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//アプリ画面でゲットしたピカチュウの情報
		Pokemon pikatyu = new Pokemon(1, 2, 3, "ピカチュウ");
		pikatyu.pokemonKind();
		pikatyu.ballType();
		pikatyu.individualValue(3, 5, 70);
		System.out.println();
		System.out.println("取得した名前: " + pikatyu.getName());
		System.out.println("getType: " + pikatyu.getKind());
		System.out.println("getBall: " + pikatyu.getBall());

		//ピカチュウの参照をコピーする
		Pokemon raityu = pikatyu;
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("コピーしたピカチュウの参照データの確認");
		System.out.println("取得した名前: " + raityu.getName());
		System.out.println("getType(変更を加えない): " + raityu.getKind());
		System.out.println("getBall: " + raityu.getBall());

		//上記の参照の内容を変更する
		raityu.setName("ライチュウ");
		raityu.setBall(4);
		System.out.println("-------------------------");
		System.out.println("コピーした参照内容を変更する");
		System.out.println("取得した名前: " + raityu.getName());
		System.out.println("getType(変更を加えない): " + raityu.getKind());
		System.out.println("getBall: " + raityu.getBall());

		//ピカチュウの参照の内容を確認する
		System.out.println("-------------------------");
		System.out.println("コピー元であるピカチュウの参照内容を確認");
		System.out.println("取得した名前: " + pikatyu.getName());
		System.out.println("getType(変更を加えない): " + pikatyu.getKind());
		System.out.println("getBall: " + pikatyu.getBall());


		//オブジェクト生成
		Pokemon rukario = new Pokemon(1, 1, 1, "ルカリオ");
		rukario.pokemonKind();

		//nullを用いて初期化
		//エラーが発生することを確認すること
		System.out.println("------------------------");
		rukario = null;
		rukario.pokemonKind();


	}

}
