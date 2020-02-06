package 네트워크;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient2 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("localhost", 9100);
		
		System.out.println("TCP client-2 전화함");

	}

}
