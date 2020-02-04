package 배열응용;

import javax.swing.JOptionPane;

public class 배열값더하기2 {

	public static void main(String[] args) {
		
		String[] num2 = {"11", "22", "33"};
		int sum = 0;
	
		for (int i = 0; i < 3; i++) {
			
			sum = sum + Integer.parseInt(num2[i]); // String을 int로 변환
			
		}
		
		System.out.println("배열의 합 = " + sum);
		
		
		String[] age = new String[4];
		int sum1 = 0;
		
		for (int i = 0; i < age.length; i++) {
			
			age[i] = JOptionPane.showInputDialog("가족의 나이를 입력하세요");
			
		}
		
		for (int i = 0; i < age.length; i++) {
			
			sum1 = sum1 + Integer.parseInt(age[i]);
			
		}
		
		System.out.println("가족의 평균 나이 = " + sum1 / age.length);

	}

}
