package sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {

//		Korean k1 = new Korean();
//		System.out.println("k1 이름 : " + k1.name);
//		
//		Korean k2 = new Korean();
//		// k2.name = "박길동";
//		System.out.println("k2 이름 : " + k2.name);

		Korean k1 = new Korean("박자바", "012345-1234567");
		Korean k2 = new Korean("김자바", "012345-7890123");

		System.out.println("k1 이름 : " + k1.name + ", 주민번호 : " + k1.ssn);
		System.out.println("k2 이름 : " + k2.name + ", 주민번호 : " + k2.ssn);

	}

}
