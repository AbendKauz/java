package sec02.exam01;

public class Coin {

	// -> �ʵ�
	// value : ���������� private / int Ÿ�� / ( ������ ������ ���� )
	private int value;

	// -> ������ (value �Ű����� ����)
	public Coin(int value) {
		this.value = value;
	}

	// -> getter �޼ҵ�
	public int getValue() {
		return value;
	}

}
