package sec03.exam02;

public class Cat extends Animal {

	// -> 추상클래스 Animal 상속하고
	// 기본생성자 - 매개변수 없고, kind 필드만 "포유류" 라는 값으로 초기화
	// -> 추상 메소드 재정의
	// - Cat 클래스 -> 추상 메소드 실행 코드 -> "야옹" 을 출력

	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}

}
