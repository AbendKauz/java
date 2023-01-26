package chap06;

import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) {

		Member member = new Member();
//		member.name = "최하얀";
//		member.age = 23;
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		member.name = sc.next();
		System.out.print("아이디 : ");
		member.id = sc.next();
		System.out.print("패스워드 : ");
		member.password = sc.next();
		System.out.print("나이 : ");
		member.age = sc.nextInt();

		System.out.println();
		System.out.println(member.age + "살인 " + member.name + "(" + member.id + ")님 안녕하세요.");

	}

}
