package style;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;

public class JButtonStyle {	// 버튼 스타일 관련 정의 메소드
	
	public void JButtonStyle(JButton btn) {
		
		// 백그라운드 색상 정의
		btn.setBackground(Color.BLACK);
		
		// 텍스트 색상 정의
		btn.setForeground(Color.WHITE);
		
		// 폰트 정의
		btn.setFont(new Font("맑은 고딕", 0, 20));
		
		// 글자 가운데 정렬 설정
		btn.setHorizontalAlignment(JLabel.CENTER);
	}
	
}
