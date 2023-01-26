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

//	<< 1. 클라이언트 소켓 생성 및 서버 접속 >>
		// 클라이언트 소켓 객체를 생성 후 매개값으로 연결할 서버의 IP주소와 포트번호를 제공
		try {
			socket = new Socket("localhost", 9999); // try/multi-catch 예외처리

//	<< 2. 네트워크 입출력 스트림 생성 >>
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

//	<< 3. 서버로 데이터 전송(출력) >>
			// while -> 무한반복
			// 보내기 >> _____A_____
			// 입력한 데이터가 "bye"일 경우 서버로 전송 후 프로그램 실행을 종료하기
			// 서버로 전송하기
			while (true) {
				System.out.print("보내기 >> ");
				String outputMes = sc.nextLine();
				if (outputMes.equals("bye")) {
					out.write(outputMes + "\n");
					out.flush();
					break; // 사용자가 bye를 입력한 경우 서버로 전송 후 프로그램 종료
				}
				out.write(outputMes + "\n"); // 키보드에서 읽은 문자열 전송
				out.flush(); // 버퍼에 있는 모든 문자열 전송

//	<< 4. 서버로부터 데이터 수신(입력) >>
				// 서버로부터 한 줄씩 문자열 읽기
				// 서버로부터 받아온 메시지(안녕하세요)를 화면에 출력

				// <console>
				// 서버 : 안녕하세요
				String intMes = in.readLine();
				System.out.println("서버 : " + intMes);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 예외발생 여부와 상관없이 실행되어야 하는 코드를 작성하는 곳
			try {
				socket.close(); // 클라이언트 소켓 닫기
			} catch (IOException e) {
				System.out.println("오류가 발생했습니다.");
			}
		}

	}

}
