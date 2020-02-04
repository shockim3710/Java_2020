package 배열;

public class 배열연습1 {

	public static void main(String[] args) {
		
		// 배열 (Array)
		// - 많은 수의 데이터를 한번에 다룰 수 있는 기술
		// - 한번에 많은 수의 변수를 만들 수 있음

		// 변수와의 차이
		// - 변수는 하나에 하나의 데이터만을 저장
		// - 하나의 변수마다 이름이 달라야함
		// - 타입도 다 선언해야 함
		// - 100개의 데이터라고 한다면 100개의 변수 필요

		// 배열의 특징
		// - 하나의 이름으로 여러개의 데이터를 다룰 수 있음
		// - 100개의 데이터라고 하면 1개의 배열 필요

		// 기본 데이터 타입
		// - 정수, 실수, 문자, 논리
		// - 변수에 해당 타입의 데이터 (값)가 들어감

		// 참조 타입 
		// - 나머지 모두
		// - 배열, 클래스, String, etc..
		// - 변수에 주소가 들어감

		// String name = "홍길동";
		// - 변수에 실제 값이 어디 들어있는지 참고할 수 있는 주소가 들어감
		// 참고 = reference
		
		int[] num = new int [10];
		
	 // int[] : int로 만둘어진 배열 타입
	 // num : 배열의 주소가 들어있음, 참조형
	 // new : 복사
	 // new int : int 변수를 복사
	 // new int [10] : int 변수를 10개 복사
		
		
		System.out.println(num);
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[9]);
		
		// 배열은 변수에 초기값을 넣음
		// int 배열은 모두 0으로 초기화를 함
		
		num[0] = 5;
		System.out.println(num[0]);
		
		// 5번째 위치값을 10을 넣어서 출력
		// 10번째 위치값을 20을 넣어서 출력
		
		num[4] = 10;
		num[9] = 20;
		
		System.out.println(num[4]);
		System.out.println(num[9]);

	}

}
