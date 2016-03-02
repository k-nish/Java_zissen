package Kadai2;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

import java.time.*;
import java.time.format.*;

public class kadai2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Date now = new Date();
		// 現在の日時をDate型で取得
		Calendar c = Calendar.getInstance();
		// Calendar型のインスタンスを生成
		c.setTime(now);
		// Calendar型のインスタンスに現在時刻を代入
		int day = c.get(Calendar.DAY_OF_MONTH);
		// 日をint型dayに代入
		int Day = day + 100;
		// 100日後の数字をint型Dayに代入
		c.set(Calendar.DAY_OF_MONTH, Day);
		// 100日後の日付けをインスタンスに代入
		Date d = c.getTime();
		// Date型の変数に100日後の日付けを代入

		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		String s = f.format(d);

		System.out.println(s);

		// Java8のAPIを利用
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		LocalDate d2 = LocalDate.now();

		d2 = d2.plusDays(100);
		String s2 = d2.format(f2);
		System.out.println(s2);
	}

}
