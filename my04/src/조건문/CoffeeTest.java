package 조건문;

public class CoffeeTest { // 클래스는 대문자표시 => 낙타(카멜)표기법
// coffee_test => 파이썬방식, 뱀(스네이크)표기법
	public static void main(String[] args) {

		int price = 5600;
		int count = 5;
		
		// 25000이 넘으면 5000원 할인쿠폰
		// 아니면 원가
		
		int sum = price * count;
		
		if (sum >= 25000) {
			
			sum = sum - 5000;
			System.out.println("당신이 지불할 금액은 " + sum + "원");
			
		} else {
			
			// System.out.println("당신이 지불할 금액은 " + sum + "원");
			// 비워두어도 됨 (파이썬  X)

		}
		
		int hour = 21;
		
		if (hour <= 22) {
			
			System.out.println("수업이 종료되지 않았습니다");
			
		} else {
			
			System.out.println("수업이 종료까지 남았습니다");

		}

	}

}
