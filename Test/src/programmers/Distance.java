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
			// x : -10000000 이상, 10000000 이하 : long타입으로 변환
			// n : 1000 이하인 자연수
			// x : 10000000, n : 1000 이면 10.000.000.000이라 int범위 초과됨
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}
}
