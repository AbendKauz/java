package sec01.exam02;

public class TryCatchFinallyExample {

	public static void main(String[] args) {

//		try {
//			Class clazz = Class.forName("java.lang.String2");
//		} catch (ClassNotFoundException e) {
//			System.out.println("클래스가 존재하지 않습니다.");
//		}

		String data1 = null;
		String data2 = null;

//		try {
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("실행 매개값의 수가 부족합니다.");
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
			System.out.println("숫자를 변환할 수 없습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
