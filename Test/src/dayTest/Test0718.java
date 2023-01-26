package dayTest;

import java.util.Scanner;

public class Test0718 {

	public static void main(String[] args) {

		// ■ 정수형 배열 50개를 생성하고 20개의 1 ~ 100까지의 랜덤값 입력,
		// 작업선택(1: 삽입, 2: 삭제) :
		// 삽입할 위치 :
		// 삽입할 값 :
		// 삽입한 후에 데이터 출력
		// 삭제 작업도 마찬가지로 작업

		Scanner s = new Scanner(System.in);
		int[] arr = new int[50];
		for (int i = 0; i < 20; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.print("\n작업선택(1: 삽입, 2: 삭제) : ");
		int a = s.nextInt();

		if (a == 1) {
			System.out.print("삽입할 위치 : ");
			int c = s.nextInt();
			System.out.print("삽입할 값 : ");
			int d = s.nextInt();
			int t = 0;
			for (int i = c; i < arr.length; i++) {
				t = arr[i];
				arr[i] = d;
				d = t;
			}

			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}

		} else if (a == 2) {
			System.out.print("삭제할 위치 : ");
			int e = s.nextInt();

			int t = 0;
			for (int i = arr.length - 1; i >= e; i--) {
				t = arr[i];
				arr[i] = arr[e];
				arr[e] = t;
			}

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0) {
					break;
				}
				System.out.print(arr[i] + " ");

			}

		}

	}

}
