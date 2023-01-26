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
			// ServerSocket 생성자는 포트번호를 매개변수로 받아서 객체를 생성함
			// => 포트번호는 클라이언트의 접속을 기다릴 자신의 포트번호임
			// => 이미 사용중인 포트번호 사용 시 error 발생

//	<<< 1. 서버 소켓 생성 >>>
			svSocket = new ServerSocket(9999); // 예외처리 필요
			System.out.println("연결을 기다리고 있습니다.....");

//	<<< 2. 클라이언트로부터 접속 대기 >>>
			// accept() : 클라이언트로부터의 연결 요청을 기다리다 요청이 들어오면 수락하고
			// 클라이언트와 데이터를 주고받을 새 Socket객체를 반환하는 메소드
			socket = svSocket.accept();
			System.out.println("연결이 되었습니다~!!!!");

//	<<< 3. 네트워크 입출력 스트림 생성 >>>
			// 클라이언트로부터 데이터를 주고받기 위한 스트림객체를 생성
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

//	<<< 4. 클라이언트로부터 데이터 수신(입력) >>>
			// - while 무한반복 -> readLine() : 데이터를 한행씩 읽기
			// 들어온 데이터 'bye'일 경우 -> "클라이언트에서 bye로 연결을 종료하였음" 출력 후 반복문 종료
			// - 클라이언트로부터 받은 메세지를 콘솔에 출력
			// 클라이언트 : 안녕
			while (true) {
				String inputMes = in.readLine();
				if (inputMes.equals("bye")) {
					System.out.println("클라이언트에서 bye로 연결을 종료하였음");
					break;
				}
				System.out.println("클라이언트 : " + inputMes);
//	<<< 5. 클라이언트로 데이터 전송(출력) >>>
				// 보내기 >> __________A___________
				// A라는 문자열을 전송(출력) / 모든 문자열을 완전하게 전송시키는 메소드 호출
				System.out.print("보내기 >> ");
				String outputMes = sc.nextLine();
				out.write(outputMes + "\n");
				out.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 예외와 상관없이 실행되어야 하는 코드 작성
					// 필요없을 경우에는 생략 가능
			try {
				in.close();
				out.close();
				socket.close();
				svSocket.close();
			} catch (IOException e) {
				System.out.println("클라이언트와 채팅 중 오류 발생");
			}

		}

		// * try - catch - finally
		// 1. try문 안에 예외가 발생할 수 있는 코드를 작성
		// : 코드는 실행중에 예외가 발생하게 되면 => 예외타입에 일치하는 catch문으로 이동
		// 2. catch문 안에는 예외 발생 시 처리해야 될 코드를 작성함
		// 3. finally문에는 예외 발생여부와 상관없이 실행이 되어야 할 코드가 있을 경우 작성

		// => 예외가 발생한 경우
		// : 1번 문장에서 에러 발생하기 전까지 실행 -> 2번 -> 3번 순으로 코드 진행
		// => 예외가 발생하지 않았을 경우
		// : 1번문장에서 3번문장으로 코드가 진행됨

	}

}
