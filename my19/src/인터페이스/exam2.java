package 인터페이스;

import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하세요");
		int kor = sc.nextInt();
		
		System.out.println("수학점수를 입력하세요");
		int math = sc.nextInt();
		
		System.out.println("영어점수를 입력하세요");
		int eng = sc.nextInt();
		
		int k = kor + math + eng;
		
		System.out.println("총 합산점수 = " + k);
		System.out.println("성적의 평균점수 = " + (k/3));

	}

}
