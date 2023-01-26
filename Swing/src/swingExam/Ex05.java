package swingExam;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class Ex05 extends JFrame {

	private JTextField tf = new JTextField(20);

	public Ex05() {
		setTitle("Focus Event 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("입력한 후 다른 창을 클릭하면 대문자로 변경"));
		c.add(tf);

		tf.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				tf.setText(tf.getText().toUpperCase());
			}

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub

			}
		});

		setSize(400, 150);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Ex05();
	}

}
