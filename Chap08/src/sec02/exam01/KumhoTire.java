package sec02.exam01;

public class KumhoTire implements Tire {

	// -> 받아온 매개값을 활용하여 아래와 똑같이 출력하는 메소드 구현
	// <console> <console>
	// 앞왼쪽 : 금호 타이어가 굴러갑니다. 앞오른쪽 : 금호 타이어가 굴러갑니다.

	@Override
	public void roll(String roll) {
		System.out.println(roll + " : 금호 타이어가 굴러갑니다.");
	}

}
