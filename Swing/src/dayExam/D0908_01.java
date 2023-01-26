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

		new J(); // JFrame을 상속받는 J 클래스 생성

	}

}

class J extends JFrame { // 최상위 GUI 컨테이너

	J() {
//		setTitle("프레임만들기");	// 타이틀 이름 방법 1
//		// => 메소드를 호출하여 타이틀 달기
		super("만들기"); // 타이틀 이름 방법 2
//		// => JFrame의 생성자를 호출하여 타이틀 달기
		setLocationRelativeTo(null); // 초기 창 위치 설정(null : 화면 가운데)
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 창 닫을 시 프로그램 종료
		Container c = getContentPane();
		// Container -> 빈 상자
		// getContentPane(); -> Container에 원하는 내용을 붙인다

		// 다중 레이블 표시 방법
		// FlowLayout : 컨테이너 크기에 맞춰 순서대로 추가
		setLayout(new FlowLayout());

		// BorderLayout : 지정된 위치에 추가(상,하,좌,우,중앙 선택 가능)
//		setLayout(new BorderLayout(30, 50));
		// (30, 50) : 수평, 수직 간격

		// GridLayout : 컨테이너를 이차원으로 나누어 배치
		// => 이차원 배열

		// CardLayout : 컴포넌트들을 카드처럼 겹치게 배치
		// => 먼저 추가한 순서대로 표시됨, 자주 사용되지 않음
//		setLayout(null);	// 배치관리자가 없는 컨테이너

//		JLabel label = new JLabel("레이블1");		// 컴포넌트1
//		c.add(label);	// ContentPane에 label Component 달기 
//		JLabel label2 = new JLabel("레이블2");	// 컴포넌트2
//		c.add(label2);	// ContentPane에 label2 Component 달기

		AddComponents(c); // 컴포넌트 추가 메소드

		setSize(400, 300); // 창 크기(width, height)
		setVisible(true); // 창 표시 (현재까지 작성된 것 까지 보여줌)
		// * setVisible은 마지막에 넣어야 작성한 내용들이 표시됨

	}

	public void AddComponents(Container c) {
		// FlowLayout
//		JButton[] btn = new JButton[8];
//		for (int i = 0; i < btn.length; i++) {
//			btn[i] = new JButton("버튼" + i);	// 버튼에 글자 추가
//			c.add(btn[i]);	// btn의 갯수만큼 버튼 생성
//		}

		// BorderLayout
//		JButton btn1 = new JButton("EAST");
//		JButton btn2 = new JButton("WEST");
//		JButton btn3 = new JButton("NORTH");
//		JButton btn4 = new JButton("SOUTH");
//		JButton btn5 = new JButton("CENTER");
//		JLabel label = new JLabel("레이블");
//		
//		// 여러개의 컴포넌트를 한 위치에 추가할 경우
//		// -> 패널을 추가하여 해당 컴포넌트들을 넣어야 함
//		JPanel panel = new JPanel();
//		panel.add(btn1);
//		panel.add(label);
//		
//		
////		c.add(btn1, BorderLayout.EAST);	// add(컴포넌트, 위치지정)
//		c.add(btn2, BorderLayout.WEST);
//		c.add(btn3, BorderLayout.NORTH);
//		c.add(btn4, BorderLayout.SOUTH);
//		c.add(btn5, BorderLayout.CENTER);
////		c.add(label, BorderLayout.EAST);
//		// 패널을 위치를 지정하면서 추가
//		c.add(panel, BorderLayout.EAST);

		// 배치관리자가 없는 컨테이너
//		JPanel panel = new JPanel();
//		panel.setBackground(Color.BLUE);	// 패널의 배경색 지정
////		panel.setLocation(100, 100);	// 패널의 위치 지정
////		panel.setSize(50, 50);	// 패널의 크기 지정
//		panel.setBounds(100, 100, 50, 50);	// 패널의 위치, 크기 지정(x축, y축, 너비, 높이)
//		c.add(panel);

		ImageIcon img = new ImageIcon("src/images/apple.jpg");
		JLabel label = new JLabel(img);
		c.add(label);

	}

}