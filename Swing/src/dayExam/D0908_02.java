package dayExam;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class D0908_02 {

	public static void main(String[] args) {

		new E();

	}

}

class E extends JFrame {

	E() {
//		setTitle("�����Ӹ����");
		super("�����");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		setLayout(new FlowLayout());

		addComponents(c);

		setSize(400, 300);
		setVisible(true);
	}

	public void addComponents(Container c) {
		JButton btn = new JButton("Action");
		// Action�̶�� ���ڰ� �����ִ� ��ư ����

		// MyMouseAdapter Ŭ���� ����
//		btn.addMouseListener(new MyMouseAdapter());	// btn ���� �� �̺�Ʈ
		c.addMouseListener(new MyMouseAdapter()); // container �ƹ����� Ŭ�� �� �̺�Ʈ

//		// 1. ����Ŭ������ �ۼ�
//		btn.addActionListener(new MyActionListener());

//		// 3. �͸� Ŭ������ �ۼ�
//		btn.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JButton b = (JButton)e.getSource();
//				b.getParent().setBackground(Color.yellow);
//				// -> ��ü�� �θ� �θ��� �޼ҵ�
//				// b�� getParent = container
//				if(b.getText().equals("Action")) {
//					b.setText("�׼�");
//				}else {
//					b.setText("Action");
//				}
//				
//				if(b.getBackground() == Color.red) {
//					b.setBackground(Color.cyan);
//				}else {
//					b.setBackground(Color.red);
//				}
//			}
//			
//		});

		c.add(btn);
	}

	// 2. ���� Ŭ����(inner class)�� �ۼ�
	// => Ŭ���� �ȿ� ���ó�� Ŭ���� �ۼ�
}

// 1. ���� Ŭ����
//class MyActionListener implements ActionListener{
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		JButton b = (JButton)e.getSource();
//		b.getParent().setBackground(Color.yellow);
//		// -> ��ü�� �θ� �θ��� �޼ҵ�
//		// b�� getParent = container
//		if(b.getText().equals("Action")) {
//			b.setText("�׼�");
//		}else {
//			b.setText("Action");
//		}
//		
//		if(b.getBackground() == Color.red) {
//			b.setBackground(Color.cyan);
//		}else {
//			b.setBackground(Color.red);
//		}
//		
//	}
//	
//}

class MyMouseAdapter extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) { // ���콺 Ŭ�� �̺�Ʈ �߻� ��
		// btn Ŭ�� �� �̺�Ʈ
//		JButton b = (JButton)e.getSource();
//		// e.getSource = Object Ÿ���̹Ƿ� ����Ÿ�Ժ�ȯ �ʿ�
//		b.getParent().setBackground(Color.black);	// �����̳��� ������ �������� ����

		// container �ƹ��� Ŭ�� �� �̺�Ʈ
		Container c = (Container) e.getSource();
		c.setBackground(Color.green);
	}

}
