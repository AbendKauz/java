package sec01;

public class D0706_02_switch��1 {

	public static void main(String[] args) {

		// switch ��
		// -> if���� ���������� ���� ���
		// -> if(���ǽ�) // switch(����) -> ������ � ���� �������� ���� ���๮�� ���õ�

		// 1 ~ 6������ ���� �ϳ� �̾Ƽ� num�� ���� ��
		// switch�� ��� -> ? ���� ���Խ��ϴ�.

		int num = (int) (Math.random() * 6) + 1;

		// switch���� case�� ������ break�� �־�� ��
		// ���� �� ��� ������
		// ex) 3�� ���� ��� -> 3, 4, 5, default �� �����
		switch (num) {
		case 1:
			System.out.println(num + "���� ���Խ��ϴ�.");
			break;
		case 2:
			System.out.println(num + "���� ���Խ��ϴ�.");
			break;
		case 3:
			System.out.println(num + "���� ���Խ��ϴ�.");
			break;
		case 4:
			System.out.println(num + "���� ���Խ��ϴ�.");
			break;
		case 5:
			System.out.println(num + "���� ���Խ��ϴ�.");
			break;
		default:
			System.out.println(num + "���� ���Խ��ϴ�.");
		}

	}

}
