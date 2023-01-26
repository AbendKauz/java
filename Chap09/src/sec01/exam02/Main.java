package sec01.exam02;

import sec01.exam02.OuterClass.InstanceA;

public class Main {

	public static void main(String[] args) {

		// 로컬 클래스 호출 -> 정적 멤버 호출 -> 인스턴스 멤버 호출

		// 로컬 클래스 호출
		OuterClass out = new OuterClass();
		out.method();

		// 정적 멤버 호출
		OuterClass.StaticA sa = new OuterClass.StaticA();
//		sa.b = 5;	// 바깥에선 필드의 초기값에 접근할 수 없다
		sa.method2();

		// 인스턴스 멤버 호출
		InstanceA ia = out.new InstanceA();
//		ia.a = 5;	// 바깥에선 필드의 초기값에 접근할 수 없다
		ia.method1();

	}

}
