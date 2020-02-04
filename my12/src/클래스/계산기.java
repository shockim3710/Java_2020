package 클래스;

public class 계산기 {
	//	입력값 X, 변환값 X
	//	- 하나의 이름으로 오버해서 여러 기능을 정의
	// 	  => overloading, 오버로딩, 다형성
	//	입력값의 타입, 개수, 순서에 따라 구분
	
	//	class
	//	- 프로그램할 대상이 되는 객체들의 원형 (틀)
	//	- 필요한 객체가 있으면 class를 복사하여 사용
	//	- class를 복사하면 필요한 만큼 객체를 만들어 쓸 수 있음
	//	- class는 성질은 멤버변수로,
	//			  동작은 멤버메소드로 만듬
	//	- 메소드는 입력값의 유무와 반환값의 유무에 따라 다르게 작성
	//	- 생성된 객체로 메소드를 호출하여 사용
	// 	- 메소드 이름 동일하게 사용 가능
	// 	- 입력값 가지고 구분 (타입, 변수)
	
	//	public void add() => add()
	//	public void add(int x, int y) => add(100, 200)
	
	
	public void add() {
		
		System.out.println("더하기 기능수행");
		
	}
	
	public int add(int x, int y) {
		
		return x + y;
		
	}
	
	public double add(double x, int y) {
		
		return x + y;
		
	}
	
	public double add(double x, double y) {
		
		return x + y;
		
	}
	
	public String add(String x, String y) {
		
		return x + y;
		
	}
	
	public String add(String x, int y) {
		
		return x + y;
		
	}
	
	
	
}
