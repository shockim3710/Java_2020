package 상속;

public class Employee {
	// 접근 제어자
	// public >> protected >> default >> private
	
	public String name; // 아무데서나 name 사용가능
	// 기본제어자 => 같은 패키지
	
	protected int salary; // 같은 패키지 + 다른 패키지 (상속)
	
	String address; // 같은 패키지 내에서만 사용가능
					// 상속이라는 패키지 내에서만 사용가능

	private int rrn; // 이 클래스 내에서만 사용가능
	
	

}
