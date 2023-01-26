package sec02.exam05;

public class Example {

	public static void main(String[] args) {

		ImplementationC impl = new ImplementationC();

		InterfaceA ia = impl;
		ia.methodA(); // 가능
//		ia.methodB();	// 실행불가
//		ia.methodC();	// 실행불가

		System.out.println();

		InterfaceB ib = impl;
//		ib.methodA();	// 실행불가
		ib.methodB(); // 가능
//		ib.methodC();	// 실행불가

		System.out.println();

		InterfaceC ic = impl;
		ic.methodA(); // 가능
		ic.methodB(); // 가능
		ic.methodC(); // 가능
		// InterfaceC : InterfaceA와 InterfaceB를 상속받았기 때문에
		// A, B, C 메소드 사용 가능

	}

}
