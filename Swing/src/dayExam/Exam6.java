package dayExam;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam6 {

	public static void main(String[] args) {

		// 6.JLabel 컴포넌트 20개를 프레임 내에 (50, 50) 위치에서
		// (250, 250)영역에 랜덤하게 출력
		// - JLabel 크기 : 10 * 10 / 배경색은 파랑
		// - 프레임 크기 : 350 * 350

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