package sec02;

public class D0718_04_�迭���� {

	public static void main(String[] args) {

		// �迭���� ���
		// 1. for�� �̿��ϱ�
		// 2. System.arrcopy() �̿��ϱ�

		// 2.
		// System.arrcopy(�����迭, �����迭_����index, �� �迭,
		// �� �迭_index, ������ ����)

		String[] arr = { "java", "system", "arrcopy" }; // �����迭

		String[] newArr = new String[5]; // ���ο� �迭

		System.arraycopy(arr, 0, newArr, 0, arr.length);

		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + "\t");
		}

	}

}
