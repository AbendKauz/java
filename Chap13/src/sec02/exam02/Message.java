package sec02.exam02;

public class Message {
	// -> 필드
	// command : 접근제한자 public / String 타입 / (어떤 Message 를 보낼것인지 저장 )
	// -> ex) Message 의 종류 - mail, SMS, 카카오톡 등
	// to : 접근제한자 public / String 타입 / ( Message 를 누구에게 보낼 것인지 저장 )

	public String command;
	public String to;

	// -> 생성자 (command, to 매개변수 선언)
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}

}
