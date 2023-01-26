package sec01.exam04;

public class MyClassExample {

	public static void main(String[] args) {

		// -> 위에서 만든 인터페이스와 클래스를 사용하여 아래와 같이 출력하기
		// 1) 필드로 선언한 rc를 사용하기 (인터페이스를 필드 타입으로 사용) -> setVolume( ) 의 매개값은 5
		// 2) 생성자의 매개변수 타입이 RemoteControl 인 생성자를 사용하기 (인터페이스를 생성자의 매개 변수 타입으로 사용)
		// 3) methodA 사용하기 (인터페이스를 로컬 변수 타입으로 사용한 메소드)
		// 4) methodB 사용하기 (인터페이스를 메소드의 매개 변수 타입으로 사용한 메소드)
		//
		// <console >
		// 1)----------------
		// TV를 켭니다.
		// 현재 TV 볼륨: 5
		// 2)----------------
		// Audio를 켭니다.
		// 현재 Audio 볼륨: 4
		// 3)----------------
		// Audio를 켭니다.
		// 현재 Audio 볼륨: 3
		// 4)----------------
		// TV를 켭니다.
		// 현재 TV 볼륨: 2

		MyClass my1 = new MyClass();
		System.out.println("1)----------------");
		my1.rc.turnOn();
		my1.rc.setVolume(5);

		System.out.println("2)----------------");
		MyClass my2 = new MyClass(new Audio());

		System.out.println("3)----------------");
		MyClass my3 = new MyClass();
		my3.methodA();

		System.out.println("4)----------------");
		MyClass my4 = new MyClass();
		my4.methodB(new Television());

	}

}
