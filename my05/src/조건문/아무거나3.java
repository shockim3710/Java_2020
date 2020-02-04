package 조건문;

import java.util.Random;
import java.util.Scanner;

public class 아무거나3 {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int computer = r.nextInt(3);
		
		System.out.print("(0)가위 (1)바위 (2)보: ");
		int me = sc.nextInt();
		
		switch (me) {
		case 0: // 내가 가위를 냄
			switch (computer) {
			case 0:
				System.out.println("COMPUTER는 가위를 냈습니다");
				System.out.println("비겼습니다");
				break;
			case 1:
				System.out.println("COMPUTER는 바위를 냈습니다");
				System.out.println("제가 졌습니다");
				break;
			case 2:
				System.out.println("COMPUTER는 보를 냈습니다");
				System.out.println("제가 이겼습니다");
				break;
			}
			break;
			
		case 1: // 내가 바위를 냄
			switch (computer) {
			case 0:
				System.out.println("COMPUTER는 가위를 냈습니다");
				System.out.println("제가 이겼습니다");
				break;
			case 1:
				System.out.println("COMPUTER는 바위를 냈습니다");
				System.out.println("비겼습니다");
				break;
			case 2:
				System.out.println("COMPUTER는 보를 냈습니다");
				System.out.println("제가 졌습니다");
				break;
			}
			break;
			
		case 2: // 내가 보를 냄
			switch (computer) {
			case 0:
				System.out.println("COMPUTER는 가위를 냈습니다");
				System.out.println("제가 졌습니다");
				break;
			case 1:
				System.out.println("COMPUTER는 바위를 냈습니다");
				System.out.println("제가 이겼습니다");
				break;
			case 2:
				System.out.println("COMPUTER는 보를 냈습니다");
				System.out.println("비겼습니다");
				break;
			}
			break;
			
		default:
			System.out.println("다시 입력해 주세요");
		}

		System.out.println("COMPUTER: " + computer);
	}

}
