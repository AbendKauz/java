package sec03.exam06;

public class Rectangle {

	// Rectangle 클래스 작성
	// -> private int 타입의 x, y, width, height 필드 (사각형을 구성하는 점과 크기 정보)
	// -> 필드를 초기화하는 생성자
	// -> area( ) 메소드 : 사각형의 넓이를 리턴 (리턴값 int)
	// -> show( ) 메소드 : 사각형의 좌표와 크기를 콘솔에 출력 (리턴값 없음)
	// -> 모든 필드의 값을 보여주는 toString 만들기 (콘솔창과 동일하게 출력)
	// -> including(Rectangle r) 메소드
	// : 매개변수로 받은 r이 현 사각형 안에 있으면 true를 리턴

	private int x;
	private int y;
	private int width;
	private int height;

	// 생성자 : alt + shift + s -> o

	Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// area( ) 메소드 : 사각형의 넓이를 리턴 (리턴값 int)

	int area() {
		return width * height;
	}

	// show( ) 메소드 : 사각형의 좌표와 크기를 콘솔에 출력 (리턴값 없음)

	void show() {
		System.out.println("(" + x + ", " + y + ")에서 크기가 " + width + " * " + height + "인 사각형");
	}

	// 모든 필드의 값을 보여주는 toString (콘솔창과 동일하게 출력)
	// toString override : alt + shift + s -> s

//	@Override
//	public String toString() {
//		String str = "필드값 : x = " + x + ", y = " + y + ", width = " + width + ", height = " + height;
//		return str;
//	}

	@Override
	public String toString() {
		return "필드값 : x = " + x + ", y = " + y + ", width = " + width + ", height = " + height;
	}

	// including(Rectangle r) 메소드
	// : 매개변수로 받은 r이 현 사각형 안에 있으면 true를 리턴

	boolean including(Rectangle r) {
		if (r.x >= x && r.y >= y && (r.width + r.x) <= (width + x) && (r.height + r.y) <= (height + y)) {
			return true;
		}
		return false;
	}

	// (r.x + r.width)-x (r.y + r.height) - y
//	boolean including(Rectangle r) {
//		if (width >= ((r.x + r.width) - x) && ((r.x + r.width) - x) > r.width
//				&& height >= ((r.y + r.height) - y) && ((r.y + r.height) - y) > r.height) {
//			return true;
//		}
//
//		return false;
//	}

}
