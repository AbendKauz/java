package sec01.exam06;

public class ExitExample {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				// i�� 5�� �Ǹ�
				System.exit(0);
				// �Ϲ������� ���������� ��� �Ű����� 0���� ��
				// break;
			}
		}
		System.out.println("������ �ڵ�");
		// ��������ǹǷ� ��¹��� ��µ��� ����
		// �� ����ϰ� �ʹٸ� exit(0)��� break ����ؾ���
	}

}
