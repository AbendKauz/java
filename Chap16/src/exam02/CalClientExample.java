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

		//-> 1. 클라이언트 소켓 생성
		//          -- "연결을 기다리고 있습니다." 출력하기
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket("localhost", 9999);
			System.out.println("연결을 기다리고 있습니다.");
			//-> 2. 네트워크 입출력 스트림 생성하기
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			//-> 3. 서버로 데이터 전송(출력) 
			//      : 콘솔에 출력하기 -> 계산식 (빈칸으로 띄어 입력, ex: 7 + 5) >>
			//      : 계산해야할 수식 키보드로 입력받기
			//         -> 입력한 데이터가 "bye" 일 경우 서버로 전송 후 프로그램 실행을 종료하기
			//           (String 타입의 변수 result 에 메소드 결과 대입)
			//     : 키보드로 입력 받은 값 출력 후
			//       키보드로 입력 받은 수식 문자열 전송하기
			while(true) {
				System.out.print("계산식 (빈칸으로 띄어 입력, ex: 7 + 5) >> ");
				String str =  sc.nextLine();
				System.out.println("계산할 수식 : " + str);
				
				out.write(str + "\n");
				out.flush();
				
				if(str.equals("bye")) {
					break;
				}
				
				//-> 4. 서버로부터 데이터 수신(입력)
				//        : 서버로부터 데이터를 계산 결과 수신받기
				//        : 서버로부터 받은 계산 결과를 화면에 출력
				String data = in.readLine();
				System.out.println("계산 결과 : " + data);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//-> 5. 데이터 송수신이 종료되면 클라이언트소켓 닫기
			try {
				out.close(); in.close(); socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
