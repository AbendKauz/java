package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {

//		Singleton sing1 = new Singleton();
//		Singleton sing2 = new Singleton();

//		if(sing1 == sing2) {	// ´Ù¸¥ °´Ã¼
//			System.out.println("°°Àº °´Ã¼");
//		}else {
//			System.out.println("´Ù¸¥ °´Ã¼");
//		}

		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();

		if (sing1 == sing2) { // °°Àº °´Ã¼
			System.out.println("°°Àº °´Ã¼");
		} else {
			System.out.println("´Ù¸¥ °´Ã¼");
		}

	}

}
