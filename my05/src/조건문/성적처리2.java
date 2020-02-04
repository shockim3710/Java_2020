package 조건문;

public class 성적처리2 {

	public static void main(String[] args) {
		
		// 프로그램 전체를 컨트롤(제어)하는 모습
		// - 순차적으로 처리
		// - 조건에 따라 다르게 처리
		// - 반복해야하는 경우 처리

		// 점수가 88점 이라고 가정
		
		int jumsu = 88;
		
		if (jumsu >= 90) {
			
			System.out.println("A학점");
			
		}else if (jumsu >=80) { //if 옆에는 소괄호가 오고, 조건을 입력
			
			System.out.println("B학점");
			
		}else if (jumsu >=70) {
		
		System.out.println("C학점");
		
		}else {
			
			System.out.println("F학점");
			
		}
	
	} // main end

} // class end
