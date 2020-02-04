package 배열;

public class 배열연습3 {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		
		// 각 int 변수 내에 0으로 초기값이 들어가있음
		
		System.out.println(num.length); // 전체 개수
		
		for (int i = 0; i < num.length; i++) {
			
			// 이클립스는 for문을 자동완성 할 때
			// 바로 위에 있는 배열을 기준으로 만듬
			
			num[i] = i;
			
		 // num[0] = 0;
		 // num[1] = 1;
		 // num[2] = 2;
			
		}
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.print(num[i] + " ");
			
		}
		

	}

}
