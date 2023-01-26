package sec04.exam04;

import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {

//		Calculator cal = new Calculator();

//		int num1 = cal.plus(3, 5);
//		// System.out.println("더하기 : " + num1);
//		
//		double num2 = cal.avg(3, 5);
//		// System.out.println("평균 : " + num2);
//		
//		cal.execute();

		// 외부의 값을 넣어주기
		// -> Scanner로 몇개의 값을 보낼것인지 입력하고
		// -> 그 크기의 배열을 생성
		// -> 배열의 각 인덱스 안의 값들을 랜덤으로 뽑아서 (1~15까지의 정수)
		// --> 매개값으로 전달 execute(배열) 실행할 때 전달

		// <console>
		// 정수입력 : 7
		// 2 5 5 2 7 8 12
		// 실행결과 : (랜덤으로 뽑은 7개의 값들의 평균)

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 15) + 1;
//			System.out.println("arr[" + i + "] : " + arr[i]);
			System.out.print(arr[i] + " ");
		}

		Calculator cal = new Calculator();
		cal.execute(arr);

	}

}
