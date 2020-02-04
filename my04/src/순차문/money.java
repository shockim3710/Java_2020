package 순차문;

import java.util.Scanner;

public class money {

	public static void main(String[] args) {

		// -------- 나의 현금 잔고 --------
		// 현재 당신이 가지고 있는 돈은? 1000원
		// 내일 당신이 가지게 될 돈은? 2000원
		// ---------------------------
		// 내일 내가 가지고 있는 돈의 총액 = 3000원
		
		Scanner sc = new Scanner(System.in);
		// 콘솔에서 입력받을 수 있는 부품 (class)을 복사해옴
		
		System.out.println("-------- 나의 현금 잔고 --------");
		System.out.print("현재 당신이 가지고 있는 돈은? ");
		// 모든 입력되는 데이터의 유형 (타입)은 String
		// 어떤 타입으로 사용할지는 프로그래머가 결정
		int now = sc.nextInt();
		
		System.out.print("내일 당신이 가지게 될 돈은? ");
		int tomorrow = sc.nextInt();
		System.out.println("---------------------------");
		
		int sum = now + tomorrow;

		System.out.println("내일 내가 가지고 있는 돈의 총액 = " + sum + "원");
		
		
		System.out.println("---------- 여행 정보 ----------");
		System.out.print("- 여행지: ");
		String tr = sc.next();
		
		System.out.print("- 경비: ");
		int mo = sc.nextInt();
		
		System.out.print("- 할인율: ");
		double per = sc.nextDouble();
		
		double no = mo - mo * per;
		// JAVA에서는 연산할 때 하나라도 실수가 들어있으면
		// 무조건 결과는 실수
		// 정수와 정수의 연산결과는 무조건 정수
		System.out.println("- 실제 경비: " + (int) no + "원");
		
		System.out.println("---------------------------");			
		System.out.println("=> 12월 중순에 갔을 때 가격");
		
	}

}
