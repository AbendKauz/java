package sec01;

public class IntegerLiteralExample {

	public static void main(String[] args) {

//		int var1 = 0b1011;	//	(0b)2����
//		int var2 = 0206;	//	(0)8����
//		int var3 = 365;		//	10����
//		int var4 = 0xB3;	//	(0x)16����
//		
//		System.out.println("var1 : " + var1);	//	11
//		System.out.println("var2 : " + var2);	//	134
//		System.out.println("var3 : " + var3);	//	365
//		System.out.println("var4 : " + var4);	//	179

//----------------------------------------------------------------

//		byte a;
//		a = 128;	//	���� ����	: byteŸ�� �ִ밪���� ū ����
//		a = 127;
//		a = a + 1;	//	���� ����, ����	: + 1 ->intŸ��	=>	a = (byte)(a + 1); �� �����ؾ�

//		char c;
//		c = 65;
//		System.out.println(c);	//	��°��	:	A
//		c = (char)(c + 2);
//		System.out.println(c);	//	��°��	:	C
//		
//		int d;
//		d = c + 3;	//	int = int + char => int
//		System.out.println(d);	//	��°��	:	70
//		d = (char)d;
//		System.out.println(d);	//	��°��	:	70	(d�� int�� ����Ǿ��־� ������ �ȵ�)

//----------------------------------------------------------------

		// a ���� �̿��ؼ� ABCD ���
		int a = 'A';

		for (int i = 0; i <= 3; i++) {
			if (i >= 3) {
				System.out.print((char) (a + i) + "\n");
			} else {
				System.out.print((char) (a + i));
			}
		}

//		System.out.println((char)a + "" + (char)(a + 1) + "" + (char)(a + 2) + "" + (char)(a + 3));	//	���� 1�� �����ϹǷ� �ݺ��ؼ� ���ص� ��

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

		// b ���� �̿��ؼ� ������ �ڵ� ���ڰ� ���
		char b = '��';
		System.out.println(b + "�� �����ڵ� �� => " + (int) b);
		b = '��';
		System.out.println(b + "�� �����ڵ� �� => " + (int) b);
		b = '��';
		System.out.println(b + "�� �����ڵ� �� => " + (int) b);

//----------------------------------------------------------------

//		byte a;
//		short b;
//		char c;
////		int c;
//		int d;
//		long e;

//		e = 3000000000L;	//	e = 3000000000; -	The literal 3000000000 of type int is out of range (int�� ������ ���)
//		e = e + e;	//	int Ÿ�Ժ��� ū longŸ���̶� ���꿡 ������ �Ȼ���(longŸ������ �����)

//		c = 'A';	//	A
//		d = 'A';	//	65

//		c = 65;
//		d = 65;
//		
//		System.out.println(c);
//		System.out.println(d);

//		c = '\uac00';			//	�����ڵ� ac00
//		c = (char)(c + 1);		//	��
//		System.out.println(c);

		// ���� �̸��� �����ڵ�� ���
//		char k = '��';
//		char j = '��';
//		char y = '��';
//		
//		System.out.println(k + "---" + (int)k);	//	44608
//		System.out.println(j + "---" + (int)j);	//	51456
//		System.out.println(y + "---" + (int)y);	//	50689

//		c = 44032;				//	��
//		System.out.println(c);

//		a = 127;			//	�ʱⰪ�� Ÿ�� ���� �ʰ� �� error
//		a = (byte)(a + 1);	//	����ÿ��� ���� ��� �� ����Ŭ �߻�

//		b = 200;
//		b = (short)(b + b);			//	b = b + b; : ����� Ÿ���� int�� ��ȯ��
//		b = (short)(b * b);			//	-25536
//		c = (char)b;

//		c = 0;
//		c = (char)(c - 1);
//		b = -1;

//		c = (char)b;
//		System.out.println((int)c);

//		c = 65;
//		System.out.println(c);				//	A ��µ�(���� Ÿ���̶� �����ڵ�� ��ȯ�Ǿ� ���)
//		System.out.println((char)c);		//	A

	}

}
