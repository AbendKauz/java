package sec02;

public class D0704_08_논리연산자2 {

	public static void main(String[] args) {

//		int a = 10;
//		int b = 4;
//		
//		System.out.println((a > b) && (a < 10));
//		//					   T    &&     F		// F
//		System.out.println((a > b) && (a <= 10));
//		//						T	  &&	  T		// T
//		
//		System.out.println((a < 7) || (a <= 10));
//		//						F	  ||	  T		// T
//		
//		int charCode = 'A';
//		System.out.println(charCode);	// 65

		// 대문자 -> 65이상 ~ 90이하
		// charCode >= 65 && charCode <= 90
//		if((charCode >= 65) && (charCode <= 90)) {
//			System.out.println("대문자입니다.");
//		}else {
//			System.out.println("대문자가 아닙니다.");
//		}

		// 소문자 -> 97이상 122이하
//		if((charCode >= 97) && (charCode <= 122)) {
//			System.out.println("소문자입니다.");
//		}else {
//			System.out.println("소문자가 아닙니다.");
//		}

		int value = 6;

		if ((value % 2 == 0) || (value % 3 == 0)) {
//				   T          ||         T
			System.out.println("2 또는 3의 배수");
		}

	}

}
