package 응용문제;

import java.util.Scanner;

public class 은행결제시스템 {

	public static void main(String[] args) {
		
		// 은행 결제 시스템
		// ----------------------------
		// (1)잔고확인 (2)입금 (3)출금 (4)종료
		// 번호를 선택하세요: 1
		// 당신의 잔고는 10000원
		// 번호를 선택하세요: 2
		// 입금액을 입력하세요 1000
		// 번호를 선택하세요: 3
		// 출금액을 입력하세요 1000
		// 번호를 선택하세요: 4
		// 시스템을 종료합니다
		
		Scanner sc = new Scanner(System.in);
		
		int money = 10000;
		
		System.out.println("은행 결제 시스템");
		System.out.println("----------------------------");
		System.out.println("(1)잔고확인 (2)입금 (3)출금 (4)종료");
		
		while (true) { 
			// 조건식에는 반드시 비교연산자를 써준다
			// 비교연산자의 결과는 항상 논리형 (true/false)
			
			System.out.print("번호를 선택하세요: ");
			int choice = sc.nextInt();
			
			if (choice == 1) {
				
				System.out.println("당신의 잔고는 " + money + "원");
				
			} else if (choice == 2) {
				
				System.out.print("입금액을 입력하세요: ");
				int in = sc.nextInt();
				
				money = money + in;

			} else if (choice == 3) {
				
				System.out.print("출금액을 입력하세요: ");
				int out = sc.nextInt();
				
				money = money - out;

			} else {
				
				System.out.println("시스템을 종료합니다");
				
				break;

			}
			
			
		}
		

	}

}
