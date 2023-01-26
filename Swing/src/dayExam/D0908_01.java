package dayExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D0908_01 {

	public static void main(String[] args) {

		new J(); // JFrame�� ��ӹ޴� J Ŭ���� ����

	}

}

class J extends JFrame { // �ֻ��� GUI �����̳�

	J() {
//		setTitle("�����Ӹ����");	// Ÿ��Ʋ �̸� ��� 1
//		// => �޼ҵ带 ȣ���Ͽ� Ÿ��Ʋ �ޱ�
		super("�����"); // Ÿ��Ʋ �̸� ��� 2
//		// => JFrame�� �����ڸ� ȣ���Ͽ� Ÿ��Ʋ �ޱ�
		setLocationRelativeTo(null); // �ʱ� â ��ġ ����(null : ȭ�� ���)
		setDefaultCloseOperation(EXIT_ON_CLOSE); // â ���� �� ���α׷� ����
		Container c = getContentPane();
		// Container -> �� ����
		// getContentPane(); -> Container�� ���ϴ� ������ ���δ�

		// ���� ���̺� ǥ�� ���
		// FlowLayout : �����̳� ũ�⿡ ���� ������� �߰�
		setLayout(new FlowLayout());

		// BorderLayout : ������ ��ġ�� �߰�(��,��,��,��,�߾� ���� ����)
//		setLayout(new BorderLayout(30, 50));
		// (30, 50) : ����, ���� ����

		// GridLayout : �����̳ʸ� ���������� ������ ��ġ
		// => ������ �迭

		// CardLayout : ������Ʈ���� ī��ó�� ��ġ�� ��ġ
		// => ���� �߰��� ������� ǥ�õ�, ���� ������ ����
//		setLayout(null);	// ��ġ�����ڰ� ���� �����̳�

//		JLabel label = new JLabel("���̺�1");		// ������Ʈ1
//		c.add(label);	// ContentPane�� label Component �ޱ� 
//		JLabel label2 = new JLabel("���̺�2");	// ������Ʈ2
//		c.add(label2);	// ContentPane�� label2 Component �ޱ�

		AddComponents(c); // ������Ʈ �߰� �޼ҵ�

		setSize(400, 300); // â ũ��(width, height)
		setVisible(true); // â ǥ�� (������� �ۼ��� �� ���� ������)
		// * setVisible�� �������� �־�� �ۼ��� ������� ǥ�õ�

	}

	public void AddComponents(Container c) {
		// FlowLayout
//		JButton[] btn = new JButton[8];
//		for (int i = 0; i < btn.length; i++) {
//			btn[i] = new JButton("��ư" + i);	// ��ư�� ���� �߰�
//			c.add(btn[i]);	// btn�� ������ŭ ��ư ����
//		}

		// BorderLayout
//		JButton btn1 = new JButton("EAST");
//		JButton btn2 = new JButton("WEST");
//		JButton btn3 = new JButton("NORTH");
//		JButton btn4 = new JButton("SOUTH");
//		JButton btn5 = new JButton("CENTER");
//		JLabel label = new JLabel("���̺�");
//		
//		// �������� ������Ʈ�� �� ��ġ�� �߰��� ���
//		// -> �г��� �߰��Ͽ� �ش� ������Ʈ���� �־�� ��
//		JPanel panel = new JPanel();
//		panel.add(btn1);
//		panel.add(label);
//		
//		
////		c.add(btn1, BorderLayout.EAST);	// add(������Ʈ, ��ġ����)
//		c.add(btn2, BorderLayout.WEST);
//		c.add(btn3, BorderLayout.NORTH);
//		c.add(btn4, BorderLayout.SOUTH);
//		c.add(btn5, BorderLayout.CENTER);
////		c.add(label, BorderLayout.EAST);
//		// �г��� ��ġ�� �����ϸ鼭 �߰�
//		c.add(panel, BorderLayout.EAST);

		// ��ġ�����ڰ� ���� �����̳�
//		JPanel panel = new JPanel();
//		panel.setBackground(Color.BLUE);	// �г��� ���� ����
////		panel.setLocation(100, 100);	// �г��� ��ġ ����
////		panel.setSize(50, 50);	// �г��� ũ�� ����
//		panel.setBounds(100, 100, 50, 50);	// �г��� ��ġ, ũ�� ����(x��, y��, �ʺ�, ����)
//		c.add(panel);

		ImageIcon img = new ImageIcon("src/images/apple.jpg");
		JLabel label = new JLabel(img);
		c.add(label);

	}

}