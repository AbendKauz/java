package sec02.exam01;

public class D0915_보조스트림 {

	public static void main(String[] args) {

		// * 보조 스트림이란?
		//	: 다른 스트림과 연결이 되어 여러가지 편리한 기능을 제공하는 스트림
		//	: 보조 스트림은 자체적으로 입출력을 수행할 수 없음
		//	=> 입출력 소스와 바로 연결이 되는 입출력스트림과 연결해서 입출력을 수행함
		
		//	: 보조 스트림은 문자변환, 입출력 성능 향상, 기본타입 입출력 등의 기능을 제공

		
		// * 보조 스트림 연결
		//	: 보조 스트림을 생성할 때 자신이 연결될 스트림을 생성자의 매개값으로 제공
		// 기본형 -> 보조스트림 변수명 = new 보조스트림(연결될 스트림);
		//		ex)
		//		InputStream is = new FileInputStream(" ");
		//		InputStreamReader reader = new InputStreamReader(is);
		
		//	: 보조스트림의 생성자 매개값은 입출력스트림 이외에
		//		또 다른 보조스트림이 될 수도 있음
		//		==> 보조스트림을 연속적으로 연결할 수 있다
	}

}
