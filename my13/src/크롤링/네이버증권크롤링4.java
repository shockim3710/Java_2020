package 크롤링;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class 네이버증권크롤링4 {
	private static JTextField t1;

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(30, 144, 255));
		
		f.setSize(400, 600);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("삼성전자");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				t1.setText("005930");

			}
		});
		
		t1 = new JTextField();
		t1.setBackground(new Color(0, 191, 255));
		t1.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		t1.setBounds(199, 212, 113, 39);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JTextArea t2 = new JTextArea();
		t2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		t2.setBounds(28, 353, 326, 178);
		f.getContentPane().add(t2);
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 25));
		btnNewButton.setBounds(107, 35, 178, 39);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("카카오");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				t1.setText("035720");
				
			}
		});
		button.setForeground(new Color(255, 204, 51));
		button.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 25));
		button.setBounds(107, 84, 178, 39);
		f.getContentPane().add(button);
		
		JButton btnNaver = new JButton("네이버");
		btnNaver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				t1.setText("035420");
				
			}
		});
		btnNaver.setForeground(new Color(51, 153, 51));
		btnNaver.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 25));
		btnNaver.setBounds(107, 133, 178, 39);
		f.getContentPane().add(btnNaver);
		
		JLabel lblNewLabel = new JLabel("CODE");
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 30));
		lblNewLabel.setBounds(84, 215, 138, 39);
		f.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("크롤링 시작");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 1. 코드값을 가지고 온다
				// 2. 그 코드값을 크롤링한다
				// 3. 가져온 크롤링값을 화면에 넣는다
				
				String code = t1.getText();
				try {
					
					String site = "https://finance.naver.com/item/main.nhn?code=";
					
					Connection con = Jsoup.connect(site + code);

					Document doc = con.get();
					
					String today = doc.select("span.blind").get(12).text();
					String s = doc.select("span.blind").get(19).text();
					String high = doc.select("span.blind").get(16).text();
					String low = doc.select("span.blind").get(20).text();
					String date = doc.select("em.date").text();
					String date2 = date.substring(0, 10);
					
					t2.setText("");
					t2.append("   날짜: " + date2 + "\n");
					t2.append("오늘가: " + today + "\n");
					t2.append("   시가: " + s + "\n");
					t2.append("   고가: " + high + "\n");
					t2.append("   저가: " + low + "\n");
					
				} catch (Exception e2) {
					
					System.out.println("EARROW");
					
				}
				
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 27));
		btnNewButton_1.setBounds(98, 292, 200, 47);
		f.getContentPane().add(btnNewButton_1);
		
		
		
		
		
		f.setVisible(true);
		

	}
}
