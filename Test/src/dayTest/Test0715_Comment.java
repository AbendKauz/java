package dayTest;

public class Test0715_Comment {

	public static void main(String[] args) {

		// �� 1 ~ 45������ 6���� ���ڸ� �ߺ����� �ʰ� ���

//		int[] a = new int[45];	// �̰���� ���������� �迭 ����
//		for (int i = 0; i < a.length; i++) {
//			a[i] = i + 1;		// �迭�ȿ� ������ �� ����ֱ�
//		}
//		for (int i = 0; i < 500; i++) {		// �迭���� �������� ����
//			int n1 = (int)(Math.random() * (a.length));	// n1 = �迭�� ����
//			int n2 = (int)(Math.random() * (a.length));	// n2 = �迭�� ����
//			
//			int t = a[n1];
//			a[n1] = a[n2];
//			a[n2] = t;
//		}
//		
//		for(int i = 0; i < 6; i++) {	// �������� ���� �迭���� �� 6���� �̱�(1 ~ 45�̱� ������ �ߺ��� ������ �ʴ´�)
//			System.out.print(a[i] + " ");
//		}

		// �� ������ �迭 10���� 5 ~ 200 ������ ������ �Է��ϰ�, �ִ밪�� �ּҰ� ���

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
//		System.out.println("�ִ밪 : " + max + ", �ּҰ� : " + min);

		// �� ������ �迭 30���� 5 ~ 15 ������ ������ �Է��ϰ�, 12 �˻��ؼ� ��ġ���
		// (12�� ���� ��µǸ� �ݺ��ߴ�)

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
//			System.out.println("ã�� ���� index�� " + i + "��°�� �ֽ��ϴ�.");
//		}else {
//			System.out.println("ã�� ���� �����ϴ�.");
//		}

		// �� ������ �迭 30���� 5 ~ 15 ������ ������ �Է��ϰ�, ������ 12 �˻��ؼ� ��ġ���

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
//			System.out.println("ã�� ���� index�� " + i + "��°�� �ֽ��ϴ�.");
//		}else {
//			System.out.println("ã�� ���� �����ϴ�.");
//		}

		// �� ������ �迭 10���� 10 ~ 50���� ������ �Է��ϰ� �������� ����������
		// �Է°��� ������ �� ���

		// �ҿ�ð� Ȯ���� ���� �迭 10000���� ����

//		// int[] a = new int[10];
//		int[] a = new int[10000];
//		System.out.println("=== ���� �� ��� ===");
//		for (int i = 0; i < a.length; i++) {
//			a[i] = (int)(Math.random() * 41 ) + 10;
//			System.out.print(a[i] + ", ");
//		}
//		System.out.println();
//		
//		long startTime = System.currentTimeMillis();	// ���۽ð�
//		
//		for (int i = 0; i < a.length - 1; i++) {		// ������ġ ����
//			for (int j = i + 1; j < a.length; j++) {	// �񱳴�� ��ġ
//				if(a[i] > a[j]) {
//					int t = a[i];
//					a[i] = a[j];
//					a[j] = t;
//				}
//			}
//		}
//		long endTime = System.currentTimeMillis();	// ����ð�
//		
//		System.out.println("=== �������� �� ��� ===");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + ", ");
//		}
//		System.out.println();
//		System.out.println("�������Ŀ� �ҿ�� �ð� : " + ((long)endTime - startTime));

		// �� ������ �迭 10���� 10 ~ 50���� ������ �Է��ϰ� �������� ����������
		// �Է°��� ������ �� ���

		// �ҿ�ð� Ȯ���� ���� �迭 10000���� ����

//		// int[] a = new int[10];
//		// int[] a = new int[10000];
//		System.out.println("=== ���� �� ��� ===");
//		for (int i = 0; i < a.length; i++) {
//			a[i] = (int)(Math.random() * 41 ) + 10;
//			System.out.print(a[i] + " ");
//		}
//		System.out.println();
//		long startTime = System.currentTimeMillis();	// ���۽ð�
//		
//		for (int i = 0; i < a.length - 1; i++) {			// ȸ����
//			for (int j = 0; j < a.length - i - 1; j++) {	// ������ġ
//				if(a[j] > a[j+1]) {
//					int t = a[j];
//					a[j] = a[j + 1];
//					a[j + 1] = t;
//				}
//			}
//		}
//		long endTime = System.currentTimeMillis();	// ����ð�
//		
//		System.out.println("=== �������� �� ��� ===");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}
//		System.out.println();
//		System.out.println("�������Ŀ� �ҿ�� �ð� : " + ((long)endTime - startTime));

		// �� ������ �迭 10���� 1 ~ 31 ���� ������ �Է��ϰ� �� �ٸ� �迭�� �ڿ��� ���� �����ؼ� �����迭�� ������ �迭 ���

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
