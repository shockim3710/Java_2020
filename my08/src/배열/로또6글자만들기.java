package 배열;

import java.util.Random;

public class 로또6글자만들기 {

	public static void main(String[] args) {
		
		// 로또번호 6숫자 만들기
		// 랜덤으로 출력하는 부품 (class) 필요
		
		int[] lotto = new int[6];
		
		Random r = new Random();
		// int data = r.nextInt(46); // 0~45
		
		// System.out.println(data);
		
		for (int i = 0; i < lotto.length; i++) {
			
			lotto[i] = r.nextInt(46);
			
		}
		
		for (int i = 0; i < lotto.length; i++) {
			
			System.out.print(lotto[i] + " ");
			
		}

	}

}
