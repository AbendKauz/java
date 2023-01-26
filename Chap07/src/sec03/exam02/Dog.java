package sec03.exam02;

public class Dog extends Animal {

	// -> 추상클래스 Animal 상속하고
	// 기본생성자 - 매개변수 없고, kind 필드만 "포유류" 라는 값으로 초기화
	// -> 추상 메소드 재정의
	// - Dog 클래스 -> 추상 메소드 실행 코드 -> "멍멍" 을 출력

	public Dog() {
		this.kind = "포유류";
	}

	// sound() -> animal 추상 클래스에서 만들어둔 추상 메소드
	// -> 추상 메소드를 재정의 하지 않으면 에러
	// * 추상 클래스 설계 시 하위 클래스에서 반드시 실행 내용을 채우도록 하고싶은 메소드가 있다면???
	// ===> 그 메소드를 추상 메소드로 선언하면 됨

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}
