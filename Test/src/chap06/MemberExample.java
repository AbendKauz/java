package chap06;

import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) {

		Member member = new Member();
//		member.name = "���Ͼ�";
//		member.age = 23;
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		member.name = sc.next();
		System.out.print("���̵� : ");
		member.id = sc.next();
		System.out.print("�н����� : ");
		member.password = sc.next();
		System.out.print("���� : ");
		member.age = sc.nextInt();

		System.out.println();
		System.out.println(member.age + "���� " + member.name + "(" + member.id + ")�� �ȳ��ϼ���.");

	}

}
