package 조건문;

import java.util.Date;
import java.util.Scanner;

public class TimeCheck2 {

	public static void main(String[] args) {
		
		Date date = new Date();
		// 한줄 삭제 : 컨트롤 + d
		// 문제 발생시 마우스를 올려주면 해결책 제시 or f2
		
		int hour = date.getHours();
		System.out.println("현재 시각은 " + hour + "시");
		
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(min + "분 " + sec + "초");
		
		int year = date.getYear();
		int year2 = year + 1900;
		System.out.println("올해는 " + year2 + "년");
		
		int month = date.getMonth() + 1;
		System.out.println("이번 달은 " + month + "월");
		
		int 일 = date.getDate();
		System.out.println("오늘은 " + 일 + "일");
		
		int day = date.getDay();
		System.out.println("오늘은 " + day + "요일"); // 정수로 출력
		
		if (day == 2) {
			
			System.out.println("화요일 맞음");
			
		} else {
			
			System.out.println("화요일 아님");

		}
		
	}

}
