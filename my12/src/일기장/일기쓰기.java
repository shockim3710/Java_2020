package 일기장;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 일기쓰기 {
	private static JTextField t1;
	private static JTextField t2;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void diary() { // 불러오기 가능
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
		
		f.setTitle("일기쓰기 창");
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBackground(new Color(153, 204, 255));
		t1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		t1.setBounds(214, 40, 221, 33);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(153, 204, 255));
		t2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		t2.setColumns(10);
		t2.setBounds(214, 101, 221, 33);
		f.getContentPane().add(t2);
		
		JTextArea t3 = new JTextArea();
		t3.setBackground(new Color(153, 204, 255));
		t3.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		t3.setColumns(10);
		t3.setRows(5);
		t3.setBounds(214, 166, 221, 293);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel = new JLabel("제목");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 20));
		lblNewLabel.setBounds(162, 40, 46, 33);
		f.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("날짜");
		label.setForeground(new Color(0, 0, 128));
		label.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 20));
		label.setBounds(162, 100, 46, 33);
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("내용");
		label_1.setForeground(new Color(0, 0, 128));
		label_1.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 20));
		label_1.setBounds(162, 165, 46, 33);
		f.getContentPane().add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\tjoeun302-20\\Desktop\\HhaA5WI7_400x400.jpg"));
		lblNewLabel_1.setBounds(-148, 295, 363, 323);
		f.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("파일에 저장하기");
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 1. 입력한 값들 가지고 오기
				// 2. 파일에 저장하기
				// 3. 확인메시지 뿌리기
				
				String title = t1.getText();
				String day = t2.getText();
				String content = t3.getText();
				
				try {
					
				FileWriter f = new FileWriter(day + ".txt");
				
				f.write(title + "\n");
				f.write(title + "\n");
				f.close();
				
				JOptionPane.showConfirmDialog(null, "저장이 되었습니다");
				
				}
				
				catch (IOException e1) {
					
					System.out.println("파일 저장 중 에러가 생겼습니다");
					
				}
				
			}
		});
		btnNewButton.setBounds(227, 487, 208, 33);
		f.getContentPane().add(btnNewButton);
		
		
		
		
		
		f.setVisible(true);

	}
}
