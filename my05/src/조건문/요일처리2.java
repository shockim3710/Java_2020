package 조건문;

import java.util.Date;
import java.util.Scanner;

public class 요일처리2 {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		int day = date.getDay();
		
		// switch문은 간단하지만 수동으로 break 해야함
		
		switch (day) { // 실수가 올 수 없음
		case 0: 
			System.out.println("오늘은 일요일 입니다");
			break;
		case 1: 
			System.out.println("오늘은 월요일 입니다");
			break;
		case 2: 
			System.out.println("오늘은 화요일 입니다");
			break;
		case 3: 
			System.out.println("오늘은 수요일 입니다");
			break;
		case 4: 
			System.out.println("오늘은 목요일 입니다");
			break;
		case 5: 
			System.out.println("오늘은 금요일 입니다");
			break;
		case 6:	
			System.out.println("오늘은 토요일 입니다");
			break;
			
		}

	} // main end

} // class end
