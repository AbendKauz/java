package sec01.exam04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) {

//		  -> 학생 정보 관리 프로그램 만들기
//		  -> ArrayList 생성(저장할 객체 타입- Member 클래스 타입)해서 콘솔사진과 같은 결과가 나오도록 
//		      코드를 작성하시오

		Scanner sc = new Scanner(System.in);
		List<Member> list = new ArrayList<>();

		while (true) {
			System.out.println("[1] 학생정보 저장\t[2] 전체학생 조회\t[3]특정학생 조회\t[4]특정학생 삭제\t[5]프로그램 종료");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.print("등록할 학생 이름 입력>> ");
				String name = sc.next();
				System.out.print("등록할 학생 나이 입력>> ");
				int age = sc.nextInt();
				System.out.print("등록할 학생 성별 입력>> ");
				String gender = sc.next();

				list.add(new Member(name, age, gender));

			} else if (choice == 2) { // 전체학생 조회
				System.out.println("전체 학생 조회>> ");

				// 방법 1. index 이용
//				for (int i = 0; i < list.size(); i++) {
//					System.out.println(list.get(i));
//				}

				// 방법 2. 향상된 for문 이용 // p.198
				int i = 0;
				for (Member member : list) {
					System.out.println(list.get(i++));
				}
			} else if (choice == 3) { // 특정학생 조회
				System.out.println("조회할 학생 이름>> ");
				String name = sc.next();

//				// 방법 1. index
//				boolean chk = false;
//				for(int i = 0; i < list.size(); i++) {
//					if(list.get(i).getName().equals(name)) {
//						System.out.println(list.get(i));
//						chk = true;
//					}
//				}
//				if(!chk) {
//					System.out.println("해당 학생 정보가 없습니다.");
//				}

				// 방법 2. 향상된 for문
				int i = 0;
				for (Member member : list) {
					if (member.getName().contains(name)) {
						System.out.println(list.get(i));
						break;
					}
					i++;
				}
				if (i >= list.size()) {
					System.out.println("해당 학생 정보가 없습니다.");
				}

			} else if (choice == 4) { // 특정학생 삭제
				System.out.println("삭제할 학생 이름>> ");
				String name = sc.next();

				// 1.
				boolean chk = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(name)) {
						list.remove(i);
						System.out.println(name + "님의 정보가 삭제되었습니다.");
						chk = true;
						break;
					}
				}
				if (!chk) {
					System.out.println("해당 학생 정보가 없습니다.");
				}

				// 2.
//				int i = 0;
//				for (Member member : list) {
////					if(member.getName().contains(name)) {
//					if(name.contains(member.getName())) {
//						list.remove(i);
//						System.out.println(name + "님의 정보가 삭제되었습니다.");
//						break;
//					}
//					i++;
//				}
//				if(i >= list.size()) {
//					System.out.println("해당 학생 정보가 없습니다.");
//				}

			} else if (choice == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}

	}

}
