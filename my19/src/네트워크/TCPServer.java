package 네트워크;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		
		// 승인만을 담당하는 소켓 (전화기)가 있어야 함
		// 연결 요청이 들어오면 승인을 하게됨
		// 승인한 후, 데이터 전송용 소켓이 별도로 만들어짐
		
		ServerSocket server = new ServerSocket(9100);
		
		while (true) {
			
			System.out.println("전화오기를 기다리는 중");
			
			Socket socket = server.accept();
			
			System.out.println("전화가 승인되었습니다");
			
		}
		

	}

}
