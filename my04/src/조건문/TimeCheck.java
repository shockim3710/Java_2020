package 조건문;

import java.util.Date;

public class TimeCheck {

	public static void main(String[] args) {

		// 실행할 때 현재 시각을 구해서
		// 얼마나 집에 갈 시간이 남았는지 체크
		
		Date date = new Date(); // java.utill 선택
		int hour = date.getHours(); //현재 시각을 출력
		
		if (hour < 20) {
			
			System.out.println("수업이 종료되지 않았습니다");
			// 컨트롤 + 알트 + 화살표 아래 : 한 줄 복사
			// 알트 + 화살표 방향 : 이동
			
		} else {
			
			System.out.println("수업이 종료까지 남았습니다");

		}

	}

}
