package sec03.exam10;

public class CarExample {

	public static void main(String[] args) {

		// 객체 배열 -> 크기가 5
		Car[] carArr = new Car[5];

		// 객체 배열의 인덱스 위치의 값들을 Car 객체 5개를 넣는데
		// 각 객체의 스피드의 값이 10, 20, 30, 40, 50

		// <console>
		// 처음 속도
		// arr[0] => 속도 : 10
		// arr[1] => 속도 : 20
		// arr[2] => 속도 : 30
		// arr[3] => 속도 : 40
		// arr[4] => 속도 : 50
		// ===================
		// 2배 속도
		// arr[0] => 속도 : 20
		// arr[1] => 속도 : 40
		// arr[2] => 속도 : 60
		// arr[3] => 속도 : 80
		// arr[4] => 속도 : 100

		System.out.println("처음 속도");
		for (int i = 0; i < carArr.length; i++) {
			carArr[i] = new Car((i + 1) * 10);
			System.out.println("arr[" + i + "] => " + carArr[i]);
		}

		System.out.println("=====================");
		System.out.println("2배 속도");

		for (int i = 0; i < carArr.length; i++) {
			// 각 필드의 값이 2배씩 커짐
//			carArr[i] = new Car((i + 1) * 10 * 2);
			int num = carArr[i].getSpeed() * 2; // 필드의 값을 읽어와서 * 2 => num 변수에 넣기
			carArr[i].setSpeed(num); // num을 필드의 값으로 변경
			System.out.println("arr[" + i + "] => " + carArr[i]);
		}

	}

}
