package 조건문;

import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		
		int ga = 7;
		int se = 8;
		int me = ga * se;
		
		System.out.println("사각형의 면적을 구하는 프로그램");
		System.out.println("---------------------");
		System.out.println("가로가 " + ga + ", 세로가 " + se);
		
		if (me >= 50) {
			
			System.out.println("면적이 너무 넓군요");
			
		} else {
			
			System.out.println("면적이 너무 좁군요");

		}
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴를 고르세요");
		System.out.println("---------------------");
		System.out.println("(1)짜장면 (2)짬뽕 (3)우동");
		System.out.println("---------------------");
		
		System.out.print("당신의 선택은? ");
		int cho = sc.nextInt();
		
		if (cho == 1) {
			
			System.out.println("짜장면이 주문되었습니다");
			
		} else if (cho == 2) {
			
			System.out.println("짬뽕이 주문되었습니다");			
			
		} else {
			
			System.out.println("우동이 주문되었습니다");
			
		}
		
	} // main end

} // class end
