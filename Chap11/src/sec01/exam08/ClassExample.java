package sec01.exam08;

public class ClassExample {

	public static void main(String[] args) {

		// ù ��° ���
		Class clazz = Car.class;

		// �� ��° ���
//		Class clazz = Class.forName("sec01.exam08.Car");

		// �� ��° ���
//		Car car = new Car();
//		Class clazz = car.getClass();

		System.out.println(clazz.getName());
		// sec01.exam08.Car
		System.out.println(clazz.getSimpleName());
		// Car
		System.out.println(clazz.getPackage().getName());
		// sec01.exam08

	}

}
