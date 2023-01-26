package exam02;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {

		// * StringTokenizer Ŭ����
		// : ��ū�� �и��� ���ڿ� ����
		// : �ϳ��� ���ڿ��� �������� ��ū���� �и����ִ� Ŭ����

		// * ������
		// 1. StringTokenizer(���ڿ�);
		// : ���⸦ �������� ���ڿ��� �и�
		// 2. StringTokenizer(���ڿ�, ������);
		// : �����ڸ� �������� ���ڿ��� �и�
		// 3. StringTokenizer(���ڿ�, ������, true/false);
		// : �����ڸ� �������� ���ڿ��� �и�
		// + �����ڸ� ��ū�� �߰��� ������ (true)
		// �߰� �Ƚ�ų��(false, default��)

		// * �޼ҵ�
		// 1. hasMoreTokens() : �����ִ� ��ū�� ������ true ����
		// ������ false ����
		// 2. nextToken() : ���� ��ū�� ��ȯ�ϴ� �޼ҵ�
		// 3. countTokens() : �� ��ū�� ������ ����

		String str1 = "���ѹα� �̱� ����";
		String str2 = "����*�α�*�̱�*����";
		String str3 = "���ѹα�*�̱�*����";

//	StringTokenizer st = new StringTokenizer(str1);				// ������1. ���⸦ �������� ���ڿ� �и�
//	StringTokenizer st = new StringTokenizer(str2, "*");		// ������2. �����ڸ� �������� ���ڿ� �и�
		StringTokenizer st = new StringTokenizer(str3, "*", true); // ������3. �����ڸ� �������� ���ڿ� �и�, ��ū�� ��

		System.out.println("��ū�� ���� : " + st.countTokens());
		String token = "";
		while (st.hasMoreTokens()) { // ��ū�� ����������
			token = st.nextToken();
			System.out.println(token);
		}

	}

}
