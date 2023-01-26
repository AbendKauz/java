package dayTest;

import java.util.Scanner;

public class Test0708_Comment {

	public static void main(String[] args) {

		// 1. 정수 2개를 입력받아 사칙연산 결과 출력

//		Scanner s = new Scanner(System.in);
//		// -> java.util package의 Scanner class를 memory에 올리고 s라는 참조변수로 사용
//		// class를 memory에 올리면? : instance
//		// 참조변수(= 참조값(주소)을 저장하고 있는 변수)
//		
//		// new -> memory에 해당 class를 올리는 keyword
//		String str = "aaa";
//		String str2 = new String("aaa");
//				
//		Scanner s = new Scanner(System.in);
//		System.out.print("첫 번째 숫자 입력 : ");
//		int num1 = s.nextInt();
//				
//		System.out.print("두 번째 숫자 입력 : ");
//		int num2 = s.nextInt();
//				
//		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//		// 큰 값 - 작은 값 으로 계산하고 싶을 때 : 
//		// int result = (num1>num2) ? num1 - num2 : num2 - num1 ;
////		System.out.println(num1 + " - " + num2 + " = " + result);
//		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
//		System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));

		// 2. 1부터 45 사이의 랜덤 정수 6개 출력

		// import java.util.Scanner; // java.util package의 Scanner class 사용
		// import java.util.ArrayList; // java.util package의 ArrayList class 사용
		// import java.util.HashMap; // java.util package의 HashMap class 사용

		// improt java.util.*; // java.util package의 모든 class 사용
		// Math.random(); // Math class : java.lang package
		// -> java 실행 시 기본적으로 import 되어있음(= static)
		// => 그냥 사용 가능(new 선언 시 오히려 중복으로 error)

		// Math class : 프로그램 시작 시 이미 메모리에 올라가있음
		// => static : 정적
		// Math m = new Math(); // 이미 메모리에 올라가있어 error
//		Math.random();	// Math라는 클래스의 random() 메소드 사용
//		// 0.0 <= Math.random() <= 1.0
//		System.out.println(Math.random());
//
//		// 0 ~ 1
//		// (int)(0.0) <= (int)(Math.random()) < (int)(1.0)								
//		// 0 ~ 9
//		// (int)(0.0 * 10) <= (int)(Math.random() * 10) < (int)(1.0 * 10)				
//		// 1 ~ 10
//		// (int)(0.0 * 10) + 1 <= (int)(Math.random() * 10) + 1 < (int)(1.0 * 10) + 1	
//		
//		for(int i = 0; i < 6; i++) {
//			System.out.println((int)(Math.random() * 45) + 1);
//		}
//		
//		
//		// 3. 정수 하나를 입력받아 솟수 여부 출력
//		
//		Scanner s = new Scanner(System.in);
//		System.out.print("솟수판별할 정수 입력 : ");
//		int num = s.nextInt();
//		
//		for (int i = 2; i < num; i++) {
//			if(num % i == 0) {
//				System.out.println("솟수 아님");
//				System.exit(0);		// 프로그램 강제 종료
//			// 0 : 정상종료	
//			// 1 : 비정상종료
//			}else {
//				continue;
//			}
//		}
//		System.out.println("솟수");
//		
//		// 3.1. 1~100까지 수 중에서 솟수의 갯수 출력
//		
//		int cnt = 2;	// 솟수갯수를 누적저장할 변수(1은 솟수이므로 미리 카운팅)
//		boolean chk;	// 솟수판별할 체크용 변수 선언
//		
//		for(int i = 3; i <= 100; i++) {		// i = 솟수판별할 수
//			chk = false;			// 변수 chk를 false로 초기화
//			for(int j = 2; j < i; j++) {	// j = 나머지를 구하기 위한 나눌수 (2 ~ 자신 - 1)
//				if(i % j == 0) {	// 솟수가 아님
//					chk = true;
//				}
//			}
//			if(!chk) {
//				cnt++;				// 솟수 갯수 증가
//			}
//		}
//		System.out.println("1부터 100까지의 솟수 개수 : " + cnt);

		// 4. 두 수를 입력받아 두 수 사이의 랜덤수 10개 출력

		// 1 ~ 10
		// (int)(0.0 * 10) + 1 <= (int)(Math.random() * 10) + 1 < (int)(1.0 * 10) + 1
		// 2 ~ 10
		// (int)(0.0 * 9) + 2 <= (int)(Math.random() * 9) + 2 < (int)(1.0 * 9) + 2
		// 5 ~ 20
		// (int)(0.0 * (20-5+1)) + 5 <= (int)(Math.random() * (20-5+1)) + 5 < (int)(1.0
		// * (20-5+1)) + 5
		// 13 ~ 34
		// (int)(0.0 * (34-13+1)) + 13 <= (int)(Math.random() * (34-13+1)) + 13 <
		// (int)(1.0 * (34-13+1)) + 13

//		Scanner s = new Scanner(System.in);
//		System.out.print("첫째수 : ");
//		int n1 = s.nextInt();
//		System.out.print("둘째수 : ");
//		int n2 = s.nextInt();
//		
//		int max, min;	// 크기에 따라 값을 저장할 변수
//		if(n1 > n2) {	// n1이 n2보다 크면
//			max = n1;	// max에 n1
//			min = n2;	// min에 n2
//		}else {			// n1이 n2보다 작으면
//			max = n2;	// max에 n2
//			min = n1;	// min에 n1
//		}
//		
//		System.out.println(min + "부터 " + max + "까지 랜덤수 출력");
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println((int)(Math.random() * (max - min + 1) + min));
//		}

	}

}
