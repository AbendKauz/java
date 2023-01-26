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
		// sjbs : JButtonStyle Ŭ����
		// sjfs : JFrameStyle Ŭ����
		
		JButtonStyle sjbs = new JButtonStyle();
		JFrameStyle sjfs = new JFrameStyle();
		
		JFrame frm = new JFrame("��ǰ ���� ���α׷�");
		// SetJFrameStyleŬ������ setJFrameStyle ȣ��
		sjfs.JFrameStyle(frm);
		
		// ���̺� �� ����
		String[] ta = {"�̸�", "����", "���"};	// ta = ���̺� ������ �迭 ����
		// DefaultTableModel : �ʱ⿣ ����ִ� ���̺�� ����� ���� ���, addRow()�� removeRow() ��� ��������
		DefaultTableModel model = new DefaultTableModel(ta, 0) { 
			// isCellEditable : ���̺��� ������ ������ ���� ����
			public boolean isCellEditable(int row, int column) {	// ���̺� ������ ���� ����
				if(column == 0) {	// ��ǰ���� �������� �ʵ���
					return false;
				}else {				// ����, �������� ���� �����ϵ���
					return true;
				}
			}
		};
		
		JTable table = new JTable(model); // ������ ǥ���� JTable ����
		table.getTableHeader().setReorderingAllowed(false);	// ���̺� �� �̵� �Ұ� ����
		table.getTableHeader().setResizingAllowed(false);	// ���̺� �� ũ�� ���� �Ұ� ����
		// JTable�� ��ũ�ѱ�� ���
		JScrollPane scrollPane = new JScrollPane(table);	
		scrollPane.getViewport().setBackground(Color.LIGHT_GRAY); // ScrollPane �� ����
		scrollPane.setBounds(0, 0, 500, 350); // ��ġ ����

		// �ϴ� �г� ����
		JPanel jp = new JPanel();	// �ϴ� �г� ����
		jp.setLayout(new FlowLayout()); // ��� �߽� ��ġ ���̾ƿ� (������â ũ�⸦ ����� �ڵ� �ٹٲ� �ǽ�)
		
		// �ϴ� �гο� ������ ����
		JTextField name = new JTextField(10);	// ��ǰ�� �Է¹��� �ʵ�
		JTextField price = new JTextField(5);	// ��ǰ���� �Է¹��� �ʵ�
		JTextField cnt = new JTextField(5);		// ��� �Է¹��� �ʵ�
		
		// �ϴ� �гο� �߰�
		jp.add(new JLabel("�߰���ǰ��"));
		jp.add(name);
		jp.add(new JLabel("����"));
		jp.add(price);
		jp.add(new JLabel("���"));
		jp.add(cnt);
		jp.setBackground(Color.GRAY);
		jp.setBounds(0, 350, 500, 50); // setBounds(������ġ, ������ġ, ���α���, ���α���);
		
		// menu.txt���� ������ ���̺� ���
		InputStream is = new FileInputStream("../Project_Stock/src/menu.txt");
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");	// �ѱ۱��� ���� ���ڵ� ����
		BufferedReader br = new BufferedReader(isr);
		String read = null;	// ������ ������ ������ ����
		
		while(true) {
			read = br.readLine();	// ������ �ٴ����� �о ����
			if(read == null) {		// ������ ������ ������ �ߴ�
				break;
			}
			Object[] str = read.split("/");	// split�Ͽ� ������ �� ����
			model.addRow(str);				// �����͸� model�� ���� ����
		}
		
		br.close(); isr.close(); is.close();	// InputStream ����
		
		// jbp : ��ư�� �� Panel
		JPanel jbp = new JPanel();
		jbp.setLayout(new FlowLayout()); // ��� �߽� ��ġ ���̾ƿ� (������â ũ�⸦ ����� �ڵ� �ٹٲ� �ǽ�)
		
		// �߰���ư ����
		JButton add_btn = new JButton("�߰�");
		// SetJButtonStyleŬ������ setJButtonStyle ȣ��
		sjbs.JButtonStyle(add_btn);
		
		// ������ư ����
		JButton upt_btn = new JButton("����");
		// SetJButtonStyleŬ������ setJButtonStyle ȣ��
		sjbs.JButtonStyle(upt_btn);
		
		// ������ư ����
		JButton del_btn = new JButton("����");	
		// SetJButtonStyleŬ������ setJButtonStyle ȣ��
		sjbs.JButtonStyle(del_btn);
		
		// �����ư ����
		JButton exit_btn = new JButton("����");	
		// SetJButtonStyleŬ������ setJButtonStyle ȣ��
		sjbs.JButtonStyle(exit_btn);
		
		// �гο� ��ư �߰�
		jbp.add(add_btn);
		jbp.add(upt_btn);
		jbp.add(del_btn);
		jbp.add(exit_btn);
		jbp.setBackground(Color.LIGHT_GRAY);	// ����
		jbp.setBounds(0, 400, 500, 100);		// ��ġ����
		
		// �̺�Ʈ����
		ActionListener action = new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("�߰�")) { // �߰� ��ư Ŭ���̺�Ʈ ó��
					
					// ���ݶǴ� ��� �ʵ尡 �������� �Ǻ�
					try {
						int chkPrice = Integer.parseInt(price.getText());	// ������ �������� �Ǻ�
						int chkCnt = Integer.parseInt(price.getText());		// ����� �������� �Ǻ�
					} catch (Exception e2) {	// ������ �ƴҰ�� �������� �ʰ� ����
						JOptionPane.showMessageDialog(null, "���ڸ� �Է����ּ���.");
						name.setText("");
						price.setText("");
						cnt.setText("");
						return;
					}
					
					// ������ �߰� ����
					Object info[] = new Object[3]; // ���� (row) �� ������ ������ ����
					info[0] = name.getText();	// ��ǰ��
					info[1] = price.getText();	// ����
					info[2] = cnt.getText();	// ���
					
					try {
						if(!info[0].equals("") && !info[1].equals("") && !info[2].equals("")) {	// �ϴ� �Է�â�� ���� ��������
							model.addRow(info); // ���̺� �𵨿� ������ ����
							JOptionPane.showMessageDialog(null, "�����Ͱ� �߰��Ǿ����ϴ�.");
						}else {
							JOptionPane.showMessageDialog(null, "�Է��Ͻ� �����Ͱ� �����մϴ�.");
						}
						updateTable();		// ���� ���̺��� �����͸� ����
					} catch (Exception e1) {}
					// �߰� �Ϸ� �� �˸�â ȣ��
					
					// �Է��� �ؽ�Ʈ �ʵ� �� ����
					name.setText("");
					price.setText("");
					cnt.setText("");
					
				} else if(e.getActionCommand().equals("����")) { // ���� ��ư Ŭ���̺�Ʈ ó��
					
					// ���� ��ư Ŭ�� �� ���� �Ǵ� ��� �ʵ忡 ������ �ƴ� ���� ����ִ��� �Ǻ�
					try {
						int row = table.getRowCount();		// ���� ���� ������ ����
						int col = table.getColumnCount();	// ���� ���� ������ ����
						int chkPrice = 0;	// ������ �������� �Ǻ��� ����
						int chkCnt = 0;		// ����� �������� �Ǻ��� ����
						
						for(int i = 0; i < row; i++) {
							for(int j = 1; j < col; j++) {
								chkPrice = (int)table.getValueAt(i, j);
								chkCnt = (int)table.getValueAt(i, j);
							}
						}
					} catch (Exception e2) {	// ������ �ƴ� ���� ���� ��� �޼��� ��� �� ����
						JOptionPane.showMessageDialog(null, "���ڸ� �Է����ּ���.");
						return;
					}
					
					// ������ ���� ����
					try {
						updateTable();		// ���� ���̺��� �����͸� ����
					} catch (Exception e1) {}
					
					JOptionPane.showMessageDialog(null, "�����Ͱ� �����Ǿ����ϴ�.");	// �˸�â ȣ��
					
				} else if(e.getActionCommand().equals("����")) { // ���� ��ư Ŭ���̺�Ʈ ó��
					
					// ������ ��(row)�� ��ȣ �˾Ƴ���
					int rowIndex = table.getSelectedRow();
					
					// ���� ���ϰ� ���� ��� ���ϰ� -1
					if(rowIndex == -1) {
						JOptionPane.showMessageDialog(null, "������ ���� ���õ��� �ʾҽ��ϴ�.");
						return;	
					}else {
						model.removeRow(rowIndex);	// �ش� ���� ������ ����
						JOptionPane.showMessageDialog(null, "�����Ͱ� �����Ǿ����ϴ�.");
					}
					
					try {
						updateTable();	// ���� ���̺��� ������ ����
					} catch (Exception e1) {}
					// ���� �Ϸ� �� �˸�â ȣ��
					
				} else if(e.getActionCommand().equals("����")) {	// ���� ��ư Ŭ���̺�Ʈ ó��
					System.exit(0);	// ���α׷� ����
				}
			}

			// ��ư ���� �� ���Ͽ� ���� ���̺� ���� ����
			private void updateTable() throws Exception {
				OutputStream os = new FileOutputStream("../Project_Stock/src/menu.txt");
				OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");	// �ѱ۱��� ���� ���ڵ� ����
				BufferedWriter bw = new BufferedWriter(osw);
				
				int row = table.getRowCount();		// ���� ���� ������ ����
				int col = table.getColumnCount();	// ���� ���� ������ ����
				
				for(int i = 0; i < row; i++) {
					for(int j = 0; j < col; j++) {
						if(table.getValueAt(i, j) == null) {	// �߰� ���� �� ���� �����Ͱ� ������� ����
							break;
						}
						bw.write(table.getValueAt(i, j) + "/");	// "/"�� �������� �� ���̺��� ������ �߰�
					}
					bw.write("\n");	// �� �� �Է� �Ϸ� �� �ٹٲ� ó��
				}
				bw.flush(); bw.close(); osw.close(); os.close();	// OutputStream ����
				
			}
			
		};
		
		// ��ư�� �̺�Ʈ ����
		add_btn.addActionListener(action);
		upt_btn.addActionListener(action);
		del_btn.addActionListener(action);
		exit_btn.addActionListener(action);
		
		// �θ� �����ӿ� �ڽ� ������Ʈ �߰�		
		frm.getContentPane().add(scrollPane, BorderLayout.CENTER);
		frm.getContentPane().add(jp);
		frm.getContentPane().add(jbp);
		
		// �θ� �������� ���̵��� ����
		frm.setVisible(true); 
		
	} // Main()
	
} // class()
