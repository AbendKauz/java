package sec03.exam01;

public abstract class Phone {

	// -> 필드
	// owner : 접근제한 public / String 타입 (폰의 소유자)
	// -> 생성자 :
	// -> 접근제한 public / 매개변수 - 폰의 소유자
	// -> 매개값으로 필드 초기화
	// -> 메소드
	// 1. turnOn( ) : 접근제한 public / 리턴타입 없음 / 매개변수 X /
	// -----> "폰 전원을 켭니다." 를 출력
	// 2. turnOff( ) : 접근제한 public / 리턴타입 없음 / 매개변수 X /
	// -----> "폰 전원을 끕니다." 를 출력

	public String owner;

	public Phone(String owner) {
		this.owner = owner;
	}

	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}

}
