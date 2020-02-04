package 배열심화;

public class 차원2배열기본 {

	public static void main(String[] args) {
		
		int[][] seat = new int[5][5];
		
		System.out.print(" : ");
		
		for (int k = 0; k < seat.length; k++) {
			
			System.out.print(k + "  ");
			
		}
		
		System.out.println();
		System.out.println("------------------");
		
		seat[0][0] = 1;
		seat[0][1] = 1;
		seat[1][1] = 1;
		seat[1][2] = 1;
		
		for (int i = 0; i < seat.length; i++) {
			
			System.out.print(i + ": ");
			
			for (int j = 0; j < seat[i].length; j++) {
				
				System.out.print(seat[i][j] + "  ");
				
			}
			
			System.out.println();
			
		}
		

	}

}
