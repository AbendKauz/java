package sec02.exam07;

public class ChildExample {

	public static void main(String[] args) {

		// �ڽ� ��ü ����
		Child child = new Child();

		// -> �θ� Ÿ������ �ڵ�Ÿ�� ��ȯ : �θ�Ÿ�� ������ = �ڽİ�ü;
		Parent parent = child;

		// -> method1, method2, method3 �� ȣ��
		// (ȣ�� ������ �޼ҵ� Ȯ��)
		parent.method1();
		parent.method2(); // �ڽ�Ŭ�������� �������� �޼ҵ� ȣ��
		// ����) �޼ҵ尡 �ڽ�Ŭ�������� �����ǵǸ�
		// : �ڽ�Ŭ������ �޼ҵ� ȣ��

		// �θ�Ÿ������ �ڵ� Ÿ�Ժ�ȯ �� ���
		// : �θ�Ŭ������ ����� �ʵ�, �޼ҵ常 ���� ����
		// ->method3 : �ڽ�Ŭ������ ����� �޼ҵ�� ���� X

		// * ���� Ÿ�� ��ȯ
		// -> �ڵ�Ÿ�Ժ�ȯ�� �θ�Ÿ���� �ٽ� �ڽ�Ÿ������ ��ȯ
		// method3�� ȣ��

		Child child2 = (Child) parent;
		child2.method3(); // ȣ�Ⱑ��

		// -> �θ�Ÿ������ �ڵ�Ÿ�Ժ�ȯ�� �صθ� -> �ڽ�Ŭ������ �ִ� ����� ��� �� �� ����
		// �ڽ�Ŭ������ �ִ� �ʵ�, �޼ҵ� ����Ϸ��� ����Ÿ�Ժ�ȯ

//		Parent par = new Parent();	// �θ�ü����
//		Child chi = (Child) par;	// �ڽ�Ÿ������ ����Ÿ�Ժ�ȯ
//		chi.method3();	// -> ClassCastException �߻�

	}

}
