package 클래스;

public class 계산기 {
	
	// void = 없음
	
	// 메소드 (동작, 처리) 만드는 방법
	
	// 1. 입력값의 여부
	// - 없을 땐 add()
	// - 있을 땐 add(int money)
	
	// 2. 메소드의 처리 결과값 반환여부
	// - 반환을 해야 할 땐 return
	// - 반환이 필요 없을 땐 void
	// - add(2000, 3000)
	
	// => 메소드 사용 (call, 호출한다)
	// => 메소드를 call 하지 않으면 실행X
	
	public int add(int coffee, int green) { // void 대신 int를 사용했으므로 return이 붙음
		
		System.out.println("결제 금액 = " + (coffee + green) + "원");
		
		return coffee + green;
		
	}
	
	public void minus(int money) {
		
		boolean vip = true;
		int result = money - 1000;
		
		System.out.println("당신의 최종 결제 금액 = " + result + "원");
		
	}
	
	public int gob(int x, int people) {
		
		System.out.println(people + "명 결제금액 = " + (x * people) + "원");
		
		return x * people;
		
	}
	
	public void nan(int result2, int count) {
		
		System.out.println("1명당 " + (result2 / count) + "원을 결제하세요");
		
	}

}
