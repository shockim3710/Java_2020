package 상속;

public class 멀티스레드2 {

	public static void main(String[] args) {
		
		이름 n = new 이름();
		별 s = new 별();
		
		s.start();
		n.start();
		
	}

}
