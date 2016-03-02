package Kadai3;

import java.util.*;

public class kadai1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		List<Hero> heros = new ArrayList<>();
		heros.add(h1);
		heros.add(h2);
		for (Hero h : heros) {
			System.out.println(h.getName());
		}

	}

}
