package 응용문제;

import java.util.Scanner;

public class 투표프로그램 {

	public static void main(String[] args) {
		
		// 5번 투표 기회가 있음
		// (1)아이유 (2)유재석 (3)공유
		// ------------------------
		// 당신의 선택은? 1
		// 당신의 선택은? 2		
		// 당신의 선택은? 3		
		// 당신의 선택은? 1		
		// 당신의 선택은? 1		
		// ------------------------
		// 아이유 3표, 유재석 1표, 공유 1표
		
		Scanner sc = new Scanner(System.in);
		
		int iu = 0;
		int js = 0;
		int gu = 0;
		
		System.out.println("(1)아이유 (2)유재석 (3)공유");
		System.out.println("------------------------");
		
		for (int i = 0; i < 5; i++) {
			
			System.out.print("당신의 선택은? (기회 5번): ");
			int choise = sc.nextInt();
			
			// choise의 값에 따라서 다르게 처리
			// 조건문 (if, switch문)
			
			switch (choise) {
			case 1:
				iu++;
				break;
			case 2:
				js++;
				break;
			case 3:
				gu++;
				break;
			default:
				System.out.println("1 2 3 중에 선택하세요");
				break;
			}
			
		}
		
		System.out.println("------------------------");
		System.out.println("아이유 " + iu + "표, 유재석 " + js + "표, 공유 " + gu + "표");
	

	}

}
