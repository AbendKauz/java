package sec03.exam08;

public class PersonExample {

	public static void main(String[] args) {

		// default 생성자를 이용해 객체 person1 생성
		// person1의 이름과 나이를 홍길동, 30으로 변경
		// person1 객체의 이름, 나이 값 출력

		// 2개의 매개변수를 넘겨받는 생성자를 이용해 객체 person2 생성 -> 박길동, 21
		// person2 객체의 이름, 나이 값 출력

		// person2의 이름과 나이를 혼자바, 15로 변경
		// person2 객체의 이름, 나이 값 출력

		Person person1 = new Person();
		person1.setName("홍길동");
		person1.setAge(30);

		System.out.println(person1.toString());

		Person person2 = new Person("박길동", 21);
		System.out.println(person2);

		person2.setName("혼자바");
		person2.setAge(15);
		System.out.println("이름 : " + person2.getName() + ", 나이 : " + person2.getAge());

	}

}
