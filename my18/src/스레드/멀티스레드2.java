package 스레드;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class 멀티스레드2 extends JFrame {
	
	JLabel up = new JLabel("카운트");
	JLabel down = new JLabel("시작");
	
	public 멀티스레드2() {
		getContentPane().setBackground(SystemColor.activeCaption);
		
		setTitle("멀티스레드2");
		setSize(300, 300);
		getContentPane().setLayout(null);
		
		up.setHorizontalAlignment(SwingConstants.CENTER);
		up.setForeground(new Color(128, 0, 0));
		up.setFont(new Font("한컴 윤고딕 230", Font.PLAIN, 40));
		up.setBounds(0, 71, 137, 127);
		getContentPane().add(up);
		
		down.setHorizontalAlignment(SwingConstants.CENTER);
		down.setForeground(new Color(0, 0, 128));
		down.setFont(new Font("한컴 윤고딕 230", Font.PLAIN, 40));
		down.setBounds(147, 67, 137, 134);
		getContentPane().add(down);
		
		JLabel label = new JLabel("▲");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(128, 0, 0));
		label.setFont(new Font("한컴 윤고딕 230", Font.PLAIN, 40));
		label.setBounds(23, 21, 92, 71);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("▼");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(0, 0, 128));
		label_1.setFont(new Font("한컴 윤고딕 230", Font.PLAIN, 40));
		label_1.setBounds(178, 164, 80, 76);
		getContentPane().add(label_1);
		
		up u = new up();
		down d = new down();
		
		u.start();
		d.start();
		
		
		
		
		setVisible(true);
		
	}
	
	class up extends Thread{
		
		@Override
		public void run() {
			
			for (int i = 0; i < 100; i++) {
				
				try {
					
					Thread.sleep(1000);
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				up.setText(i + "");
				
			}

			
		}
		
	}

	class down extends Thread{
		
		@Override
		public void run() {
			
			for (int i = 100; i >= 0; i--) {
				
				try {
					
					Thread.sleep(1000);
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				down.setText(i + "");
				
			}

			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		멀티스레드2 mul2 = new 멀티스레드2();
		
	}

}
