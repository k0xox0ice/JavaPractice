package practice;

public class StrongBox<E> {

	private E item;
	private KeyType key;
	private int count = 0;

	public StrongBox(KeyType key) {
		this.key = key;
	}

	/**
	 * インスタンスを1つ格納する
	 */
	public void put(E i) {
		this.item = i;
	}

	/**
	 * put()で格納したインスタンスを取り出す
	 * @return
	 */
	public E get() {
		this.count++;

		switch (key) {
		case PADLOCK:
			if (count < 1024) {
				return null;
			}
			break;
		case BUTTON:
			if (count < 10000) {
				return null;
			}
			break;
		case DIAL:
			if (count < 30000) {
				return null;
			}
			break;
		case FINGER:
			if (count < 1000000) {
				return null;
			}
			break;
		}
		return item;
	}

	public enum KeyType {
		PADLOCK, BUTTON, DIAL, FINGER;
	}
}
