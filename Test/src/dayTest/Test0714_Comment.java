package dayTest;

import java.util.Scanner;

public class Test0714_Comment {

	public static void main(String[] args) {

		// ■ 정수 입력받아 자리수 출력

		Scanner s = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int n = s.nextInt();	// 정수 저장
//		int input = n;			// 정수 자리수 계산용 임시변수
//		int cnt = 0;			// count
//		while(input > 0) {
//				input /= 10;
//				cnt++;
//		}
//		System.out.println(n + "의 자리수 갯수는 " + cnt + "개 입니다.");	

		// ■ 정수형 배열 5개를 만들고 5 ~ 15 사이의 랜덤값 입력하고 출력
		// (출력예시) : a[0] = 13

//		int[] a = new int[5];	// 배열 생성
//		// 5 ~ 15
//		for (int i = 0; i < a.length; i++) {
//			int n = (int)(Math.random() * 11) + 5;
//			a[i] = n;
//			System.out.println("a[" + i + "] = " + a[i]);
//		}

		// ■ 정수형 배열 10을 만들고 2~20 사이 랜덤값 입력, 배열의 합계 출력

//		int[] a = new int[10];	// 배열 생성(memory에 올림), new : 참조변수 생성
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {		// . => 참조변수에 사용할 수 있는 변수 or method 호출
//			a[i] = (int)(Math.random() * 19) + 2;	// .random() : method는 괄호()가 뒤에 들어감
//			sum += a[i];
//			System.out.println("a[" + i + "] = " + a[i]);
//		}
//		System.out.println("배열 합계 : " + sum);

		// ■ 정수를 입력받아 입력받은 정수크기의 배열생성하고 랜덤값 저장, 저장된 값 중에서
		// 짝수의 개수와 합계 출력 (random값 : 1 ~ 100까지)

//		Scanner s = new Scanner(System.in);
//		System.out.print("배열 크기 입력 : ");
//		int n = s.nextInt();
//		int cnt = 0, sum = 0;	// 갯수, 합계
//		int[] a = new int[n];
//		
//		for (int i = 0; i < a.length; i++) {
//			a[i] = (int)(Math.random() * 100) + 1;
//			if(a[i] % 2 == 0) {
//				sum += a[i];
//				cnt++;
//				System.out.println("a[" + i + "] = " + a[i]);	// 짝수인 배열의 값 출력
//			}
//		}
//		System.out.println("짝수의 개수 : " + cnt + ", 짝수의 합 : " + sum);

		// ■ 5 ~ 1000 사이의 솟수를 배열에 저장하고
		// 배열에 저장된 값들의 평균 출력

//		int[] a = new int[200];		// 임의로 길이 200이라 선언
//		int idx = 0;	// index 역할 변수
//		int start = 5;
//		int end = 1000;
//		int j;
//		for(int i = start; i <= end; i++) {	// 솟수인지 판별할 수			// i = 5	,	6
//			for(j = 2; j < i; j++) {	// 나눠볼 수 (2 ~ (자신 - 1))	// j = 2 ~ 4,	2 ~ 5
//				if(i % j == 0) {
//					break;
//				}
//			}
//			if(i == j) {
//				a[idx] = i;
//				idx++;
////				a[idx++];	//a[idx]에 i를 넣고 1 증가
//			}
//		}
//		System.out.println("** 솟수 출력 **");
//		
//		for (j = 0; j < a.length; j++) {
//			System.out.println("a[" + j + "] " + a[j]);
//		}
//		
//		// 평균 출력 (직접)
//		int sum = 0;		// 솟수 총합 계산용
//		int cnt = 0
//		double avg = 0;		// 평균 저장용 변수
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] > 0){
//				sum += arr[i];						// 총합에 arr[i]값 더함
//				cnt++;
//			}		
//		}
//		avg = (double)sum / cnt;			// avg = (double)sum / cnt
//		System.out.println("arr[]의 평균 : " + avg);

		// ■ 10 ~ 200 사이의 랜덤 숫자 10개를 배열에 저장하고,
		// 전체 배열요소를 출력하고 50에 가장 가까운 수 출력

//		int a = 100;
//		int b = -50;
//		b= Math.abs(b);	// .abs : 절대값을 구하는 method
//									-> 음수여도 정수로 표현됨
//		System.out.println(a + ", " + b);
//		int[] a = new int[10];
//		int cha = 200;
//		int c = 0;	// 차이가 가장 작은 값 저장용 변수
//		for (int i = 0; i < a.length; i++) {
//			a[i] = (int)(Math.random() * 191) + 10;
//			System.out.print(a[i] + ", ");	// 전체 배열요소 출력
//			int k = Math.abs(50-a[i]);	// k = 50 - a[i]번지의 절대값
//			if(cha > k) {
//				c = a[i];	// 근사값 저장
//				cha = k;	// cha에 근사치 저장
//			}
//		}
//		System.out.println();
//		System.out.println("50에 가장 가까운 값 : " + c);

	}

}
