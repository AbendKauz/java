package sec01.exam03;

public class D0902_Vector이론 {

	public static void main(String[] args) {

		// * Vector
		// : ArrayList와 동일한 내부 구조를 가짐

		// List<E> 변수명 = new Vector<E>();

		// * ArrayList와 차이점
		// : 동기화된 메소드로 구성되어 있기 때문에
		// 멀티 스레드가 동시에 Vector의 메소드들을 실행할 수 없고,
		// 하나의 스레드가 메소드를 실행을 완료해야만
		// 다른 스레드가 메소드를 실행할 수 있음
		// => 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있음

		// 보통 싱글 스레드에서는 ArrayList
		// 멀티 스레드에서는 Vector를 사용함

	}

}
