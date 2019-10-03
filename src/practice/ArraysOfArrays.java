package practice;

public class ArraysOfArrays {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//配列の配列を宣言
		int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };

		//numberの要素をつずつ出力する
		for (int i = 0; i < numbers.length ; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}

		int[][] arrays = new int[1][];
		arrays[0] = new int[] {1, 2, 3};
		//arrays[1] = new int[] {4, 5};
		//arrays[2] = new int[] {6, 7};
		System.out.println(arrays[0][2]);



	}

}
