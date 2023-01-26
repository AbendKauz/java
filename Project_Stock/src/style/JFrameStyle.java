package style;

import java.awt.Color;

import javax.swing.JFrame;

public class JFrameStyle {	// 부모 프레임 스타일 지정 메소드

	public void JFrameStyle(JFrame frame){
		
		// 부모 프레임 크기 설정
		frame.setSize(500, 500);
		
		// 부모 프레임 배경색 지정
		frame.setBackground(Color.BLACK);
		 
		// 부모 프레임을 화면 가운데에 배치
		frame.setLocationRelativeTo(null);
		
		// 부모 프레임 창 크기 고정 실시
		frame.setResizable(false);
		
		// 부모 프레임을 닫았을 때 메모리에서 제거되도록 설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 부모 레이아웃 설정
		frame.getContentPane().setLayout(null);
	}
	
}
