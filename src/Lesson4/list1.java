package Lesson4;

public class list1 {
	String accountNo;// 口座番号

	public boolean equals(Object o) {
		if (o == this)
			return true;

		if (o == null)
			return false;

		if (!(o instanceof list1))
			return false;
		list1 r = (list1) o;
		if (!this.accountNo.trim().equals(r.accountNo.trim())) {
			return false;
		}
		return false;
	}
}
