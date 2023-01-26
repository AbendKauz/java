package sec01.exam03;

public class Board {
	// -> 필드 :
	// subject : String타입 (제목을 저장할 필드)
	// content : String타입 (내용을 저장할 필드)
	// writer : String타입 (글쓴이를 저장할 필드)
	// -> 생성자 (제목, 내용, 글쓴이 매개값을 가져올 매개변수 3개)
	// - 받아온 매개값으로 필드값 변경

	String subject;
	String content;
	String writer;

	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

}
