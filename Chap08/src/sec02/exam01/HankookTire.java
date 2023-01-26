package sec02.exam01;

public class HankookTire implements Tire {

	// -> 받아온 매개값을 활용하여 아래와 똑같이 출력하는 메소드 구현
	// <console> <console>
	// 앞왼쪽 : 한국 타이어가 굴러갑니다. 뒤왼쪽 : 한국 타이어가 굴러갑니다.

	@Override
	public void roll(String roll) {
		System.out.println(roll + " : 한국 타이어가 굴러갑니다.");
	}

}
