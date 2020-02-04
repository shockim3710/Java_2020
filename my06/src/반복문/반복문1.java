package 반복문;

public class 반복문1 {

	public static void main(String[] args) {
		
		// 반복을 해봅시다
		// 어느 조건일 때, 몇번 반복
		
		int day = 0; // 시작값은 0부터
		
		while (day < 6) { // 조건식
			// 조건이 맞으면 반복처리할 내용
			
			System.out.println(day + ": 반갑습니다");
			
			day = day + 1; // 증감식
			// day++; // 증감연산자
			
		}


	}

}
