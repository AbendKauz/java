package sec02.exam02;

public class Message {
	// -> �ʵ�
	// command : ���������� public / String Ÿ�� / (� Message �� ���������� ���� )
	// -> ex) Message �� ���� - mail, SMS, īī���� ��
	// to : ���������� public / String Ÿ�� / ( Message �� �������� ���� ������ ���� )

	public String command;
	public String to;

	// -> ������ (command, to �Ű����� ����)
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}

}
