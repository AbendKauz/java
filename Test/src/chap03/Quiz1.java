package chap03;

public class Quiz1 {

	public static void main(String[] args) {

		// 1. Ŭ������ Quiz1 �� ����
		// 2. int Ÿ���� appleNum �� ���� �� 123���� �ʱ�ȭ�ϱ� (����� �� 123��)
		// 3. int Ÿ���� bucketSize �� ���� �� 10���� �ʱ�ȭ�ϱ�
		// (�ٱ����� ũ�� -> 10���� ����� ���� �� ����)
		// 4. int Ÿ���� bucketNum�� �����ϱ� (�ʿ��� �ٱ����� ����)
		// 5. appleNum, bucketSize, ��������ڸ� Ȱ���Ͽ� �� �� ���� �ٱ��ϰ�
		// �ʿ����� ���� �� �� ���� ���� bucketNum �� �����Ͻÿ�.
		// 6. bucketNum �� ���� ����Ͻÿ�.
		int appleNum = 123;
		int bucketSize = 10;
		int bucketNum = (appleNum % bucketSize);
//		// 1)
//		if(appleNum % bucketSize == 0) {
//			bucketNum = appleNum / bucketSize;
//		}else {
//			bucketNum = appleNum / bucketSize + 1;
//		}
//		System.out.println("����� �� : " + appleNum);
//		System.out.println("�ʿ��� �ٱ����� �� : " + bucketNum);

//		// 2)
		System.out.println((appleNum % bucketSize == 0) ? "�ʿ��� �ٱ����� �� : " + bucketNum : "�ʿ��� �ٱ����� �� : " + bucketNum + 1);

	}

}
