package sec01.exam08;

public class Child extends Parent {

	private String name;

	public Child() {
		this("홍길동"); // this(): 다른 생성자 호출
		System.out.println("Child() 호출");
	}

	public Child(String name) {
		System.out.println("C1");
		this.name = name;
		System.out.println("C2");
		System.out.println("Child(String nation) 호출");
	}

}
