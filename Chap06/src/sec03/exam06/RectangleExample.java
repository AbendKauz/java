package sec03.exam06;

public class RectangleExample {

	public static void main(String[] args) {

		// RectangleExample 클래스 작성
		// -> 4개의 매개값을 가진 객체 3개 생성하기 (rec1, rec2, rec3)
		// (직접 선언한 생성자로 객체를 생성하기)
		// rec1 -> x=2, y=2, width=8, height=7
		// rec2 -> x=5, y=5, width=8, height=7
		// rec3 -> x=1, y=1, width=10, height=10
		// -> rec1 객체 -> show 메소드
		// -> rec1 객체 -> area 메소드
		// -> 만든 toString()을 통해 모든 필드의 값 출력하기
		// -> rec3 객체 -> including(）메소드
		// (rec1, rec2 둘 다 비교하기)
		//
		// < console >
		// (2, 2) 에서 크기가 8*7인 사각형
		// rec1 의 넓이는 56입니다.
		// 필드값 : x=2, y=2, width=8, height=7
		// rec3은 rec1을 포함합니다.
		// rec3은 rec2를 포함하지 않습니다.

		Rectangle rec1 = new Rectangle(2, 2, 8, 7);
		Rectangle rec2 = new Rectangle(5, 5, 8, 7);
		Rectangle rec3 = new Rectangle(1, 1, 10, 10);

		// rec1 객체 -> show 메소드

		rec1.show();

		// rec1 객체 -> area 메소드

		System.out.println("rec1의 넓이는 " + rec1.area() + "입니다.");

		// 만든 toString()을 통해 모든 필드의 값 출력하기

//		System.out.println(rec1);
		System.out.println(rec1.toString());

		// rec3 객체 -> including(）메소드
		// (rec1, rec2 둘 다 비교하기)

//		System.out.println((rec3.including(rec1) ? "rec3은 rec1을 포함합니다." : "rec3은 rec1을 포함하지 않습니다."));
//		System.out.println((rec3.including(rec2) ? "rec3은 rec2를 포함합니다." : "rec3은 rec2를 포함하지 않습니다."));

		if (rec3.including(rec1)) {
			System.out.println("rec3은 rec1을 포함합니다.");
		} else {
			System.out.println("rec3은 rec1을 포함하지 않습니다.");
		}

		if (rec3.including(rec2)) {
			System.out.println("rec3은 rec2을 포함합니다.");
		} else {
			System.out.println("rec3은 rec2을 포함하지 않습니다.");
		}

	}

}
