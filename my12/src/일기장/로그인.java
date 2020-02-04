package 일기장;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setForeground(new Color(0, 0, 128));
		f.getContentPane().setForeground(new Color(0, 0, 128));
		f.getContentPane().setBackground(Color.WHITE);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tjoeun302-20\\Desktop\\HhaA5WI7_400x400.jpg"));
		lblNewLabel.setBounds(48, 0, 460, 326);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(58, 324, 89, 64);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblPassword = new JLabel("비밀번호");
		lblPassword.setForeground(new Color(0, 0, 128));
		lblPassword.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 30));
		lblPassword.setBounds(31, 377, 244, 64);
		f.getContentPane().add(lblPassword);
		
		t1 = new JTextField();
		t1.setFont(new Font("맑은 고딕", Font.PLAIN, 27));
		t1.setBounds(159, 334, 290, 40);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("맑은 고딕", Font.PLAIN, 27));
		t2.setColumns(10);
		t2.setBounds(159, 387, 290, 40);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = t1.getText();
				String pw = t2.getText();
				
				if (id.equals("root") && pw.equals("1234")) {
					
					JOptionPane.showMessageDialog(null, "로그인 되었습니다");
					
					// diary() 필요함
					일기쓰기 today = new 일기쓰기();
					
					today.diary();
					// diary() 메소드를 쓰고 싶으면
					// 이 메소드를 쓸 수 있는 주소를 가진 변수만 있으면 됨

				} else {
					
					JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 틀렸습니다");

				}

				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\tjoeun302-20\\Desktop\\button_login.gif"));
		btnNewButton.setBounds(41, 434, 133, 127);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// ID, PW를 공백으로 초기화
				
				t1.setText("");
				t2.setText("");
				
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\tjoeun302-20\\Desktop\\images.jfif"));
		button.setBounds(306, 434, 122, 127);
		f.getContentPane().add(button);
		
		f.setTitle("나의 일기장");
		f.setSize(500, 600);
		
		
		
		
		
		
		
	
		f.setVisible(true);

	}
}
