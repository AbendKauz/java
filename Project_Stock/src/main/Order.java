package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import style.JButtonStyle;
import style.JFrameStyle;

public class Order extends JFrame{
	
	public void start() throws Exception {
		// sjbs : JButtonStyle 클래스
		// sjfs : JFrameStyle 클래스
		
		JButtonStyle sjbs = new JButtonStyle();
		JFrameStyle sjfs = new JFrameStyle();
		
		JFrame frm = new JFrame("상품 관리 프로그램");
		// SetJFrameStyle클래스의 setJFrameStyle 호출
		sjfs.JFrameStyle(frm);
		
		// 테이블 모델 세팅
		String[] ta = {"이름", "가격", "재고"};	// ta = 테이블 데이터 배열 지정
		// DefaultTableModel : 초기엔 비어있는 테이블로 만들기 위해 사용, addRow()와 removeRow() 사용 가능해짐
		DefaultTableModel model = new DefaultTableModel(ta, 0) { 
			// isCellEditable : 테이블의 데이터 변경을 위해 선언
			public boolean isCellEditable(int row, int column) {	// 테이블 데이터 수정 금지
				if(column == 0) {	// 상품명은 수정되지 않도록
					return false;
				}else {				// 가격, 재고수량은 수정 가능하도록
					return true;
				}
			}
		};
		
		JTable table = new JTable(model); // 데이터 표시할 JTable 생성
		table.getTableHeader().setReorderingAllowed(false);	// 테이블 열 이동 불가 설정
		table.getTableHeader().setResizingAllowed(false);	// 테이블 열 크기 수정 불가 설정
		// JTable에 스크롤기능 사용
		JScrollPane scrollPane = new JScrollPane(table);	
		scrollPane.getViewport().setBackground(Color.LIGHT_GRAY); // ScrollPane 색 지정
		scrollPane.setBounds(0, 0, 500, 350); // 위치 지정

		// 하단 패널 관련
		JPanel jp = new JPanel();	// 하단 패널 생성
		jp.setLayout(new FlowLayout()); // 가운데 중심 배치 레이아웃 (윈도우창 크기를 벗어나면 자동 줄바꿈 실시)
		
		// 하단 패널에 삽입할 내용
		JTextField name = new JTextField(10);	// 상품명 입력받을 필드
		JTextField price = new JTextField(5);	// 상품가격 입력받을 필드
		JTextField cnt = new JTextField(5);		// 재고량 입력받을 필드
		
		// 하단 패널에 추가
		jp.add(new JLabel("추가상품명"));
		jp.add(name);
		jp.add(new JLabel("가격"));
		jp.add(price);
		jp.add(new JLabel("재고"));
		jp.add(cnt);
		jp.setBackground(Color.GRAY);
		jp.setBounds(0, 350, 500, 50); // setBounds(가로위치, 세로위치, 가로길이, 세로길이);
		
		// menu.txt파일 내용을 테이블에 출력
		InputStream is = new FileInputStream("../Project_Stock/src/menu.txt");
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");	// 한글깨짐 방지 인코딩 설정
		BufferedReader br = new BufferedReader(isr);
		String read = null;	// 파일의 내용을 저장할 변수
		
		while(true) {
			read = br.readLine();	// 파일을 줄단위로 읽어서 저장
			if(read == null) {		// 파일의 내용이 없으면 중단
				break;
			}
			Object[] str = read.split("/");	// split하여 저장해 둘 변수
			model.addRow(str);				// 데이터를 model의 열에 삽입
		}
		
		br.close(); isr.close(); is.close();	// InputStream 종료
		
		// jbp : 버튼이 들어갈 Panel
		JPanel jbp = new JPanel();
		jbp.setLayout(new FlowLayout()); // 가운데 중심 배치 레이아웃 (윈도우창 크기를 벗어나면 자동 줄바꿈 실시)
		
		// 추가버튼 관련
		JButton add_btn = new JButton("추가");
		// SetJButtonStyle클래스의 setJButtonStyle 호출
		sjbs.JButtonStyle(add_btn);
		
		// 수정버튼 관련
		JButton upt_btn = new JButton("수정");
		// SetJButtonStyle클래스의 setJButtonStyle 호출
		sjbs.JButtonStyle(upt_btn);
		
		// 삭제버튼 관련
		JButton del_btn = new JButton("삭제");	
		// SetJButtonStyle클래스의 setJButtonStyle 호출
		sjbs.JButtonStyle(del_btn);
		
		// 종료버튼 관련
		JButton exit_btn = new JButton("종료");	
		// SetJButtonStyle클래스의 setJButtonStyle 호출
		sjbs.JButtonStyle(exit_btn);
		
		// 패널에 버튼 추가
		jbp.add(add_btn);
		jbp.add(upt_btn);
		jbp.add(del_btn);
		jbp.add(exit_btn);
		jbp.setBackground(Color.LIGHT_GRAY);	// 배경색
		jbp.setBounds(0, 400, 500, 100);		// 위치지정
		
		// 이벤트관련
		ActionListener action = new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("추가")) { // 추가 버튼 클릭이벤트 처리
					
					// 가격또는 재고량 필드가 정수인지 판별
					try {
						int chkPrice = Integer.parseInt(price.getText());	// 가격이 정수인지 판별
						int chkCnt = Integer.parseInt(price.getText());		// 재고량이 정수인지 판별
					} catch (Exception e2) {	// 정수가 아닐경우 수행하지 않고 리턴
						JOptionPane.showMessageDialog(null, "숫자만 입력해주세요.");
						name.setText("");
						price.setText("");
						cnt.setText("");
						return;
					}
					
					// 데이터 추가 실행
					Object info[] = new Object[3]; // 한행 (row) 에 저장할 데이터 모음
					info[0] = name.getText();	// 제품명
					info[1] = price.getText();	// 가격
					info[2] = cnt.getText();	// 재고량
					
					try {
						if(!info[0].equals("") && !info[1].equals("") && !info[2].equals("")) {	// 하단 입력창에 값이 있을때만
							model.addRow(info); // 테이블 모델에 데이터 삽입
							JOptionPane.showMessageDialog(null, "데이터가 추가되었습니다.");
						}else {
							JOptionPane.showMessageDialog(null, "입력하신 데이터가 부족합니다.");
						}
						updateTable();		// 현재 테이블의 데이터를 저장
					} catch (Exception e1) {}
					// 추가 완료 후 알림창 호출
					
					// 입력후 텍스트 필드 값 제거
					name.setText("");
					price.setText("");
					cnt.setText("");
					
				} else if(e.getActionCommand().equals("수정")) { // 삭제 버튼 클릭이벤트 처리
					
					// 수정 버튼 클릭 시 가격 또는 재고량 필드에 정수가 아닌 값이 들어있는지 판별
					try {
						int row = table.getRowCount();		// 열의 개수 저장할 변수
						int col = table.getColumnCount();	// 행의 개수 저장할 변수
						int chkPrice = 0;	// 가격이 정수인지 판별할 변수
						int chkCnt = 0;		// 재고량이 정수인지 판별할 변수
						
						for(int i = 0; i < row; i++) {
							for(int j = 1; j < col; j++) {
								chkPrice = (int)table.getValueAt(i, j);
								chkCnt = (int)table.getValueAt(i, j);
							}
						}
					} catch (Exception e2) {	// 정수가 아닌 값이 있을 경우 메세지 출력 후 리턴
						JOptionPane.showMessageDialog(null, "숫자만 입력해주세요.");
						return;
					}
					
					// 데이터 수정 실행
					try {
						updateTable();		// 현재 테이블의 데이터를 저장
					} catch (Exception e1) {}
					
					JOptionPane.showMessageDialog(null, "데이터가 수정되었습니다.");	// 알림창 호출
					
				} else if(e.getActionCommand().equals("삭제")) { // 삭제 버튼 클릭이벤트 처리
					
					// 선택한 열(row)의 번호 알아내기
					int rowIndex = table.getSelectedRow();
					
					// 선택 안하고 누를 경우 리턴값 -1
					if(rowIndex == -1) {
						JOptionPane.showMessageDialog(null, "삭제할 행이 선택되지 않았습니다.");
						return;	
					}else {
						model.removeRow(rowIndex);	// 해당 열의 데이터 삭제
						JOptionPane.showMessageDialog(null, "데이터가 삭제되었습니다.");
					}
					
					try {
						updateTable();	// 현재 테이블의 데이터 저장
					} catch (Exception e1) {}
					// 삭제 완료 후 알림창 호출
					
				} else if(e.getActionCommand().equals("종료")) {	// 종료 버튼 클릭이벤트 처리
					System.exit(0);	// 프로그램 종료
				}
			}

			// 버튼 누를 시 파일에 현재 테이블 내용 저장
			private void updateTable() throws Exception {
				OutputStream os = new FileOutputStream("../Project_Stock/src/menu.txt");
				OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");	// 한글깨짐 방지 인코딩 설정
				BufferedWriter bw = new BufferedWriter(osw);
				
				int row = table.getRowCount();		// 열의 개수 저장할 변수
				int col = table.getColumnCount();	// 행의 개수 저장할 변수
				
				for(int i = 0; i < row; i++) {
					for(int j = 0; j < col; j++) {
						if(table.getValueAt(i, j) == null) {	// 추가 선택 시 안의 데이터가 없을경우 멈춤
							break;
						}
						bw.write(table.getValueAt(i, j) + "/");	// "/"를 구분으로 각 테이블의 데이터 추가
					}
					bw.write("\n");	// 한 줄 입력 완료 시 줄바꿈 처리
				}
				bw.flush(); bw.close(); osw.close(); os.close();	// OutputStream 종료
				
			}
			
		};
		
		// 버튼에 이벤트 연결
		add_btn.addActionListener(action);
		upt_btn.addActionListener(action);
		del_btn.addActionListener(action);
		exit_btn.addActionListener(action);
		
		// 부모 프레임에 자식 컴포넌트 추가		
		frm.getContentPane().add(scrollPane, BorderLayout.CENTER);
		frm.getContentPane().add(jp);
		frm.getContentPane().add(jbp);
		
		// 부모 프레임이 보이도록 설정
		frm.setVisible(true); 
		
	} // Main()
	
} // class()
