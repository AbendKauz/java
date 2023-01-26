package sec01.exam02;

public class Member {

	// -> �ʵ�
	// name : �������� private / StringŸ�� /
	// age : �������� private / int Ÿ�� /
	// gender : �������� private / StringŸ�� /
	// -> ������ (�̸�, ����, ���� �Ű����� 3��)
	// -> getter, setter �޼ҵ�
	// - getter �޼ҵ�
	// - setter �޼ҵ�
	// -> toString �޼ҵ�
	// <console>
	// �̸� : ���ڹ�, ���� : 20, ���� : ��

	private String name;
	private int age;
	private String gender;

	public Member(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "�̸� : " + name + ", ���� : " + age + ", ���� : " + gender;
	}

}
