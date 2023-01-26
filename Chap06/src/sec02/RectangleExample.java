package sec02;

public class RectangleExample {

	public static void main(String[] args) {

		// -> Rectangle 클래스 내부의 필드 width, height 읽기(출력)
//		
//		Rectangle rec = new Rectangle();
//		System.out.println("변경 전 : " + rec.width);
//		System.out.println("변경 전 : " + rec.height);
//		
//		// -> width = 10, height = 5로 변경 후 출력
//		rec.width = 10;
//		rec.height = 5;
//		System.out.println("변경 후 : " + rec.width);
//		System.out.println("변경 후 : " + rec.height);
//		
//		// 가로가 10, 세로가 5인 사각형의 넓이 : 50
//		// (사각형의 넓이 구하는 공식 : 가로 * 세로)
//		double a = rec.width * rec.height;
//		System.out.println("가로가 " + (int)rec.width + ", 세로가 " + (int)rec.height + "인 사각형의 넓이 : " + (int)a);

		// getArea() 를 여기서 사용
		// 1. Rectangle 클래스의 객체를 생성하는 코드
		Rectangle rec = new Rectangle();
		rec.width = 10;
		rec.height = 5;

		rec.getArea();

//		rec.getArea(14, 3);	// 가로 14, 세로 3인 사각형의 넓이 계산

		double a = rec.getArea2(14, 3); // getArea2() 호출 + 14와 3을 매개값으로 보냄
		System.out.println(a);

	}

}
