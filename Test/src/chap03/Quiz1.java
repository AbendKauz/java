package chap03;

public class Quiz1 {

	public static void main(String[] args) {

		// 1. 클래스명 Quiz1 로 생성
		// 2. int 타입의 appleNum 을 생성 후 123으로 초기화하기 (사과의 수 123개)
		// 3. int 타입의 bucketSize 를 생성 후 10으로 초기화하기
		// (바구니의 크기 -> 10개의 사과를 담을 수 있음)
		// 4. int 타입의 bucketNum을 생성하기 (필요한 바구니의 수량)
		// 5. appleNum, bucketSize, 산술연산자를 활용하여 총 몇 개의 바구니가
		// 필요한지 구한 후 그 값을 변수 bucketNum 에 저장하시오.
		// 6. bucketNum 의 값을 출력하시오.
		int appleNum = 123;
		int bucketSize = 10;
		int bucketNum = (appleNum % bucketSize);
//		// 1)
//		if(appleNum % bucketSize == 0) {
//			bucketNum = appleNum / bucketSize;
//		}else {
//			bucketNum = appleNum / bucketSize + 1;
//		}
//		System.out.println("사과의 수 : " + appleNum);
//		System.out.println("필요한 바구니의 수 : " + bucketNum);

//		// 2)
		System.out.println((appleNum % bucketSize == 0) ? "필요한 바구니의 수 : " + bucketNum : "필요한 바구니의 수 : " + bucketNum + 1);

	}

}
