package 문제;

import java.util.Scanner;

public class 콘솔연습 {

	public static void main(String[] args) {
		
		// 나에 대한 정보
		// ------------
		// 이름 입력 - hong
		// 나이 입력 - 100
		// 취미 입력 - run
		// ------------
		// 나의 이름은 hong
		// 나의 나이는 100세
		// 나의 취미는 run 입니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		
		System.out.print("나이를 입력하세요: ");
		String old = sc.next();
		
		System.out.print("취미를 입력하세요: ");
		String hobb = sc.next();
		
		System.out.println("나에 대한 정보");
		System.out.println("------------");
		System.out.println("나의 이름은 " + name + " 입니다");
		System.out.println("나의 나이는 " + old + "살 입니다");
		System.out.println("나의 취미는 " + hobb + " 입니다");
		System.out.println("------------");
		
	}

}
