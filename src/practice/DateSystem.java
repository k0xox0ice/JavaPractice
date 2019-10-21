package practice;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateSystem {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Date型のインスタンスを作成(コンストラクタに値を代入しない)
		Date now = new Date();

		//インスタンスの情報を出力する
		//コンストラクタの初期値を設定しないと現在時刻が表示される
		System.out.println(now);
		System.out.println("***************************");
		//getTimeメソッドは1970/1/1からの経過時間をミリ秒で表示する
		System.out.println(now.getTime());

		//java.timeパッケージの利用
		System.out.println("java.timeパッケージの利用");

		//Instantクラスで現在時刻を取得
		Instant ins = Instant.now();
		System.out.println("現在時刻(Instant)：" + ins);

		//ZonedDateTimeで時刻を取得
		//現在時刻を取得
		ZonedDateTime zone1 = ZonedDateTime.now();
		System.out.println("現在時刻(ZonedDateTime)：" + zone1);
		//日時を指定して取得
		ZonedDateTime zone2 = ZonedDateTime.of(2019, 10, 22, 12, 15, 30, 45, ZoneId.of("Asia/Tokyo"));
		System.out.println("指定時刻(ZonedDateTime)：" + zone2);

		//LocalDateTimeで時刻を取得
		//現在時刻を取得
		LocalDateTime local1 = LocalDateTime.now();
		System.out.println("現在時刻(LocalDateTime)：" + local1);
		//日時を指定して取得
		LocalDateTime local2 = LocalDateTime.of(2019, 10, 22, 12, 30);
		System.out.println("指定時刻(LocalDateTime)：" + local2);

		LocalDateTime local3 = LocalDateTime.ofInstant(ins, ZoneId.of("Asia/Tokyo"));
		System.out.println(local3);

		//日付パターンを指定
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localParse = LocalDate.parse("2019/10/07", dateFormat);
		System.out.println("pase()を利用");
		System.out.println(localParse);

		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime localParse2 = LocalDateTime.parse("2019/10/08 12:35:45", dateTimeFormat);
		System.out.println(localParse2);

		//format()の利用
		String localFormat = local2.format(dateTimeFormat);
		System.out.println("format()を利用");
		System.out.println(localFormat);

		//get()の利用
		int getYear = zone1.getYear();
		System.out.println("get()を利用");
		System.out.println(getYear);

		//plus()の利用
		System.out.println("plus()の利用");
		System.out.print("変更前の日時：");
		System.out.println(localParse2);
		System.out.println("日付を先送りする");
		//LocalDateTime localPlus = localParse2.plusYears(14);
		localParse2 = localParse2.plusYears(14);
		System.out.println(localParse2);

		//isAfter()の利用
		System.out.println("isAfter()の利用");
		if (local1.isAfter(localParse2) == true) {
			System.out.println("引数よりも未来の日付");
		} else {
			System.out.println("引数よりも過去の日付");
		}

		//Periodクラスの利用
		//LocalDateインスタンスの作成
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2020, 05, 26);

		System.out.println("date1：" + date1);
		System.out.println("date2：" + date2);

		//ofDaysとbetweenを取得
		Period period1 = Period.ofDays(3);
		Period period2 = Period.ofMonths(5);
		System.out.println("period1：" + period1);
		System.out.println("period2：" + period2);
		Period period3 = Period.between(date1, date2);
		System.out.println("period3：" + period3);

		//date1の月と日付を進める
		date1 = date1.plus(period1);
		date1 = date1.plus(period2);
		System.out.println("ofDays、ofMonthsで進行後のdate1：" + date1);

		//date1の日付をdate2の差分だけ進める
		date1 = date1.now();
		System.out.println("date1：" + date1);
		date1 = date1.plus(period3);
		System.out.println("betweenで進行後のdate1：" + date1);






	}

}
