package sec02.exam04;

import java.io.Serializable;

public class Board implements Serializable {	// 직렬화가 가능한 클래스
	
	// 필드
	// private -> int bno / String title / String content
	private int bno;
	private String title;
	private String content;
	
	// 생성자
	public Board(int bno, String title, String content) {
		this.bno = bno;
		this.title = title;
		this.content = content;
	}
	
	// Getter / Setter
	public int getBno() {
		return bno;
	}
	
	public void setBno(int bno) {
		this.bno = bno;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
}
