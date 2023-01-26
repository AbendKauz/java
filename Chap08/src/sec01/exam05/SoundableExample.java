package sec01.exam05;

public class SoundableExample {

	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {

		printSound(new Cat()); // 具克
		printSound(new Dog()); // 港港

	}

}
