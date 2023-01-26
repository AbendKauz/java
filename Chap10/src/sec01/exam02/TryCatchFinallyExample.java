package sec01.exam02;

public class TryCatchFinallyExample {

	public static void main(String[] args) {

//		try {
//			Class clazz = Class.forName("java.lang.String2");
//		} catch (ClassNotFoundException e) {
//			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
//		}

		String data1 = null;
		String data2 = null;

//		try {
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("���� �Ű����� ���� �����մϴ�.");
//			return;
//		}

		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� ��ȯ�� �� �����ϴ�.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
		} catch (Exception e) {
			System.out.println("���࿡ ������ �ֽ��ϴ�.");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}

	}

}
