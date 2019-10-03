package practice;

public class Static_confirmation {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		divition();
	}

	public static void divition() {
		// TODO 自動生成されたメソッド・スタブ
		//addition(1, 4);
	}

	public void addition(int a, int b) {
		System.out.println("mainメソッド内、staticナシ");
		System.out.println(a + b);

		Static_confirmation.divition();
	}

}
