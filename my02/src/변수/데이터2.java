package 변수;

public class 데이터2 {

	public static void main(String[] args) {

		// 컴퓨터가 인식하는 데이터는 무엇인가?
		// - 기본 데이터
		// 숫자 (정수, 실수)
		// 문자 (1글자)
		// 논리 (맞는지 여부)
		
		int age = 100; // = (등호) : 저장공간(변수)에 값을 넣는 것
		double eye = 0.7;
		// int eye = 0.7; 안됨
		char sn = '1';
		boolean coffee = false;
		
		System.out.println("내 나이는 " + age + "살");
		System.out.println("내 시력은 " + eye);
		System.out.println("나는 " + sn + "세대");
		System.out.println("나는 오늘 커피를 마셨다? " + coffee);
		
		
		// 모든 연산은 CPU가 한다.
		System.out.println(age + 1);
		
		int nextAge = age + 1;
		
		System.out.println("내년 내 나이는 " + nextAge + "살");
		
		
		//변수 선언 - RAM에 저장공간이 만들어짐
		int year;
		
		//변수에 값을 대입
		year = 2020;
		
	}

}
