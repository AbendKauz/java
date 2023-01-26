package sec01.exam04;

public class Chatting {
	// 컴파일 에러 위치 + 원인 찾기
	void startChat(String chatId) {
		String nickName = null;
//		nickName = chatId;	// error
		// 원인 : nickName = final속성이라 수정불가
		// 수정코드 : String nickName = chatId;

		class Chat {
			public void start() {
				while (true) {
					String inputData = "안녕하세요.";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}

			void sendMessage(String message) {

			}
		}
		Chat chat = new Chat();
		chat.start();
	}
}
