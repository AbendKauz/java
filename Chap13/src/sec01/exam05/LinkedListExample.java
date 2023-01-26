package sec01.exam05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		// * ArrayList, LinkedList 실행 성능 비교
		// => ArrayList, LinkedList에 10,000개를 특정 위치에 삽입하는데 걸리는 시간을 측정 비교
		// 0번 인덱스에 String 객체를 10,000번 추가하는 시간 비교 ===> LinkedList가 더 빠른 성능을 보임

		// ArrayList 생성
		List<String> list1 = new ArrayList<>();

		long startTime; // 시작한 시간
		long endTime; // 끝난 시간

		startTime = System.nanoTime();
		// .nanoTime() : 시간 재는 method
		// -> JVM에서 임의로 고정된 구간부터 현재 나노세컨즈의 값을 반환

		// ArrayList에 0번째 인덱스에 String 객체(i)를 10,000번 넣는 코드

		for (int i = 0; i < 10000; i++) {
//			list1.add(0, i + "");
			list1.add(0, String.valueOf(i));
		}

		endTime = System.nanoTime();

		System.out.println("ArrayList 걸린 시간 : " + (endTime - startTime) + "ns");

		System.out.println("========================");

		// LinkedList 생성
		List<String> list2 = new LinkedList<>();

		startTime = System.nanoTime();

		// LinkedList에 0번째 인덱스에 String 객체(i)를 10,000번 넣는 코드
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}

		endTime = System.nanoTime();

		System.out.println("LinkedList 걸린 시간 : " + (endTime - startTime) + "ns");

		// ** 특정한 위치에 추가, 삭제하는 경우에는 앞뒤 링크 정보만 변경하는 LinkedList가 더 빠름
		// 끝에서부터(순차적으로) 추가, 삭제하는 경우는 ArrayList를 사용

	}

}
