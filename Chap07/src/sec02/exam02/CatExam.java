package sec02.exam02;

public class CatExam {

	public static void main(String[] args) {

		// 자식 클래스인 Cat 의 객체를 생성
		Cat cat = new Cat(); // cat 객체 생성시 부모 객체ㅏ 먼저 생성됨

		// Animal 자동 타입변환
		// : 부모타입 변수명 = 자식타입;
		// 방법 1
		Animal ani1 = cat;
		System.out.println(cat);
		System.out.println(ani1); // 동일한 Cat 객체를 참조

		// 참조 변수의 == 연산 -> 참조 번지가 같을 경우 true, 다를경우 false
		System.out.println(cat == ani1); // true

		// 방법2
		Animal ani2 = new Cat();
		System.out.println(ani2);
		System.out.println(cat == ani2); // false

	}

}
