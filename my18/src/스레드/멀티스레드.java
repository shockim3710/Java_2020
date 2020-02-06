package 스레드;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.Date;
import java.awt.Color;


public class 멀티스레드 extends JFrame {
	
	//	전공자 포트폴리오 준비
	//	- 네트워크 프로그램이 들어간 그래픽 프로그램 (Swing)
	
	//	- 자바로 만들어진 웹사이트
	//	  (최근 기술의 융합)
	//	  1. Spring
	//	  2. 실제 사이트 운영시의 고려할 점 : 싱글톤, 스레드
	//							 : 트래픽 핸들링, 보안
	//	  3. 외부 사이트 연결
	//	  4. 외부 API 연결 (REST API), JSON
	//	  5. 자바 스크립트, Node.js, React
	//	  6. 데이터 베이스
	
	//	- 자료구조
	
	//	자바 기본 >>> 응용
	//		      1. 웹 프로그래밍: JSP, Spring
	//		      2. 앱 프로그래밍: 안드로이드
	
	//	파이썬 + 응용 >>> 장고
	
	//	파이썬 + 웹사이트
	//		+ 인공지능 (AI): 머신러닝, 딥러닝
	
	
	//	상속: 재사용
	//	     - 부모클래스, 자식클래스
	//	     - 부모클래스는 하나 (단일상속)
	//	     - override (재정의)
	
	JLabel count = new JLabel("카운트 시작");
	JLabel img = new JLabel("");
	JLabel now = new JLabel("3");
	
	public 멀티스레드() {
		getContentPane().setBackground(SystemColor.activeCaption);
		
		setTitle("멀티 스레드");
		setSize(700, 300);
		getContentPane().setLayout(null);
		count.setForeground(new Color(0, 0, 128));
		
		count.setFont(new Font("한컴 윤고딕 230", Font.PLAIN, 35));
		count.setBounds(30, 79, 378, 47);
		getContentPane().add(count); // 형변환
		
		img.setBounds(462, 16, 222, 217);
		getContentPane().add(img); // 형변환
		now.setForeground(new Color(0, 0, 128));
		
		now.setFont(new Font("한컴 윤고딕 230", Font.PLAIN, 25));
		now.setBounds(30, 152, 420, 47);
		getContentPane().add(now); // 형변환
		
		CountThread c = new CountThread();
		ImgThread img = new ImgThread();
		NowThread n = new NowThread();
		
		c.start();
		img.start();
		n.start();
		
		setVisible(true);
		
	}
	
	// 내부클래스 (inner class)
	// 전역변수를 공유해서 사용해야 하는경우
	// 이 클래스는 독립적으로 사용X
	// 멀티스레드 안에서만 쓸 수 있는 특별한 클래스
	
	class CountThread extends Thread{
		
		@Override
		public void run() {
			
			for (int i = 500; i >= 0; i--) {
				
				try {
					
					Thread.sleep(1000);
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				count.setText("카운트: " + i);
				
			} // for	
			
		} // run
	
	} // inner class
	
	class ImgThread extends Thread{
		
		String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};
		
		@Override
		public void run() {
			
			for (int i = 0; i < list.length; i++) {
				
				try {
					
					Thread.sleep(3000);
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				ImageIcon icon = new ImageIcon(list[i]);
				
				img.setIcon(icon);
				
				
				
			} // for	
			
		} // run
	
	} // inner class
	
	class NowThread extends Thread{
		
		@Override
		public void run() {
			
			for (int i = 0; i < 500; i++) {
				
				try {
					
					Thread.sleep(1000);
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				Date date = new Date();
				
				now.setText(date + "");
				
			} // for	
			
		} // run
	
	} // inner class
	
	
	public static void main(String[] args) {
		
		멀티스레드 multi = new 멀티스레드();
		
	}
}
