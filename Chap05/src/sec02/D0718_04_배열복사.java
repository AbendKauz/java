package sec02;

public class D0718_04_배열복사 {

	public static void main(String[] args) {

		// 배열복사 방법
		// 1. for문 이용하기
		// 2. System.arrcopy() 이용하기

		// 2.
		// System.arrcopy(원본배열, 원본배열_시작index, 새 배열,
		// 새 배열_index, 복사할 개수)

		String[] arr = { "java", "system", "arrcopy" }; // 원본배열

		String[] newArr = new String[5]; // 새로운 배열

		System.arraycopy(arr, 0, newArr, 0, arr.length);

		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + "\t");
		}

	}

}
