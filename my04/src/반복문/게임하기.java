package 반복문;

import java.util.Scanner;

public class 게임하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 반복문 (~동안)
		while (true) { // 3번째 선택, 무한루프
			
			System.out.println("^^");
			System.out.print("선택하세요 (계속0, 종료1): ");
			int choice = sc.nextInt();
			
			if (choice == 1) {
				
				System.out.println("시스템을 종료합니다");
				break; // 반복문을 중단
				
			} else {

			}
			
			
		}

	}

}
