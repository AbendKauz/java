package sec01.exam01;

public class D0831_작업스레드생성방법1 {

	public static void main(String[] args) {

		// 1. Thread 클래스로부터 직접 생성
		// => 작업 스레드 객체를 직접 생성하려면 Thread의 생성자를 호출 (매개값 Runnable)
		// Runnable은 인터페이스 타입이어서 구현 객체를 만들어 대입해야함
		// => run() 메소드가 정의되어 있으므로 구현 클래스에서 재정의해야함

		// 2. Thread 클래스를 상속해서 하위 클래스를 만들어 생성
		// => Thread의 하위 클래스를 작업스레드로 정의 -> 작업 내용을 포함

		// => Thread 클래스를 상속한 후 -> run() 메소드를 재정의(작업스레드에서 실행할 내용)
		// 작업스레드 클래스로부터 작업스레드 객체를 생성

	}

}
