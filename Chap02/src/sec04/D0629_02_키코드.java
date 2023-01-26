package sec04;

public class D0629_02_키코드 {

	public static void main(String[] args) throws Exception {

		int keyCode;

		keyCode = System.in.read();
		System.out.println(keyCode);
		keyCode = System.in.read();
		System.out.println(keyCode);

		// 키보드로부터 값이 여러개 입력되면 위의 코드를 계속 복붙해야함
		// 너무 불편하니 반복문으로 입력된 키 갯수와 상관없이 키코드 읽기

	}

}
