package sec01.exam03;

public class Board {
	// -> �ʵ� :
	// subject : StringŸ�� (������ ������ �ʵ�)
	// content : StringŸ�� (������ ������ �ʵ�)
	// writer : StringŸ�� (�۾��̸� ������ �ʵ�)
	// -> ������ (����, ����, �۾��� �Ű����� ������ �Ű����� 3��)
	// - �޾ƿ� �Ű������� �ʵ尪 ����

	String subject;
	String content;
	String writer;

	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

}
