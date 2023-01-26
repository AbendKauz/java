package sec02;

public class D0630_02_증감연산자1 {

	public static void main(String[] args) {

//		int age = 20;
//		System.out.println("현재의 나이는? " + age);
//		
//		++age;
//		System.out.println("++age? " + age);	// 21
//		System.out.println(age++);				// 21
//		System.out.println(age);				// 22

		int num1 = 20;
		int result = num1++ * 3; // 20 * 3 ==> 60
		// num1 = num1 +1
		System.out.println("result : " + result + ", num1 : " + num1);

		int num2 = 20;
		int result2 = ++num2 * 3; // num1 = num1 +1
		// 21 * 3 ==> 63
		System.out.println("result2 : " + result2 + ", num2 : " + num2);

	}

}
