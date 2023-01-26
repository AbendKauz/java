package dayExam;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam4 {

	public static void main(String[] args) {

		// 4. gridlayout�� ����Ͽ� �����
		// ��ư�� ������ ���� �ٸ��� ����

		new A();

	}

}

class A extends JFrame {
	A() {
		setTitle("Color GridLayout");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		setLayout(new GridLayout(1, 10)); // 1�� 10�� grid����

		AddComponents(c);

		setSize(500, 200);
		setVisible(true);

	}

	public void AddComponents(Container c) {

		JButton[] btn = new JButton[10];
		for (int i = 0; i < btn.length; i++) {
			Color color = new Color(i * 20, i * 20, i * 20);
			btn[i] = new JButton("" + (i + 1));
			btn[i].setBackground(color);
			c.add(btn[i]);
		}

	}

}