package exam02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class CalServerExample {

	public static void main(String[] args) {

		//		* CalServerExample- Ŭ����
		//		  -> 1. ���� ���� ����
		//		           -- "������ ��ٸ��� �ֽ��ϴ�." ����ϱ�
		ServerSocket svsocket = null;
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		try {
			svsocket = new ServerSocket(9999);
			System.out.println("������ ��ٸ��� �ֽ��ϴ�.");
			//		  -> 2. Ŭ���̾�Ʈ�κ��� ���� ��û ���
			//		          -- "������ �Ǿ����ϴ�" ����ϱ�
			socket = svsocket.accept();
			System.out.println("������ �Ǿ����ϴ�.");
			
			//		 -> 3. ��Ʈ��ũ ����� ��Ʈ�� �����ϱ�
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			//		 -> 4. Ŭ���̾�Ʈ�κ��� ������ ����(�Է�)
			//		         : Ŭ���̾�Ʈ�κ��� �����͸� ���پ� �б�. 
			//		           -> ���࿡ �о�� �����Ͱ� "bye" ��� "Ŭ���̾�Ʈ���� bye�� ������ �����Ͽ���"�� ��� �� 
			//		               ��� ���α׷��� �����Ű��
			//		         : �޾ƿ� �����͸� ȭ�鿡 ����ϱ�
			String data = "";
			while(true) {
				data = in.readLine();
				if(data.equals("bye")) {
					System.out.println("Ŭ���̾�Ʈ���� bye�� ������ �����Ͽ���");
					break;
				}
				System.out.println(data);
				
				//		  -> 5. Ŭ���̾�Ʈ�� ������ ����(���) 
				//		       : �޾ƿ� ������(����) ����ϱ�
				//		           ---> calc( ) �޼ҵ� ȣ�� �� Ŭ���̾�Ʈ�κ��� �޾ƿ� �����͸� �Ű������� ����.
				//		            (String Ÿ���� ���� result �� �޼ҵ� ��� ����)
				//		      : ���İ�� ����� �����ϱ� 
				
				String result = calc(data);
				out.write(result + "\n");
				out.flush();
			}
			//		 -> 6. ������ �ۼ����� ����Ǹ� ��ſ� ����, ���� ���� �ݱ�
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				in.close(); out.close();
				socket.close(); svsocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
		}
		
	}

	public static String calc(String str) {
		
		//		 -> �������� public / static / ����Ÿ�� ??? / �Ű����� ??? 
		//				 -> StringTokenizer Ŭ������ �̿��Ͽ� �Ű����� " " (����) �������� ���ڿ� �и��ϱ�
		//				     ���࿡ �и��� ��ū�� ������ 3���� �ƴ϶�� error �����ϱ�
		//				 -> ������ ����Ͽ� ������� �����ϱ�  
		//				     ex) 7 + 5 �����Ͱ� ���Դٸ� => 12 �� ����
		//				         7 - 5 �����Ͱ� ���Դٸ� => 2 �� ����
		//				         7 * 5 �����Ͱ� ���Դٸ� => 35 �� ����
		//				         7 / 5 �����Ͱ� ���Դٸ� => 1.4 �� ����
		//				        => ��� �����Ͱ� +, -, *, /  �̿��� �����Ͱ� ���Դٸ� error �� �����ϱ� 
		
		StringTokenizer st = new StringTokenizer(str, " ");
		if(st.countTokens() != 3) {
			return "error";
		}
		
		int a = Integer.parseInt(st.nextToken());
		String s = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		
		switch (s) {
			case "+": {
				return (a + b) + "";
			}
			case "-": {
				return (a - b) + "";
			}
			case "*": {
				return (a * b) + "";
			}
			case "/": {
				return ((double)a / b) + "";
			}
			default: return "error";
		}
	}
	
}
