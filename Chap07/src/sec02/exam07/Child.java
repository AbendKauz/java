package sec02.exam07;

public class Child extends Parent {

	// 메소드 접근제한 public / 리턴타입 X
	// method2 -> 부모클래스의 메소드 재정의
	// -> 자식클래스의 method2 호출 출력
	// method3 -> 자식클래스의 method3 호출 출력

	// 부모클래스의 메소드 재정의
//	@Override
//	public void method2() {
//		System.out.println("자식클래스의 method2 호출");
//	}

	public void method3() {
		System.out.println("자식클래스의 method3 호출");
	}

}
