package sec02;

public class D0712_01_�迭����2 {

	public static void main(String[] args) {

		int[] scores;
		scores = new int[] { 83, 45, 75, 64 };
		int sum1 = 0;

		for (int i = 0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("sum1 : " + sum1);

		int sum2 = add(new int[] { 83, 45, 75, 64 });
		System.out.println("sum2 : " + sum2);

	}

	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}

		return sum;
	}

}
