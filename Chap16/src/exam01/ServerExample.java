package exam01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExample {

	public static void main(String[] args) {

		ServerSocket svSocket = null;
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);

		try {
			// ServerSocket �����ڴ� ��Ʈ��ȣ�� �Ű������� �޾Ƽ� ��ü�� ������
			// => ��Ʈ��ȣ�� Ŭ���̾�Ʈ�� ������ ��ٸ� �ڽ��� ��Ʈ��ȣ��
			// => �̹� ������� ��Ʈ��ȣ ��� �� error �߻�

//	<<< 1. ���� ���� ���� >>>
			svSocket = new ServerSocket(9999); // ����ó�� �ʿ�
			System.out.println("������ ��ٸ��� �ֽ��ϴ�.....");

//	<<< 2. Ŭ���̾�Ʈ�κ��� ���� ��� >>>
			// accept() : Ŭ���̾�Ʈ�κ����� ���� ��û�� ��ٸ��� ��û�� ������ �����ϰ�
			// Ŭ���̾�Ʈ�� �����͸� �ְ���� �� Socket��ü�� ��ȯ�ϴ� �޼ҵ�
			socket = svSocket.accept();
			System.out.println("������ �Ǿ����ϴ�~!!!!");

//	<<< 3. ��Ʈ��ũ ����� ��Ʈ�� ���� >>>
			// Ŭ���̾�Ʈ�κ��� �����͸� �ְ�ޱ� ���� ��Ʈ����ü�� ����
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

//	<<< 4. Ŭ���̾�Ʈ�κ��� ������ ����(�Է�) >>>
			// - while ���ѹݺ� -> readLine() : �����͸� ���྿ �б�
			// ���� ������ 'bye'�� ��� -> "Ŭ���̾�Ʈ���� bye�� ������ �����Ͽ���" ��� �� �ݺ��� ����
			// - Ŭ���̾�Ʈ�κ��� ���� �޼����� �ֿܼ� ���
			// Ŭ���̾�Ʈ : �ȳ�
			while (true) {
				String inputMes = in.readLine();
				if (inputMes.equals("bye")) {
					System.out.println("Ŭ���̾�Ʈ���� bye�� ������ �����Ͽ���");
					break;
				}
				System.out.println("Ŭ���̾�Ʈ : " + inputMes);
//	<<< 5. Ŭ���̾�Ʈ�� ������ ����(���) >>>
				// ������ >> __________A___________
				// A��� ���ڿ��� ����(���) / ��� ���ڿ��� �����ϰ� ���۽�Ű�� �޼ҵ� ȣ��
				System.out.print("������ >> ");
				String outputMes = sc.nextLine();
				out.write(outputMes + "\n");
				out.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally { // ���ܿ� ������� ����Ǿ�� �ϴ� �ڵ� �ۼ�
					// �ʿ���� ��쿡�� ���� ����
			try {
				in.close();
				out.close();
				socket.close();
				svSocket.close();
			} catch (IOException e) {
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ���� �߻�");
			}

		}

		// * try - catch - finally
		// 1. try�� �ȿ� ���ܰ� �߻��� �� �ִ� �ڵ带 �ۼ�
		// : �ڵ�� �����߿� ���ܰ� �߻��ϰ� �Ǹ� => ����Ÿ�Կ� ��ġ�ϴ� catch������ �̵�
		// 2. catch�� �ȿ��� ���� �߻� �� ó���ؾ� �� �ڵ带 �ۼ���
		// 3. finally������ ���� �߻����ο� ������� ������ �Ǿ�� �� �ڵ尡 ���� ��� �ۼ�

		// => ���ܰ� �߻��� ���
		// : 1�� ���忡�� ���� �߻��ϱ� ������ ���� -> 2�� -> 3�� ������ �ڵ� ����
		// => ���ܰ� �߻����� �ʾ��� ���
		// : 1�����忡�� 3���������� �ڵ尡 �����

	}

}
