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
//		setTitle("프레임만들기");
		super("만들기");
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
		// Action이라는 글자가 쓰여있는 버튼 생성

		// MyMouseAdapter 클래스 연결
//		btn.addMouseListener(new MyMouseAdapter());	// btn 누를 시 이벤트
		c.addMouseListener(new MyMouseAdapter()); // container 아무데나 클릭 시 이벤트

//		// 1. 독립클래스로 작성
//		btn.addActionListener(new MyActionListener());

//		// 3. 익명 클래스로 작성
//		btn.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JButton b = (JButton)e.getSource();
//				b.getParent().setBackground(Color.yellow);
//				// -> 객체의 부모를 부르는 메소드
//				// b의 getParent = container
//				if(b.getText().equals("Action")) {
//					b.setText("액션");
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

	// 2. 내부 클래스(inner class)로 작성
	// => 클래스 안에 멤버처럼 클래스 작성
}

// 1. 독립 클래스
//class MyActionListener implements ActionListener{
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		JButton b = (JButton)e.getSource();
//		b.getParent().setBackground(Color.yellow);
//		// -> 객체의 부모를 부르는 메소드
//		// b의 getParent = container
//		if(b.getText().equals("Action")) {
//			b.setText("액션");
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
	public void mouseClicked(MouseEvent e) { // 마우스 클릭 이벤트 발생 시
		// btn 클릭 시 이벤트
//		JButton b = (JButton)e.getSource();
//		// e.getSource = Object 타입이므로 강제타입변환 필요
//		b.getParent().setBackground(Color.black);	// 컨테이너의 배경색을 검정으로 변경

		// container 아무곳 클릭 시 이벤트
		Container c = (Container) e.getSource();
		c.setBackground(Color.green);
	}

}
