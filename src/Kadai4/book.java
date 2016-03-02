package Kadai4;

import java.util.*;

//bookクラスの生成

public class book implements Comparable<book>, Cloneable {
	private String title;
	private Date publishDate;
	private String comment;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int hashCode() {
		int result = 37;
		result = result * 17 + title.hashCode();
		result = result * 17 + publishDate.hashCode();
		result = result * 17 + comment.hashCode();
		return result;
	}

	public int compareTo(book b) {

		if (getPublishDate().getTime() < b.getPublishDate().getTime()) {
			return 1;
		}
		if (getPublishDate().getTime() > b.getPublishDate().getTime()) {
			return -1;

		}
		return 0;

	}

	public book clone() {
		book result = new book();
		result.setTitle(clone().getTitle());
		result.setPublishDate(clone().getPublishDate());
		result.setComment(clone().getComment());
		return result;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof book))
			return false;
		if (o instanceof book) {
			book B = (book) o;
			if (B.getTitle() == this.getTitle()
					&& B.getPublishDate() == this.getPublishDate())
				return true;

		}
		return false;
	}
}
