package 윈도우;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class 메뉴판 {
	
	static int count = 10; // 치킨의 개수

	public static void main(String[] args) {
		
		JFrame f = new JFrame(); // 큰 프레임을 만듬
		
		f.setSize(800, 500); // 프레임의 크기를 결정
		
		JLabel label = new JLabel("");
		label.setBackground(SystemColor.desktop);
		label.setIcon(new ImageIcon("D:\\ksh\\my06\\img_menu.png"));
		f.getContentPane().add(label, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// JOptionPane.showMessageDialog(null, "치킨 빼기");

				if (count != 0) { // 음수가 될 때 막기
					
					count--;
					
					System.out.println("치킨 " + count + "개");
					f.setTitle("치킨의 개수: " + count + "개");
					
				} else {
					
					f.setTitle("더 이상 뺄 수 없습니다");

				}	

				
			}
		});
		btnNewButton.setForeground(new Color(205, 92, 92));
		btnNewButton.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 40));
		btnNewButton.setBackground(new Color(178, 34, 34));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// JOptionPane.showMessageDialog(null, "치킨 더하기");
				count++;
				
				System.out.println("치킨 " + count + "개");
				f.setTitle("치킨의 개수: " + count + "개");
				
			}
		});
		button.setForeground(new Color(30, 144, 255));
		button.setBackground(new Color(0, 0, 139));
		button.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 40));
		f.getContentPane().add(button, BorderLayout.EAST);
		

		
		f.setVisible(true); // 프레임을 보여지게 설정


	}

}
