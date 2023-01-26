package sec01.exam19;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {

		String str1 = "Java Programming";
		String str2 = "JAVA Programming";

		System.out.println(str1.equals(str2));

		// toLowerCase : ���� �ҹ��ڷ� ����
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();

		System.out.println(lowerStr1.equals(lowerStr2));

		String upperStr1 = str1.toUpperCase();
		String upperStr2 = str2.toUpperCase();

		// toUpperCase : ���� �빮�ڷ� ����
		System.out.println(upperStr1.equals(upperStr2));

		// equalsIgnoreCase : ��ҹ��� ���о��� ��
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
