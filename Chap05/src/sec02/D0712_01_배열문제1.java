package sec02;

public class D0712_01_배열문제1 {

	public static void main(String[] args) {

		// Q1)
		// 2200, 1400, 3200, 2900, 4500, 3000, 800, 3400
		// 의 값을 가진 배열에서 2000 이하의 금액의 합계를 구한 후 출력

		int[] money = { 2200, 1400, 3200, 2900, 4500, 3000, 800, 3400 };
		int sum = 0;
		for (int i = 0; i < money.length; i++) {
			if (money[i] <= 2000) {
				sum += money[i];
			}
		}
		System.out.println(sum);

		// Q2)
		// 한국, 광주, 서울, 부산, 북구, 남구, 서구, 용봉동, 오치동
		// 의 값을 가진 배열에서 아래와 같이 출력
		String[] arr = { "한국", "광주", "서울", "부산", "북구", "남구", "서구", "용봉동", "오치동" };

//		[console 출력]
//		한국 - 광주 북구 용봉동
		System.out.println(arr[0] + " - " + arr[1] + " " + arr[4] + " " + arr[7]);

		// Q2-2)
		// 북구를 광산구로 바꿔보기
		arr[4] = "광산구";
		System.out.println(arr[4]);

		// Q2-3)
		// 배열에 들어있는 값들을 전부 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
