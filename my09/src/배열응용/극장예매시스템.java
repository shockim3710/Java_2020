package 배열응용;

import java.util.Scanner;

public class 극장예매시스템 {

	public static void main(String[] args) {
		
		// 좌석의 예매 상황을 저장할 변수 10개 - 배열
		int[] seat = new int[10];
		int count = 0;
		Scanner sc = new Scanner(System.in);
			
		while (true) {
			
			System.out.println("------------------------------");
			
			for (int i = 0; i < 10; i++) {

				System.out.print(i + "  ");

			}
			
			System.out.println();
			System.out.println("------------------------------");
			
			for (int i = 0; i < seat.length; i++) {

				System.out.print(seat[i] + "  ");

			}
			
			System.out.println();
			System.out.println("------------------------------");
			
			System.out.print("애몌할 좌석번호를 입력하세요 (종료 -1): ");
			int choice = sc.nextInt();
			
			if (choice == -1) {

				System.out.println("당신은 " + count + "자리 예매했습니다");
				System.out.println("결제금액 = " + (count * 10000) + "원");
				System.out.println();
				
				System.out.println("예매 프로그램을 종료합니다");
				System.exit(0); //프로그램 종료

			} if (seat[choice] == 1) {
				
				// 이미 그 자리가 예매되었으면
				// (그 자리값이 1인 경우)
				// 예매할 수 없게 처리
				
				System.out.println("이미 예매된 좌석입니다");
				
			} else {
				
				seat[choice] = 1; // 예매처리
				System.out.println("예매가 완료되었습니다");
				System.out.println();
				
				count++;
				
			}
			
		} 

	}

}
