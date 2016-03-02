package Kadai3;

import java.util.*;

public class kadai2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		Map<Hero, Integer> Heros = new HashMap<>();
		Heros.put(h1, 3);
		Heros.put(h2, 7);
		for (Hero h : Heros.keySet()) {
			String H = h.getName();
			int enemy = Heros.get(h);
			System.out.println(H + "が倒した敵" + enemy);
			System.out.println(h.getName()+"が倒した敵"+enemy);
		}
	}

}
