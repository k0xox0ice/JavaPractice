package practice;

import java.util.Date;

public class Practice4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("練習問題4-1");

	}

}

class Book implements Comparable<Book>, Cloneable {
	private String title;
	private Date publishDate;
	private String comment;

	/**
	 * オーバーライド
	 * equals()を定義する
	 */
	//①の解答
	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if ((o instanceof Book) == false) {
			return false;
		}
		Book b = (Book) o;
		if (b.title.equals(this.title) == true) {
			return true;
		}
		if (b.publishDate.equals(this.publishDate) == true) {
			return true;
		}
		return false;
	}

	/**
	 * オーバーライド
	 * hashCode()をオーバーライドする
	 */
	@Override
	public int hashCode() {
		int result = 3;
		result = result * 31 + title.hashCode();
		result = result * 31 + comment.hashCode();
		result = result * 31 + publishDate.hashCode();
		return result;
	}

	/**
	 * オーバーライド
	 * compareTo()をオーバーライドする
	 */
	//②の解答
	@Override
	public int 	compareTo(Book book) {
		return book.publishDate.compareTo(this.publishDate);
	}

	/**
	 * clone()の定義
	 */
	//③の解答
	public Book clone() {
		Book copy = new Book();
		copy.title = this.title;
		copy.publishDate = (Date)this.publishDate.clone();
		copy.comment = this.comment;
		return copy;
	}

}
