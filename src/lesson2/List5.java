package lesson2;

import java.time.*;
import java.time.format.*;

public class List5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate d1 = LocalDate.of(2012, 1, 1);
		LocalDate d2 = LocalDate.of(2012, 1, 4);

		// ３日間を表すPeriodを２通りの方法で生成
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1, d2);

		// d２のさらに3日後を計算する
		LocalDate d3 = d2.plus(p2);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(d3);
	}

}
