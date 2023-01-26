package exam02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class CalClientExample {

	public static void main(String[] args) {

		//-> 1. Ŭ���̾�Ʈ ���� ����
		//          -- "������ ��ٸ��� �ֽ��ϴ�." ����ϱ�
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket("localhost", 9999);
			System.out.println("������ ��ٸ��� �ֽ��ϴ�.");
			//-> 2. ��Ʈ��ũ ����� ��Ʈ�� �����ϱ�
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			//-> 3. ������ ������ ����(���) 
			//      : �ֿܼ� ����ϱ� -> ���� (��ĭ���� ��� �Է�, ex: 7 + 5) >>
			//      : ����ؾ��� ���� Ű����� �Է¹ޱ�
			//         -> �Է��� �����Ͱ� "bye" �� ��� ������ ���� �� ���α׷� ������ �����ϱ�
			//           (String Ÿ���� ���� result �� �޼ҵ� ��� ����)
			//     : Ű����� �Է� ���� �� ��� ��
			//       Ű����� �Է� ���� ���� ���ڿ� �����ϱ�
			while(true) {
				System.out.print("���� (��ĭ���� ��� �Է�, ex: 7 + 5) >> ");
				String str =  sc.nextLine();
				System.out.println("����� ���� : " + str);
				
				out.write(str + "\n");
				out.flush();
				
				if(str.equals("bye")) {
					break;
				}
				
				//-> 4. �����κ��� ������ ����(�Է�)
				//        : �����κ��� �����͸� ��� ��� ���Źޱ�
				//        : �����κ��� ���� ��� ����� ȭ�鿡 ���
				String data = in.readLine();
				System.out.println("��� ��� : " + data);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//-> 5. ������ �ۼ����� ����Ǹ� Ŭ���̾�Ʈ���� �ݱ�
			try {
				out.close(); in.close(); socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
