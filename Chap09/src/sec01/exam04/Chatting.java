package sec01.exam04;

public class Chatting {
	// ������ ���� ��ġ + ���� ã��
	void startChat(String chatId) {
		String nickName = null;
//		nickName = chatId;	// error
		// ���� : nickName = final�Ӽ��̶� �����Ұ�
		// �����ڵ� : String nickName = chatId;

		class Chat {
			public void start() {
				while (true) {
					String inputData = "�ȳ��ϼ���.";
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
