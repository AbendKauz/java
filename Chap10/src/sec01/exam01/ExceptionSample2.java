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
//			System.out.println("a�� ���� true�Դϴ�.");
//		}else {
//			System.out.println("a�� ���� true�� �ƴմϴ�.");
//		}

//		String[] arr = new String[2];
//		
//		arr[0] = "������";
//		arr[1] = "�󸶹�";
//		arr[2] = "�����"; 
		// java.lang.ArrayIndexOutOfBoundsException

		// run -> Run Configurations -> Arguments tab
		// -> Program arguments�� �� 2�� �Է��ϸ� Exception �����
		// Arguments -> ���α׷� ���� �� �ڵ����� ���� �迭

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
//		System.out.println("data1�� ���� " + value1 + "�Դϴ�.");
//		System.out.println("data2�� ���� " + value2 + "�Դϴ�.");

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
