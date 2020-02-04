package exam;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 기본입력2 {

	public static void main(String[] args) throws IOException {
		
		// 두 개를 입력받아서
		// 두 개를 결합시켜
		// 그 결합 결과를 출력
		
		String x = JOptionPane.showInputDialog("당신의 태어난 연도를 적으세요.");
		String y = JOptionPane.showInputDialog("당신의 태어난 월일을 적으세요.");
		String z = x + y;
		
		// System.out.println("주민번호 = " + z);
		// JOptionPane.showMessageDialog(null, z);
		FileWriter file = new FileWriter("win.txt");
		file.write(z);
		file.close();

	}

}
