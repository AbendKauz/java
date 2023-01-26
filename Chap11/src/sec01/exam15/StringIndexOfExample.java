package sec01.exam15;

public class StringIndexOfExample {

	public static void main(String[] args) {

		String subject = "자바 프로그래밍";

		int location = subject.indexOf("프로그래밍");
		// index 3번부터 "프로그래밍" 단어가 있기 때문에 3 반환
		System.out.println(location);

		// 특정 문자열이 존재하지 않으면 -1 리턴
		if (subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책임");
		} else {
			System.out.println("자바와 관련없는 책임");
		}

	}

}
