package practice;

public class practice_01 {

	//オーバーロードの確認
	//以下の場合、同名称のメソッドでも作成ができる
		//引数の数が異なる
		//引数の組み合わせ(変数の型、順番)が異なる

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("正三角形  の面積: " + triangleArea(50));
		System.out.println("直角三角形の面積: " + triangleArea(50, 20));
		System.out.println("三角形    の面積: " + triangleArea(50, 20, 30));
	}

	/*
	 * 正三角形の面積計算
	 *
	 * double a 正三角形一辺の長さ
	 */
	public static double triangleArea (double a) {
		double area = Math.sqrt(3.0) * a / 4;
		return area;
	}

	/*
	 * 直角三角形の面積計算
	 *
	 * double a 直角三角形の斜辺以外の長辺
	 * double b 直角三角形の斜辺以外の短辺
	 */
	public static double triangleArea (double a, double b) {
		double area = a * b / 2;
		return area;
	}

	/*
	 * 三角形の面積計算
	 *
	 * double a 三角形の一辺の長さ
	 * double b 三角形の一辺の長さ
	 * double c 三角形の一辺の長さ
	 */
	public static double triangleArea (double a, double b, double c) {
		double area = (a + b + c) / 2;
		return area;
	}
}
