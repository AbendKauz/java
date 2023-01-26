package sec01;

public class ByteExample {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
//		byte var6 = 128;	//	error(초기화 시에는 타입에 초과하는 값은 들어가지 않는다)

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);

		byte var7 = 127;
		var7 = (byte) (var7 + 1);
//		var7 = (byte)(var7 - 1);
		System.out.println(var7); // -128

		byte var8 = -128;
		var8 = (byte) (var8 - 1);
		System.out.println(var8); // 127

		char a = '김';
		int b = '김'; // ''로 감싸면 유니코드로 변환되서 int로 저장 및 출력 가능
		System.out.println(a); // 김 출력
		System.out.println((int) a); // 유니코드 : 44608로 출력
		System.out.println(b); // 44608

	}

}
