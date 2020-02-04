package 조건문;

import java.util.Date;

public class 요일처리 {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		int day = date.getDay();
		
		if (day == 0) {
			
			System.out.println("오늘은 일요일 입니다");
			
		} else if (day == 1) {
			
			System.out.println("오늘은 월요일 입니다");
			
		} else if (day == 2) {
			
			System.out.println("오늘은 화요일 입니다");
			
		} else if (day == 3) {
			
			System.out.println("오늘은 수요일 입니다");
			
		} else if (day == 4) {
			
			System.out.println("오늘은 목요일 입니다");
			
		} else if (day == 5) {
			
			System.out.println("오늘은 금요일 입니다");
			
		} else {
			
			System.out.println("오늘은 토요일 입니다");
			
		}

		
	} // main end

} // class end
