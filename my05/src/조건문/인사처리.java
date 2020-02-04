package 조건문;

import java.util.Date;

public class 인사처리 {

	public static void main(String[] args) {

		// 지금은 몇시 인가요?
		// 몇시인지를 알려주는 부품(class)가 필요
		
		// 연산자
		// 산술, 비교, 논리 (&& : and, || : or, ! : not)
		
		Date date = new Date();
		
		int hour = date.getHours();
		
		// 지금 단계에서는 if~else if~else
		// 복잡한 if~else문을 정리해서 만드는 방법
		
		if (hour >=6 && hour < 10) { 
			// 논리연산자
			// 여러가지 조건을 다 만족 해야하는 경우
			// and 연산 (&&)
			// 여러가지 조건 중 하나만 만족해도 되는 경우
			// or 연산 (||)
			
			System.out.println("GOOD MORNING");
			
		} else if (hour < 15) {
			
			System.out.println("GOOD AFTERNOON");
			
		} else if (hour < 22) {
			
			System.out.println("GOOD EVENING");
			
		} else {
			
			System.out.println("GOOD NIGHT");
			
		}
		
	} // main end

} // class end
