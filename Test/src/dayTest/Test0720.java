package dayTest;

import java.util.Arrays;
import java.util.Scanner;

public class Test0720 {

	public static void main(String[] args) {

		// 1. ���� 1 ~ 12�� ���ڷ� ǥ���ϰ� �ش� ���� ���� �ܾ �Է��ϴ� ���α׷� �ۼ�
		// - ���� ���� ���� ����
		// - ���� ���� �����ؼ� ǥ������ ����

		// ( ���� �� )
		// �ش� ���� ���� �ܾ �Է��Ͻÿ�.
		// ù ���ڴ� �빮��, �������� �ҹ��ڷ� �Է��ϼ���.
		// 12�� : December
		// �����Դϴ�. �ٽ� �ѹ�? 1...Yes/0...No : 1
		// 10�� : March
		// Ʋ�Ƚ��ϴ�.
		// 10�� : October
		// �����Դϴ�. �ٽ� �ѹ�? 1...Yes/0...No : 0

//		String[] month = new String[] {
//				"January", "February", "March", "April", "May", "June",
//				"July", "August", "September", "October", "November","December"
//		};
//		
//		Scanner s = new Scanner(System.in);
//		boolean chk = true;
//		int a = 0;
//		int b;
//		
//		System.out.println("�ش� ���� ���� �ܾ �Է��Ͻÿ�.");
//		System.out.println("ù ���ڴ� �빮��, �������� �ҹ��ڷ� �Է��ϼ���.");
//		do {
//			boolean answer = false;
//			do {
//				b = (int)(Math.random() * 12) + 1;
//			}while(a == b);
//			a = b;
//			System.out.print(a + "�� : ");
//			String user = s.next();
//			
//			for (int i = 0; i < month.length; i++) {
//				if(month[i].equals(user)) {
//					answer = true;
//					System.out.print("�����Դϴ�. �ٽ��ѹ�? 1...Yes/0...No : ");
//					int select = s.nextInt();
//					if(select == 0) {
//						chk = false;
//					}else {
//						continue;
//					}
//				}
//			}
//			if(!answer) {
//				System.out.println("Ʋ�Ƚ��ϴ�.");
//			}
//		}while(chk);

		// 2. ������ ǥ���ϰ� �ش� ������ ���� �ܾ �Է��ϴ� ���� �н� ���α׷� �ۼ�
		// - ������ ������ ���
		// - ���� ������ �����ؼ� ǥ������ ����

		// ( ���� �� )
		// ���ϸ��� ���� �ҹ��ڷ� �Է��Ͻÿ�.
		// �Ͽ��� : sunday
		// �����Դϴ�. �ٽ� �ѹ�? 1...Yes/0...No : 1
		// ������ : wednesday
		// �����Դϴ�. �ٽ� �ѹ�? 1...Yes/0...No : 0

//		Scanner s = new Scanner(System.in);
//		String[] week = new String[] {
//			"sunday", "monday", "tuesday", "wednesday",
//			"thursday", "friday", "saturday"
//		};
//		String[] korWeek = new String[] {
//			"�Ͽ���", "������", "ȭ����", "������",
//			"�����", "�ݿ���", "�����"
//		};
//		System.out.println("������ ���� �ҹ��ڷ� �Է��Ͻÿ�.");
//		int a = 0;
//		int b;
//		boolean answer = false;
//		do {
//			while(a == b) {
//				b = (int)(Math.random() * 7) + 1;
//			}
//			a = b;
//			System.out.print(korWeek[b + 1] + " : ");
//			String user = s.next();
//			if(user.equals(korWeek[b + 1])) {
//				answer = true;
//				System.out.print("�����Դϴ�. �ٽ��ѹ�? 1...Yes/0...No :");
//				int select = s.nextInt();
//				if(select == 0) {
//					break;
//				}
//			}
//			if(!answer) {
//				System.out.println("Ʋ�Ƚ��ϴ�.");
//			}
//		}while(true);
//		

		// 3. ������ �迭�� ũ�⸦ ��ĳ�ʷ� �Է¹��� ������ŭ ũ��� �����ϰ� 1 ~ 10 ������ �������� �Է¹޴´�.
		// �����ϴ� ��Ұ� ������ ���� ������ �ʵ���
		// (=> {1, 3, 5, 5, 3, 2}�� �Ǹ� �ȵȴ�. 5�� �����ؼ� ���ͼ�)

//		Scanner s = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		int a = s.nextInt();
//		int[] arr = new int[a];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 10) + 1;
//		}
//		for (int i = 0; i < arr.length - 1; i++) {
//			while(arr[i] == arr[i + 1]) {
//				arr[i + 1] = (int)(Math.random() * 10) + 1;
//			}
//		}
//		System.out.println(Arrays.toString(arr));

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		// 4. 3�������� ���� �ٸ� ��Ұ� ������ ���� ������ �ʵ��� ���α׷���
		// �迭�� ��Ҽ��� 10 ���Ϸ�
		// (ex => {1, 2, 5, 6, 1, 2}�� �Ǹ� �ȵȴ�. 1�̶� 2�� �ߺ��ȴ�)

//		Scanner s = new Scanner(System.in);
//		System.out.print("10 ������ ���� �Է� : ");
//		int a = s.nextInt();
//		int[] arr = new int[a];
//		
//		int i = 0;			// arr.length count
//		int num = 0;		// ������ �Է°�
//		boolean chk = true;	// ���� ���� ���� Ȯ�ο�
//		
//		while(i < arr.length) {
//			chk = true;
//			num = (int)(Math.random() * 10) + 1;
//			for (int j = 0; j < i; j++) {
//				if(num == arr[j]) {
//					chk = false;
//					break;
//				}
//			}
//			if(chk) {
//				arr[i] = num;
//				i++;
//			}
//		}
//		
//		System.out.println(Arrays.toString(arr));

	}

}
