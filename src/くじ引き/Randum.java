package くじ引き;

import java.util.Random;

public class Randum {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

        int count = 0;
        int r = 0;
        int listNumbers[] = {4, 4, 4};

		while (count < 3) {

			r = Random();

			while (r == listNumbers[0] || r == listNumbers[1] || r == listNumbers[2]) {
				r = Random();
			}

			listNumbers[count] = r;

			if (r == 0) {
				System.out.println("栗原");
			} else if (r == 1) {
				System.out.println("上田");
			} else {
				System.out.println("大野");
			}

			count++;
		}
	}

	public static int Random() {
		Random rand = new Random();
        int randomNumber = rand.nextInt(3);
		return randomNumber;
	}

}
