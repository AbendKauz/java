package exam01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample {

	public static void main(String[] args) {

		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);

//	<< 1. Ŭ���̾�Ʈ ���� ���� �� ���� ���� >>
		// Ŭ���̾�Ʈ ���� ��ü�� ���� �� �Ű������� ������ ������ IP�ּҿ� ��Ʈ��ȣ�� ����
		try {
			socket = new Socket("localhost", 9999); // try/multi-catch ����ó��

//	<< 2. ��Ʈ��ũ ����� ��Ʈ�� ���� >>
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

//	<< 3. ������ ������ ����(���) >>
			// while -> ���ѹݺ�
			// ������ >> _____A_____
			// �Է��� �����Ͱ� "bye"�� ��� ������ ���� �� ���α׷� ������ �����ϱ�
			// ������ �����ϱ�
			while (true) {
				System.out.print("������ >> ");
				String outputMes = sc.nextLine();
				if (outputMes.equals("bye")) {
					out.write(outputMes + "\n");
					out.flush();
					break; // ����ڰ� bye�� �Է��� ��� ������ ���� �� ���α׷� ����
				}
				out.write(outputMes + "\n"); // Ű���忡�� ���� ���ڿ� ����
				out.flush(); // ���ۿ� �ִ� ��� ���ڿ� ����

//	<< 4. �����κ��� ������ ����(�Է�) >>
				// �����κ��� �� �پ� ���ڿ� �б�
				// �����κ��� �޾ƿ� �޽���(�ȳ��ϼ���)�� ȭ�鿡 ���

				// <console>
				// ���� : �ȳ��ϼ���
				String intMes = in.readLine();
				System.out.println("���� : " + intMes);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally { // ���ܹ߻� ���ο� ������� ����Ǿ�� �ϴ� �ڵ带 �ۼ��ϴ� ��
			try {
				socket.close(); // Ŭ���̾�Ʈ ���� �ݱ�
			} catch (IOException e) {
				System.out.println("������ �߻��߽��ϴ�.");
			}
		}

	}

}
