package sec01.exam12;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {

		// * HashMap과 Hashtable의 차이점
		// - Hashtable : 동기화된 메소드로 구성되어있기 때문에 멀티스레드 환경에서
		// 안전하게 객체를 추가, 삭제가 가능함
		// - HashMap : 싱글스레드 환경일 때 사용하는 것이 좋음
		// 멀티스레드 환경에서는 사용하지 않아야함

		// * Hashtable 생성
		// Map<키타입, 값타입> 변수명 = new Hashtable<>();

		// -> 키는 String 타입(아이디를 저장) , 값은 String 타입(비밀번호를 저장) 를 저장하는 Hashtable 생성
		// // 변수명은 map

		Map<String, String> map = new Hashtable<>();

		// -> map 에 객체 추가하기
		// key : spring value : 12
		// key : summer value : 123
		// key : fall value : 1234
		// key : winter value : 12345

		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		// -> 키보드로 아이디와 비밀번호를 입력 받아서, Hashtable 에 저장되어 있는 키, 값을 비교
		// 콘솔 사진처럼 출력 하는 코드를 작성하시오

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디 입력 >> ");
			String id = sc.next();
			System.out.print("비밀번호 입력 >> ");
			String pw = sc.next();
			System.out.println();

			// 1.
			// containsKey(키) : 주어진 키가 저장되어 있는지 여부를 확인
			// -> 저장되어있으면 true를 리턴
			if (map.containsKey(id)) { // id를 비교
				if (map.get(id).equals(pw)) { // pw를 비교
//				if(map.containsValue(pw)) {	// pw를 비교
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}

			// 2.
			boolean chk = false;
			boolean chkPw = false;
			for (Map.Entry<String, String> entry : map.entrySet()) {
				String key = entry.getKey();
				String val = entry.getValue();
				if (key.equals(id)) {
					if (val.equals(pw)) {
						chk = true;
						break;
					} else {
						System.out.println("비밀번호가 일치하지 않습니다.");
						chkPw = true;
						break;
					}
				}
			}
			if (chk) {
				System.out.println("로그인 되었습니다.");
				break;
			}
			if (!chkPw) {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
	}
}
