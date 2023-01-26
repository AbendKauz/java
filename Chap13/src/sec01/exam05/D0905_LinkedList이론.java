package sec01.exam05;

public class D0905_LinkedList이론 {

	public static void main(String[] args) {

		// => 객체를 추가하거나, 삭제를 하게되면 해당 인덱스부터 마지막 인덱스까지 모두 1씩 밀림 또는 땡겨짐
		// * 저장된 객체 수가 많고, 특정 인덱스에 객체를 추가 또는 제거하는 일이 많다면
		// => ArrayList 사용하지 않는 것이 좋음
		// 이럴 때는 LinkedList를 사용하는 것이 좋음

		// * LinkedList
		// : 사용방법은 ArrayList와 똑같은데, 내부 구조가 완전히 다름
		// ArrayList는 내부 배열에 객체를 저장해서 관리하지만, LinkedList는 인접 참조를 링크해서 체인처럼 관리함

		// List<E> 변수명 = new LinkedList<E>();
		// List<E> 변수명 = new LinkedList<>();

		// * 특징 : 인접 참조를 링크해서 체인처럼 관리
		// -> 앞, 뒤의 요소를 참조 // 객체의 삭제, 삽입 등에 유리함

	}

}
