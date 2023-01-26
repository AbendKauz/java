package chap03;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {

		// 정수를 하나 키보드로 입력받아 -> 스캐너
		// int 타입의 num 이라는 변수에 값을 저장
		// b 라는 변수에 num 이 5의 배수인지, 아닌지 (ture, false)
		// 값을 저장해서
		// b의 값을 출력하시오
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean b = (num % 5 == 0);
		if (b) {
			System.out.println(num + "은(는) 5의 배수입니다.");
		} else {
			System.out.println(num + "은(는) 5의 배수가 아닙니다.");
		}

	}

}
