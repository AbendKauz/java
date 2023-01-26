package sec01;

public class D0622_01_변수사용범위 {

	public static void main(String[] args) {

		int v1 = 13;
		int v2 = 5;
		// v2가 출력보다 아래에서 선언되서 출력문에서 error 발생
		// System.out.println(v2);
		if (v1 > 10) {
			// int v2;
			v2 = v1 - 10;
			System.out.println(v2);
		}
		// if문에 v2를 선언했을 경우에는 if문 중괄호 밖에서 사용 불가
		// v2를 더 위에 메인 메소드 선언부 아래에 선언하면 사용 가능
//		int v3 = v1 + v2 + 5;

	}

}
