package 메뉴판;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FoodMenu {
	
	// 선언의 위치가 변수를 사용할 수 있는 범위
	// 클래스 전체 영역에서 쓸 수 있는 변수 - 전역 변수
	
	static int count = 0; // 주문수 카운트
	static int 짜장 = 0;
	static int 우동 = 0;
	static int 짬뽕 = 0;
	static int sum = 0; // 전체 금액 계산
	
	private static JTextField t2;
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame(); // 지역 변수
		f.getContentPane().setBackground(new Color(255, 255, 255));

		f.setSize(500, 700);
		f.getContentPane().setLayout(null);
		
		t2 = new JTextField();
		t2.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 40));
		t2.setBounds(205, 591, 256, 39);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("지불할 총 금액");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 25));
		lblNewLabel.setBounds(12, 591, 173, 39);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 40));
		t1.setColumns(10);
		t1.setBounds(333, 51, 128, 39);
		f.getContentPane().add(t1);
		
		
		
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("D:\\ksh\\my07\\1554785385_mem.png"));
		img.setBounds(12, 116, 449, 406);
		f.getContentPane().add(img);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\ksh\\my07\\1.jpg"));
		label.setBounds(12, 116, 449, 406);
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("D:\\ksh\\my07\\691DBABCCAA2430EBAB0BB575DD22AA1.jpg"));
		label_1.setBounds(12, 116, 449, 406);
		f.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("D:\\ksh\\my07\\1490c2f216.jpg"));
		label_2.setBounds(12, 116, 449, 406);
		f.getContentPane().add(label_2);
		
		
		
		JLabel j = new JLabel("");
		j.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 12));
		JLabel ja = new JLabel("");
		ja.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 12));
		JLabel o = new JLabel("");
		o.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 12));
		
		
		
		JButton btnNewButton = new JButton("짜장면");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				count++;
				t1.setText(count + "개");
				
				sum = count * 5000;
				t2.setText(sum + "원");
				
				ImageIcon icon = new ImageIcon("label.jpg");
				img.setIcon(icon);
				
				짜장++;
				j.setText(짜장 + "개");
				
			}
		});
		btnNewButton.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 25));
		btnNewButton.setBounds(12, 51, 108, 39);
		f.getContentPane().add(btnNewButton);
		
		
		JButton button = new JButton("짬뽕");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				count++;
				t1.setText(count + "개");
				
				sum = count * 5000;
				t2.setText(sum + "원");
				
				ImageIcon icon = new ImageIcon("label_2.jpg");
				img.setIcon(icon);
				
				짬뽕++;
				ja.setText(짬뽕 + "개");
				
			}
		});
		button.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 25));
		button.setBounds(120, 51, 101, 39);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("우동");
		button_1.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 25));
		button_1.setBounds(220, 51, 101, 39);
		f.getContentPane().add(button_1);
		
		
		j.setBounds(40, 100, 57, 15);
		f.getContentPane().add(j);
		
		ja.setBounds(145, 100, 57, 15);
		f.getContentPane().add(ja);
		
		o.setBounds(245, 100, 57, 15);
		f.getContentPane().add(o);
		
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				count++;
				t1.setText(count + "개");
				
				sum = count * 5000;
				t2.setText(sum + "원");
				
				// 우동 그림을 img 라벨에 icon으로 집어 넣어야 함
				ImageIcon icon = new ImageIcon("label_1.jpg");
				img.setIcon(icon);
				
				우동++;
				o.setText(우동 + "개");
				
				
			}
		});

		
		
		
		
		
		
		f.setVisible(true);

	}
}
