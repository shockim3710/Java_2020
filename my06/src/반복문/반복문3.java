package 반복문;

public class 반복문3 {

	public static void main(String[] args) {
		
		// while문으로 10부터 1까지 감소하는 것을 찍으시오
		// 반복문: 초기값, 조건문, 증감식
		int x = 10;
		
		while (x > 0) {
			
			System.out.print(x + " ");
			x--;
			
		}
		
		System.out.println(); // 엔터 출력
		
		// for문으로 1부터 10까지 프린트
		for (int i = 1; i < 11; i++) {
			
			System.out.print(i + " ");
			
		}
		
	}

}
