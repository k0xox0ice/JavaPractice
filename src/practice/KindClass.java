package practice;

public class KindClass {

	//ローカルクラス
	int count;

	void outerMethod() {
		//ここでローカルクラスを定義する
		class LocalClass {

			void innerMethod() {
				++count;
				System.out.println(count + "回目のinnerMethodです");
			}
		}
		//ローカルクラスは定義したメソッド内のみ有効
		//ローカルクラスを定義されたouterMethodで実行する
		LocalClass inner1 = new LocalClass();
		inner1.innerMethod();

	}
	//ローカルクラスは定義されたメソッド外では動かない
	//LocalClass inner2 = new LocalClass();   //エラー

}
