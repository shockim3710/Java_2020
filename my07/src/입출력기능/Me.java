// 변수 - 기본데이터형
// int, double, char, boolean

// 연산자 - 산술, 비교, 논리
// &&, ||, ! : not
// 증감
// ++, -- : RAM에 바로적용

// 제어문 - 순차적, 조건문 (if, switch), 반복문 (while, for)



package 입출력기능;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Me {
	private static JTextField name;
	private static JTextField age;
	private static JTextField sh;

	public static void main(String[] args) {
		
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.textHighlight);
		
		f.setSize(500, 500); // .연산자 - 접근연산자 (~에)
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("나이");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 40));
		lblNewLabel.setDisplayedMnemonic('d');
		lblNewLabel.setBounds(37, 161, 84, 75);
		f.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("이름");
		label.setForeground(new Color(0, 0, 128));
		label.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 40));
		label.setDisplayedMnemonic('d');
		label.setBounds(37, 77, 84, 75);
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("신발");
		label_1.setForeground(new Color(0, 0, 128));
		label_1.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 40));
		label_1.setDisplayedMnemonic('d');
		label_1.setBounds(37, 235, 84, 75);
		f.getContentPane().add(label_1);
		
		name = new JTextField();
		name.setBackground(new Color(0, 204, 255));
		name.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 40));
		name.setBounds(143, 91, 159, 46);
		f.getContentPane().add(name);
		name.setColumns(10);
		
		age = new JTextField();
		age.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 40));
		age.setColumns(10);
		age.setBackground(new Color(0, 204, 255));
		age.setBounds(143, 174, 159, 46);
		f.getContentPane().add(age);
		
		sh = new JTextField();
		sh.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 40));
		sh.setColumns(10);
		sh.setBackground(new Color(0, 204, 255));
		sh.setBounds(143, 250, 159, 46);
		f.getContentPane().add(sh);
		
		JButton btnNewButton = new JButton("출력");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String n = name.getText(); //입력한 문자를 가져옴
				
				if (n.equals("") || n.equals("입력오류")) { // or 연산자
					
					name.setText("입력오류");
					
				} else {
					
					System.out.println("이름 출력: " + n + "님");
					
				}
				
			}
		});
		btnNewButton.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 30));
		btnNewButton.setBounds(351, 91, 98, 46);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("출력");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String a = age.getText();
				
				// 내년 나이를 구해서 나이 출력 아래에 출력
				
				int a2 = Integer.parseInt(a); // int로 변환
				int nextYear = a2 + 1;
				
				System.out.println("나이 출력: " + a + "살");
				System.out.println("내년 나이: " + nextYear + "살");
				
			}
		});
		button.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 30));
		button.setBounds(351, 174, 98, 46);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("출력");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s = sh.getText();
				System.out.println("신발사이즈 출력: " + s + "mm");
				
			}
		});
		button_1.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 30));
		button_1.setBounds(351, 250, 98, 46);
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("모두 출력");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String n = name.getText();
				String a = age.getText();
				String s = sh.getText();
				
				System.out.println("모두 출력");
				System.out.println("이름: " + n + "님");
				System.out.println("나이: " + a + "살");
				System.out.println("신발사이즈: " + s + "mm");
				
			}
		});
		button_2.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 30));
		button_2.setBounds(163, 367, 170, 46);
		f.getContentPane().add(button_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(217, 27, 57, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		
		
		
		
		
		
		f.setVisible(true);


	}
}
