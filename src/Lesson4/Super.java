package Lesson4;

public class Super implements Cloneable {
	String name;
	int hp;
	char sword;

	public Super clone() {
		Super result = new Super();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword;
		return result;
	}

}
