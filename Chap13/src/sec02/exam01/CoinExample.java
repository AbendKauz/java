package sec02.exam01;

import java.util.Stack;

public class CoinExample {

	public static void main(String[] args) {

		// -> Coin Ÿ���� �����ϴ� Stack ���� // �������� coinBox
		Stack<Coin> coinBox = new Stack<>();

		// -> ������ coinBox �� Coin ��ü�� �����Ͽ� �߰� -> push()
		// - �Ű��� 100
		// - �Ű��� 50
		// - �Ű��� 500
		// - �Ű��� 10
		// push() : �־��� ��ü�� ���ÿ� ���� --> LIFO(���� ���߿� ���� ��ü�� ���� ���� ���������� ����)
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));

		// -> �Ʒ��� ���� �ֿܼ� ��� (�ݺ����� isEmpty �޼ҵ带 Ȱ��)
		// - isEmpty( ) => ����ִٸ� true �� �����ϴ� �޼ҵ�
		// <console>
		// ������ ���� : 10��
		// ������ ���� : 500��
		// ������ ���� : 50��
		// ������ ���� : 100��

		while (!coinBox.isEmpty()) {
//			System.out.println("������ ���� : " + coinBox.pop().getValue() + "��");
			Coin coin = coinBox.pop();
			System.out.println("������ ���� : " + coin.getValue() + "��");
		}

	}

}
