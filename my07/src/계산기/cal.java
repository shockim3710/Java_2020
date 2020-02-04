package 계산기;

import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class cal {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField re;

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(30, 144, 255));
		f.getContentPane().setForeground(new Color(30, 144, 255));
		f.setSize(500, 600);
		
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\ksh\\my07\\cal.png"));
		lblNewLabel.setBounds(168, 32, 134, 75);
		f.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("숫자1");
		label.setForeground(new Color(0, 0, 128));
		label.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 40));
		label.setBounds(31, 144, 95, 68);
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("숫자2");
		label_1.setForeground(new Color(0, 0, 128));
		label_1.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 40));
		label_1.setBounds(31, 228, 105, 68);
		f.getContentPane().add(label_1);
		
		t1 = new JTextField();
		t1.setBackground(SystemColor.activeCaption);
		t1.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 40));
		t1.setBounds(168, 154, 192, 41);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(SystemColor.activeCaption);
		t2.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 40));
		t2.setColumns(10);
		t2.setBounds(168, 244, 192, 41);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 1. t1, t2 입력값 불러오기
				// 2. 둘의 계산을 위해 int로 변환
				// 3. 두 수를 더함
				// 4. 더한 값을 re에 넣음
				// 5. 결과값: 300
				
				String t11 = t1.getText();
				String t22 = t2.getText();
				
				int t111 = Integer.parseInt(t11);
				int t222 = Integer.parseInt(t22);
				
				int t = t111 + t222;
				
				String s = String.valueOf(t);
				re.setText(s);
				
			}
		});
		btnNewButton.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 30));
		btnNewButton.setBounds(0, 336, 117, 47);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("빼기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String t11 = t1.getText();
				String t22 = t2.getText();
				
				int t111 = Integer.parseInt(t11);
				int t222 = Integer.parseInt(t22);
				
				int t = t111 - t222;
				
				String s = String.valueOf(t);
				re.setText(s);
				
				
			}
		});
		button.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 30));
		button.setBounds(118, 336, 113, 47);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("곱하기");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 더하기, 빼기, 나누기 = 정수
				// 곱하기 = 실수가 가능
				// Double.parseDouble();
				
				String t11 = t1.getText();
				String t22 = t2.getText();
				
				double t111 = Double.parseDouble(t11);
				double t222 = Double.parseDouble(t22);
				
				double t = t111 * t222;
				re.setText("곱한값 = " + t);
				
				
			}
		});
		button_1.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 30));
		button_1.setBounds(243, 336, 117, 47);
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("나누기");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String t11 = t1.getText();
				String t22 = t2.getText();
				
				int t111 = Integer.parseInt(t11);
				int t222 = Integer.parseInt(t22);
				
				int t = t111 / t222;
				
				String s = String.valueOf(t);
				re.setText(s);
				
			}
		});
		button_2.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 30));
		button_2.setBounds(359, 336, 125, 47);
		f.getContentPane().add(button_2);
		
		JLabel label_2 = new JLabel("결과화면");
		label_2.setForeground(new Color(0, 0, 128));
		label_2.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 40));
		label_2.setBounds(12, 429, 171, 68);
		f.getContentPane().add(label_2);
		
		re = new JTextField();
		re.setBackground(SystemColor.activeCaption);
		re.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 40));
		re.setColumns(10);
		re.setBounds(168, 429, 304, 68);
		f.getContentPane().add(re);
		
		
		
		
		f.setVisible(true);

	}
}
