package sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		// -> Message 타입을 저장하는 Queue 생성 // 변수명은 messageQueue
		// Queue 생성
		// -> Queue 인터페이스의 구현객체로 LinkedList 컬렉션을 생성
		Queue<Message> messageQueue = new LinkedList<>();

		// -> 만들어둔 messageQueue에 객체를 추가 --> offer()
		// * Message 객체 생성 매개값
		// - sendMail, 홍길동
		// - sendSms, 신용권
		// - sendKakaotalk, 박길동
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSms", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "박길동"));

		// -> 아래와 같이 콘솔에 출력 (반복문과 isEmpty 메소드를 활용)
		// - isEmpty( ) => 비어있다면 true 를 리턴하는 메소드
		// <console>
		// 홍길동님에게 메일을 보냅니다.
		// 신용권님에게 SMS를 보냅니다.
		// 박길동님에게 카카오톡를 보냅니다.

		while (!messageQueue.isEmpty()) {
			// poll() : 객체 하나를 가져옴 -> 큐에서 객체를 제거
			Message m = messageQueue.poll();
			String name = m.to;
			String command = m.command;
			switch (command) {
			case "sendMail":
				System.out.println(name + "님에게 문자를 보냅니다.");
				break;
			case "sendSms":
				System.out.println(name + "님에게 SMS을 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(name + "님에게 카카오톡을 보냅니다.");
				break;
			}

//			switch(command.charAt(4)) {
//			case 'M':
//				System.out.println(name + "님에게 문자를 보냅니다.");
//				break;
//			case 'S':
//				System.out.println(name + "님에게 SMS을 보냅니다.");
//				break;
//			case 'K':
//				System.out.println(name + "님에게 카카오톡을 보냅니다.");
//				break;
//			}

		}

	}

}
