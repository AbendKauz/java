package sec02.exam02;

public class CatExam {

	public static void main(String[] args) {

		// �ڽ� Ŭ������ Cat �� ��ü�� ����
		Cat cat = new Cat(); // cat ��ü ������ �θ� ��ü�� ���� ������

		// Animal �ڵ� Ÿ�Ժ�ȯ
		// : �θ�Ÿ�� ������ = �ڽ�Ÿ��;
		// ��� 1
		Animal ani1 = cat;
		System.out.println(cat);
		System.out.println(ani1); // ������ Cat ��ü�� ����

		// ���� ������ == ���� -> ���� ������ ���� ��� true, �ٸ���� false
		System.out.println(cat == ani1); // true

		// ���2
		Animal ani2 = new Cat();
		System.out.println(ani2);
		System.out.println(cat == ani2); // false

	}

}
