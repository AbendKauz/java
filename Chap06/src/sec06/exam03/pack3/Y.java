package sec06.exam03.pack3;

public class Y {

	// �ʵ�
	Y y1 = new Y(10); // -> public ������ ȣ��
	Y y2 = new Y(true); // -> default ������ ȣ��
	Y y3 = new Y("Y"); // -> private ������ ȣ��

	// ������
	public Y(int a) {
	} // public ��������

	Y(boolean a) {
	} // default ��������

	private Y(String a) {
	} // private ��������

}
