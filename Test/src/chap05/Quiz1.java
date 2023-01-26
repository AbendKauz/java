package chap05;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		// 추가작업내용
		// 1. do-while + switch문 사용버전 추가
		// 2. 1, 2 실행 시 회원가입, 로그인 문구 추가

		// 회원가입 로그인 프로그램
//		1. 회원의 수는 총 3명이다. 
//		  ->  1 을 키보드로 입력하면 “ ==== 회원가입 ==== ”이 출력되고
//		       회원 아이디와 비밀번호를 입력받아 저장한다. 
//		  -> 3명까지 정보를 받고, 저장 후 1을 4번 눌러 4번째 회원을 등록하려고 하면 
//		     “회원이 가득 찼습니다.” 라는 문구를 출력한다.
//	     2.  키보드로 2를 입력하면 로그인
//	     -> 로그인할 아이디와 비밀번호를 키보드로 입력받아서 [1] 회원가입으로 가입한 회원의 아이디와 
//	        비밀번호가 일치 할 경우 “로그인 성공” 이라는 문구 출력
//	     -> 아이디랑 비밀번호가 일치하지 않을 경우 “로그인 실패” 라는 문구 출력
//	     3.  키보드로 3을 입력하면 프로그램 종료
//	     -> “프로그램이 종료되었습니다” 문구를 출력 후 반복문 종료
//	     4. 키보드로 입력한 값이 1, 2, 3 이 아닌 다른 값일 경우 
//	     -> “값을 잘못 입력하셨습니다“ 문구를 출력하기

		// 변수 선언부만 따로 위에 빼둠(여러 방법들에 다 사용 예정)
		Scanner sc = new Scanner(System.in);
		String[] id = new String[3]; // id 저장할 배열
		String[] pw = new String[3]; // pw 저장할 배열
		String select; // 초기화면 선택 시 입력값 확인용(정수아닌 값 받아도 작동하도록 String으로 생성)
		String joinId = ""; // 회원가입 시 id
		String joinPw = ""; // 회원가입 시 pw
		boolean joinChk; // join 통과유무
		boolean loginChk; // login 통과유무

		// 1. do-while + switch 사용

		boolean cycle = true; // 계속 실행시킬지 판단하는 비교용 변수 따로 생성

		do { // 자피 반복실행되는 부분이면 최소 1회 실행 보장되는 do-while 사용 가능
			System.out.print("[1]회원가입\t[2]로그인\t\t[3]종료 >> ");
			select = ""; // 돌아왔을 때 select 초기화
			select = sc.next(); // 초기화면 선택관련

			switch (select) {
			case "1":
				System.out.println("====회원가입====");
				joinChk = false; // idChk 초기화(회원가입 이후 다시 회원가입 시 check 초기화)
				System.out.print("아이디 입력 : ");
				joinId = sc.next();
				System.out.print("비밀번호 입력 : ");
				joinPw = sc.next();
				for (int i = 0; i < id.length; i++) { // 같은 번지에 id와 pw를 넣기 위해 for문 1개만 사용
					if (id[i] == null) { // id[i]가 null값일 경우
						if (pw[i] == null) { // pw[i]가 null값일 경우
							id[i] = joinId; // id[i]에 입력값 저장
							pw[i] = joinPw; // pw[i]에 입력값 저장
							joinChk = true; // joinChk 변경
							break; // for문 종료
						}
					}
				}
				if (!joinChk) { // joinChk가 true(null값인 번지가 없어서 저장 실패 시)
					System.out.println("회원이 가득 찼습니다.");
				} else { // joinChk가 false(저장 성공 시)
					System.out.println("회원가입 성공!"); // id와 pw 삽입 시
				}
				// 배열안에 값이 잘 들어갔나 출력
//				for (int i = 0; i < id.length; i++) {
//					System.out.println("id[" + i + "] : " + id[i]);
//					System.out.println("pw[" + i + "] : " + pw[i]);
//				}
				break;

			case "2":
				System.out.println("<<로그인>>");
				loginChk = false; // loginChk = login 통과 관련 변수 초기화
				System.out.print("로그인 아이디 입력 : ");
				String loginId = sc.next();
				System.out.print("로그인 비밀번호 입력 : ");
				String loginPw = sc.next();
				for (int i = 0; i < id.length; i++) { // 같은 번지의 id와 pw만 비교하기 위해 for문 1개만 사용
					if (id[i] != null) { // id[i]가 null이 아닌것만 계산
						if (id[i].equals(loginId)) { // id[i]값 중 loginId 값과 일치하는 값이 있을 경우
							if (pw[i].equals(loginPw)) { // pw[i]번지의 비밀번호와 loginPw값이 일치할 경우
								loginChk = true; // loginChk값 변경
								break; // for문 종료
							}
						}
					}
				}
				if (loginChk) { // loginChk가 true면
					System.out.println("로그인 성공!");
				} else { // loginChk가 false면
					System.out.println("로그인 실패.");
					continue;
				}
				break;

			case "3":
				System.out.println("프로그램이 종료되었습니다.");
				// break; // switch에서 break 사용 시 -> switch문만 빠져나옴 -> System.exit(0);로 강제 종료
//				System.exit(0);
				cycle = false; // 회전여부 변수의 값 변경
				break; // case 3 종료 후 맨 위로 이동 -> 비교변수 false -> 종료

			default:
				System.out.println("값을 잘못 입력하셨습니다.");
				continue;

			}
		} while (cycle);

		// 2. while - if-else if 사용
