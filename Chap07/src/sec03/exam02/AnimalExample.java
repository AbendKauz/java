package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {

		// -> 각 실체 클래스에 재정의한 sound( ) 메소드 호출
		// 방법 1. 각 실체 클래스 타입의 변수를 만들어서 호출
		// 방법 2. 자동 타입 변환 활용
		// - Animal 타입의 변수를 만들어서 자동 타입 변환을 이용하여 호출
		// 방법 3. 메소드의 다형성 적용
		// - animalSound( ) 메소드 만들어서 호출
		// : 정적 메소드 / 접근제한 public / 리턴 타입 X / 매개변수 - Animal 타입 하나 선언
		// 받아온 매개값의 sound( ) 메소드 호출
		// -> <console>
		// 멍멍
		// 야옹

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
