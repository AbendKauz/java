package sec01.exam02;

public class Key {

	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			// obj�� KeyŸ������ ������ȯ
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	// hashCode()�� ���ϰ��� number�ʵ尪���� �߱� ������
	// ������ ���� new Key(1)�� ���� ���� new Key(1)��
	// ���� �ؽ��ڵ尡 ���ϵ�
	@Override
	public int hashCode() {
		return number;
	}

}