//		while(true) {
//			System.out.print("[1]회원가입\t[2]로그인\t\t[3]종료 >> ");
//			select = "";	// 돌아왔을 때 select 초기화
//			select = sc.next();	// 초기화면 선택관련
//			if(select.equals("1")) {	// 회원가입 선택 시
//				System.out.println("====회원가입====");
//				joinChk = false;	// idChk 초기화(회원가입 이후 다시 회원가입 시 check 초기화)
//				System.out.print("아이디 입력 : ");
//				joinId = sc.next();
//				System.out.print("비밀번호 입력 : ");
//				joinPw = sc.next();
//				for(int i = 0; i < id.length; i++) {	// 같은 번지에 id와 pw를 넣기 위해 for문 1개만 사용
//					if(id[i] == null) {	// id[i]가 null값일 경우
//						if(pw[i] == null) {	// pw[i]가 null값일 경우
//							id[i] = joinId;	// id[i]에 입력값 저장
//							pw[i] = joinPw;	// pw[i]에 입력값 저장
//							joinChk = true;	// joinChk 변경
//							break;
//						}
//					}
//				}
//				if(!joinChk) {	// joinChk가 true(null값인 번지가 없어서 저장 실패 시)
//					System.out.println("회원이 가득 찼습니다.");
//				}else {
//					System.out.println("회원가입 성공!");	// id와 pw 삽입 시
//				}
//				// 배열안에 값이 잘 들어갔나 출력
////				for (int i = 0; i < id.length; i++) {
////					System.out.println("id[" + i + "] : " + id[i]);
////					System.out.println("pw[" + i + "] : " + pw[i]);
////				}
//			}else if(select.equals("2")) {
//				System.out.println("<<로그인>>");
//				loginChk = false;	// loginChk = login 통과 관련 변수 초기화
//				System.out.print("로그인 아이디 입력 : ");
//				String loginId = sc.next();
//				System.out.print("로그인 비밀번호 입력 : ");
//				String loginPw = sc.next();
//				for (int i = 0; i < id.length; i++) {	// 같은 번지의 id와 pw만 비교하기 위해 for문 1개만 사용
//					if(id[i] != null) {	// id[i]가 null이 아닌것만 계산
//						if(id[i].equals(loginId)) {	// id[i]값 중 loginId 값과 일치하는 값이 있을 경우
//							if(pw[i].equals(loginPw)) {	// pw[i]번지의 비밀번호와 loginPw값이 일치할 경우
//								loginChk = true;	// loginChk값 변경
//								break;
//							}
//						}
//					}
//				}
//				if(loginChk) {	// loginChk가 true면
//					System.out.println("로그인 성공!");
//				}else {		// loginChk가 false면
//					System.out.println("로그인 실패.");
//					continue;
//				}
//			}else if(select.equals("3")) {
//				System.out.println("프로그램이 종료되었습니다.");
//				break;
//			}else {
//				System.out.println("값을 잘못 입력하셨습니다.");
//				continue;
//			}
//		}

	}

}
