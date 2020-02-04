package 배열응용;

import java.util.Random;

public class 여러개중최대값찾기 {

	public static void main(String[] args) {
		
		Random r = new Random(7);
		// 42를 넣는 것 - 씨앗(seed)값을 심는다
		// 랜덤값들을 동일하게 유지
		
		int[] num = new int[10000];
		int count = 0;
		
		for (int i = 0; i < num.length; i++) {
			
			num[i] = r.nextInt(10000);
			
		}
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.println(i + ": " + num[i]);
			
		}
		
		System.out.println("------------------------");
		
		int max = num[0];
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] > max) {
				
				max = num[i];
				
			}
			
		}
		
		System.out.println("        랜덤 숫자중 최대값 = " + max);
		
		// 최대값이 들어있는 자리찾기
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] == max) {
				
				System.out.println(max + "값이 들어있는 위치 = " + i);
				
				count++;
				
			}
			
		}
		
		System.out.println("최대값이 위치한 개수는 " + count + "개");

	}

}
