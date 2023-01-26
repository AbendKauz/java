package sec01;

public class IntegerLiteralExample {

	public static void main(String[] args) {

//		int var1 = 0b1011;	//	(0b)2진수
//		int var2 = 0206;	//	(0)8진수
//		int var3 = 365;		//	10진수
//		int var4 = 0xB3;	//	(0x)16진수
//		
//		System.out.println("var1 : " + var1);	//	11
//		System.out.println("var2 : " + var2);	//	134
//		System.out.println("var3 : " + var3);	//	365
//		System.out.println("var4 : " + var4);	//	179

//----------------------------------------------------------------

//		byte a;
//		a = 128;	//	에러 이유	: byte타입 최대값보다 큰 수라서
//		a = 127;
//		a = a + 1;	//	에러 이유, 수정	: + 1 ->int타입	=>	a = (byte)(a + 1); 로 수정해야

//		char c;
//		c = 65;
//		System.out.println(c);	//	출력결과	:	A
//		c = (char)(c + 2);
//		System.out.println(c);	//	출력결과	:	C
//		
//		int d;
//		d = c + 3;	//	int = int + char => int
//		System.out.println(d);	//	출력결과	:	70
//		d = (char)d;
//		System.out.println(d);	//	출력결과	:	70	(d는 int로 선언되어있어 변경이 안됨)

//----------------------------------------------------------------

		// a 변수 이용해서 ABCD 출력
		int a = 'A';

		for (int i = 0; i <= 3; i++) {
			if (i >= 3) {
				System.out.print((char) (a + i) + "\n");
			} else {
				System.out.print((char) (a + i));
			}
		}

//		System.out.println((char)a + "" + (char)(a + 1) + "" + (char)(a + 2) + "" + (char)(a + 3));	//	수가 1씩 증가하므로 반복해서 안해도 됨

//		System.out.print((char)a);
//		a = 'B';
//		System.out.print((char)a);
//		a = 'C';
//		System.out.print((char)a);
//		a = 'D';
//		System.out.println((char)a);

//		System.out.print((char)a);
//		a = a + 1;
//		System.out.print((char)a);
//		a = a + 1;
//		System.out.print((char)a);
//		a = a + 1;
//		System.out.println((char)a);

		// b 변수 이용해서 가나다 코드 숫자값 출력
		char b = '가';
		System.out.println(b + "의 유니코드 값 => " + (int) b);
		b = '나';
		System.out.println(b + "의 유니코드 값 => " + (int) b);
		b = '다';
		System.out.println(b + "의 유니코드 값 => " + (int) b);

//----------------------------------------------------------------

//		byte a;
//		short b;
//		char c;
////		int c;
//		int d;
//		long e;

//		e = 3000000000L;	//	e = 3000000000; -	The literal 3000000000 of type int is out of range (int의 범위를 벗어남)
//		e = e + e;	//	int 타입보다 큰 long타입이라 연산에 문제가 안생김(long타입으로 계산함)

//		c = 'A';	//	A
//		d = 'A';	//	65

//		c = 65;
//		d = 65;
//		
//		System.out.println(c);
//		System.out.println(d);

//		c = '\uac00';			//	유니코드 ac00
//		c = (char)(c + 1);		//	각
//		System.out.println(c);

		// 본인 이름을 유니코드로 출력
//		char k = '김';
//		char j = '준';
//		char y = '영';
//		
//		System.out.println(k + "---" + (int)k);	//	44608
//		System.out.println(j + "---" + (int)j);	//	51456
//		System.out.println(y + "---" + (int)y);	//	50689

//		c = 44032;				//	가
//		System.out.println(c);

//		a = 127;			//	초기값은 타입 범위 초과 시 error
//		a = (byte)(a + 1);	//	연산시에는 범위 벗어날 시 사이클 발생

//		b = 200;
//		b = (short)(b + b);			//	b = b + b; : 연산시 타입이 int로 전환됨
//		b = (short)(b * b);			//	-25536
//		c = (char)b;

//		c = 0;
//		c = (char)(c - 1);
//		b = -1;

//		c = (char)b;
//		System.out.println((int)c);

//		c = 65;
//		System.out.println(c);				//	A 출력됨(문자 타입이라 유니코드로 변환되어 출력)
//		System.out.println((char)c);		//	A

	}

}
