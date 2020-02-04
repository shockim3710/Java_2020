package 순차문;

import java.util.Scanner;

public class 평균계산 {

	public static void main(String[] args) {

		int 수학 = 88;
		int 영어 = 99;
		int 국어 = 55;
		
		int total = 수학 + 영어 + 국어;
		
		System.out.println("전체 과목의 합계 = " + total + "점");
		
		int 과목수 = 3;
		double avg = (double) total / 과목수;
		
		System.out.println("전체 과목의 평균 = " + avg + "점");
		
		// 음식점 계산 총 금액: 446677
		// 함께 먹은 사람 인원 수: 6
		// ----------------------
		// 각자 내야할 돈 = 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("음식점 계산 총 금액: ");
		int mon = sc.nextInt();
		
		System.out.print("함께 먹은 사람 인원 수: ");
		int pe = sc.nextInt();
		
		System.out.println("----------------------");
		
		double res = (double) mon / pe;
		// 타입을 바꾸는 것 => casting (캐스팅)
		
		System.out.println("각자 내야할 돈 = " + (int) res + "원");
		
		// 프로그래밍에서의 괄호
		// ( ) : 소, 명령문 (함수)
		// { } : 중, 포함
		// [ ] : 대, 배열
		
	}

}
