package sec03.exam05;

import java.util.Scanner;

public class GradeExample {

	public static void main(String[] args) {

		// 3������ ������ �Է¹޾� Grade ��ü ����
		// (���� ������ �����ڷ� ��ü�� ����)
		// ���� toString()�� ���� ��� �ʵ��� �� ���
		// ���� �޼ҵ带 ���� ��հ� ���

		Scanner sc = new Scanner(System.in);

		// Ű����� ������ ���� �Է¹ޱ�
		System.out.print("���� ���� : ");
		int math = sc.nextInt();
		System.out.print("���� ���� : ");
		int science = sc.nextInt();
		System.out.print("���� ���� : ");
		int english = sc.nextInt();

		System.out.println();

		// ��ü ����
		Grade grade = new Grade(math, science, english); // ��ü ����

		// toString() ���
//		System.out.println(grade.toString());
		System.out.println(grade.toString());

		// average() ���
//		System.out.println("����� " + grade.average(grade.math, grade.science, grade.english) + "�� �Դϴ�.");
		System.out.println("����� " + grade.average() + "�� �Դϴ�.");

	}

}
