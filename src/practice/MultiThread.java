package practice;

public class MultiThread extends Thread{

	private int i = 0;

	/**
	 * オーバーライド
	 *
	 * マルチスレッドの動きを確認する
	 * 0から4までの数字を順番に表示する
	 */
	public void run() {
		try {
			Thread.sleep(2000);
			while(i < 10) {
				Thread.sleep(500);
				System.out.println("マルチスレッド" + (i + 1) + "回目の起動");
				i++;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
