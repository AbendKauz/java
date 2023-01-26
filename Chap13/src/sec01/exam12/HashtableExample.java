package sec01.exam12;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {

		// * HashMap�� Hashtable�� ������
		// - Hashtable : ����ȭ�� �޼ҵ�� �����Ǿ��ֱ� ������ ��Ƽ������ ȯ�濡��
		// �����ϰ� ��ü�� �߰�, ������ ������
		// - HashMap : �̱۽����� ȯ���� �� ����ϴ� ���� ����
		// ��Ƽ������ ȯ�濡���� ������� �ʾƾ���

		// * Hashtable ����
		// Map<ŰŸ��, ��Ÿ��> ������ = new Hashtable<>();

		// -> Ű�� String Ÿ��(���̵� ����) , ���� String Ÿ��(��й�ȣ�� ����) �� �����ϴ� Hashtable ����
		// // �������� map

		Map<String, String> map = new Hashtable<>();

		// -> map �� ��ü �߰��ϱ�
		// key : spring value : 12
		// key : summer value : 123
		// key : fall value : 1234
		// key : winter value : 12345

		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		// -> Ű����� ���̵�� ��й�ȣ�� �Է� �޾Ƽ�, Hashtable �� ����Ǿ� �ִ� Ű, ���� ��
		// �ܼ� ����ó�� ��� �ϴ� �ڵ带 �ۼ��Ͻÿ�

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.print("���̵� �Է� >> ");
			String id = sc.next();
			System.out.print("��й�ȣ �Է� >> ");
			String pw = sc.next();
			System.out.println();

			// 1.
			// containsKey(Ű) : �־��� Ű�� ����Ǿ� �ִ��� ���θ� Ȯ��
			// -> ����Ǿ������� true�� ����
			if (map.containsKey(id)) { // id�� ��
				if (map.get(id).equals(pw)) { // pw�� ��
//				if(map.containsValue(pw)) {	// pw�� ��
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			} else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}

			// 2.
			boolean chk = false;
			boolean chkPw = false;
			for (Map.Entry<String, String> entry : map.entrySet()) {
				String key = entry.getKey();
				String val = entry.getValue();
				if (key.equals(id)) {
					if (val.equals(pw)) {
						chk = true;
						break;
					} else {
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
						chkPw = true;
						break;
					}
				}
			}
			if (chk) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				break;
			}
			if (!chkPw) {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
		}
	}
}
