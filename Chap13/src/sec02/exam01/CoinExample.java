package sec02.exam01;

import java.util.Stack;

public class CoinExample {

	public static void main(String[] args) {

		// -> Coin 타입을 저장하는 Stack 생성 // 변수명은 coinBox
		Stack<Coin> coinBox = new Stack<>();

		// -> 만들어둔 coinBox 에 Coin 객체를 생성하여 추가 -> push()
		// - 매개값 100
		// - 매개값 50
		// - 매개값 500
		// - 매개값 10
		// push() : 주어진 객체를 스택에 넣음 --> LIFO(가장 나중에 넣은 객체가 가장 먼저 빠져나가는 구조)
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));

		// -> 아래와 같이 콘솔에 출력 (반복문과 isEmpty 메소드를 활용)
		// - isEmpty( ) => 비어있다면 true 를 리턴하는 메소드
		// <console>
		// 꺼내온 동전 : 10원
		// 꺼내온 동전 : 500원
		// 꺼내온 동전 : 50원
		// 꺼내온 동전 : 100원

		while (!coinBox.isEmpty()) {
//			System.out.println("꺼내온 동전 : " + coinBox.pop().getValue() + "원");
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}

	}

}
