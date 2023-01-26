package sec03;

import java.util.Calendar;

public class D0720_02_확인문제 {

	public static void main(String[] args) {

//		LoginResult a = LoginResult.FAIL_PASSWORD;
//		if(a == LoginResult.SUCCESS) {
//			System.out.println("Success");
//		}else if(a == LoginResult.FAIL_ID) {
//			System.out.println("Fail_Id");
//		}else if(a == LoginResult.FAIL_PASSWORD) {
//			System.out.println("Fail_Password");
//		}

		// Week -> 열거타입
		// 오늘의 날짜 출력
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; // 1월 = 0
		int day = calendar.get(Calendar.DATE);
		Week today = null;

		int week = calendar.get(Calendar.DAY_OF_WEEK);
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}

		System.out.println("오늘의 날짜는 " + year + "년 " + month + "월 " + day + "일 " + today + "요일");

		// Season -> 열거타입
		// 오늘 계절 출력
		Season season = null;
		int se = calendar.get(Calendar.MONTH);
//		switch (se) {
//			case 12, 1, 2: 
//				season = Season.WINTER;
//				break;
//			case 3, 4, 5:
//				season = Season.SPRING;
//				break;
//			case 6, 7, 8:
//				season = Season.SUMMER;
//				break;
//			case 9, 10, 11:
//				season = Season.FALL;
//				break;
//		}
		switch (se / 3) {
		case 0, 4:
			season = Season.WINTER;
			break;
		case 1:
			season = Season.SPRING;
			break;
		case 2:
			season = Season.SUMMER;
			break;
		case 3:
			season = Season.FALL;
			break;
		}
		System.out.println("지금 계절은 " + season + "입니다.");

	}

}
