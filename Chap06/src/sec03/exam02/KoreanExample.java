package sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {

//		Korean k1 = new Korean();
//		System.out.println("k1 �̸� : " + k1.name);
//		
//		Korean k2 = new Korean();
//		// k2.name = "�ڱ浿";
//		System.out.println("k2 �̸� : " + k2.name);

		Korean k1 = new Korean("���ڹ�", "012345-1234567");
		Korean k2 = new Korean("���ڹ�", "012345-7890123");

		System.out.println("k1 �̸� : " + k1.name + ", �ֹι�ȣ : " + k1.ssn);
		System.out.println("k2 �̸� : " + k2.name + ", �ֹι�ȣ : " + k2.ssn);

	}

}
