package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {

//		Singleton sing1 = new Singleton();
//		Singleton sing2 = new Singleton();

//		if(sing1 == sing2) {	// �ٸ� ��ü
//			System.out.println("���� ��ü");
//		}else {
//			System.out.println("�ٸ� ��ü");
//		}

		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();

		if (sing1 == sing2) { // ���� ��ü
			System.out.println("���� ��ü");
		} else {
			System.out.println("�ٸ� ��ü");
		}

	}

}
