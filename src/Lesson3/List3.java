package Lesson3;

import java.util.LinkedList;
import java.util.Iterator;

public class List3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LinkedList<String> names = new LinkedList<>();
		names.add("湊");
		names.add("朝香");
		names.add("菅原");
		Iterator<String> it = names.iterator();

		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
	}

}