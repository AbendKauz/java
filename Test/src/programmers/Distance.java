package programmers;

import java.util.Arrays;

public class Distance {
	public static void main(String[] args) {
		solution(4, 3);
	}

	public static long[] solution(int x, int n) {
		long[] answer = {};
		answer = new long[n];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (long) x * (i + 1);
			// x : -10000000 �̻�, 10000000 ���� : longŸ������ ��ȯ
			// n : 1000 ������ �ڿ���
			// x : 10000000, n : 1000 �̸� 10.000.000.000�̶� int���� �ʰ���
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}
}
