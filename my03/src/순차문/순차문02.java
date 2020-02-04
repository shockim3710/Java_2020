package 순차문;

import javax.swing.JOptionPane;

public class 순차문02 {

	public static void main(String[] args) {
		
		String data = JOptionPane.showInputDialog("현재 온도는?");
		
		// 모든 외부 입력의 타입 = String
		// String을 그대로 쓸지 숫자로 변환해서 쓸지 프로그래머가 결정
		// String > int 변환방법
		// inte + 컨트롤 + 스페이스바 + .parse
		
		int now = Integer.parseInt(data);
		int back = now - 1;
		
		System.out.println("수업 종료 후에는 " + back + "도 입니다");
		
		// 두수를 입력받아서 더한 후 출력 : 200 + 100 = 300 입니다.
		
		String n1 = JOptionPane.showInputDialog("숫자를 입력하시오");
		String n2 = JOptionPane.showInputDialog("더할 숫자를 입력하시오");
		
		int now1 = Integer.parseInt(n1);
		int now2 = Integer.parseInt(n2);
		int res = now1 + now2;

		System.out.println(now1 + " + " + now2 + " = " + res);
		
	} // main end

} // class end
