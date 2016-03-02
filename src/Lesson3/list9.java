package Lesson3;

import java.util.*;

class Hero {
	public String name;
}

public class list9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero();
		h.name = "ミナト";
		List<Hero> list = new ArrayList<>();
		list.add(h);
		h.name = "スガワラ";
		System.out.println(list.get(0).name);
	}

}
