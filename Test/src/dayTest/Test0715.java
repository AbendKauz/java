package dayTest;

public class Test0715 {

	public static void main(String[] args) {

		// ■ 1 ~ 45사이의 6개의 숫자를 중복되지 않게 출력

//		int[] arr = new int[6];
//		for(int i = 0; i <= 5; i++) {
//			arr[i] = (int)(Math.random() * 45) + 1;
//			for (int j = 0; j < i; j++) {
//				if(arr[i] == arr[j]) {
//					arr[i] = (int)(Math.random() * 45) + 1;
//				}
//			}
//			System.out.println(arr[i]);
//		}

		// ■ 정수형 배열 10개에 5 ~ 200 사이의 랜덤값 입력하고, 최대값과 최소값 출력

//		int[] arr = new int[10];
//		int max = 5;	// 범위 5 ~ 200이므로 가장 작은값을 최대값으로
//		int min = 200;	// 범위 5 ~ 200이므로 가장 큰 값을 최소값으로
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 196) + 5;
//			System.out.print(arr[i] + " ");
//			max = min = arr[0];
//			for (int j = 0; j < i; j++) {
//				if(arr[j] > max) {
//					max = arr[j];
//				}else if(arr[j] < min) {
//					min = arr[j];
//				}
//			}
//		}
//		System.out.println("최대값 : " + max + ", 최소값 : " + min);

		// ■ 정수형 배열 30개에 5 ~ 15 사이의 랜덤값 입력하고, 12 검색해서 위치출력

//		int[] arr = new int[30];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 11) + 5;
//			if(arr[i] == 12) {
//				System.out.println("12는 " + i + "번지에 위치하고 있습니다.");
//				break;
//			}
//		}

		// ■ 정수형 배열 30개에 5 ~ 15 사이의 랜덤값 입력하고, 마지막 12 검색해서 위치출력

//		int[] arr = new int[30];
//		int num = 0;
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 11) + 5;
//			if(arr[i] == 12) {
//				num = i;
//			}
//		}
//		System.out.println("마지막 12는 " + num + "번지에 위치하고 있습니다.");

		// ■ 정수형 배열 10개에 10 ~ 50사이 랜덤값 입력하고 오름차순 선택정렬후
		// 입력값과 정렬후 값 출력
		// 선택정렬 - n을 n + 1부터 배열 길이까지 비교하고 위치변경
		// -> n이 다 돌고나면 n은 제일 작은 수가 됨
//		
//		int[] arr = new int[10];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 41) + 10;
//			System.out.print("a[" + i + "] : " + arr[i] + "\t");
//		}
//		
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					int t = arr[i];
//					arr[i] = arr[j];
//					arr[j] = t;
//				}
//			}
//		}
//		
//		System.out.println();
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print("a[" + i + "] : " + arr[i] + "\t");
//		}

		// ■ 정수형 배열 10개에 10 ~ 50사이 랜덤값 입력하고 오름차순 버블정렬후
		// 입력값과 정렬후 값 출력
//		// 버블정렬 - n과 n+1의 크기 비교 후 오름차순 : 큰 값이 뒤로 이동
//		//								내림차순 : 작은 값이 뒤로 이동

//		int[] arr = new int[10];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 41) + 10;
//			System.out.println("a[" + i + "] : " + arr[i]);
//		}
//		
//		for (int i = 0; i < arr.length; i++) {	// 회차
//			for(int j = 0; j < arr.length - i - 1; j++) {	// arr.length - i - 1 : 회차 돌 때 마다 가장 큰 값이 맨 뒤로 감(반복계산필요x)
//				if(arr[j] > arr[j+1]) {						// arr.length - 1 : 첫 회차에선 j + 1이 가장 마지막 수 이므로
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("정렬 후 a[" + i + "] : " + arr[i]);
//		}

		// ■ 정수형 배열 10개에 1 ~ 31 사이 랜덤값 입력하고 또 다른 배열에 뒤에서 부터 복사해서 원본배열과 복사한 배열 출력

//		int[] a = new int[10];			// 원본 배열
//		int[] b = new int[a.length];	// 복사본 배열
//		System.out.println("=== 원본배열 ===");
//		for (int i = 0; i < a.length; i++) {
//			a[i] = (int)(Math.random() * 31) + 1;
//			System.out.print(a[i] + " ");
//			b[a.length - 1 - i] = a[i];
//		}
//		
//		System.out.println();
//		System.out.println("=== 복사배열 ===");
//		for (int i = 0; i < b.length; i++) {
//			System.out.print(b[i] + " ");
//		}

	}

}
