package 배열;

import java.util.Iterator;

public class 배열간단출력 {

	public static void main(String[] args) {
		
		int[] age = {10, 20, 30};
		
		for (int i = 0; i < age.length; i++) {
			
			System.out.println(age[i]);
			
		}
		
		System.out.println();
		
		for (int x : age) {
			
			System.out.println(x);
			
		}
		
		
		double[] eyes = {0.7, 0.5, 0.9};
		
		for (double d : eyes) {
			
			System.out.println(d);
			
		}


	}

}
