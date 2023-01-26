package sec01;

public class D0622_01_변수사용 {
	public static void main(String[] args) {

		// 교재 p.53

		// Q1) int 타입의 hour 변수를 선언과 동시에 3이라는 초기값 부여
		int hour = 3;

		// Q2) int 타입의 minute 변수를 선언과 동시에 5이라는 초기값 부여
		int minute = 5;

		// Q3) 출력문 수행하는 것을 변수 사용
		// 콘솔창에 3시간 5분 이라고 출력되도록 출력문 작성하기
		System.out.println(hour + "시간 " + minute + "분");

		String name = "김준영";
		String a = "광주 국제";

		// Q4) 콘솔창에 광주 국제 김준영입니다. 를 출력
		// System.out.println("광주 국제 김준영입니다.");
		System.out.println(a + " " + name + "입니다.");

		// Q5) 시간 -> 분으로 바꾸기
		// 1시간 -> 60분 -> hour = 3시간 = (3*60)180분

		System.out.println(hour); // 3이 출력
		System.out.println(hour * 60); // 3시간이 180분으로 나오도록 출력

		System.out.println(minute); // 5분

		// Q6) hour = 3, minute = 5 ---> 총 몇분인지
		// 3시간 5분 ==> 총 몇분인지????
		// 형식 : "총 000분"

		// int totalMinute = (시간*60) + 분;
		int totalMinute = (hour * 60) + minute;
		System.out.println("\"" + "총 " + totalMinute + "분" + "\"");

	}
}
