package dayTest;

public class Test0715 {

	public static void main(String[] args) {

		// �� 1 ~ 45������ 6���� ���ڸ� �ߺ����� �ʰ� ���

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

		// �� ������ �迭 10���� 5 ~ 200 ������ ������ �Է��ϰ�, �ִ밪�� �ּҰ� ���

//		int[] arr = new int[10];
//		int max = 5;	// ���� 5 ~ 200�̹Ƿ� ���� �������� �ִ밪����
//		int min = 200;	// ���� 5 ~ 200�̹Ƿ� ���� ū ���� �ּҰ�����
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
//		System.out.println("�ִ밪 : " + max + ", �ּҰ� : " + min);

		// �� ������ �迭 30���� 5 ~ 15 ������ ������ �Է��ϰ�, 12 �˻��ؼ� ��ġ���

//		int[] arr = new int[30];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 11) + 5;
//			if(arr[i] == 12) {
//				System.out.println("12�� " + i + "������ ��ġ�ϰ� �ֽ��ϴ�.");
//				break;
//			}
//		}

		// �� ������ �迭 30���� 5 ~ 15 ������ ������ �Է��ϰ�, ������ 12 �˻��ؼ� ��ġ���

//		int[] arr = new int[30];
//		int num = 0;
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 11) + 5;
//			if(arr[i] == 12) {
//				num = i;
//			}
//		}
//		System.out.println("������ 12�� " + num + "������ ��ġ�ϰ� �ֽ��ϴ�.");

		// �� ������ �迭 10���� 10 ~ 50���� ������ �Է��ϰ� �������� ����������
		// �Է°��� ������ �� ���
		// �������� - n�� n + 1���� �迭 ���̱��� ���ϰ� ��ġ����
		// -> n�� �� ������ n�� ���� ���� ���� ��
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

		// �� ������ �迭 10���� 10 ~ 50���� ������ �Է��ϰ� �������� ����������
		// �Է°��� ������ �� ���
//		// �������� - n�� n+1�� ũ�� �� �� �������� : ū ���� �ڷ� �̵�
//		//								�������� : ���� ���� �ڷ� �̵�

//		int[] arr = new int[10];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 41) + 10;
//			System.out.println("a[" + i + "] : " + arr[i]);
//		}
//		
//		for (int i = 0; i < arr.length; i++) {	// ȸ��
//			for(int j = 0; j < arr.length - i - 1; j++) {	// arr.length - i - 1 : ȸ�� �� �� ���� ���� ū ���� �� �ڷ� ��(�ݺ�����ʿ�x)
//				if(arr[j] > arr[j+1]) {						// arr.length - 1 : ù ȸ������ j + 1�� ���� ������ �� �̹Ƿ�
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("���� �� a[" + i + "] : " + arr[i]);
//		}

		// �� ������ �迭 10���� 1 ~ 31 ���� ������ �Է��ϰ� �� �ٸ� �迭�� �ڿ��� ���� �����ؼ� �����迭�� ������ �迭 ���

//		int[] a = new int[10];			// ���� �迭
//		int[] b = new int[a.length];	// ���纻 �迭
//		System.out.println("=== �����迭 ===");
//		for (int i = 0; i < a.length; i++) {
//			a[i] = (int)(Math.random() * 31) + 1;
//			System.out.print(a[i] + " ");
//			b[a.length - 1 - i] = a[i];
//		}
//		
//		System.out.println();
//		System.out.println("=== ����迭 ===");
//		for (int i = 0; i < b.length; i++) {
//			System.out.print(b[i] + " ");
//		}

	}

}
