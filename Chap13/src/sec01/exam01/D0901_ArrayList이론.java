package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

public class D0901_ArrayList이론 {

	public static void main(String[] args) {

		// List<E> 변수명 = new ArrayList<E>();
		// => 저장할 객체 타입을 E라고 적힌 부분에 표기

		// List<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<>();

		// 기본생성자로 ArrayList 객체 생성 -> 내부에 10개의 객체를 저장할 수 있는 초기 용량
		// => 객체 수가 늘어나면 용량은 자동으로 증가

		// => 객체를 추가하거나, 삭제를 하게되면 해당 인덱스부터 마지막 인덱스까지 모두 1씩 밀림 또는 땡겨짐
		// * 저장된 객체 수가 많고, 특정 인덱스에 객체를 추가 또는 제거하는 일이 많다면
		// => ArrayList 사용하지 않는 것이 좋음
		// 이럴 때는 LinkedList를 사용하는 것이 좋음

	}

}
