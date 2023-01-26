package sec02;

import java.util.Scanner;

public class D0706_01_for문2 {

	public static void main(String[] args) {

		// 1부터 100까지의 합을 출력하는 프로그램을 작성
//		int a = 0;
//		for(int i = 1; i <= 100; i++) {
//			a = a + i;
//		}
//		System.out.println("1부터 100까지의 합 : " + a);

		// 키보드로 정수를 입력받아
		// 1부터 입력한 만큼 합을 구하는 프로그램
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int b = sc.nextInt();
//		int c = 0;
//		for(int j = 1; j <= b; j++) {
//			c = c + j;
//		}
//		System.out.println("1부터 " + b + "까지의 합 = " + c );

		// 87에서 34까지 출력하는 프로그램 작성
//		for(int k = 87; k >= 34; k--) {
//			System.out.println(k);
//		}

		// 87에서 34까지 짝수만 출력하는 프로그램 작성
//		for(int l = 87; l >= 34; l--) {
//			if(l % 2 == 0) {
//				System.out.println(l);
//			}
//		}

		// 100이하의 다른 정수 2개를 입력받아
		// 홀수인 수를 작은 수 부터 큰 수 까지 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 1 : ");
		int m = sc.nextInt();
		System.out.print("정수 입력 2 : ");
		int n = sc.nextInt();

//		// 1)
//		if(m < n) {
//			for(m = m; m <= n; m++) {
//				if(m % 2 == 1) {
//					System.out.println(m);
//				}
//			}
//		}else {
//			for(n = n; n <= m; n++) {
//				if(n % 2 == 1) {
//					System.out.println(n);
//				}
//			}
//		}

//		// 2)(if - for문 최대한 적게 사용)
//		int temp = 0;
//		if(m > n) {			// ex) m = 20	n = 10
//			temp = m;	// temp = 20, m = 20, n = 10
//			m = n;			// temp = 20, m = 10, n = 10
//			n = temp;		// temp = 20, m = 10, n = 20
//		}
//		
//		for(m = m; m <= n; m++) {
//			if(m % 2 != 0) {
//				System.out.println(m);
//			}
//		}

//		// 3)(삼항연산 이용) -> 큰 숫자는 large, 작은 숫자는 small
		// 삼항연산자 구조
		// 조건식 ? T일때 식 : F일때 식
		// (T) :_______
		// (F) :_________
//		int large = m > n ? m : n;
//		int small = m < n ? m : n;
//		
//		for(int i = small; i <= large; i++) {
//			if(i % 2 != 0) {
//				System.out.println(i);
//			}
//		}

	}

}
