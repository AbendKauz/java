package sec02;

import java.util.Scanner;

public class D0714_02_배열문제4 {

	public static void main(String[] args) {

		// Q1) 배열의 길이를 키보드로 값을 입력받아 배열을 생성
		// 배열에는 값이 2, 4, 8, 16, 32, 64, 128, 256, 512,....이
		// 들어갈 수 있도록 코드를 작성 후 배열을 출력

		Scanner sc = new Scanner(System.in);

//		System.out.print("배열의 길이 : ");
//		int num = sc.nextInt();
//		
//		int[] arr = new int[num];
//		
//		int a = 1;
//		for (int i = 0; i < arr.length; i++) {
//			a *= 2;		//		2			4			8
//			arr[i] = a;	// arr[0] = 2;	arr[1] = 4;	arr[2] = 8;
//			System.out.print(arr[i] + " ");
//		}

		// Q2) 1차원 문자형 배열을 선언한 후 "자","바"로 초기화(배열크기 = 2)
		// 숫자를 입력받아 입력받은 수가 5인 경우 "자바자바자",
		// 8인 경우 "자바자바자바자바"를
		// 출력하는 프로그램 작성

//		char[] arr = {'자', '바'};
//		
//		System.out.println("====자바 출력====");
//		System.out.print("정수 입력 >> ");
//		int num = sc.nextInt();
//		
//		// num이 1 -> 자
//		// num이 3 -> 자바자
//		// num이 5 -> 자바자바자
//		
//		// num이 6 -> 자바자바자바
//		// num이 8 -> 자바자바자바자바
//		
//		for (int i = 1; i <= num; i++) {
//			if(i % 2 == 1) {
//				System.out.print(arr[0]);
//			}else {
//				System.out.print(arr[1]);
//			}
//		}

		// Q3) 아래와 같이 name 배열을 생성하고 각각의 이름으로 초기화
		// Scanner로 읽어들인 이름이 몇 번째 index에 저장되어 있는지
		// 검색하는 프로그램 작성
		// 혼자바, 홍길동, 이민후, 김우영, 임수아, 박지우

//		String[] name = {"혼자바", "홍길동", "이민후", "김우영", "임수아", "박지우"};
//		System.out.print("검색할 이름을 입력 >> ");
//		String a = sc.nextLine();
//		
//		boolean c = true;
////		int cnt = 0;
//		
//		for (int i = 0; i < name.length; i++) {
//			if(a.equals(name[i])) {
//				System.out.println(a + "님은 " + i + "번째 index에 들어있습니다.");
//				c = false;
////				cnt++;
//			}
//		}
//		
//		if(c) {
////		if(cnt == 0) {
//			System.out.println(a + "님은 저장되어 있지 않습니다.");
//		}

		// Q4) 다음과 같이 정답이 있을 때 사용자로부터 답을 입력받아 결과를 출력하고
		// 총점을 출력해라(배점은 각 20점)
		// 답 : 2, 4, 3, 5, 1

//		int[] arr = {2, 4, 3, 5, 1};
//		int[] answer = new int[arr.length];
//		System.out.println("====채점하기====");
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print((i + 1) + "번답 : ");
//			answer[i] = sc.nextInt();
////			System.out.print(answer[i] + " ");
//		}
//		
//		int cnt = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == answer[i]) {
//				System.out.print("O" + " ");
//				cnt++;
//			}else {
//				System.out.print("X" + " ");
//			}
//		}
//		System.out.println("-> 총점 : " + (cnt * 20) + "점");

		// Q5) 배열의 각 인덱스에 저장된 값 만큼 별을 출력
		// 배열 : 3, 4, 2, 5, 7

		// 추가문제
		// -> 배열의 길이를 키보드로 입력을 받아서 배열을 생성
		// 배열의 값을 랜덤하게 저장(1 ~ 15)
		// 별을 전부 출력

//		int[] arr = {3, 4, 2, 5, 7};
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(i + "인덱스 - " + arr[i] + " : ");
//			for (int j = 0; j < arr[i]; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	}

}
