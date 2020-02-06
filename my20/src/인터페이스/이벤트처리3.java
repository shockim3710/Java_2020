package 인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Font;

public class 이벤트처리3 extends JFrame {
	
	JButton b1, b2;

	public 이벤트처리3() {
		
		setTitle("이벤트 처리연습");
		setSize(300, 300);
		
		b1 = new JButton("나를 눌러요");
		b1.setFont(new Font("한컴 윤고딕 230", Font.PLAIN, 30));
		getContentPane().add(b1);
		
		b2 = new JButton("나도 눌러요");
		b2.setFont(new Font("한컴 윤고딕 230", Font.PLAIN, 30));
		getContentPane().add(b2, BorderLayout.SOUTH);
		
		// 인터페이스를 구현한 익명클래스의 객체를 생성
		// 반드시 원래 구현해 주어야만 하는 메소드를 꼭 구현해 주어야함
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("더하기 처리 - b1을 누름");
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("빼기 처리 - b2을 누름");
				
			}
		});
		// b라는 버튼에 이벤트처리 기능을 넣을거야 설정
		// this는 클릭했을 때,
		// 이벤트 처리할 메소드를 가진 객체를 지정
		// 이 클래스가 그 이벤트 처리할 메소드를 가짐

		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		이벤트처리3 이 = new 이벤트처리3();
	}


}
