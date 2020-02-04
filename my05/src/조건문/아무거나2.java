package 조건문;

import java.util.Random;

public class 아무거나2 {

	public static void main(String[] args) {
		
		// 랜덤(Random)으로 나오게 하는 class
		
		Random r = new Random();
		
		int computer = r.nextInt(3); // -21억 ~ 21억
		// 괄호숫자에 3 = 0부터 2까지를 발생
		System.out.println("COMPUTER: " + computer);
		
		// 0이면, COMPUTER는 가위
		// 1이면, COMPUTER는 바위
		// 2이면, COMPUTER는 보
		
		switch (computer) {
		case 0:
			System.out.println("COMPUTER는 가위를 냈습니다");
			break;
		case 1:
			System.out.println("COMPUTER는 바위를 냈습니다");
			break;
		case 2:
			System.out.println("COMPUTER는 보를 냈습니다");
			break;
		}

	}

}
