package sec03.exam07;

public class Car {

	private int speed = 10; // 필드

	// Getter 메소드 (데이터를 리턴해주는 메소드)
	// 구조 :
	// public 리턴타입 getSpeed(){
	// return 필드명;
	// }

	// Setter 메소드 (데이터를 수정하는 용도로 많이 사용 -> 리턴값이 X)
	// 구조 :
	// public void setSpeed(매개변수타입 변수명){
	// this.필드명 = 필드명;
	// }

	// alt + shift + s -> r : getter & setter 메소드 생성

	// Getter -> 필드 값 읽기
	public int getSpeed() { // getter
		return speed;
	}

	// Setter -> 필드 값 수정(변경)
	public void setSpeed(int speed) { // setter
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}

}
