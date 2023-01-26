package style;

import java.awt.Color;

import javax.swing.JFrame;

public class JFrameStyle {	// �θ� ������ ��Ÿ�� ���� �޼ҵ�

	public void JFrameStyle(JFrame frame){
		
		// �θ� ������ ũ�� ����
		frame.setSize(500, 500);
		
		// �θ� ������ ���� ����
		frame.setBackground(Color.BLACK);
		 
		// �θ� �������� ȭ�� ����� ��ġ
		frame.setLocationRelativeTo(null);
		
		// �θ� ������ â ũ�� ���� �ǽ�
		frame.setResizable(false);
		
		// �θ� �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// �θ� ���̾ƿ� ����
		frame.getContentPane().setLayout(null);
	}
	
}
