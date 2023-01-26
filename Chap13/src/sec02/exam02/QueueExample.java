package sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		// -> Message Ÿ���� �����ϴ� Queue ���� // �������� messageQueue
		// Queue ����
		// -> Queue �������̽��� ������ü�� LinkedList �÷����� ����
		Queue<Message> messageQueue = new LinkedList<>();

		// -> ������ messageQueue�� ��ü�� �߰� --> offer()
		// * Message ��ü ���� �Ű���
		// - sendMail, ȫ�浿
		// - sendSms, �ſ��
		// - sendKakaotalk, �ڱ浿
		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendSms", "�ſ��"));
		messageQueue.offer(new Message("sendKakaotalk", "�ڱ浿"));

		// -> �Ʒ��� ���� �ֿܼ� ��� (�ݺ����� isEmpty �޼ҵ带 Ȱ��)
		// - isEmpty( ) => ����ִٸ� true �� �����ϴ� �޼ҵ�
		// <console>
		// ȫ�浿�Կ��� ������ �����ϴ�.
		// �ſ�ǴԿ��� SMS�� �����ϴ�.
		// �ڱ浿�Կ��� īī���带 �����ϴ�.

		while (!messageQueue.isEmpty()) {
			// poll() : ��ü �ϳ��� ������ -> ť���� ��ü�� ����
			Message m = messageQueue.poll();
			String name = m.to;
			String command = m.command;
			switch (command) {
			case "sendMail":
				System.out.println(name + "�Կ��� ���ڸ� �����ϴ�.");
				break;
			case "sendSms":
				System.out.println(name + "�Կ��� SMS�� �����ϴ�.");
				break;
			case "sendKakaotalk":
				System.out.println(name + "�Կ��� īī������ �����ϴ�.");
				break;
			}

//			switch(command.charAt(4)) {
//			case 'M':
//				System.out.println(name + "�Կ��� ���ڸ� �����ϴ�.");
//				break;
//			case 'S':
//				System.out.println(name + "�Կ��� SMS�� �����ϴ�.");
//				break;
//			case 'K':
//				System.out.println(name + "�Կ��� īī������ �����ϴ�.");
//				break;
//			}

		}

	}

}
