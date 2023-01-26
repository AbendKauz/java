package sec02.exam03;

public class AnonymousExample {

	public static void main(String[] args) {

		Anonymous a = new Anonymous();
		a.field.turnOn();
		a.field.turnOff();

		a.method1();

		a.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("SmartTV¸¦ ÄÕ´Ï´Ù.");
			}

			@Override
			public void turnOff() {
				System.out.println("SmartTV¸¦ ²ü´Ï´Ù.");
			}

		});

	}

}
