package sec06.exam03.pack2; // 패키지 다름

import sec06.exam03.pack1.B;

public class C {

//	A a;	// A 클래스 접근 불가(컴파일 에러) -> default 접근제한
	// -> 서로 다른 패키지에 저장
	B b; // B 클래스 접근 가능(import) -> public 접근제한

	// * 클래스의 접근 제한
	// - default
	// : public 생략 시 default로 인식
	// 같은 패키지에서는 가능 / 다른 패키지에서는 불가능

	// - public
	// 같은 패키지에서 가능 / 다른 패키지에서도 가능
	// -> 아무런 제한 없이 사용 가능

}
