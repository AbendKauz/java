package sec02;

public class D0704_10_���׿�����1 {

	public static void main(String[] args) {

		// ���׿�����
		// ���ǽ� ? �� �Ǵ� ����� : �� �Ǵ� �����
		// true : ____________

		// false : ____________

		// 90 �ʰ� -> A���
		// 90 ���� -> B���
		int score = 83;
//		System.out.println( (score > 90) ? "A���" : "B���" );

//		if(score > 90) {
//			System.out.println("A���");
//		}else {
//			System.out.println("B���");
//		}

		// 90 �ʰ� -> A���
		// 80 �ʰ� -> B���
		// 80 ���� -> C���
//		if(score > 90) {
//			System.out.println("A���");
//		}else if(score > 80) {
//			System.out.println("B���");
//		}else {
//			System.out.println("C���");
//		}

		System.out.println((score > 90) ? "A���" : ((score > 80) ? "B���" : "C���"));

	}

}
