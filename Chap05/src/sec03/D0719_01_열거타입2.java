package sec03;

import java.util.Calendar;

public class D0719_01_열거타입2 {

	public static void main(String[] args) {

		Week today = null;

		// 자바에서 컴퓨터의 날짜 및 요일, 시간을 얻기위해 Calendar 클래스를 제공

		// Calendar 클래스 타입의 변수를 선언하고
		// Calendar.getInstance() method로 Calendar 객체를 얻어옴
		Calendar now = Calendar.getInstance();

//		int year = now.get(Calendar.YEAR);	// 현재 년도를 확인
//		System.out.println(year);	// 2022
//		
//		int month = now.get(Calendar.MONTH);// 현재 월을 확인 (1월 : 0)
//		System.out.println(month);	// 6 -> 1월 : 0
//		
//		int date = now.get(Calendar.DATE);	// 현재 날짜를 확인
//		System.out.println(date);	// 19

		int week = now.get(Calendar.DAY_OF_WEEK); // 현재 요일를 확인
		// 일요일 : 1, 토요일 : 7
		// 일(1), 월(2), 화(3), 수(4), 목(5), 금(6), 토(7)
		System.out.println(week); // 3 -> 화요일

		switch (week) {
		case 1: {
			today = Week.SUNDAY;
			System.out.println("오늘은 일요일");
			break;
		}
		case 2: {
			today = Week.MONDAY;
			System.out.println("오늘은 월요일");
			break;
		}
		case 3: {
			today = Week.TUESDAY;
			System.out.println("오늘은 화요일");
			break;
		}
		case 4: {
			today = Week.WEDNESDAY;
			System.out.println("오늘은 수요일");
			break;
		}
		case 5: {
			today = Week.THURSDAY;
			System.out.println("오늘은 목요일");
			break;
		}
		case 6: {
			today = Week.FRIDAY;
			System.out.println("오늘은 금요일");
			break;
		}
		case 7:
			today = Week.SATURDAY;
			System.out.println("오늘은 토요일");
			break;
		}
		System.out.println(today);

	}

}
