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
		// sjbs : JButtonStyle 클래스
		// sjfs : JFrameStyle 클래스	
	
		JButtonStyle sjbs = new JButtonStyle();
		JFrameStyle sjfs = new JFrameStyle();
		
		JFrame frm = new JFrame("상품 관리 프로그램");	// 프레임 생성
		sjfs.JFrameStyle(frm);					// 프레임 스타일 관련 메소드 호출
		
		JPanel tp = new JPanel();					// 상단 패널 생성
		tp.setLayout(new FlowLayout());				// 가운데 중심 배치 레이아웃
		tp.setBounds(0, 10, 500, 50);
		tp.setBackground(Color.LIGHT_GRAY);
		JLabel tl = new JLabel("상품 관리 프로그램");	// 상단 패널 글자
		tl.setFont(new Font("맑은 고딕", 0, 20));		// 상단 글자 지정
		tp.add(tl);
		
		ImageIcon image = new ImageIcon("src/image/center.jpg");	// 이미지 아이콘 객체 생성
		
		JPanel jp = new JPanel();		// 중앙용 패널 생성
		jp.setLayout(new FlowLayout());	// 가운데 중심 배치 레이아웃
		jp.setBounds(0, 70, 500, 350);
		
		JButton move = new JButton(null, image);	// 버튼생성 + 버튼에 이미지를 추가
		sjbs.JButtonStyle(move);					// 버튼 스타일 관련 메소드 호출
		
		jp.add(move);
		
		JPanel bp = new JPanel();		// 하단 패널 생성
		bp.setLayout(new FlowLayout());	// 가운데 중심 배치 레이아웃
		bp.setBounds(0, 420, 500, 50);
		bp.setBackground(Color.LIGHT_GRAY);
		JLabel bl = new JLabel("실행하시려면 가운데 이미지를 눌러주세요.");
		bl.setFont(new Font("맑은 고딕", 0, 20));
		bp.add(bl);
		
		// 버튼이 눌렸을 때 수행할 이벤트 선언
		ActionListener action =  new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("")) {	// 이미지버튼 눌렀을 때
					try {
						Order order = new Order();
						order.start();			// Order클래스의 start()메소드 호출
						frm.setVisible(false);	// 현재 프레임 표시안함으로 변경
					} catch (Exception e1) {}
				}
			}
			
		};
		
		move.addActionListener(action);	// 버튼에 이벤트 연결
		// 패널 연결
		frm.getContentPane().add(tp);
		frm.getContentPane().add(jp);
		frm.getContentPane().add(bp);
		// 프레임 표시
		frm.setVisible(true);
			
	} // start()
	
} // class()
