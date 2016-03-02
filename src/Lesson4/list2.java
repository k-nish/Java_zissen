package Lesson4;

import java.util.*;

class Hero {
	public String name;

}

public class list2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Hero> list = new ArrayList<Hero>();
		Hero h1 = new Hero();
		h1.name = "ミナト";
		list.add(h1);
		System.out.println("要素数＝" + list.size());
		h1 = new Hero();
		h1.name = "ミナト";
		list.remove(h1);
		System.out.println("要素数＝" + list.size());
	}

}
