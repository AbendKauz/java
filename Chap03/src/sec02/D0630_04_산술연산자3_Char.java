package sec02;

public class D0630_04_���������3_Char {

	public static void main(String[] args) {

		// char Ÿ���� �������

//		char c1 = 'A' + 1;
//		System.out.println(c1);
		char c2 = 'A';
//		char c3 = c2 + 1;	//	char ������ ������� -> int Ÿ������ ��ȯ
		// --> ������ ����
		char c3 = (char) (c2 + 1); // c3 -> B�� ���� (����Ÿ�Ժ�ȯ)
//		int c3 = c2 + 1;		// 66
		System.out.println(c3); // B

	}

}
