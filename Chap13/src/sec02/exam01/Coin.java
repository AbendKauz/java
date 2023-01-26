package sec02.exam01;

public class Coin {

	// -> 필드
	// value : 접근제한자 private / int 타입 / ( 동전의 가격을 저장 )
	private int value;

	// -> 생성자 (value 매개변수 선언)
	public Coin(int value) {
		this.value = value;
	}

	// -> getter 메소드
	public int getValue() {
		return value;
	}

}
