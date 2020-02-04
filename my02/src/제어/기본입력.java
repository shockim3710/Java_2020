package 제어;

import javax.swing.JOptionPane;

public class 기본입력 {

	public static void main(String[] args) {
		
		// 제어문의 종류
		// 1. 순차문 *** 중요
		// 2. 조건문
		// 3. 반복문
		
		// 프로그램의 흐름
		// 데이터 입력 > 처리 > 결과 출력
		
		// jop+. (접근연산자)+showi
		
		String name = JOptionPane.showInputDialog("당신의 이름은?");
		System.out.println("당신이 입력한 이름은 " + name + " 입니다."); //결합연산자
		
		// 1. 입력 : 당신의 소속은? 메가
		// 2. 처리 : "메가 + 스터디" 해서 임의의 변수에 저장
		// 3. 출력 : 2번의 변수 내용을 모니터에 출력
		
		String s = JOptionPane.showInputDialog("당신의 소속은?");
		String r = s + " 스터디";
				
		System.out.println("당신은 " + r + " 소속이군요.");
		
		// 자동주석 : 컨트롤+/
		
	}

}
