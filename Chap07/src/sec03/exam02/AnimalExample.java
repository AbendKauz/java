package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {

		// -> �� ��ü Ŭ������ �������� sound( ) �޼ҵ� ȣ��
		// ��� 1. �� ��ü Ŭ���� Ÿ���� ������ ���� ȣ��
		// ��� 2. �ڵ� Ÿ�� ��ȯ Ȱ��
		// - Animal Ÿ���� ������ ���� �ڵ� Ÿ�� ��ȯ�� �̿��Ͽ� ȣ��
		// ��� 3. �޼ҵ��� ������ ����
		// - animalSound( ) �޼ҵ� ���� ȣ��
		// : ���� �޼ҵ� / �������� public / ���� Ÿ�� X / �Ű����� - Animal Ÿ�� �ϳ� ����
		// �޾ƿ� �Ű����� sound( ) �޼ҵ� ȣ��
		// -> <console>
		// �۸�
		// �߿�

		// 1.
//		Dog dog = new Dog();
//		dog.sound();
//		Cat cat = new Cat();
//		cat.sound();

		// 2.
//		Animal animal = new Dog();
//		dog.sound();
//		animal = new Cat();
//		cat.sound();

		// 3-1
//		Dog dog = new Dog();
//		animalSound(dog);
//		Cat cat = new Cat();
//		animalSound(cat);

		// 3-2
		animalSound(new Dog());
		animalSound(new Cat());
	}

	// 3.
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
