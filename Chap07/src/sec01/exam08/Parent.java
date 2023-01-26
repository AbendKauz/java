package sec01.exam08;

public class Parent {

	public String nation;

	public Parent() { // 부모 생성자로 먼저 부모 객체부터 생성 후 자식객체 생성
		this("대한민국"); // 밑에 있는 다른 생성자를 호출
		System.out.println("P3");
		System.out.println("Parent() 호출");
	}

	public Parent(String nation) {
		System.out.println("P1");
		this.nation = nation;
		System.out.println("P2");
		System.out.println("Parent(String nation) 호출");
	}

}
