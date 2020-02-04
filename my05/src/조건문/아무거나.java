package 조건문;

import java.util.Random;

public class 아무거나 {

	public static void main(String[] args) {
		
		// 랜덤(Random)으로 나오게 하는 class
		
		Random r = new Random();
		
		int data = r.nextInt(100); // -21억 ~ 21억
		// 괄호숫자에 3 = 0부터 2까지를 발생
		System.out.println(data);

	}

}
