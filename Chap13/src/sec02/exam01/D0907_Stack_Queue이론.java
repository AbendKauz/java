package sec02.exam01;

public class D0907_Stack_Queue이론 {

	public static void main(String[] args) {

		// * LIFO (Last In First Out : 후입 선출)
		// -> 나중에 넣은 객체가 먼저 빠져나가는 자료 구조 (Stack클래스)

		// * FIFO (First In FIrst Out : 선입 선출)
		// -> 먼저 넣은 객체가 먼저 빠져나가는 자료 구조 (Queue인터페이스)

		// ================= Stack 클래스 =================

		// * Stack 객체를 생성하는 방법
		// Stack<E> 변수명 = new Stack<E>();

		// * 주요 메소드
		// -> push(E) : 주어진 객체를 스택에 넣는 메소드 (객체 저장)
		// -> peek() : 스택 맨 위의 객체 하나를 가져옴 (객체를 스택에서 제거하지 않음, 객체의 참조만 얻어옴)
		// -> pop() : 스택 맨 위의 객체 하나를 가져옴 (객체를 스택에서 제거함)

		// ================= Queue 인터페이스 =================
		// * FIFO (가장 먼저 넣은 객체가 먼저 빠져나가는 구조)

		// -> Queue 인터페이스를 구현한 대표적인 클래스 : LinkedList
		// LinkedList : List 인터페이스를 구현한 클래스이지만, Queue 인터페이스도 구현하고 있는 클래스

		// * Queue 객체를 생성
		// Queue<E> 변수명 = new LinkedList<E>();

		// * 주요 메소드
		// -> offer(E) :주어진 객체를 큐에 넣는 메소드 (객체 저장)
		// -> peek() : 큐에서 객체를 하나 가져옴(객체를 큐에서 제거하지 않음)
		// -> poll() : 큐에서 객체를 하나 가져옴(객체를 큐에서 제거)

	}

}
