package main;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import style.JButtonStyle;
import style.JFrameStyle;

public class Info extends JFrame{
	
	public void start() throws Exception{
		// sjbs : JButtonStyle Ŭ����
		// sjfs : JFrameStyle Ŭ����	
	
		JButtonStyle sjbs = new JButtonStyle();
		JFrameStyle sjfs = new JFrameStyle();
		
		JFrame frm = new JFrame("��ǰ ���� ���α׷�");	// ������ ����
		sjfs.JFrameStyle(frm);					// ������ ��Ÿ�� ���� �޼ҵ� ȣ��
		
		JPanel tp = new JPanel();					// ��� �г� ����
		tp.setLayout(new FlowLayout());				// ��� �߽� ��ġ ���̾ƿ�
		tp.setBounds(0, 10, 500, 50);
		tp.setBackground(Color.LIGHT_GRAY);
		JLabel tl = new JLabel("��ǰ ���� ���α׷�");	// ��� �г� ����
		tl.setFont(new Font("���� ���", 0, 20));		// ��� ���� ����
		tp.add(tl);
		
		ImageIcon image = new ImageIcon("src/image/center.jpg");	// �̹��� ������ ��ü ����
		
		JPanel jp = new JPanel();		// �߾ӿ� �г� ����
		jp.setLayout(new FlowLayout());	// ��� �߽� ��ġ ���̾ƿ�
		jp.setBounds(0, 70, 500, 350);
		
		JButton move = new JButton(null, image);	// ��ư���� + ��ư�� �̹����� �߰�
		sjbs.JButtonStyle(move);					// ��ư ��Ÿ�� ���� �޼ҵ� ȣ��
		
		jp.add(move);
		
		JPanel bp = new JPanel();		// �ϴ� �г� ����
		bp.setLayout(new FlowLayout());	// ��� �߽� ��ġ ���̾ƿ�
		bp.setBounds(0, 420, 500, 50);
		bp.setBackground(Color.LIGHT_GRAY);
		JLabel bl = new JLabel("�����Ͻ÷��� ��� �̹����� �����ּ���.");
		bl.setFont(new Font("���� ���", 0, 20));
		bp.add(bl);
		
		// ��ư�� ������ �� ������ �̺�Ʈ ����
		ActionListener action =  new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("")) {	// �̹�����ư ������ ��
					try {
						Order order = new Order();
						order.start();			// OrderŬ������ start()�޼ҵ� ȣ��
						frm.setVisible(false);	// ���� ������ ǥ�þ������� ����
					} catch (Exception e1) {}
				}
			}
			
		};
		
		move.addActionListener(action);	// ��ư�� �̺�Ʈ ����
		// �г� ����
		frm.getContentPane().add(tp);
		frm.getContentPane().add(jp);
		frm.getContentPane().add(bp);
		// ������ ǥ��
		frm.setVisible(true);
			
	} // start()
	
} // class()
