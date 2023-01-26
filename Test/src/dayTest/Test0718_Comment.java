package dayTest;

import java.util.Arrays;
import java.util.Scanner;

public class Test0718_Comment {

	public static void main(String[] args) {

//		int[] b = new int[10];		// 참조변수
//		// int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int[] a = {1, 2, 3, 4, 5};
//		// int c = 5;	// 일반변수
//		// int d = 10;
//		// c = d;	// 일반변수끼리 대입
//		System.out.println(a);					// [I@1ddc4ec2
//		System.out.println(Arrays.toString(a));	//[1, 2, 3, 4, 5]
//		// @ 앞(I) : 타입
//		// @ 뒤(1ddc4ec2) : 참조값
//		System.out.println(b);					// [I@133314b
//		System.out.println(Arrays.toString(b));	// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//		
//		b = a;	// 참조변수 대입(b의 참조값을 a의 참조값으로 변경 -> 참조값이 변경되어 값이 달라짐)
//		System.out.println(a);					// [I@1ddc4ec2
//		System.out.println(Arrays.toString(a));	// [1, 2, 3, 4, 5]
//		System.out.println(b);					// [I@1ddc4ec2
//		System.out.println(Arrays.toString(b));	// [1, 2, 3, 4, 5]
//		
//		a = null;	// a의 값을 null로 변경(길이와 내용 전부 삭제됨)
//		System.out.println(a);					// null
//		System.out.println(Arrays.toString(a));	// null
//		System.out.println(b);					// [I@1ddc4ec2
//		System.out.println(Arrays.toString(b));	// [1, 2, 3, 4, 5]

		// ■ 정수형 배열 50개를 생성하고 20개의 1 ~ 100까지의 랜덤값 입력,
		// 작업선택(1: 삽입, 2: 삭제) :
		// 삽입할 위치 :
		// 삽입할 값 :
		// 삽입한 후에 데이터 출력
		// 삭제 작업도 마찬가지로 작업

//		Scanner s = new Scanner(System.in);
//		int[] arr = new int[50];
//		for (int i = 0; i < 20; i++) {
//			arr[i] = (int)(Math.random() * 100) + 1;
//		}
//		
//		// 배열 확인용
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		
//		System.out.print("\n작업선택(1: 삽입, 2: 삭제) : ");
//		int a = s.nextInt();
//		
//		if(a == 1) {
//			System.out.print("삽입할 위치 : ");
//			int c = s.nextInt();
//			System.out.print("삽입할 값 : ");
//			int d = s.nextInt();
//			int t = 0;
//			
//			for (int i = c; i < arr.length; i++) {
//				t = arr[i];
//				arr[i] = d;
//				d = t;
//			}
//			
//			for (int i = 0; i < arr.length; i++) {
//				System.out.print(arr[i] + " ");
//			}
//			
//		}else if(a == 2) {
//			System.out.print("삭제할 위치 : ");
//			int e = s.nextInt();
//			
//			// 해당위치의 뒤에 있는 값들을 앞으로 땡겨옴(삭제위치의 값이 변경되어 사라짐)
//			// => 삭제처리
//			// 삭제시엔 자리바꿈이 아니라 말 그대로 해당번지의 값을 삭제해야 하므로
//			// 다음 번지의 값을 해당 번지로 옮기기만 하면 됨 
//			for (int i = e; i < arr.length - 1; i++) {
//				arr[i] = arr[i + 1];
//			}
//			
//			for (int i = 0; i < arr.length; i++) {
//				System.out.print(arr[i] + " ");
//			}
//			
//		}

	}

}
