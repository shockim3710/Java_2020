package 인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Font;

public class 이벤트처리2 extends JFrame implements ActionListener {
	
	JButton b1, b2;

	public 이벤트처리2() {
		
		setTitle("이벤트 처리연습");
		setSize(300, 300);
		
		b1 = new JButton("나를 눌러요");
		b1.setFont(new Font("한컴 윤고딕 230", Font.PLAIN, 30));
		getContentPane().add(b1);
		
		b2 = new JButton("나도 눌러요");
		b2.setFont(new Font("한컴 윤고딕 230", Font.PLAIN, 30));
		getContentPane().add(b2, BorderLayout.SOUTH);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		// b라는 버튼에 이벤트처리 기능을 넣을거야 설정
		// this는 클릭했을 때,
		// 이벤트 처리할 메소드를 가진 객체를 지정
		// 이 클래스가 그 이벤트 처리할 메소드를 가짐

		setVisible(true);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("버튼을 눌렀군요");
		
		if(e.getSource() == b1) {
			
			System.out.println("b1을 눌렀군요 - 더하기 기능처리");
			
		} if (e.getSource() == b2) {
			
			System.out.println("b2을 눌렀군요 - 빼기 기능처리");
			
			
		}
		
	}
	
	public static void main(String[] args) {
		이벤트처리2 이 = new 이벤트처리2();
	}


}
