package 배열응용;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 등수확인문제 {

	public static void main(String[] args) {
		
		int[] jumsu = {50, 80, 70, 60, 40};
		
		int me = 70;
		int index = 0; // 위치값 저장
		
		Arrays.sort(jumsu); // 정렬
		
		System.out.println("**** 점수정렬 ****");
		
		for (int i = 0; i < jumsu.length; i++) {
			
			System.out.print(jumsu[i] + " ");
			
		}
		
		System.out.println();
		
		for (int i = 0; i < jumsu.length; i++) {
			
			if (me == jumsu[i]) {
				
				index = i;
				System.out.println("내 위치 = " + i);
				
			}
			
		}
		
		System.out.println("내 등수 = " + (jumsu.length - index) + "등");


	}

}
