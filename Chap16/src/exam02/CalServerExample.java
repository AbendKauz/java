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

		//		* CalServerExample- 클래스
		//		  -> 1. 서버 소켓 생성
		//		           -- "연결을 기다리고 있습니다." 출력하기
		ServerSocket svsocket = null;
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		try {
			svsocket = new ServerSocket(9999);
			System.out.println("연결을 기다리고 있습니다.");
			//		  -> 2. 클라이언트로부터 연결 요청 대기
			//		          -- "연결이 되었습니다" 출력하기
			socket = svsocket.accept();
			System.out.println("연결이 되었습니다.");
			
			//		 -> 3. 네트워크 입출력 스트림 생성하기
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			//		 -> 4. 클라이언트로부터 데이터 수신(입력)
			//		         : 클라이언트로부터 데이터를 한줄씩 읽기. 
			//		           -> 만약에 읽어온 데이터가 "bye" 라면 "클라이언트에서 bye로 연결을 종료하였음"을 출력 후 
			//		               계산 프로그램을 종료시키기
			//		         : 받아온 데이터를 화면에 출력하기
			String data = "";
			while(true) {
				data = in.readLine();
				if(data.equals("bye")) {
					System.out.println("클라이언트에서 bye로 연결을 종료하였음");
					break;
				}
				System.out.println(data);
				
				//		  -> 5. 클라이언트로 데이터 전송(출력) 
				//		       : 받아온 데이터(수식) 계산하기
				//		           ---> calc( ) 메소드 호출 시 클라이언트로부터 받아온 데이터를 매개값으로 제공.
				//		            (String 타입의 변수 result 에 메소드 결과 대입)
				//		      : 수식계산 결과를 전송하기 
				
				String result = calc(data);
				out.write(result + "\n");
				out.flush();
			}
			//		 -> 6. 데이터 송수신이 종료되면 통신용 소켓, 서버 소켓 닫기
			
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
		
		//		 -> 접근제한 public / static / 리턴타입 ??? / 매개변수 ??? 
		//				 -> StringTokenizer 클래스를 이용하여 매개값을 " " (띄어쓰기) 기준으로 문자열 분리하기
		//				     만약에 분리한 토큰의 개수가 3개가 아니라면 error 리턴하기
		//				 -> 수식을 계산하여 결과값을 리턴하기  
		//				     ex) 7 + 5 데이터가 들어왔다면 => 12 를 리턴
		//				         7 - 5 데이터가 들어왔다면 => 2 를 리턴
		//				         7 * 5 데이터가 들어왔다면 => 35 를 리턴
		//				         7 / 5 데이터가 들어왔다면 => 1.4 를 리턴
		//				        => 가운데 데이터가 +, -, *, /  이외의 데이터가 들어왔다면 error 를 리턴하기 
		
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
