package normalExam;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class Ex01 extends JFrame {
	Ex01() {
		setTitle("ÀÚ¹Ù ½ºÀ®");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();

		c.setBackground(Color.CYAN);

		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Ex01();

	}
}
