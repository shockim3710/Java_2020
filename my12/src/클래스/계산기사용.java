package 클래스;

public class 계산기사용 {

	public static void main(String[] args) {
		
		계산기 cal = new 계산기();
		
		cal.add();
		
		int result = cal.add(200, 100); 
		
		System.out.println(cal.add(200, 100)); // int x, int y
		// System.out.println(cal.add());
		// void 타입의 메소드를 호출한 경우에는
		// 반환값이 없으므로 변수에 값을 넣을 수도 없고
		// 프린트도 할 수 없음
		
		System.out.println(cal.add(3.14, 100)); // double x, int y
		System.out.println(cal.add(3.14, 1.74)); // double x, double y
		System.out.println(cal.add("자바", "스크립트")); // String x, String y
		System.out.println(cal.add("홍길동", 20)); // String x, int y

	}

}
