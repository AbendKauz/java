package sec01.exam08;

public class Child extends Parent {

	private String name;

	public Child() {
		this("ȫ�浿"); // this(): �ٸ� ������ ȣ��
		System.out.println("Child() ȣ��");
	}

	public Child(String name) {
		System.out.println("C1");
		this.name = name;
		System.out.println("C2");
		System.out.println("Child(String nation) ȣ��");
	}

}
