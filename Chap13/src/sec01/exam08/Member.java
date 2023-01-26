package sec01.exam08;

import java.util.Objects;

public class Member {
	// -> �ʵ�
	// name : �������� public / StringŸ�� /
	// age : �������� public / int Ÿ�� /
	// -> ������ (�̸�, ���� �Ű����� 2��)
	// -> equals( ) ������
	// - �޾ƿ� �Ű����� Member Ŭ���� Ÿ���̶�� Member Ÿ������ Ÿ�� ��ȯ ��
	// �̸��� ���̰� ���� ��쿡 true , �ƴҰ�쿡 false �� ������.
	//
	// Member Ŭ���� Ÿ���� �ƴ϶�� false �� ������.
	// -> hashCode( ) ������
	// - return Objects.hash(name, age);

	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
//		if(obj.getClass().equals(this.getClass())) {
		if (obj instanceof Member) {
			Member m = (Member) obj; // ����Ÿ�Ժ�ȯ
			if (m.age == this.age && m.name.equals(this.name)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age); // �̸��� ���̰� ������ ������ hashcode ����
		// �Ű������� �־��� ������ �̿��ؼ� �ؽ��ڵ带 �����ϴ� �޼ҵ�
		// �������� �ʵ带 ������ ���� �� => �ʵ��κ��� �ؽ��ڵ带 �����ϸ�
		// ������ �ʵ尪�� ���� ��쿡�� ������ �ؽ��ڵ带 ������
	}

	// * �ؽ��ڵ��?
	// => ��ü�� �ĺ��ϴ� �ϳ��� ������
	// hashCode() : ��ü�� �޸� ������ �̿��ؼ� �ؽ��ڵ带 ����� ����
	// ==> ��ü���� ������ �ٸ� ���� ����

}
