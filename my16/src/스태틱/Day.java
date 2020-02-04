package 스태틱;

public class Day {
	
	// - new를 할 때 객체 생성 시, 멤버변수가 복사되는
	//   RAM의 영역은 heap 영역
	// - heap 영역은 크기만 맞으면 아무데나 만들 수 있음
	
	// - new를 할 때 heap 영역에 복사되는 변수는 다이나믹 복사
	// - static 변수는 객체를 생성하지 않아도 접근해서 사용가능
	// - 다이나믹 변수나 일반메소드는 반드시 객체 생성 후
	//   객체이름으로 접근(.)해서 사용가능
	
	// - static 메소드는 객체생성하지 않아도
	//   클래스 이름으로 바로 접근해서 편하게 쓸 수 있는 메소드
	//   => 자주 사용하는 메소드
	//   JOptionPane.showInputDialog()
	//   Class.forName
	
	String doing;
	int time;
	String location;
	static int count; // 멤버변수는 자동으로 초기화를 시켜줌
			   		  // int는 0으로 초기화
	static int sum; //시간 누적용
	
	public Day(String doing, int time, String location) {
		
		sum = sum + time;
		count++;
		
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	public String toString() {
		return "Day *** 하는 일: " + doing + ", 시간: " + time + ", 장소: " + location;
	}
	
	public void play() {
		
		System.out.println("매일매일 놀다");
		
	}

}
