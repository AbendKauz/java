package dayTest;

import java.util.Arrays;
import java.util.Scanner;

public class Test0720_Comment {

	public static void main(String[] args) {

		// 1. ������ �迭�� ũ�⸦ ��ĳ�ʷ� �Է¹��� ������ŭ ũ��� �����ϰ� 1 ~ 10 ������ �������� �Է¹޴´�.
		// �����ϴ� ��Ұ� ������ ���� ������ �ʵ���
		// (=> {1, 3, 5, 5, 3, 2}�� �Ǹ� �ȵȴ�. 5�� �����ؼ� ���ͼ�)

//		Scanner s = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		
//		int[] arr = new int[s.nextInt()];
//		
//		arr[0] = (int)(Math.random() * 10) + 1;	// 0������ ���� ��������
//		
//		for (int i = 1; i < arr.length; i++) {	// 1�������� ��������������
//			do {	// �ּ� 1ȸ ������ ���� do-while�� ���
//				arr[i] = (int)(Math.random() * 10) + 1;	// i������ �� ��������
//			}while(arr[i] == arr[i - 1]);				// i������ i - 1������ ���� ���� ��� �ݺ�(for�� �ȿ� �����Ƿ� i++�� �Ͼ�� �ʰ� �ݺ���)
//		}
//
//		System.out.println(Arrays.toString(arr));

		// 2. 1�������� ���� �ٸ� ��Ұ� ������ ���� ������ �ʵ��� ���α׷���
		// �迭�� ��Ҽ��� 10 ���Ϸ�
		// (ex => {1, 2, 5, 6, 1, 2}�� �Ǹ� �ȵȴ�. 1�̶� 2�� �ߺ��ȴ�)

//		Scanner s = new Scanner(System.in);
//		System.out.print("10 ������ ���� �Է� : ");
//		
//		int[] arr = new int[s.nextInt()];
//		
//		arr[0] = (int)(Math.random() * 10) + 1;	// 0������ ���� ����
//		
//		for (int i = 1; i < arr.length; i++) {
//			int j;				// ���� j ���� ����(do-while������ ���ؾ� �ϹǷ� ������ ����)
//			do {
//				arr[i] = (int)(Math.random() * 10) + 1;	// i���� �� ���� ����
//				for(j = 0; j < i; j++) {				// 0�������� i - 1��������(i������ ���� ������)
//					if(arr[i] == arr[j]) {				// i������ j������ ���� ���ٸ�
//						break;	// break -> do-while�� ���(for������ j++�� �̷������ �ʰ� ������ ������ j���� �״�� ������)
//					}
//				}
//			}while(j < i);		// j���� i���� ������ �� ���� �ݺ�
//		}
//
//		System.out.println(Arrays.toString(arr));

//==================================================================================================================

		// 3. ���� 1 ~ 12�� ���ڷ� ǥ���ϰ� �ش� ���� ���� �ܾ �Է��ϴ� ���α׷� �ۼ�
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

//		Scanner s = new Scanner(System.in);
//		
//		String[] monthStr = {	// ���� �̸����� ������ �迭
//				"January", "February", "March", "April", "May", "June",
//				"July", "August", "September", "October", "November", "December"
//		};
//		
//		System.out.println("�ش� ���� ���� �ܾ �Է��Ͻÿ�.");
//		System.out.println("ù ���ڴ� �빮��, �������� �ҹ��ڷ� �Է��ϼ���.");
//		
//		int last = -1;	// ������ ���õ� �� ������ ����(-1�� �����ϸ� �ʱ⿡ �������� �����Ƿ�)
//		int mon;		// �������� �����Ǵ� �� ������ ����
//		int regame;		// ������ ������� ���� ����
//		do {
//			do {
//				mon = (int)(Math.random() * 12);	// ������ �ʿ��ϹǷ� 0~11���� ����
//			}while(last == mon);	// ������ ���õ� ���� �������� ������ ���� ������ �ݺ�
//		
//			last = mon;				// ������� ������ ���� ������ ���õ� ���� ����
//			
//			while(true) {
//				System.out.print(mon + 1 + "�� : ");	// mon�� 0~11�̹Ƿ� +1�� �ؾ� 1~12
//				String in = s.next();
//				
//				if(in.equals(monthStr[mon])) {	// ���߸� �ݺ����� ��������
//					break;
//				}
//				System.out.println("Ʋ�Ƚ��ϴ�.");	// Ʋ���� �ݺ�(Ʋ�� �� �ٽ� ǥ��)
//			}
//			System.out.print("�����Դϴ�. �ٽ� �ѹ�? 1...Yes/0...No : 0 : ");
//			regame = s.nextInt();
//			
//		}while(regame == 1);	// ����ڰ� 1�� ������ �� ��� �ݺ�

		// 4. ������ ǥ���ϰ� �ش� ������ ���� �ܾ �Է��ϴ� ���� �н� ���α׷� �ۼ�
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
//		int a = -1;
//		int b;
//		do {
//			do {
//				b = (int)(Math.random() * 7);
//			}while(a == b);
//			a = b;
//			System.out.print(korWeek[b] + " : ");
//			String user = s.next();
//			if(user.equals(week[b])) {
//				System.out.print("�����Դϴ�. �ٽ��ѹ�? 1...Yes/0...No :");
//				int select = s.nextInt();
//				if(select == 0) {
//					break;
//				}
//			}else {
//				System.out.println("Ʋ�Ƚ��ϴ�.");
//			}
//		}while(true);

	}

}
