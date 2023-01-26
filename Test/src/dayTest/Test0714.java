package dayTest;

import java.util.Scanner;

public class Test0714 {

	public static void main(String[] args) {

		// 0713 문제풀이(별 찍기 1 ~ 4)

//		Scanner s = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int n = s.nextInt();

		// (1)
		// *****
		// ****
		// ***
		// **
		// *

//		for (int i = 1; i <= n; i++) {				// 행	: n
//			for (int j = 1; j <= n - i + 1; j++) {	// 열	: n - i + 1
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// (2)
		// *
		// **
		// ***
		// ****
		// *****

//		for (int i = 1; i <= n; i++) {		// 행	: n
//			for (int j = 1; j <= i; j++) {	// 열	: i
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// (3)
		// *****
		// ****
		// ***
		// **
		// *

//		for(int i = 1; i <= n; i++) {				// 행	: n
//			for(int j = 1; j <= i - 1; j++) {		// 공백	: i - 1
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= n - i + 1; j++) {	// 열(*)	: n - i + 1
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// (4)
		// *
		// **
		// ***
		// ****
		// *****

//		for(int i = 1; i <= n; i++) {			// 행	: n
//			for(int j = 1; j <= n - i; j++) {	// 공백	: n - i
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= i; j++) {		// 열(*)	: i
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//--------------------------------------------------------------------------------------------------------------------------

		// n을 5 입력받았을 때 출력
		// *
		// ***
		// *****
		// *******
		// *********

//		Scanner s = new Scanner(System.in);
//		System.out.print("숫자 입력 : ");
//		int n = s.nextInt();
//		
//		for (int i = 1; i <= n; i++) {				// 행	: n
//			for (int j = 1; j <= n - i; j++) {		// 공백	: n - i
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= i * 2 - 1; j++) {	// 열(*)	: i * 2 - 1
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// ■ 정수 입력받아 자리수 출력

//		Scanner s = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int n = s.nextInt();	// 정수 저장
//		int input = n;			// 정수 자리수 계산용 임시변수
//		int cnt = 0;			// count
//		while(input > 0) {
//				input /= 10;
//				cnt++;
//		}
//		System.out.println(n + "의 자리수 갯수는 " + cnt + "개 입니다.");

		// ■ 정수형 배열 5개를 만들고 5 ~ 15 사이의 랜덤값 입력하고 출력 (출력예시) : a[0] = 13

//		int[] a = new int[5];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = (int)((Math.random() * 11) + 5);
//			System.out.println("a[" + i + "] = " + a[i]);
//		}

		// ■ 정수형 배열 10을 만들고 2~20 사이 랜덤값 입력, 배열의 합계 출력

//		int[] a = new int[10];
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			a[i] = (int)((Math.random() * 19) + 2);
//			System.out.print(a[i] + " ");		// 랜덤값 확인용 출력
//			sum += a[i];
//		}
//		System.out.println("배열의 합계 : " + sum);

		// ■ 정수를 입력받아 입력받은 정수크기의 배열생성하고 랜덤값 저장, 저장된 값 중에서
		// 짝수의 개수와 합계 출력 (random값 : 1 ~ 100까지)

//		Scanner s = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int[] a = new int[s.nextInt()];
//		int sum = 0;
//		int cnt = 0;
//		for (int i = 0; i < a.length; i++) {
//			a[i] = (int)((Math.random() * 100) + 1);
//			System.out.print(a[i] + " ");		// 랜덤값 확인용 출력
//			if(a[i] % 2 == 0) {
//				sum += a[i];
//				cnt++;
//			}
//		}
//		System.out.println("짝수의 개수 : " + cnt + ", 짝수의 합계 : " + sum);

		// ■ 5 ~ 1000 사이의 솟수를 배열에 저장하고
		// 배열에 저장된 값들의 평균 출력

//		boolean tf = true;			// 솟수 아닐 시 판정
//		int cnt = 0;				// 배열 번지 갯수 저장할 변수
//		
//		for(int i = 5; i <= 1000; i++) {	// 5 ~ 1000 사이의 수
//			for(int j = 2; j < i; j++) {	// 솟수판별
//				if(i % j == 0) {	// 솟수가 아니면
//					tf = false;		// tf = false
//				}
//			}
//			if(tf) {	// tf가 true면
//				cnt++;	// 갯수 추가
//			}
//			tf = true;	// false가 올 경우 초기화
//		}
//		
//		int[] arr = new int[cnt];	// 솟수 저장할 배열, cnt로 크기 지정
//		
//		for(int i = 0; i <arr.length; i++) {	// arr[] 크기만큼
//			for(int j = 5; j <= 1000; j++) {	// 5 ~ 1000 사이의 수
//				for(int k = 2; k < i; k++) {	// 솟수판별
//					if(i % j == 0) {			// 솟수가 아니면
//						tf = false;				// tf = false
//					}
//				}
//				if(tf) {		// tf가 true면
//					arr[i] = i;	// arr[i]에 값 저장
//				}
//				tf = true;	// false가 올 경우 초기화
//			}
//		}
//		
//		int sum = 0;		// 솟수 총합 계산용
//		double avg = 0;		// 평균 저장용
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];						// 총합에 arr[i]값 더함
//		}
//		avg = (double)sum / arr.length;			// avg = (double)sum / arr.length
//		System.out.println("arr[]의 평균 : " + avg);

		// ■ 10 ~ 200 사이의 랜덤 숫자 10개를 배열에 저장하고,
		// 전체 배열요소를 출력하고 50에 가장 가까운 수 출력

//		int[] arr = new int[10];
//		for(int i = 0; i <= 9; i++) {	// 10 ~ 200 사이의 랜덤 숫자 10개를 배열에 저장
//			arr[i] = (int)((Math.random() * 191) + 10);
//			System.out.println("arr[" + i + "] : " + arr[i]);
//		}
//		System.out.println();
//		
//		int n = arr[0];		// 50에 가장 가까운 수 저장
//		int num1 = 0;		// 근사치 계산용 변수1(배열값)
//		int num2 = 0;		// 근사치 계산용 변수2(n에 저장된 값)
//		for (int i = 1; i < arr.length; i++) {
//			num1 = (arr[i] - 50 > 0) ? arr[i] - 50 : 50 - arr[i];	// 배열값이 50보다 큰지 작은지 계산
//			num2 = (n - 50 > 0) ? n - 50 : 50 - n;
//			if(num1 < num2) {
//				n = arr[i];
//			}
//		}
//		System.out.println("50에 가장 가까운 수 : " + n);

	}

}
