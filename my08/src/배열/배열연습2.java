package 배열;

public class 배열연습2 {

	public static void main(String[] args) {
		
		// int 배열 100개를 만들어
		// 첫번째 위치값은 1을 넣고
		// 50번째 위치값은 11을 넣고
		// 77번째 위치값은 111을 넣고
		// 마지막 위치값은 1111을 넣으세요
		// 위의 값들을 출력
		
		int[] num = new int[100];
		
		num[0] = 1;
		num[49] = 11;
		num[76] = 111;
		num[99] = 1111;
		
		System.out.println(num[0]);
		System.out.println(num[49]);
		System.out.println(num[76]);
		System.out.println(num[99]);

	}

}
