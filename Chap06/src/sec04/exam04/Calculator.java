package sec04.exam04;

public class Calculator {

	// 메소드
//	int plus(int x, int y) {	// 2개의 매개변수를 더하는 메소드
//		int result = x + y;
//		return result;
//	}
//	
//	double avg(int x, int y) {	// 2개의 매개변수의 평균을 구하는 메소드
//		// plus() 호출
//		double sum = plus(x, y);
//		double result = sum / 2; 
//		return result;
//	}
//	
//	void execute() {
//		double result = avg(7, 10);
//		System.out.println("실행결과 : " + result);
//	}

	// execute() -> 외부의 값을 받아서 계산한 결과값 (평균)

//	int plus(int ... arr) {
	int plus(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

//	double avg(int ... arr) {
	double avg(int[] arr) {
		double sum = plus(arr);
		double result = sum / arr.length;
		return result;
	}

//	void execute(int ... arr) {
	void execute(int[] arr) {
		double result = avg(arr);
		System.out.println("\n실행 결과 : " + result);
	}

}
