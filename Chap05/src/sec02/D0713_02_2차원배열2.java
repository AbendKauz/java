package sec02;

import java.util.Scanner;

public class D0713_02_2차원배열2 {

	public static void main(String[] args) {

		// Q1) 배열의 길이를 키보드로 값을 입력받아 배열을 생성
		// 배열에는 값이 2, 4, 8, 16, 32, 64, 128, 256, 512,....이
		// 들어갈 수 있도록 코드를 작성 후 배열을 출력
		// [console]
		// 2 4 8 16 32 64 128 256 512....
		// [console]
		// 정수입력 : 12
		// 2 4 8 16 32 64 128 256 512 1024 2048 4096

//		Scanner sc = new Scanner(System.in);
//		System.out.print("배열의 길이 : ");
//		int length = sc.nextInt();
//		
//		int num = 2;
//		int[] arr = new int[length];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = num;
//			num *= 2;
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		// Q2) 1차원 문자형 배열을 선언한 후 "자","바"로 초기화(배열크기 = 2)
		// 숫자를 입력받아 입력받은 수가 5인 경우 "자바자바자",
		// 8인 경우 "자바자바자바자바"를
		// 출력하는 프로그램 작성
		// [console]
		// ====자바 출력====
		// 정수입력 >> 5
		// 자바자바자

		// [console]
		// ====자바 출력====
		// 정수입력 >> 8
		// 자바자바자바자바

//		String[] arr1 = new String[2];
//		arr1 = new String[] {"자", "바"};
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("====자바 출력====");
//		System.out.print("정수 입력 >> ");
//		int cnt = sc.nextInt();
//		for (int i = 0; i < cnt; i++) {
//			if(i % 2 != 0) {
//				System.out.print(arr1[1]);
//			}else {
//				System.out.print(arr1[0]);
//			}
//		}

		// Q3) 아래와 같이 name 배열을 생성하고 각각의 이름으로 초기화
		// Scanner로 읽어들인 이름이 몇 번째 index에 저장되어 있는지
		// 검색하는 프로그램 작성
		// 혼자바, 홍길동, 이민후, 김우영, 임수아, 박지우

		// [console]
		// 검색할 이름을 입력 >> 김우진
		// 김우진님은 3번째 index에 저장되어 있습니다.

		// [console]
		// 검색할 이름을 입력 >> 홍길동
		// 홍길동님은 1번째 index에 저장되어 있습니다.

//		String[] name = new String[6];
//		name = new String[] {"혼자바", "홍길동", "이민후", "김우영", "임수아", "박지우"};
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("검색할 이름을 입력 >> ");
//		String user = sc.nextLine();
//		
//		for (int i = 0; i < name.length; i++) {
//			if(user.equals(name[i])) {
//				System.out.println(name[i] + "님은 "+ i +"번째 index에 저장되어 있습니다.");
//			}
//		}

		// Q4) 다음과 같이 정답이 있을 때 사용자로부터 답을 입력받아 결과를 출력하고
		// 총점을 출력해라(배점은 각 20점)
		// 답 : 2, 4, 3, 5, 1
		// [console]
		// ====채점하기====
		// 1번답 >> 2
		// 2번답 >> 3
		// 3번답 >> 3
		// 4번답 >> 5
		// 5번답 >> 4
		// 정답확인
		// O X O O X -> 총점 : 60점
//		Scanner sc = new Scanner(System.in);
////		int[] arr = {2, 4, 3, 5, 1};
//		
//		// 답안도 입력받으래...ㅇ>-ㄷ
//		
//		System.out.println("====답안작성====");
//		int[] arr = new int[5];
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print((i + 1) + "번째 답 >> ");
//			arr[i] = sc.nextInt();
//		}
//		System.out.println("====채점하기====");
//		int[] user = new int[5];
//		String[] cnt = new String[5];
//		
//		for (int i = 0; i < user.length; i++) {
//			System.out.print((i + 1) + "번째 답 >> ");
//			user[i] = sc.nextInt();
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] == user[i]) {
//				cnt[i] = "O";
//			}else {
//				cnt[i] = "X";
//			}
//		}
//		System.out.println("정답확인");
//		int sum = 0;
//		for (int i = 0; i < cnt.length; i++) {
//			System.out.print(cnt[i] + " ");
//			if(cnt[i].equals("O")) {
//				sum += 20;
//			}
//		}
//		System.out.println("총점 : " + sum + "점");

//------------------------------------------------------------------------------------

		// 0714 추가문제

		// Q5) 배열의 각 인덱스에 저장된 값 만큼 별을 출력
		// 배열 : 3, 4, 2, 5, 7
		// [console]
		// index 0 - ***
		// index 1 - ****
		// index 2 - **
		// index 3 - *****
		// index 4 - *******

//		int[] arr = new int[] {3, 4, 2, 5, 7};
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(i + "index - " + arr[i] + " : ");
//		
//			for(int j = 1; j <= arr[i]; j++) {
//				System.out.print("*");
//			}
//		
//			System.out.println();
//		}

		// Q5.1)
		// 원하는 길이만큼 배열 생성
		// 값들을 random으로(1~15)
		// 오늘은 조용히 넘어갈 줄 알았는데 ㅇ>-ㄷ

		Scanner sc = new Scanner(System.in);
		System.out.print("배열 길이 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 15) + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + " index - " + arr[i] + " : ");

			for (int j = 1; j <= arr[i]; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
