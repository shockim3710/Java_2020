package 배열응용;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 여러번입력저장 {

	public static void main(String[] args) {
		
		
		String[] names = new String[5];
		
		for (int i = 0; i < names.length; i++) {
			
			names[i] = JOptionPane.showInputDialog("친구의 이름을 입력하세요");
			
		}
		
		System.out.println("***** 친구 이름 목록 *****");
		
		for (int i = 0; i < names.length; i++) {
			
			System.out.print(names[i] + " ");
			
		}

	}

}
