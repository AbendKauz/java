package sec03.exam01;

public class SmartPhone extends Phone {

	// -> 생성자
	// -> 접근제한 public
	// -> 폰의 소유자를 매개값으로 받아서 부모인 Phone 클래스의 생성자를 호출할 때 넘겨주기
	// -> 메소드
	// internetSearch( ) : 접근제한 public / 리턴타입 없음 / 매개변수 X /
	// -----> "인터넷 검색을 합니다." 를 출력
	public SmartPhone(String owner) {
		super(owner);
	}

	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
