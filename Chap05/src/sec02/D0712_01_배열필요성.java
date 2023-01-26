package sec02;

public class D0712_01_배열필요성 {

	public static void main(String[] args) {

		// 배열

		// Q) 학생 10명의 점수를 저장하고, 평균값을 구해라

//		학생1 = 90;
//		학생2 = 87;
//		학생3 = 76;
//		학생4 = 45;
//		학생5 = 78;
//		학생6 = 94;
//		학생7 = 70;
//		학생8 = 81;
//		학생9 = 65;
//		학생10 = 99;

//		int st1 = 90; 
//		int st2 = 87; 
//		int st3 = 76; 
//		int st4 = 45; 
//		int st5 = 78; 
//		int st6 = 94; 
//		int st7 = 70; 
//		int st8 = 81; 
//		int st9 = 65; 
//		int st10 = 99; 

//		int sum = (st1 + st2 + st3 + st4 + st5 + st6 + st7 + st8 + st9 + st10) / 10;
//		System.out.println(sum);

		// 배열이란?
		// : 같은 타입의 데이터를 연속된 공간에 나열하고, 각 데이터에 인덱스(index)를 부여한 자료구조
		// : 특징 -- 1. 같은 타입의 데이터만 저장할 수 있음
		// -- 2. 한번 생성된 배열은 길이를 늘리거나 줄일 수 없음
		// * 인덱스는 0부터 시작함
		// 배열 선언 방법 2가지
		// 타입[] 변수명; 타입 변수명[];

		// 배열 생성
		// 1. 값 목록으로 배열 생성
		// {90, 87, 76, 45, ....}
		int[] score = { 90, 87, 76, 45, 78, 94, 70, 81, 65, 99 };
		// 인덱스 0 1 2 3 4 5 6 7 8 9

//		System.out.println(score[5]);

		// 2. new 연산자를 활용
		// 타입[] 변수명 = new 타입[길이];
		// ex) int[] arr = new int[20];

		// Q) 87 + 78 + 94 + 99 + 65
//		int sum = score[1] + score[4] + score[5] + score[9] + score[8];
//		System.out.println(sum);

		// Q) 10명의 점수의 평균출력
//		int sum = 0;
//		for(int i = 0; i < 10; i++) {
////			System.out.println(score[i]);
////			sum = sum + score[i];
//			sum += score[i];
//		}

		// 배열변수.length score.length -> 배열의 길이를 리턴
//		System.out.println(score.length);	-> 10
//		for(int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//
//		System.out.println((double)sum/10);

		// String 배열 만들기
		// 타입[] 변수명 = {"값", "값", ...}

		String[] name = { "성은", "다인", "민교", "태원", "수빈", "채연", "수찬" };
		System.out.println(name[1]);
		name[1] = "기범"; // 배열 name의 index1 값을 변경 (다인->기범)
		System.out.println(name[1]);

	}

}
