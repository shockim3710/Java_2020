package 조건문;

import java.util.Date;
import java.util.Scanner;

public class 시간커피체크 {

	public static void main(String[] args) {

		// 커피값은? 5000
		// 주문수는? 3
		// 현재 시각이 저녁 10시 이전이면 원가격
		// 10시 이후면 5000원 할인

		Scanner sc = new Scanner(System.in); // 콘솔에서 입력받는 class
		Date date = new Date(); // 시각 알려주는 class
		
		System.out.print("커피값은? ");
		int coffee = sc.nextInt();
		
		System.out.print("주문수는? ");
		int peo = sc.nextInt();
		
		int res = coffee * peo;
		int s = date.getHours();
		
		if (s > 22) {
			
			int h = res - 5000;
			System.out.println(h + "원 입니다");
			
		} else {
			
			System.out.println(res + "원 입니다");

		}
		

	}

}
