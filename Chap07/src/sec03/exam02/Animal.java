package sec03.exam02;

public abstract class Animal {

	// -> 필드
	// kind : 접근제한 public / String 타입
	// -> 메소드
	// 1. breathe( ) : 접근제한 public / 리턴타입 없음 / 매개변수 X /
	// -----> "숨을 쉽니다." 를 출력
	// 2. sound( ) : 추상 메소드 / 접근제한 public / 리턴타입 없음 / 매개변수 X

	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	};

	// 추상메소드 -> 선언부분만 있고, { } 실행부분은 없는 메소드
	// -> 일반 클래스에서는 선언 불가 // 추상 클래스에서만 사용 가능
	public abstract void sound();

}
