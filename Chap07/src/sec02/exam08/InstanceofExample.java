package sec02.exam08;

public class InstanceofExample {

	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child 변환 성공");
		} else {
			System.out.println("변환 실패");
		}
	}

	public static void main(String[] args) {

		Parent parentA = new Child();
		method1(parentA); // 성공

		Parent parentB = new Parent();
		method1(parentB); // 실패

	}

}
