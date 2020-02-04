package 조건문;

import java.util.Scanner;

public class 보너스문제 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("당신의 직책은? ");
	String data = sc.next(); //사원
	
	switch (data) {
	case "사원":
		System.out.println("월급이 1000만원 입니다");
		break;
	case "과장":
		System.out.println("월급이 2000만원 입니다");
		break;
	case "사장":
		System.out.println("월급이 3000만원 입니다");	
		break;
	case "회장":
		System.out.println("월급이 4000만원 입니다");
		break;
	default:
		System.out.println("직급을 잘못 입력하였습니다");
		break;
		}		

	} // main end

} // class end
