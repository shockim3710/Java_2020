package 클래스복습;

public class 마스크 {
	
	//	클래스 만들때의 규칙
	//	- 원형 (틀)을 만들어야 함
	//	(리모콘의 버튼이 여러개 있을 때
	//	하나의 원형 (틀)을 만들어서
	//	여러개의 버튼을 찍어내듯이 복사해서 사용)
	//	- 복사되는 것은 멤버변수들이 복사
	//	- ex) 클래스: 버튼 틀 (색, 글자)
	//		    객체 (대상): 버튼1 (색: 검정, 글자: 종료)
	//		    객체 (대상): 버튼2 (색: 하얀, 글자: 소리)
	
	
	// 멤버변수
	String color;
	int price;
	
	// 멤버메소드
	public void make() {
		
		System.out.println("마스크를 만들다");
		
	}
	
	// 마스크를 복사한 변수를 프린트할 때 자동 실행 (호출)
	// 멤버 변수값울 한번에 간단히 출력하고 싶을 때 사용
	public String toString() {
		return "color: " + color + ", price: " + price;
	}

	
}
