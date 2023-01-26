package programmers;

public class Collatz {
	public static void main(String[] args) {
		solution(626331);
	}

	public static int solution(int num) {
		int answer = 0;
		long a = num;
		// 626331�� �����ٺ��� int���� �ʰ��ϴ� �� �߻�
		// -> longŸ������ ��ȯ�Ͽ� ����
		int cnt = 0;
		while (true) {
			if (num == 1) {
				answer = 0;
				break;
			} else if (cnt == 500) {
				answer = -1;
				break;
			} else if (a == 1) {
				answer = cnt;
				break;
			} else {
				if (a % 2 == 0) {
					a /= 2;
				} else {
					a = a * 3 + 1;
				}
				System.out.println(a);
				cnt++;
			}
		}
		System.out.println(answer);
		return answer;
	}

}
