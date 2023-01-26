package exam02;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {

		// * StringTokenizer 클래스
		// : 토큰은 분리된 문자열 조각
		// : 하나의 문자열을 여러개의 토큰으로 분리해주는 클래스

		// * 생성자
		// 1. StringTokenizer(문자열);
		// : 띄어쓰기를 기준으로 문자열을 분리
		// 2. StringTokenizer(문자열, 구분자);
		// : 구분자를 기준으로 문자열을 분리
		// 3. StringTokenizer(문자열, 구분자, true/false);
		// : 구분자를 기준으로 문자열을 분리
		// + 구분자를 토큰에 추가할 것인지 (true)
		// 추가 안시킬지(false, default값)

		// * 메소드
		// 1. hasMoreTokens() : 남아있는 토큰이 있으면 true 리턴
		// 없으면 false 리턴
		// 2. nextToken() : 다음 토큰을 반환하는 메소드
		// 3. countTokens() : 총 토큰의 개수를 리턴

		String str1 = "대한민국 미국 영국";
		String str2 = "대한*민국*미국*영국";
		String str3 = "대한민국*미국*영국";

//	StringTokenizer st = new StringTokenizer(str1);				// 생성자1. 띄어쓰기를 기준으로 문자열 분리
//	StringTokenizer st = new StringTokenizer(str2, "*");		// 생성자2. 구분자를 기준으로 문자열 분리
		StringTokenizer st = new StringTokenizer(str3, "*", true); // 생성자3. 구분자를 기준으로 문자열 분리, 토큰도 포

		System.out.println("토큰의 갯수 : " + st.countTokens());
		String token = "";
		while (st.hasMoreTokens()) { // 토큰이 남아있으면
			token = st.nextToken();
			System.out.println(token);
		}

	}

}
