package sec02;

public class D0704_08_��������2 {

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

		// �빮�� -> 65�̻� ~ 90����
		// charCode >= 65 && charCode <= 90
//		if((charCode >= 65) && (charCode <= 90)) {
//			System.out.println("�빮���Դϴ�.");
//		}else {
//			System.out.println("�빮�ڰ� �ƴմϴ�.");
//		}

		// �ҹ��� -> 97�̻� 122����
//		if((charCode >= 97) && (charCode <= 122)) {
//			System.out.println("�ҹ����Դϴ�.");
//		}else {
//			System.out.println("�ҹ��ڰ� �ƴմϴ�.");
//		}

		int value = 6;

		if ((value % 2 == 0) || (value % 3 == 0)) {
//				   T          ||         T
			System.out.println("2 �Ǵ� 3�� ���");
		}

	}

}
