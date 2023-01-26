package sec01.exam01;

// extends Parent : 상속받을 부모클래스 선택
public class Child extends Parent {

	// 필드
	int chField = 5;

	// 생성자
	public Child(int paField, int chField) {
		super(paField); // 부모생성자 호출
		this.chField = chField;
	}

	// 부모 클래스에 직접 생성자를 만들었을 경우
	// -> 자식 생성자에서 반드시 부모 생성자 호출 -> 호출 안할 시 error
	// ------------------------------
	// super(부모 클래스의 생성자의 매개값, ...);
	// * 반드시 자식 생성자 맨 첫줄에 위치해야 함
	// -> 순서가 바뀔 경우 error 발생

}
