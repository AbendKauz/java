package sec01.exam01;

public class ExceptionSample2 {

	public static void main(String[] args) {

////		String a = null;
//		// java.lang.NullPointerException
//		
//		String a = "";
//		System.out.println(a.toString());
//		
//		if(a.equals("true")) {
//			System.out.println("a의 값은 true입니다.");
//		}else {
//			System.out.println("a의 값은 true가 아닙니다.");
//		}

//		String[] arr = new String[2];
//		
//		arr[0] = "가나다";
//		arr[1] = "라마바";
//		arr[2] = "사아자"; 
		// java.lang.ArrayIndexOutOfBoundsException

		// run -> Run Configurations -> Arguments tab
		// -> Program arguments에 값 2개 입력하면 Exception 사라짐
		// Arguments -> 프로그램 실행 시 자동으로 들어가는 배열

//		String data1 = args[0];
//		String data2 = args[1];
//		
//		System.out.println("args[0] : " + data1);
//		System.out.println("args[1] : " + data2);

//		String data1 = "100";
//		String data2 = "a100";
//		
//		int value1 = Integer.parseInt(data1);
//		int value2 = Integer.parseInt(data2);
//		// java.lang.NumberFormatException
//		
//		System.out.println("data1의 값은 " + value1 + "입니다.");
//		System.out.println("data2의 값은 " + value2 + "입니다.");

		Dog dog = new Dog();
		changeDog(dog);

		Cat cat = new Cat();
		changeDog(cat);
	}

	private static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
//		Dog dog = (Dog) animal;
		// java.lang.ClassCastException
	}

}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
