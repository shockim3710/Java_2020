package 배열응용;

public class 배열최대값찾기 {

	public static void main(String[] args) {
		
		
		int[] num = {90, 80, 20, 60, 70};
		
		// for문을 순회하면서 거기까지 최소값을 넣어두는
		// 변수를 하나 지정
		int max = num[0]; 
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] > max) {
				
				max = num[i];
				
			}
			
		}
		
		System.out.println("최대값 = " + max);
		

	}

}
