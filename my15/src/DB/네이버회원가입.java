package DB;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class 네이버회원가입 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		
		JFrame f = new JFrame("나의 네이버 회원가입");
		f.getContentPane().setBackground(Color.WHITE);
		
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tjoeun302-20\\Desktop\\다운로드.jfif"));
		lblNewLabel.setBounds(12, -6, 460, 161);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setForeground(new Color(0, 153, 102));
		lblNewLabel_1.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(45, 172, 81, 47);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("비밀번호");
		label.setForeground(new Color(0, 153, 102));
		label.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 30));
		label.setBounds(22, 241, 165, 47);
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("이름");
		label_1.setForeground(new Color(0, 153, 102));
		label_1.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 30));
		label_1.setBounds(72, 312, 67, 47);
		f.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("주소");
		label_2.setForeground(new Color(0, 153, 102));
		label_2.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 30));
		label_2.setBounds(72, 384, 67, 47);
		f.getContentPane().add(label_2);
		
		t1 = new JTextField();
		t1.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		t1.setBounds(165, 174, 296, 45);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		t2.setColumns(10);
		t2.setBounds(165, 241, 296, 45);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		t3.setColumns(10);
		t3.setBounds(165, 314, 296, 45);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		t4.setColumns(10);
		t4.setBounds(165, 386, 296, 45);
		f.getContentPane().add(t4);
		
		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				
				// 입력한 값 가지고오기
				// DB처리 4단계
				
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					System.out.println("1. 커넥터 설정 성공 --------------");
					
					String url = "jdbc:mysql://localhost:3309/shoes";
					String user = "root";
					String password = "1234";
					
					Connection con = DriverManager.getConnection(url, user, password);
					
					System.out.println("2. DB연결 성공 -----------------");
					
					String sql = "insert into member values (?,?,?,?)";
					
					PreparedStatement ps = con.prepareStatement(sql);
					
					ps.setString(1, id);
					ps.setString(2, pw);
					ps.setString(3, name);
					ps.setString(4, tel);
					
					System.out.println("3. SQL문 만들기 성공 -------------");
					
					ps.executeUpdate();
					
					System.out.println("4. SQL문 전송 성공 --------------");
				} catch (Exception e) {
					e.printStackTrace();

				}
				
			}
		});
		btnNewButton.setForeground(new Color(0, 153, 102));
		btnNewButton.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 30));
		btnNewButton.setBounds(45, 474, 165, 47);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("회원탈퇴");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					System.out.println("1. 커넥터 설정 성공 --------------");
					
					String url = "jdbc:mysql://localhost:3309/shoes";
					String user = "root";
					String password = "1234";
					
					Connection con = DriverManager.getConnection(url, user, password);
					
					System.out.println("2. DB연결 성공 -----------------");
					
					String id = JOptionPane.showInputDialog("탈퇴할 ID를 입력하세요");
					
					String sql = "delete from member where id = (?)";
					
					PreparedStatement ps = con.prepareStatement(sql);
					
					ps.setString(1, id);
					
					System.out.println("3. SQL문 만들기 성공 -------------");
					
					ps.executeUpdate();
					
					System.out.println("4. SQL문 전송 성공 --------------");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				
				}
				
			}
		});
		button.setForeground(new Color(0, 153, 102));
		button.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 30));
		button.setBounds(274, 474, 165, 47);
		f.getContentPane().add(button);
		
		
		
		
		f.setVisible(true);

	}
}
