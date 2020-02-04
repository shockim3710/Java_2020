package 순차문;

import javax.swing.JOptionPane;

public class 순차문01 {

	public static void main(String[] args) {
		
		// 입력 > 처리 > 출력
		// 1. 입력: 오늘의 날씨는?
		// 2. 처리: 비 > 비가 오는 날에는 우산을 챙겨요
		// 3. 출력
		
		String data = JOptionPane.showInputDialog("오늘의 날씨는?");
		String result = data + "가 오는 날에는 우산을 챙겨요";
		
		// System.out.println(result);
		JOptionPane.showMessageDialog(null, result);
		
		// 소속, 이름
		// 홍길동은 메가소속입니다.
		
		String n = JOptionPane.showInputDialog("당신의 이름은?");
		String k = JOptionPane.showInputDialog("당신의 소속은?");
		String r = n + "은(는) " + k + "소속 입니다.";
		
		JOptionPane.showMessageDialog(null, r);
		
	}

}
