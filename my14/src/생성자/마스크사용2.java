package 생성자;

public class 마스크사용2 {

	public static void main(String[] args) {
		
		마스크 m1 = new 마스크("검정색", 1000); 
		// 마스크()가 자동실행
		// m1이라는 객체를 만들 때 (생성될 때) 자동실행
		// 클래스와 똑같이 생긴 메소드를 생성자 (메소드)
		// constructor 건설
		
		System.out.println(m1); // toString()이 자동실행

	}

}
