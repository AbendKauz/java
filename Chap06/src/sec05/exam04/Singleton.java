package sec05.exam04;

public class Singleton {

	// 싱글톤
	// -> 단 하나의 객체만 만들도록 하는 디자인 패턴
	// 어떤 클래스가 최초 한번만 메모리를 할당하고
	// 그 메모리에 객체를 만들어 사용하는 디자인 패턴

	// * 사용하는 이유
	// : 단 한번의 객체 생성으로 사용이 가능함 -> 메모리 낭비를 방지

	// * 방법 :
	// 1. 생성자를 외부에서 호출할 수 없도록 -> private 접근제한자 사용
	// 2. 자신의 타입인 정적 필드를 하나 선언 -> 자신의 객체를 생성 후 초기화
	// -> private 접근제한
	// 3. 외부에서 호출할 수 있도록 -> 정적 메소드 선언
	// -> getInstance() 선언 후 정적필드에서 참조하는 자신의 객체 리턴

	// 2. 정적 필드 선언
	private static Singleton a = new Singleton();

	// 1. 생성자
	private Singleton() { // 생성자

	}

	// 3. 외부에서 호출할 수 있는 정적 메소드 getInstance()
	static Singleton getInstance() {
		return a;
	}

}
