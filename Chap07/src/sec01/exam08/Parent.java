package sec01.exam08;

public class Parent {

	public String nation;

	public Parent() { // �θ� �����ڷ� ���� �θ� ��ü���� ���� �� �ڽİ�ü ����
		this("���ѹα�"); // �ؿ� �ִ� �ٸ� �����ڸ� ȣ��
		System.out.println("P3");
		System.out.println("Parent() ȣ��");
	}

	public Parent(String nation) {
		System.out.println("P1");
		this.nation = nation;
		System.out.println("P2");
		System.out.println("Parent(String nation) ȣ��");
	}

}
