package 순차문;

import java.util.Scanner;

public class 콘솔연습2 {

	public static void main(String[] args) {
		
		// next는 단어만 가능

		Scanner sc = new Scanner(System.in); // new + 컨트롤 + 스페이스바
		System.out.print("나이를 입력하세요: ");

		int age = sc.nextInt(); // sc.nexti + 컨트롤 + 스페이스바
		int nextAge = age + 1;

		System.out.println("내년 나이는 " + nextAge + "살");

		System.out.print("키를 입력하세요: ");
		double height = sc.nextDouble();
		System.out.println("당신의 키는 " + height + "cm");

		System.out.print("저녁을 먹었습니까? (true/fales): ");
		boolean food = sc.nextBoolean();
		System.out.println("당신의 저녁 여부는 " + food);

		System.out.print("올해의 목표는? ");
		sc.nextLine(); //엔터 처리, 안하면 아래코드가 종료됨
		String life = sc.nextLine(); // 문장 가능
		System.out.println("올해의 목표는 " + life);
		
		// 자동 코드 정리 = 컨트롤 + 쉬프트 + f

	}

}
