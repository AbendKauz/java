package sec02;

public class Test2Example {

	public static void main(String[] args) {

		// �ʵ� �� �б�
		// 1. ��ü ���� -> ��Ʈ������ Ȱ���ؼ� �б�

		Test2 test = new Test2();
		// �� �ʵ尪�� �ʱⰪ ���
		System.out.println(test.byteField); // 0
		System.out.println(test.shortField); // 0
		System.out.println(test.intField); // 0
		System.out.println(test.longField); // 0

		System.out.println();
		System.out.println(test.charField); // false
		System.out.println(test.booleanField); // (����)

		System.out.println();
		System.out.println(test.floatField); // 0.0
		System.out.println(test.doubleField); // 0.0

		System.out.println();
		System.out.println(test.arrField); // null
		System.out.println(test.strField); // null

	}

}
