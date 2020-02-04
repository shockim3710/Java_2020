package 배열;

import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = {10, 20, 30, 40, 50};
		
		System.out.println(num[0] + num[1]);
		System.out.println("---------------------------------------");
		
		
		String[] code = new String[3];
		
		for (int i = 0; i < code.length; i++) {
			
			System.out.print("코딩 언어를 입력하세요: ");
			code[i] = sc.next();
			
		}
		
		System.out.println(code[0] + " 보다는 " + code[1]);
		System.out.println("---------------------------------------");
		
		
		int[] ber = new int[5];
		
		for (int i = 0; i < ber.length; i++) {
			
			System.out.print("정수를 입력하세요: ");
			ber[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < ber.length; i++) {
			
			System.out.print(ber[i] + " ");
			
		}

	}
	

}
