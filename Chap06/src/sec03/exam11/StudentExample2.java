package sec03.exam11;

import java.util.Scanner;

public class StudentExample2 {

	public static void main(String[] args) {

		// Student ��ü�迭 ���� -> �迭 ũ��� 3.
		// Ű����� �л� ������ �Է¹޾� ��ü �迭�� ������ �����ϱ�

//		Student stu1 = new Student("ȫ�浿", "20220123", 20, 40, 50, 60);
//		System.out.println(stu1);

		Student[] stuArr = new Student[3];
		Scanner sc = new Scanner(System.in);
		int cnt = 0;

		while (true) {

			System.out.println("�л� ���>>1 || ��� �л� ��ȸ>>2 || Ư�� �л� ��ȸ>>3 || ���α׷� ����>>4");
			int num = sc.nextInt();

			if (num == 1) { // �л� ���
				System.out.print("�̸� �Է� : ");
				String name = sc.next();
				System.out.print("�й� �Է� : ");
				String number = sc.next();
				System.out.print("���� �Է� : ");
				int age = sc.nextInt();
				System.out.print("Java ���� �Է� : ");
				int java = sc.nextInt();
				System.out.print("Web ���� �Է� : ");
				int web = sc.nextInt();
				System.out.print("Python ���� �Է� : ");
				int python = sc.nextInt();

				// �� Ű����� �Է¹��� ������ �̿��ؼ� ��ü�� ����� -> ��ü �迭�� �ֱ�
				stuArr[cnt++] = new Student(name, number, age, java, web, python);
				System.out.println();
			} else if (num == 2) { // ��� �л� ���� ��ȸ
				System.out.println("��� �л� ���� ��ȸ : ");
				for (int i = 0; i < stuArr.length; i++) {
					System.out.println(stuArr[i]);
				}
				System.out.println();
			} else if (num == 3) { // Ư�� �л� ���� ��ȸ
				System.out.println("Ư�� �л� ���� ��ȸ : ");
				String name = sc.next();
				int arrNum = 0;
				boolean nameChk = false;
				for (int i = 0; i < cnt; i++) {
					if (stuArr[i].getName().equals(name)) {
						nameChk = true; // Ư���л� �̸��� ����
						arrNum = i;
						break;
					} else {
						nameChk = false; // Ư���л� �̸��� ����
					}
				}
				if (nameChk) {
					System.out.println(stuArr[arrNum]);
				} else {
					System.out.println(name + "�� ������ �����ϴ�.");
				}
				System.out.println();
			} else if (num == 4) { // ���α׷� ����
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			} else { // 1 ~ 4�� �ƴ� ���� �Է� ��
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}

		}

	}

}
