package sec01.exam02;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {

		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();

		// 식별키 new Key(1)로 "홍길동"을 저장
		hashMap.put(new Key(1), "홍길동");

		// 식별키 new Key(1)로 "홍길동"을 읽어옴
		// -> number필드값이 같더라도 hashCode() 메소드에서 리턴하는
		// 해시코드가 다르므로 다른 식별키로 인식
		String value = hashMap.get(new Key(1));
		System.out.println(value);

		// -> 객체의 동등비교를 위해서는 Object의 equals()메소드만 재정의하면 안됨
		// -> hashCode() 메소드도 재정의 해서 논리적으로 동등한 객체일 경우
		// 동일한 해시코드가 리턴되도록 해야 함
	}

}
