package 상속;

public class 고등학생 extends 학생 {

	// 오버로딩: 다형성
	// 메소드 이름을 동일하게 쓸 수 있는 기능
	
	@Override // 재정의: 부모클래스의 기능을 자식클래스에서 재정의
	public void 배우다() {
		
		System.out.println("입시공부를 하다");
		
	}
	
	
}
