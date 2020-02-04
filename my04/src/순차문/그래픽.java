package 순차문;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class 그래픽 {

	public static void main(String[] args) {

		// 그래픽 부품 (class) 사용해서 화면을 띄우기
		
		JFrame f = new JFrame(); // jfr + 컨트롤 + 스페이스, 큰 틀
		f.setSize(800, 800); //f.set
		
		JButton b = new JButton(); // 버튼
		b.setForeground(new Color(0, 0, 102));
		b.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 40));
		b.setBackground(new Color(0, 102, 204));
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b.setText("클릭하세요"); // 버튼위에 텍스트
		
		f.getContentPane().add(b); // 프레임에 b라는 버튼을 올리기
		
		f.setVisible(true); //화면에 띄우면 true, 맨 아래 있어야 함

	}

}
