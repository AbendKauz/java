package dayTest;

import java.util.Arrays;
import java.util.Scanner;

public class Test0720_Comment {

	public static void main(String[] args) {

		// 1. 정수형 배열의 크기를 스캐너로 입력받은 정수만큼 크기로 생성하고 1 ~ 10 사이의 랜덤값을 입력받는다.
		// 인접하는 요소가 동일한 값을 가지지 않도록
		// (=> {1, 3, 5, 5, 3, 2}가 되면 안된다. 5가 연속해서 나와서)

//		Scanner s = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		
//		int[] arr = new int[s.nextInt()];
//		
//		arr[0] = (int)(Math.random() * 10) + 1;	// 0번지에 먼저 랜덤생성
//		
//		for (int i = 1; i < arr.length; i++) {	// 1번지부터 마지막번지까지
//			do {	// 최소 1회 실행을 위해 do-while문 사용
//				arr[i] = (int)(Math.random() * 10) + 1;	// i번지의 값 랜덤생성
//			}while(arr[i] == arr[i - 1]);				// i번지와 i - 1번지의 값이 같을 경우 반복(for문 안에 있으므로 i++이 일어나지 않고 반복됨)
//		}
//
//		System.out.println(Arrays.toString(arr));

		// 2. 1번문제를 서로 다른 요소가 동일한 값을 가지지 않도록 프로그래밍
		// 배열의 요소수는 10 이하로
		// (ex => {1, 2, 5, 6, 1, 2}가 되면 안된다. 1이랑 2가 중복된다)

//		Scanner s = new Scanner(System.in);
//		System.out.print("10 이하의 정수 입력 : ");
//		
//		int[] arr = new int[s.nextInt()];
//		
//		arr[0] = (int)(Math.random() * 10) + 1;	// 0번지에 랜덤 생성
//		
//		for (int i = 1; i < arr.length; i++) {
//			int j;				// 변수 j 따로 생성(do-while문에서 비교해야 하므로 별개로 생성)
//			do {
//				arr[i] = (int)(Math.random() * 10) + 1;	// i번지 값 랜덤 생성
//				for(j = 0; j < i; j++) {				// 0번지부터 i - 1번지까지(i번지와 비교할 번지들)
//					if(arr[i] == arr[j]) {				// i번지와 j번지의 값이 같다면
//						break;	// break -> do-while문 계속(for문에서 j++이 이루어지지 않고 나가기 때문에 j값은 그대로 유지됨)
//					}
//				}
//			}while(j < i);		// j값이 i값과 같아질 때 까지 반복
//		}
//
//		System.out.println(Arrays.toString(arr));

//==================================================================================================================

		// 3. 월을 1 ~ 12의 숫자로 표시하고 해당 월의 영어 단어를 입력하는 프로그램 작성
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

//		Scanner s = new Scanner(System.in);
//		
//		String[] monthStr = {	// 월의 이름들을 저장할 배열
//				"January", "February", "March", "April", "May", "June",
//				"July", "August", "September", "October", "November", "December"
//		};
//		
//		System.out.println("해당 월의 영어 단어를 입력하시오.");
//		System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
//		
//		int last = -1;	// 이전에 제시된 월 저장할 변수(-1로 설정하면 초기에 같을수가 없으므로)
//		int mon;		// 랜덤으로 지정되는 월 저장할 변수
//		int regame;		// 게임을 계속할지 묻는 변수
//		do {
//			do {
//				mon = (int)(Math.random() * 12);	// 번지만 필요하므로 0~11까지 랜덤
//			}while(last == mon);	// 이전에 제시된 월과 랜덤으로 생성된 월이 같으면 반복
//		
//			last = mon;				// 방금전에 지정된 월을 이전에 제시된 월에 저장
//			
//			while(true) {
//				System.out.print(mon + 1 + "월 : ");	// mon은 0~11이므로 +1을 해야 1~12
//				String in = s.next();
//				
//				if(in.equals(monthStr[mon])) {	// 맞추면 반복문을 빠져나옴
//					break;
//				}
//				System.out.println("틀렸습니다.");	// 틀리면 반복(틀린 월 다시 표시)
//			}
//			System.out.print("정답입니다. 다시 한번? 1...Yes/0...No : 0 : ");
//			regame = s.nextInt();
//			
//		}while(regame == 1);	// 사용자가 1을 눌렀을 때 계속 반복

		// 4. 요일을 표시하고 해당 요일의 영어 단어를 입력하는 영어 학습 프로그램 작성
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
//		int a = -1;
//		int b;
//		do {
//			do {
//				b = (int)(Math.random() * 7);
//			}while(a == b);
//			a = b;
//			System.out.print(korWeek[b] + " : ");
//			String user = s.next();
//			if(user.equals(week[b])) {
//				System.out.print("정답입니다. 다시한번? 1...Yes/0...No :");
//				int select = s.nextInt();
//				if(select == 0) {
//					break;
//				}
//			}else {
//				System.out.println("틀렸습니다.");
//			}
//		}while(true);

	}

}
