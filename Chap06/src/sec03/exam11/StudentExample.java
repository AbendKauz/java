package sec03.exam11;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {

		// Student ��ü�迭 ���� -> �迭 ũ��� 3.
		// Ű����� �л� ������ �Է¹޾� ��ü �迭�� ������ �����ϱ�

//		Student stu1 = new Student("ȫ�浿", "20220123", 20, 40, 50, 60);
//		System.out.println(stu1);

		Student[] stuArr = new Student[3];
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("�л� ���>>1 || ��� �л� ��ȸ>>2 || Ư�� �л� ��ȸ>>3 || ���α׷� ����>>4");
			int select = sc.nextInt();

			if (select == 1) { // �л� ���
				int i = 0;
				for (i = 0; i < stuArr.length; i++) {
					if (stuArr[i] == null) {
						System.out.print("�̸� �Է� : ");
						String name = sc.next();
						System.out.print("�й� �Է� : ");
						String number = sc.next();
						System.out.print("���� �Է� : ");
						int age = sc.nextInt();
						System.out.print("Java ���� �Է� : ");
						int javaScore = sc.nextInt();
						System.out.print("Web ���� �Է� : ");
						int webScore = sc.nextInt();
						System.out.print("Python ���� �Է� : ");
						int pythonScore = sc.nextInt();
						stuArr[i] = new Student(name, number, age, javaScore, webScore, pythonScore);
						break;
					}
				}
				if (i >= stuArr.length) {
					System.out.println("����� �� �ִ� �ο����� �ʰ��Ͽ����ϴ�.");
				}
				System.out.println();
			} else if (select == 2) { // ��� �л� ���� ��ȸ
				System.out.println("��� �л� ���� ��ȸ : ");
				for (int i = 0; i < stuArr.length; i++) {
					System.out.println(stuArr[i]);
				}
				System.out.println();
			} else if (select == 3) { // Ư�� �л� ���� ��ȸ
				System.out.println("Ư�� �л� ���� ��ȸ : ");
				String name = sc.next();
				int i = 0;
//				for (i = 0; i < stuArr.length; i++) {
//					if(stuArr[i] != null) {
//						if(stuArr[i].getName().equals(name)) {
//							System.out.println(stuArr[i]);
//							break;
//						}
//					}
//				}
//				if(i > stuArr.length) {
//					System.out.println(name + "�� ������ �����ϴ�.");
//				}
				for (i = 0; i < stuArr.length; i++) {
					if (stuArr[i] == null) {
						continue;
					}
					if (stuArr[i].getName().equals(name)) {
						break;
					}
				}
				if (i < stuArr.length) {
					System.out.println(stuArr[i]);
				} else {
					System.out.println(name + "�� ������ �����ϴ�.");
				}
				System.out.println();
			} else if (select == 4) { // ���α׷� ����
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			} else { // 1 ~ 4�� �ƴ� ���� �Է� ��
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}

		}

	}

}
