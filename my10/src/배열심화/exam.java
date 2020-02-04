package 배열심화;

public class exam {

	public static void main(String[] args) {
		
		// 1학기 수학점수 : 100 88 96
		// 2학기 수학점수는 첫 학생만 100에서 99로 변경
		// 두 학기의 점수를 출력
		
		int[] x = {100, 88, 96};
		int[] y = x.clone();
		
		y[0] = 99;
		
		System.out.print("1학기 수학점수 : ");
		
		for (int a : x) {
			
			System.out.print(a + " ");
			
		}
		
		System.out.print("\n2학기 수학점수 :  ");
		
		for (int b : y) {
			
			System.out.print(b + " ");
			
		}


	}

}
