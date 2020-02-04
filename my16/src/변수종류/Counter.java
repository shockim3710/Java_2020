package 변수종류;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Counter {
	
	static int count; // 전역변수 (global)
			   // 멤버변수는 모두 전역변수
			   // 전역변수는 자동으로 초기화

	public static void main(String[] args) {
		
		JFrame f = new JFrame("나의 카운터");
		
		// f는 지역변수 (local)
		// 지역변수는 자동 초기화를 안해줌
		// 지역변수는 프로그래머가 초기화를 해주어야 함
		
		f.getContentPane().setBackground(new Color(30, 144, 255));
		
		f.setSize(300, 300);
		f.getContentPane().setLayout(null);
		
		JLabel result = new JLabel("0");
		
		// result는 지역변수
		// 프로그램은 순자척으로 실행
		// 아래의 객체들은 위에서 인식불가
		
		JButton btnNewButton = new JButton("▲");
		btnNewButton.setForeground(new Color(0, 0, 139));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				count++;
				result.setText(count + "");
				
			}
		});
		btnNewButton.setToolTipText("");
		btnNewButton.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 20));
		btnNewButton.setBounds(12, 29, 57, 29);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("초기화");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				count = 0;
				result.setText(count + "");
				
			}
		});
		button.setToolTipText("");
		button.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 20));
		button.setBounds(96, 29, 93, 29);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("▼");
		button_1.setForeground(new Color(128, 0, 0));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				count--;
				result.setText(count + "");
				
			}
		});
		button_1.setToolTipText("");
		button_1.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 20));
		button_1.setBounds(213, 29, 59, 29);
		f.getContentPane().add(button_1);
		
		result.setForeground(new Color(128, 0, 0));
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 99));
		result.setBounds(12, 83, 260, 154);
		f.getContentPane().add(result);
		
		
		
		
		
		f.setVisible(true);
		
	}
}
