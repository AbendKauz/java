package sec04;

public class D0629_02_Ű�ڵ�ݺ� {

	public static void main(String[] args) throws Exception {

		int keyCode;

		// while �ݺ��� 1
//		while (true) {	// ��� �ݺ��� �̷������ ������ ������� ����
		// terminate(������ư) ������ ������ ������
//			keyCode = System.in.read();
//			System.out.println("Ű�ڵ� �� : " + keyCode);
//		}

		// �ݺ���
//		while (true) {
//			System.out.println("����");
//		}

		// while �ݺ��� 2
		// ���� �ݺ��� �ϴµ�, �̶� q�� �ԷµǸ� �ݺ��� ���� (��������)
		while (true) {
			keyCode = System.in.read();
			System.out.println("Ű�ڵ� �� : " + keyCode);

			// ����� keyCode ���� q�� Ű�ڵ�(113) ���ٸ�
			// �ݺ��� while�� ����
			if (keyCode == 113) { // ����� keyCode ���� q�� Ű�ڵ�(113) ���ٸ�
				break; // �ݺ��� ����
			}
		}
		System.out.println("�ݺ��� ����");

	}

}
