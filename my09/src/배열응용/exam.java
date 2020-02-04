package 배열응용;

import java.util.Arrays;
import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = {66, 33, 22, 11, 99};
		
		System.out.print("숫자를 입력하세요: ");
		int input = sc.nextInt();
		
		for (int i = 0; i < num.length; i++) {
			
			if (input == num[i]) {
				
				System.out.println("위치는 " + (i + 1) + "번째 입니다");
				
			}
			
		}


	}

}
