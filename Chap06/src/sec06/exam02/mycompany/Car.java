package sec06.exam02.mycompany;

// import�� - �ܺ� ��Ű������ Ŭ���� ���
// ctrl + shift + o : import
import sec06.exam02.hankook.*;
import sec06.exam02.hankook.Tire;
import sec06.exam02.kumho.*;
import sec06.exam02.hyundai.Engine; // �ܺ� ��Ű�� ���� Ŭ���� ���

public class Car {

	Engine eng = new Engine();
	SnowTire tire1 = new SnowTire();
	Tire tire2 = new Tire();

	BigWidthTire tire3 = new BigWidthTire();

	// * ��쿡 ���� import���� ������� ��Ű���� ���Ե� Ŭ���� ��ü �̸��� ���
	// -> ���� �ٸ� ��Ű���� ������ �̸��� Ŭ������ �ִٸ� + �� ��Ű���� ��� import
	// �����Ϸ��� � ��Ű���� Ŭ������ ���� ������ �ָŸ�ȣ�� --> �����Ͽ���
	// �ذ�� : ��Ȯ�ϰ� ��Ű���� ���Ե� Ŭ���� ��ü �̸��� ���
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();

	// * import��
	// -> ����ϰ��� �ϴ� Ŭ���� �Ǵ� �������̽��� �ٸ� ��Ű���� �ҼӵǾ� ���� ���
	// import������ �ش� ��Ű���� Ŭ���� �Ǵ� �������̽��� ������ ����� ������ �˷��ִ� ���
	// -> ������ ������ ���� �󸶵��� ��� ������.

	// * ������ ��
	// --> ���� ��Ű���� import �ߴٰ� ������Ű������ import�Ǵ� ���� �ƴ�
	// ���� ��Ű�� ���� Ŭ������ ����ϰڴٴ� import�� ���� �ۼ�

	// * import�� �ۼ����
	// import ������Ű��.������Ű��.Ŭ�����̸�;
	// import ������Ű��.������Ű��.*;
	// -> ���������� ��� Ŭ������ �ش��ϴ� import���� �ۼ��ϴ� �ͺ��ٴ�
	// * �� �̿��ؼ� �ش� ��Ű�� ���� �Ҽӵ� ��� Ŭ�������� ����� ������ �˷��ֱ�

}
