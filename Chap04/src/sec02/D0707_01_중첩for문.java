package sec02;

public class D0707_01_��øfor�� {

	public static void main(String[] args) {

		// ��ø for��
		// -> for�� �ȿ� �� �ٸ� for���� ����ִ� ����
		// for(�ʱⰪ; ���ǽ�; ������){
		// �ݺ��� ���๮
		// for(�ʱⰪ; ���ǽ�; ������){
		// �ݺ��� ���๮
		// }
		// }

//		for(int i = 0; i <= 3; i++) {
//			System.out.println("=====" + i + "=====");
//			for(int num = 0; num <= 5; num++) {
//				System.out.println(i + " - " + num);
//			}
//		}

		// 2~4�ܱ��� �������� ����ϴ� ���α׷� �ۼ�
//		for(int i = 2; i <= 4; i++) {
//			System.out.println("**** " + i + "�� ****");
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i + " x " + j + " = " + (i * j));
//			}
//		}

		// 2~9�ܱ��� �������� ���
		// x 1 -> ����
//		// 1)
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 2; j <= 9; j++) {
//				if(j == 9) {
//					System.out.println(j + " x " + i + " = " + (j * i));
//				}else {
//					System.out.print(j + " x " + i + " = " + (j * i) + "\t");
//				}
//			}
//		}

//		// 2)
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " x " + i + " = " + (j * i) + "\t");
			}
			System.out.println();
		}

	}

}
