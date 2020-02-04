package 연산;

public class 산술연산 {

	public static void main(String[] args) {
		
		// 컴퓨터가 인식하는 계산
		// 산술연산 : 사칙연산 (+-*/), % (나머지)
		// 비교연산 : == (동일), != (안동일한지)

		int n1 = 200; // -21억 ~ 21억
		int n2 = 100;
		int n3 = n1 + n2; //300
		
		System.out.println("두 수의 합 = " + n3);
		
		n3 = n3 + 1; // n3 = 300
		// + 기호 : 연산자
		int n4 = n1 - n2; // n1에서 n2를 빼서 n4에 저장
		
		System.out.println("n1 X n2 = " + n1 * n2); // n1, n2 곱해서 출력
		System.out.println("n1 / n2 = " + n1 / n2);
		System.out.println("n1 / n2의 나머지 = " + n1 % n2); // n1, n2롤 나누어 출력 (몫, 나머지 각각)
		
	}

}
