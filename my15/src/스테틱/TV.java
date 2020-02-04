package 스테틱;

public class TV {
	
	//	1. 클래스 만들기: 상태 (멤버변수), 동작 (멤버메소드)
	//	2. 멤버변수값 한번에 출력: toString()
	//	3. 멤버변수값 한번에 입력: 생성자 (Constructor)
	//					    new를 통해 객체생성
	//	----------------------------------------
	//	4. static (정적) <---> dynamic (동적)
	//	   - Integer.parseInt()
	//	   - JOptionPane.showInputDialog()
	//	   - Class.forName()
	
	//	   - new를 할 때마다 멤버변수가 객체마다 따로따로
	//	      다이나믹하게 복사됨
	//	   - 어떤 멤버변수는 누적시킬 필요가 있는 변수가 필요한 경우
	//	      멤버변수 앞에 static라고 붙여주면
	//	      객체마다 따로따로 생기지 않고, 하나의 변수가 가지면서
	//	      객체마다 공유해서 사용할 수 있음
	//	   - 클래스 당 한개만 가지고 있으면서 객체마다 공유해서 사용
    //	      클래스 이름.스태틱변수명
	
	//	5. 상속 (재사용), 인터페이스
	//	6. 유용한 클래스들 사용

	String color;
	int price;
	static int count;
	
	// 생성자
	// 멤버변수값 입력을 한번에

	public TV(String color, int price) {
		count++;
		// 멤버변수는 new를 할 때마다 메모리에 객체마다 각각 복사됨
		
		this.color = color;
		this.price = price;
	}

	// 멤버변수에 들어있는 값들 출력을 한번에
	public String toString() {
		return "TV [color: " + color + ", price: " + price + "]";
	}
	

}
