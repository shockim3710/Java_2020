package 상속;

public class 멀티스레드 {

	public static void main(String[] args) {
		
		// 멀티스레드
		// - 여러 처리를 동시에 하고 싶은 경우
		// - 하나의 처리를 스레드로 만들기
		// - 스레드 기능을 넣은 클래스로 만들고 싶으면
		//   상속해서 클래스 만들기
		
		Plus p = new Plus();
		Minus m = new Minus();
		
		p.start();
		m.start();
		

	}

}
