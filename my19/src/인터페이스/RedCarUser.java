package 인터페이스;

public class RedCarUser {

	public static void main(String[] args) {
		
		// 배열을 대신할 수 있는 클래스
		// - First Input First Output (FIFO)
		// - LinkedList (중복허용 X)
		// - HashSet (키 + 값의 목록)
		
		// 모든 클라스의 조상: Object
		// 에러처리할 수 있는 기능을 붙인 클래스: Exception
		// 참조형 주소가 null인 경우의 에러처리 기능을 붙인 클레스
		// = NullpointerException
		
		// 컴퓨터가 인식할 수 있는 것: 0, 1 (2진수)
		// 사람은 인식할 수 있는 것: 0 ~ 9 (10진수)
		// 5 = 101 (2)
		// 20 = 10100 (2)
		
		RedCar red = new RedCar();
		
		red.엔진으로가다();
		red.몇인용자동차다();

	}

}
