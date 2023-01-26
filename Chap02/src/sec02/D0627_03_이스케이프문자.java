package sec02;

public class D0627_03_이스케이프문자 {

	public static void main(String[] args) {

		System.out.println("나는 \"자바\"를\t좋아\n한다.");

		// * 이스케이프 문자
		// -> 문자열 내부에 특정문자를 포함시키거나, 문자를 출력제어하는 기능

		// 1. \" -> " 큰따옴표출력
		// \' -> ' 작은따옴표출력
		// \\ -> \ 출력

		// 2. \t -> 탭만큼 띄움
		// \n -> 개행(줄바꿈)

		// 번호 날짜 이름
		// 01 06.23 준영
		// 02 06.23 길동
		// 오늘 "날씨"는
		// 시원합니다.
		// \내일 날씨\ 출력

		String a = "번호";
		String b = "날짜";
		String c = "이름";
		System.out.println(a + "\t" + b + "\t" + c);
//		System.out.println("번호\t날짜\t이름");
		System.out.println("01\t06.23\t준영");
		String date = "06.23";
		System.out.println("02\t" + date + "\t길동");
		System.out.println("오늘 \"날씨\" 는\n시원합니다.");
		System.out.println("\\내일 날씨\\");

	}

}
