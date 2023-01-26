package dayExam;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam6 {

	public static void main(String[] args) {

		// 6.JLabel ������Ʈ 20���� ������ ���� (50, 50) ��ġ����
		// (250, 250)������ �����ϰ� ���
		// - JLabel ũ�� : 10 * 10 / ������ �Ķ�
		// - ������ ũ�� : 350 * 350

		new B();

	}

}

class B extends JFrame {
	B() {
		setTitle("Random JLabels");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		setLayout(null);

		AddComponents(c);

		setSize(350, 350);
		setVisible(true);
	}

	public void AddComponents(Container c) {

		for (int i = 0; i < 20; i++) {
			int x = (int) (Math.random() * 200) + 50;
			int y = (int) (Math.random() * 200) + 50;

			JLabel label = new JLabel("3");
			label.setOpaque(true);
//			label.setLocation(x, y);
//			label.setSize(10, 10);
			label.setBounds(x, y, 10, 10);
			label.setBackground(Color.BLUE);
			c.add(label);
		}

	}

}