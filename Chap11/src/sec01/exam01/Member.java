package sec01.exam01;

public class Member {

	public String id;

	public Member(String id) {
		this.id = id;
	}

	// equals() �޼ҵ� ������
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			// �Ű����� MemberŸ������ Ȯ��
			Member member = (Member) obj;
			// MemberŸ������ ����Ÿ�Ժ�ȯ
			if (id.equals(member.id)) {
				// id�ʵ尪�� �������� �˻�
				return true;
				// �����ϴٸ� true ����
			}
		}
		return false;
		// �Ű����� MemberŸ���� �ƴϰų�
		// id�� �ʵ尪�� �ٸ� ��� false ����
	}

}
