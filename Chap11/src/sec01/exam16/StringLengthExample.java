package sec01.exam16;

public class StringLengthExample {

	public static void main(String[] args) {

		String ssn = "7306241230123";
		int length = ssn.length();
		// length�� length() ȥ�� ����
		if (length == 13) {
			System.out.println("�ֹι�ȣ �ڸ��� ����");
		} else {
			System.out.println("�ֹι�ȣ �ڸ��� Ʋ��");
		}

	}

}
