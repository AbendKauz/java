package sec02.exam05;

public class Example {

	public static void main(String[] args) {

		ImplementationC impl = new ImplementationC();

		InterfaceA ia = impl;
		ia.methodA(); // ����
//		ia.methodB();	// ����Ұ�
//		ia.methodC();	// ����Ұ�

		System.out.println();

		InterfaceB ib = impl;
//		ib.methodA();	// ����Ұ�
		ib.methodB(); // ����
//		ib.methodC();	// ����Ұ�

		System.out.println();

		InterfaceC ic = impl;
		ic.methodA(); // ����
		ic.methodB(); // ����
		ic.methodC(); // ����
		// InterfaceC : InterfaceA�� InterfaceB�� ��ӹ޾ұ� ������
		// A, B, C �޼ҵ� ��� ����

	}

}
