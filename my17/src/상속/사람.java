package 상속;

public class 사람 {
	
	//	사람: 성별, 이름
	//       잠자다, 먹다

	//  맨 = 사람 + 맨의 특징
	//			: 힘의 크기
	//	  		: 달리다
	
	//	수퍼맨 = 맨 + 수퍼맨의 특징
	//			: 날아다니다
	
	//	스파이더맨 = 맨 + 스파이더맨의 특징
	// 			: 벽을 타다
	
	String gender;
	String name;
	
	public void 잠자다() {
		
		System.out.println("잠을 자다");
		
	}
	
	public void 먹다() {
		
		System.out.println("음식을 먹다");
		
	}
	
}
