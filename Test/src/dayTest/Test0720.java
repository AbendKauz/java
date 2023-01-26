package dayTest;

import java.util.Arrays;
import java.util.Scanner;

public class Test0720 {

	public static void main(String[] args) {

		// 1. 월을 1 ~ 12의 숫자로 표시하고 해당 월의 영어 단어를 입력하는 프로그램 작성
		// - 월은 랜덤 수로 생성
		// - 동일 월을 연속해서 표시하지 말것

		// ( 실행 예 )
		// 해당 월의 영어 단어를 입력하시오.
		// 첫 글자는 대문자, 나머지는 소문자로 입력하세요.
		// 12월 : December
		// 정답입니다. 다시 한번? 1...Yes/0...No : 1
		// 10월 : March
		// 틀렸습니다.
		// 10월 : October
		// 정답입니다. 다시 한번? 1...Yes/0...No : 0

//		String[] month = new String[] {
//				"January", "February", "March", "April", "May", "June",
//				"July", "August", "September", "October", "November","December"
//		};
//		
//		Scanner s = new Scanner(System.in);
//		boolean chk = true;
//		int a = 0;
//		int b;
//		
//		System.out.println("해당 월의 영어 단어를 입력하시오.");
//		System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
//		do {
//			boolean answer = false;
//			do {
//				b = (int)(Math.random() * 12) + 1;
//			}while(a == b);
//			a = b;
//			System.out.print(a + "월 : ");
//			String user = s.next();
//			
//			for (int i = 0; i < month.length; i++) {
//				if(month[i].equals(user)) {
//					answer = true;
//					System.out.print("정답입니다. 다시한번? 1...Yes/0...No : ");
//					int select = s.nextInt();
//					if(select == 0) {
//						chk = false;
//					}else {
//						continue;
//					}
//				}
//			}
//			if(!answer) {
//				System.out.println("틀렸습니다.");
//			}
//		}while(chk);

		// 2. 요일을 표시하고 해당 요일의 영어 단어를 입력하는 영어 학습 프로그램 작성
		// - 요일은 난수를 사용
		// - 동일 요일을 연속해서 표시하지 말것

		// ( 실행 예 )
		// 요일명을 영어 소문자로 입력하시오.
		// 일요일 : sunday
		// 정답입니다. 다시 한번? 1...Yes/0...No : 1
		// 수요일 : wednesday
		// 정답입니다. 다시 한번? 1...Yes/0...No : 0

//		Scanner s = new Scanner(System.in);
//		String[] week = new String[] {
//			"sunday", "monday", "tuesday", "wednesday",
//			"thursday", "friday", "saturday"
//		};
//		String[] korWeek = new String[] {
//			"일요일", "월요일", "화요일", "수요일",
//			"목요일", "금요일", "토요일"
//		};
//		System.out.println("요일을 영어 소문자로 입력하시오.");
//		int a = 0;
//		int b;
//		boolean answer = false;
//		do {
//			while(a == b) {
//				b = (int)(Math.random() * 7) + 1;
//			}
//			a = b;
//			System.out.print(korWeek[b + 1] + " : ");
//			String user = s.next();
//			if(user.equals(korWeek[b + 1])) {
//				answer = true;
//				System.out.print("정답입니다. 다시한번? 1...Yes/0...No :");
//				int select = s.nextInt();
//				if(select == 0) {
//					break;
//				}
//			}
//			if(!answer) {
//				System.out.println("틀렸습니다.");
//			}
//		}while(true);
//		

		// 3. 정수형 배열의 크기를 스캐너로 입력받은 정수만큼 크기로 생성하고 1 ~ 10 사이의 랜덤값을 입력받는다.
		// 인접하는 요소가 동일한 값을 가지지 않도록
		// (=> {1, 3, 5, 5, 3, 2}가 되면 안된다. 5가 연속해서 나와서)

//		Scanner s = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int a = s.nextInt();
//		int[] arr = new int[a];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 10) + 1;
//		}
//		for (int i = 0; i < arr.length - 1; i++) {
//			while(arr[i] == arr[i + 1]) {
//				arr[i + 1] = (int)(Math.random() * 10) + 1;
//			}
//		}
//		System.out.println(Arrays.toString(arr));

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		// 4. 3번문제를 서로 다른 요소가 동일한 값을 가지지 않도록 프로그래밍
		// 배열의 요소수는 10 이하로
		// (ex => {1, 2, 5, 6, 1, 2}가 되면 안된다. 1이랑 2가 중복된다)

//		Scanner s = new Scanner(System.in);
//		System.out.print("10 이하의 정수 입력 : ");
//		int a = s.nextInt();
//		int[] arr = new int[a];
//		
//		int i = 0;			// arr.length count
//		int num = 0;		// 랜덤수 입력값
//		boolean chk = true;	// 같은 값의 번지 확인용
//		
//		while(i < arr.length) {
//			chk = true;
//			num = (int)(Math.random() * 10) + 1;
//			for (int j = 0; j < i; j++) {
//				if(num == arr[j]) {
//					chk = false;
//					break;
//				}
//			}
//			if(chk) {
//				arr[i] = num;
//				i++;
//			}
//		}
//		
//		System.out.println(Arrays.toString(arr));

	}

}
