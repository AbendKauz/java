package sec01.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) {

		// -> 학생 정보 관리 프로그램 만들기
		// -> ArrayList 생성(저장할 객체 타입- Member 클래스 타입)해서 콘솔사진과 같은 결과가 나오도록
		// 코드를 작성하시오

		List<Member> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("[1]학생정보 저장\t[2]전체학생 조회\t[3]특정학생 조회\t[4]특정학생 삭제\t[5]프로그램 종료");
			String select = s.next();
			if (select.equals("1")) {
				System.out.print("등록할 학생 입력>>");
				String name = s.next();
				System.out.print("등록할 나이 입력>>");
				int age = Integer.parseInt(s.next());
				System.out.print("등록할 성별 입력>>");
				String gender = s.next();
				list.add(new Member(name, age, gender)); // 생성자를 이용해 list에 add
			} else if (select.equals("2")) {
				System.out.println("전체학생 조회>>");
				int i = 0;
				for (Member member : list) {
					System.out.println(list.get(i++));
				}
			} else if (select.equals("3")) {
				System.out.print("조회할 학생 이름>>");
				String userName = s.next();
				int cnt = 0;
				for (Member member : list) {
					if (userName.equals(member.getName())) {
						System.out.println(list.get(cnt));
						break;
					}
					cnt++;
				}
				if (cnt >= list.size()) {
					System.out.println("해당 학생 정보가 없습니다.");
				}
			} else if (select.equals("4")) {
				System.out.print("삭제할 학생 이름>>");
				String reName = s.next();
				int cnt = 0;
				for (Member member : list) {
					if (reName.equals(member.getName())) {
						list.remove(cnt);
						System.out.println(reName + "님의 정보를 삭제했습니다.");
						break;
					}
					cnt++;
				}
				if (cnt >= list.size()) {
					System.out.println("해당 학생 정보가 없습니다.");
				}
			} else if (select.equals("5")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}

}
