package dayTest;

public class Test0715_Comment {

	public static void main(String[] args) {

		// ■ 1 ~ 45사이의 6개의 숫자를 중복되지 않게 출력

//		int[] a = new int[45];	// 뽑고싶은 범위값으로 배열 생성
//		for (int i = 0; i < a.length; i++) {
//			a[i] = i + 1;		// 배열안에 범위값 다 집어넣기
//		}
//		for (int i = 0; i < 500; i++) {		// 배열값들 무작위로 섞기
//			int n1 = (int)(Math.random() * (a.length));	// n1 = 배열의 길이
//			int n2 = (int)(Math.random() * (a.length));	// n2 = 배열의 길이
//			
//			int t = a[n1];
//			a[n1] = a[n2];
//			a[n2] = t;
//		}
//		
//		for(int i = 0; i < 6; i++) {	// 무작위로 섞인 배열값들 중 6개만 뽑기(1 ~ 45이기 때문에 중복이 나오지 않는다)
//			System.out.print(a[i] + " ");
//		}

		// ■ 정수형 배열 10개에 5 ~ 200 사이의 랜덤값 입력하고, 최대값과 최소값 출력

//		int[] a= new int[10];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = (int)(Math.random() * 196) + 5;
//			System.out.print(a[i] + ", ");
//		}
//		int min;
//		int max = min =  a[0];
//		for (int i = 1; i < a.length; i++) {
//			if(max < a[i]) {
//				max = a[i];
//			}
//			if(min > a[i]) {
//				min = a[i];
//			}
//		}
//		System.out.println("최대값 : " + max + ", 최소값 : " + min);

		// ■ 정수형 배열 30개에 5 ~ 15 사이의 랜덤값 입력하고, 12 검색해서 위치출력
		// (12가 최초 출력되면 반복중단)

//		int[] a = new int[30];
//		final int SEARCH = 12;
//		boolean flag = false;
//		int i;
//		for (i = 0; i < a.length; i++) {
//			a[i] = (int)(Math.random() * 11) + 5;
//		}
//		for (i = 0; i < a.length; i++) {
//			if(SEARCH == a[i]) {
//				flag = true;
//				break;
//			}
//		}
//		if(flag) {
//			System.out.println("찾는 값의 index는 " + i + "번째에 있습니다.");
//		}else {
//			System.out.println("찾는 값이 없습니다.");
//		}

		// ■ 정수형 배열 30개에 5 ~ 15 사이의 랜덤값 입력하고, 마지막 12 검색해서 위치출력

//		int[] a = new int[30];
//		final int SEARCH = 12;
//		boolean flag = false;
//		int i;
//		for (i = 0; i < a.length; i++) {
//			a[i] = (int)(Math.random() * 11) + 5;
//		}
//		for (i = a.length - 1; i >= 0 ; i--) {
//			if(SEARCH == a[i]) {
//				flag = true;
//				break;
//			}
//		}
//		if(flag) {
//			System.out.println("찾는 값의 index는 " + i + "번째에 있습니다.");
//		}else {
//			System.out.println("찾는 값이 없습니다.");
//		}

		// ■ 정수형 배열 10개에 10 ~ 50사이 랜덤값 입력하고 오름차순 선택정렬후
		// 입력값과 정렬후 값 출력

		// 소요시간 확인을 위해 배열 10000개로 변경

//		// int[] a = new int[10];
//		int[] a = new int[10000];
//		System.out.println("=== 정렬 전 결과 ===");
//		for (int i = 0; i < a.length; i++) {
//			a[i] = (int)(Math.random() * 41 ) + 10;
//			System.out.print(a[i] + ", ");
//		}
//		System.out.println();
//		
//		long startTime = System.currentTimeMillis();	// 시작시간
//		
//		for (int i = 0; i < a.length - 1; i++) {		// 기준위치 지정
//			for (int j = i + 1; j < a.length; j++) {	// 비교대상 위치
//				if(a[i] > a[j]) {
//					int t = a[i];
//					a[i] = a[j];
//					a[j] = t;
//				}
//			}
//		}
//		long endTime = System.currentTimeMillis();	// 종료시간
//		
//		System.out.println("=== 선택정렬 후 결과 ===");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + ", ");
//		}
//		System.out.println();
//		System.out.println("선택정렬에 소요된 시간 : " + ((long)endTime - startTime));

		// ■ 정수형 배열 10개에 10 ~ 50사이 랜덤값 입력하고 오름차순 버블정렬후
		// 입력값과 정렬후 값 출력

		// 소요시간 확인을 위해 배열 10000개로 변경

//		// int[] a = new int[10];
//		// int[] a = new int[10000];
//		System.out.println("=== 정렬 전 결과 ===");
//		for (int i = 0; i < a.length; i++) {
//			a[i] = (int)(Math.random() * 41 ) + 10;
//			System.out.print(a[i] + " ");
//		}
//		System.out.println();
//		long startTime = System.currentTimeMillis();	// 시작시간
//		
//		for (int i = 0; i < a.length - 1; i++) {			// 회전수
//			for (int j = 0; j < a.length - i - 1; j++) {	// 기준위치
//				if(a[j] > a[j+1]) {
//					int t = a[j];
//					a[j] = a[j + 1];
//					a[j + 1] = t;
//				}
//			}
//		}
//		long endTime = System.currentTimeMillis();	// 종료시간
//		
//		System.out.println("=== 버블정렬 후 결과 ===");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}
//		System.out.println();
//		System.out.println("선택정렬에 소요된 시간 : " + ((long)endTime - startTime));

		// ■ 정수형 배열 10개에 1 ~ 31 사이 랜덤값 입력하고 또 다른 배열에 뒤에서 부터 복사해서 원본배열과 복사한 배열 출력

//		int n = 10;
//		int min = 1;
//		int max = 31;
//		int[] a = new int[n];
//		int[] b = new int[n];
//		
//		for (int i = 0; i < a.length; i++) {
//			a[i] = (int)(Math.random() * (max - min + 1)) + min;
//			System.out.print(a[i] + ", ");
//		}
//		System.out.println();
//		
//		for(int i = 0; i < a.length; i++) {
//			int idx = a.length - i  - 1;
//			b[idx] = a[i];
//		}
//		
//		for (int i = 0; i < b.length; i++) {
//			System.out.print(b[i] + ", ");
//		}

	}

}
