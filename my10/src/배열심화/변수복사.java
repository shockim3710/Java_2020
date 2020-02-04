package 배열심화;

public class 변수복사 {

	public static void main(String[] args) {
		
		int x = 100;
		int y = x; // x값을 복사해 y에 넣음
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("--------------------");
		
		x = 200; // x변수의 값을 200으로 변경
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
