package 네트워크;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MessengerB extends JFrame{
	private JTextField input;
	private JTextArea list;
	DatagramSocket socket; // 전역범위
	// 변수가 생성되는 위치가 사용할 수 있는 범위
	// 변수를 선언할 때 변수가 생성
	// 변수의 선언의 위치가 사용할 수 있는 범위
	
	public MessengerB() throws Exception {
		
		socket = new DatagramSocket(6000); // 수신용 전화기
		
		setTitle("메신저B");
		
		list = new JTextArea();
		list.setForeground(SystemColor.activeCaption);
		list.setEditable(false);
		list.setColumns(25);
		list.setRows(20);
		list.setBackground(new Color(0, 128, 0));
		list.setFont(new Font("맑은 고딕", Font.PLAIN, 23));
		getContentPane().add(list, BorderLayout.CENTER);
		
		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 1. 입력한 값을 가지고 온다
				// ** 전송용 전화기와 수신용 전화기를 따로 따로 만들어 주어야함
				// 2. 패킷을 만들어서 전송한다
				// 	  2-1. byte 배열로 바꾸어준다
				// 	  2-2. 패킷에 들어갈 ip 와 포트를 지정한다
				//    2-3. 소캣으로 패킷을 보낸다
				// 3. 소캣을 close
				
				String str = input.getText();
				
				try {
					
					DatagramSocket socket = new DatagramSocket();
					InetAddress ip = InetAddress.getByName("localhost");
					int port = 5000; // 상대방 포트
					byte[] data = str.getBytes();
					
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, port);
					
					list.append("ME>> " + str + "\n"); // 자동줄바꾸기
					input.setText("");
					socket.send(packet);
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		input.setBackground(new Color(60, 179, 113));
		input.setFont(new Font("맑은 고딕", Font.PLAIN, 23));
		getContentPane().add(input, BorderLayout.SOUTH);
		input.setColumns(13);
		
		

		pack(); // 자동으로 크기를 맞춰줌
		setVisible(true);
		
	}
	
	public void process() throws Exception {
		
		while (true) {
			
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			socket.receive(packet);
			
			String str = new String(data);
			
			list.append("YOU>> " + str + "\n");
			
			
		}
		
	}

	public static void main(String[] args) throws Exception {
		
		MessengerB m = new MessengerB();
		
		m.process();

	}

}
