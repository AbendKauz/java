package style;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;

public class JButtonStyle {	// ��ư ��Ÿ�� ���� ���� �޼ҵ�
	
	public void JButtonStyle(JButton btn) {
		
		// ��׶��� ���� ����
		btn.setBackground(Color.BLACK);
		
		// �ؽ�Ʈ ���� ����
		btn.setForeground(Color.WHITE);
		
		// ��Ʈ ����
		btn.setFont(new Font("���� ���", 0, 20));
		
		// ���� ��� ���� ����
		btn.setHorizontalAlignment(JLabel.CENTER);
	}
	
}
