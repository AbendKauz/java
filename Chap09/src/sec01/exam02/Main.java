package sec01.exam02;

import sec01.exam02.OuterClass.InstanceA;

public class Main {

	public static void main(String[] args) {

		// ���� Ŭ���� ȣ�� -> ���� ��� ȣ�� -> �ν��Ͻ� ��� ȣ��

		// ���� Ŭ���� ȣ��
		OuterClass out = new OuterClass();
		out.method();

		// ���� ��� ȣ��
		OuterClass.StaticA sa = new OuterClass.StaticA();
//		sa.b = 5;	// �ٱ����� �ʵ��� �ʱⰪ�� ������ �� ����
		sa.method2();

		// �ν��Ͻ� ��� ȣ��
		InstanceA ia = out.new InstanceA();
//		ia.a = 5;	// �ٱ����� �ʵ��� �ʱⰪ�� ������ �� ����
		ia.method1();

	}

}
