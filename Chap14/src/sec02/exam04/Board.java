package sec02.exam04;

import java.io.Serializable;

public class Board implements Serializable {	// ����ȭ�� ������ Ŭ����
	
	// �ʵ�
	// private -> int bno / String title / String content
	private int bno;
	private String title;
	private String content;
	
	// ������
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
