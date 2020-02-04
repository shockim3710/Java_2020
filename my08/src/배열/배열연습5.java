package 배열;

public class 배열연습5 {

	public static void main(String[] args) {
		
		// 기본형의 RAM 크기 사이즈
		// double - 8바이트
		// int - 4바이트
		// char - 2바이트
		// boolean - 1바이트

		// 참조형의 RAM 크기 사이즈
		// 주소가 들어가는 변수를 쓸 때 (참조형 변수)
		// - 8바이트
		
		
		// 친구 이름
		
		String[] names = {"홍길동", "김길동", "송길동", "정길동"};
		for (int i = 0; i < names.length; i++) {
			
			System.out.print(names[i] + " ");
			
		}
		
		System.out.println();
		
		// 우리가족 5명의 나이를 넣으세요 (전체출력)
		// 친구들의 발 사이즈를 넣으세요 (전체출력)
		// 친구들의 성별을 넣으세요 (전체출력)
		
		int[] age = {10, 25, 40, 50};
		int[] size = {250, 260, 270, 245};
		char[] s = {'남', '남', '여', '남', '여'};
		
		for (int i = 0; i < age.length; i++) {
			
			System.out.print(age[i] + " ");
			
		}
		
		System.out.println();
		
		for (int i = 0; i < size.length; i++) {
			
			System.out.print(size[i] + " ");
			
		}
		
		System.out.println();
		
		for (int i = 0; i < s.length; i++) {
			
			System.out.print(s[i] + " ");
			
		}

	}

}
