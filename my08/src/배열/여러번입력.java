package 배열;

import java.util.Scanner;

public class 여러번입력 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// int data = 0;
		// int data; - 쓰레기값이 들어가 있는 상태
		// 변수의 처음값 = 초기값 => 초기화
		
		int[] data2 = new int[5];
			
		for (int i = 0; i < 5; i++) {
			
			System.out.print("성적을 입력하세요: ");
			data2[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < data2.length; i++) {
			
			System.out.print(data2[i] + " ");
			
		}
		
		System.out.println();
		
		int sum = 0;
		
		for (int i = 0; i < data2.length; i++) {
			
			sum = sum + data2[i];
			
		}
		
		System.out.println("총합 = " + sum + "점");
		System.out.println("평균 = " + sum / data2.length + "점");

	}

}
