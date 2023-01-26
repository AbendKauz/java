package sec01.exam04;

public class MainThreadExample {

	public static void main(String[] args) {

		// -> Calculator 객체를 생성하기
		Calculator calculator = new Calculator(); // 공유객체

		// -> User1 스레드 생성 후 스레드 객체의 setCalculator() 을 이용하여 Calculator 공유객체 전달
		// User1 스레드 시작
		User1 th1 = new User1();
		th1.setCalculator(calculator);
		th1.start();

		// -> User2 스레드생성 후 스레드 객체의 setCalculator() 을 이용하여 Calculator 공유객체 전달
		// User2 스레드 시작
		User2 th2 = new User2();
		th2.setCalculator(calculator);
		th2.start();

	}

}
